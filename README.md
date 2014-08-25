jrecastnavigation
=================

A JNI wrapper for the recast navigation library.

EXPERIMENTAL

Currently build script only supports Linux x64. Will work on ant build description later.

Purpose
--------------

To have a one to one wrapper of the recast navigation system wrapped with JNI for full functionality. This will include the detour system as well as the recast nav mesh generation system.
The inception is for my own personal usage, out of frustration of not being able to find a JNI wrapper or full java implementation.

Building
---------------

Dependencies :

g++
java JDK
swig

Currently the recastnavigation/Recast/build.sh build script has a absolute path to the jni.h so you may want to change that to where your jni.h resides.


Usage
--------------

Use the supplied recast.jar in your project and put the librecast.so in your library path, you will probably have to set this through the run configuration with java  -Djava.library.path=SOMEPATH
From there you should be able to access the recastnavigation libraries as normal.






