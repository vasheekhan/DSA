 // Method to sort colors (Dutch National Flag Algorithm)
//   int[] nums = {2, 0, 2, 1, 1, 0};
//0 0 1 1 2 2




public class sortcolor{

    // Method to sort colors (Dutch National Flag Algorithm)
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to run in VS Code
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Before sorting:");
        printArray(nums);

        sortColors(nums);

        System.out.println("After sorting:");
        printArray(nums);
    }
}
