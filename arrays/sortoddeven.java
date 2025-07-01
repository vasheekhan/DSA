//same logic as o and 1 sorting but use else if for second condition


class sortoddeven {
    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                swap(arr, i, j);
                i++;
                j--;
            } 
             if (arr[i] % 2 == 0) {
                i++;
            }
             if (arr[j] % 2 != 0) {
                j--;
            }
        }

        printArray(arr);
    }
}
