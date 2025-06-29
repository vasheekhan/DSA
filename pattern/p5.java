// 121212
// 212121
// 121212
// 212121
class p5 {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                // If row is odd, start with 1; if even, start with 2
                if (i % 2 == 1) {
                    System.out.print((j % 2 == 0) ? "2" : "1");
                } else {
                    System.out.print((j % 2 == 0) ? "1" : "2");
                }
            }
            System.out.println();
        }
    }
}
