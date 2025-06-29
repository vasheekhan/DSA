class Armstrong {
    public static void main(String args[]) {

        int number = 2;  // or try 153, 9474
        int originalNumber = number;
        int ans = 0;

        if (number <= 0) {
            System.out.println("Enter a positive number");
            return;
        }

        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            ans = ans + (int) Math.pow(digit, digits);
            number = number / 10;
        }

        if (ans == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number");
        }
    }
}
