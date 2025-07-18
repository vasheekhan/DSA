class BinarySearch{
    public static void binarySearch(int arr[],int target){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
         int mid=start+(end-start)/2;
         if(arr[mid]==target){
            ans=mid;
           System.out.println("element found at index "+ ans);
           break;
         }else if (arr[mid]>target) {
             end=mid-1;
         }
         else{
            start=mid+1;
         }

        }
        if(ans==-1){
            System.out.println("Element does not found in array");
        }
    }
    public static void binarySearchDesc(int arr[],int target){
            int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
         int mid=start+(end-start)/2;
         if(arr[mid]==target){
            ans=mid;
           System.out.println("element found at index "+ ans);
           break;
         }else if (arr[mid]>target) {
             end=mid+1;
         }
         else{
            start=mid-1;
         }

        }
        if(ans==-1){
            System.out.println("Element does not found in array");
        }
    }
    public static void main(String args[]){
        // int arr[]={1,2,3,4,5,6,78,6,5};
        int arr2[]={5,4,3,21,2,1};
        int target=2;
        // binarySearch(arr,target);
        binarySearchDesc(arr2, target);
    }
}