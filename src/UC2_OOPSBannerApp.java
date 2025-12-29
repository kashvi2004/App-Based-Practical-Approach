
    /**
     * UC2: Render OOPS as Banner using spaces and *
     * Height: 7 lines
     * Width: 9 characters per letter
     */
    public class UC2_OOPSBannerApp {

        public static void main(String[] args) {

            // String 1D array to store each row of the banner
            String[] bannerLines = {

                    String.join("   ",
                            " ***** ",
                            " ***** ",
                            " ***** ",
                            " ***** "
                    ),

                    String.join("   ",
                            "*     *",
                            "*     *",
                            "*     *",
                            "*      "
                    ),

                    String.join("   ",
                            "*     *",
                            "*     *",
                            " ***** ",
                            " ***** "
                    ),

                    String.join("   ",
                            "*     *",
                            "*     *",
                            "*      ",
                            "      *"
                    ),

                    String.join("   ",
                            "*     *",
                            "*     *",
                            "*      ",
                            "      *"
                    ),

                    String.join("   ",
                            "*     *",
                            "*     *",
                            "*      ",
                            "      *"
                    ),

                    String.join("   ",
                            " ***** ",
                            " ***** ",
                            "*      ",
                            " ***** "
                    )
            };

            // Enhanced for loop to print the banner
            for (String line : bannerLines) {
                System.out.println(line);
            }
        }
    }


