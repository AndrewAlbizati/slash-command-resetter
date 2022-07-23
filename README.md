# Slash Command Resetter
This bot is designed to reset an existing bot's Slash Commands.

## Setup
1. Run the following commands into terminal or command prompt
   1. If on Windows:
       1. `gradlew build`
       2. `move build\libs\slash-command-resetter-1.0.0.jar .`
       3. `java -jar slash-command-resetter-1.0.0.jar`

   2. If on macOS/Linux
       1. `chmod +x gradlew`
       2. `./gradlew build`
       3. `mv build/libs/slash-command-resetter-1.0.0.jar .`
       4. `java -jar slash-command-resetter-1.0.0.jar`
2. Input your bot's token.
3. Type y if you want to reset the bot's Slash Commands (THIS CHANGE WILL BE PERMANENT).

## Dependencies
- Javacord 3.5.0 (https://github.com/Javacord/Javacord)