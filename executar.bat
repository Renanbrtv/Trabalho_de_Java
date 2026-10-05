@echo off
chcp 65001 >nul
cd /d "%~dp0"
if not exist out mkdir out
javac -encoding UTF-8 -d out src\Main.java src\Cabecalho.java src\Questao.java
if errorlevel 1 (
 echo Falha na compilacao. Confira se o JDK esta instalado e no PATH.
 pause
 exit /b 1
)
java -Dfile.encoding=UTF-8 -cp out Main
pause
