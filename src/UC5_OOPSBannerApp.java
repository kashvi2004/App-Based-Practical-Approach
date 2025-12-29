import java.util.HashMap;

/**
 * OOPSBannerApp UC5 – Advanced OOP Concepts Implementation
 *
 * Uses HashMap to store ASCII art patterns for characters
 * and renders the banner using utility static methods.
 *
 * @author Developer
 * @version 5.0
 */
public class UC5_OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     *
     * @return HashMap where key is Character and value is String[] pattern
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for 'O'
        charMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // Pattern for 'P'
        charMap.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        // Pattern for 'S'
        charMap.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        // Pattern for space
        charMap.put(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map.
     *
     * @param message the message to display as banner
     * @param charMap HashMap containing character patterns
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        message = message.toUpperCase();

        // Height of the pattern (7 lines)
        int patternHeight = charMap.get('O').length;

        // Loop through each row
        for (int line = 0; line < patternHeight; line++) {

            StringBuilder rowBuilder = new StringBuilder();

            // Loop through each character in the message
            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);

                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                rowBuilder.append(pattern[line]).append("  ");
            }

            // Print the constructed row
            System.out.println(rowBuilder.toString());
        }
    }

    /**
     * Main entry point of the application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";

        displayBanner(message, charMap);
    }
//    public static void main(String[] args) {   /* this is for if u want to print a single letter*/
//        displayBanner("P", createCharacterMap());
//    }

}
