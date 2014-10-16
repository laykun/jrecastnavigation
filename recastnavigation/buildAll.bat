del /F ../src/com
del /F ../src/sources.txt

cd Recast
call build.bat
cd ../Detour
call build.bat

cd ../../
cd src
dir /S /B "*.java" > sources.txt
javac @sources.txt
jar cf ../jrecast.jar *