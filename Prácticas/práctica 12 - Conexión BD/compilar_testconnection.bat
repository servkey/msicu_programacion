@echo off
SET CLASSPATH=.\mysql\mysql-connector-java-5.0.8-bin.jar;.\conexion.jar

echo Eliminando archivos compilados previamente...
del *.class
echo Compilando TestConnection...
javac *.java

set /p DUMMY=Hit ENTER para continuar...