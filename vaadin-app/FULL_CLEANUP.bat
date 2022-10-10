call mvn -q -f ..\multi-module-project clean
@echo on
if exist node_modules rd /s /q node_modules
call mvn -q hilla:clean-frontend
@echo on
if exist package.json del package.json
