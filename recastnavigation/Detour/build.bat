set javaDir=C:\Program Files\Java\jdk1.7.0_25

del *.java
swig -c++ -java -package com.laykun.detour Detour.i
c++ -shared -fPIC -IInclude -I"%javaDir%\include" -I"%javaDir%\include\win32" -o detour.dll Source\*.cpp Detour_wrap.cxx
move *.java ../../src/com/laykun/detour/
move detour.dll ../../detour.dll

