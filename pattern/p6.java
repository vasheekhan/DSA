//    1
//   121
//  12321
// 1234321

class p6 {

    public static void main(String args[]) {
        int i, j, l, k;
        for (i = 1; i <= 4; i++) {
            for (j = 4 - i; j >= 1; j--) {
                System.out.print(" ");

            }
            for (k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (l = i- 1; l >=1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
