echo off
cd /d %~dp0 
if /i "%PROCESSOR_IDENTIFIER:~0,3%" == "X86" goto X86 
if /i "%PROCESSOR_IDENTIFIER:~0,3%" NEQ "X86" goto X64
:X86
start ZHLFV4.0_Setup_x86.exe
exit
:X64
start ZHLFV4.0_Setup_x64.exe
exit