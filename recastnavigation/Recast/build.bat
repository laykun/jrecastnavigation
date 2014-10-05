set javaDir=C:\Program Files\Java\jdk1.7.0_25

del *.java
swig -c++ -java -package com.laykun.recast Recast.i
c++ -shared -fPIC -IInclude -I"%javaDir%\include" -I"%javaDir%\include\win32" -o recast.dll Source\*.cpp Recast_wrap.cxx
move *.java ../../src/com/laykun/recast/
move recast.dll ../../librecast.dll
cd ../../
cd src
dir /S /B "*.java" > sources.txt
javac @sources.txt
del -rf *.java
jar cf ../jrecast.jar *
