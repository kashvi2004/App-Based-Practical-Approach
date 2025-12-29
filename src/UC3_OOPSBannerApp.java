/**
 * OOPSBannerApp – OOPS Banner Application (Use Case 3)
 *
 * Refactors UC2 by extracting banner logic into reusable methods
 * following SRP and modular design.
 */
public class UC3_OOPSBannerApp {

    // Method to generate pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Method to generate pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };
    }

    // Method to generate pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };
    }

    // Main method
    public static void main(String[] args) {

        // Retrieve patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble and print banner line by line
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + "   " +
                            oPattern[i] + "   " +
                            pPattern[i] + "   " +
                            sPattern[i]
            );
        }
    }
}
