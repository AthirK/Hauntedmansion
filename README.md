# Haunted House Adventure Game

   Welcome to the Haunted House Adventure Game! Your objective in this text-based adventure game is to find a lost key and return it to the ghost. Navigate through the rooms, search for clues, and use commands to interact with the environment and characters.

   ## Features

   - **Text-Based Adventure**: Explore the haunted house using commands.
   - **Rooms**: Discover different rooms with objects to search.
   - **Key Search**: Find the hidden key within one of the rooms.
   - **Ghost Interaction**: Return the key to the ghost to complete the game.

   ## Getting Started

   1. **Clone the Repository**:
      ```bash
      git clone https://github.com/yourusername/haunted-house-game.git
      cd haunted-house-game
      ```

   2. **Build and Run**:
      This project is built using Gradle. To build and run the game, execute the following commands in your terminal:

      - For Unix-based systems (Linux/Mac):
        ```bash
        ./gradlew build
        ./gradlew run
        ```

      - For Windows:
        ```bat
        gradlew.bat build
        gradlew.bat run
        ```

   3. **Gameplay**:
      - Type `help` to see a list of available commands.
      - Use `search [object]` to search for the key in each room (e.g., `search bed`, `search wardrobe`, `search chest`).
      - Once you find the key, use the command `speak with ghost` to complete the game.

   ## Commands

   - **help**: Display a list of available commands.
   - **exit**: Exit the game.
   - **cheat**: (Debug only) Show where the key is hidden in Room 1.
   - **search [object]**: Search for an object in Room 1. Valid objects are `bed`, `wardrobe`, and `chest`.
   - **speak with ghost**: Talk to the ghost after finding the key.

   ## Credits

   - **Developer**: Your Name
   - **Version**: 1.0
   - **Date**: [Insert Date]

   Feel free to reach out if you have any questions or need further assistance with the game.