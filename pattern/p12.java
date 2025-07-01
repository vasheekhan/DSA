// *     *
//  *   *
//   * *
//    *





class p12 {
    public static void main(String[] args) {
        int n = 4; // total number of rows
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print first star
            System.out.print("*");

            // Print inner spaces and second star (only for i < n - 1)
            int innerSpaces = 2 * (n - i - 1) - 1;
            if (innerSpaces > 0) {
                for (int j = 0; j < innerSpaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            // Newline
            System.out.println();
        }
    }
}
