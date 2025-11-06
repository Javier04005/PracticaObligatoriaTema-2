@echo off
REM -- Forzar el cambio de directorio a la ubicación del script --
cd /d "%~dp0"

REM -- Ejecuta la aplicación Java --
java -jar PracticaHotelT2.jar

REM Mantiene la ventana abierta para ver la salida o errores.
pause