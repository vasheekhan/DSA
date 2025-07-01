import java.util.Scanner;
class rotate{
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

    public static void printArray(int arr[]){
        int l=arr.length;
        for(int i=0;i<l;i++){
            System.out.print(arr[i] +" ");
        }
         System.out.println();
    }
    public static int[] reverseArray(int arr[],int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();

        int arr[]=new int[n];
            System.out.println("enter the elements of array");
        for (int i=0;i<arr.length;i++){
       arr[i]=sc.nextInt();
        }
          System.out.println("enter how the number of rotation");
          int k=sc.nextInt();
          k=k%n;
   int []p1=reverseArray(arr,0,n-k-1);
   p1=reverseArray(arr,n-k,n-1);
   int  []reverse_array=reverseArray(p1,0,n-1);
   printArray(reverse_array);

    }
}