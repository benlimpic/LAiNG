#!/bin/bash

BACKEND_PATH="$(pwd)/backend"
FRONTEND_PATH="$(pwd)/frontend"

# Open backend in new Terminal tab
osascript <<EOD
tell application "Terminal"
    activate
    do script "cd \"$BACKEND_PATH\" && mvn spring-boot:run -Dspring-boot.run.profiles=dev"
end tell
EOD

# Open frontend in another Terminal tab
osascript <<EOD
tell application "Terminal"
    activate
    do script "cd \"$FRONTEND_PATH\" && npm run dev"
end tell
EOD
