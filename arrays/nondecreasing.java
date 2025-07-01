//  int[] arr = { -10, -3, -2, -1, 3, 4, 5 };
//    printArray(sortedSquares);  // Output: 1 4 9 9 16 25 100



class nondecreasing {
      public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method that returns a new array of sorted squares
    public static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int resIndex = n - 1;

        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                result[resIndex--] = leftSquare;
                left++;
            } else {
                result[resIndex--] = rightSquare;
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { -10, -3, -2, -1, 3, 4, 5 };
        int[] sortedSquares = sortedSquares(arr);
        printArray(sortedSquares);  // Output: 1 4 9 9 16 25 100
    }
}