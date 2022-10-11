call mvn -q -f ..\small-business-starter-project clean
@echo on
if exist node_modules rd /s /q node_modules
if exist ..\core-module\node_modules rd /s /q ..\core-module\node_modules
call mvn -q hilla:clean-frontend
@echo on
if exist package.json del package.json
if exist package_template.json copy package_template.json package.json

