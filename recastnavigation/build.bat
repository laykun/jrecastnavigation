set javaDir=C:\Program Files\Java\jdk1.7.0_25

del /F ..\src\com
del /F ..\src\sources.txt
del *.java
swig -c++ -java -package com.laykun.recast jrecast.i
c++ -shared -fPIC -IDetour\Include -IRecast\Include -I"%javaDir%\include" -I"%javaDir%\include\win32" -o recast.dll Detour\Source\*.cpp Recast\Source\*.cpp jrecast_wrap.cxx
mkdir ..\src\com\laykun\recast\
move *.java ..\src\com\laykun\recast\
move recast.dll ../recast.dll

cd ../
cd src
dir /S /B "*.java" > sources.txt
javac @sources.txt
jar cf ../jrecast.jar *