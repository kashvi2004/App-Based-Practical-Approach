/**
 * OOPSBannerApp – OOPS Banner Application (Use Case 4)
 *
 * Demonstrates encapsulation by storing ASCII patterns
 * inside an inner class and separating data from rendering logic.
 *
 * @author Kashvi
 * @version 1.4
 */
public class UC4_OOPSBannerApp {

    /* =========================================================
       Part 2 – Inner Class
       ========================================================= */

    /**
     * Inner class to map a character to its ASCII pattern.
     * Encapsulates character data and its visual representation.
     */
    static class CharacterPatternMap {

        private final Character character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern.
         *
         * @param character the character to map
         * @param pattern   the ASCII art pattern
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * @return the mapped character
         */
        public Character getCharacter() {
            return character;
        }

        /**
         * @return the ASCII art pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /* =========================================================
       Part 3 – Utility Static Methods
       ========================================================= */

    /**
     * Creates and initializes character-pattern mappings.
     *
     * @return array of CharacterPatternMap objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[]{

                new CharacterPatternMap('O', new String[]{
                        " *** ",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        " *** "
                }),

                new CharacterPatternMap('P', new String[]{
                        "**** ",
                        "*   *",
                        "*   *",
                        "**** ",
                        "*    ",
                        "*    ",
                        "*    "
                }),

                new CharacterPatternMap('S', new String[]{
                        " ****",
                        "*    ",
                        "*    ",
                        " *** ",
                        "    *",
                        "    *",
                        "**** "
                }),

                new CharacterPatternMap(' ', new String[]{
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     "
                })
        };
    }

    /**
     * Retrieves the ASCII pattern for a given character.
     *
     * @param ch       character to search
     * @param charMaps available character maps
     * @return pattern array for the character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // fallback to space pattern
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints a message as a banner using ASCII patterns.
     *
     * @param message  message to render
     * @param charMaps character pattern mappings
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        message = message.toUpperCase();

        for (int row = 0; row < 7; row++) {
            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);
                System.out.print(pattern[row] + "  ");
            }
            System.out.println();
        }
    }

    /* =========================================================
       Part 4 – Main Method
       ========================================================= */

    /**
     * Entry point of the application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";

        printMessage(message, charMaps);
    }
}
