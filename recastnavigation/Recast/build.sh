rm *.java
swig -c++ -java -package com.laykun.recast Recast.i
c++ -shared -fPIC -IInclude/ -I/usr/lib/jvm/java-7-openjdk-amd64/include/ -I/usr/lib/jvm/java-7-openjdk-amd64/include/linux/ -o recast.so Source/*.cpp Recast_wrap.cxx
mv *.java ../../src/com/laykun/recast/
mv recast.so ../../librecast.so
cd ../../
jar cf jrecastnatives.jar recast.so
cd src
find -name "*.java" > sources.txt
javac @sources.txt
rm -rf *.java
jar cf ../jrecast.jar *
