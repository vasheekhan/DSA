
class sort {
     public static void printArray(int arr[]){
        int l=arr.length;
        for(int i=0;i<l;i++){
            System.out.print(arr[i] +" ");
        }
         System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0};
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }
printArray(arr);
    }
}
