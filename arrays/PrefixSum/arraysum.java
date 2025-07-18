class arraysum{
    public static int totalSum(int arr[]){
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
totalsum+=arr[i];
        }
        return totalsum;
    }
    public static boolean subArraySum(int arr[]){
        int totalsum=totalSum(arr);
        int prefixsum=0;
        for(int i=0;i<arr.length;i++){
        prefixsum+=arr[i];
        int suffixsum=totalsum -prefixsum;
        if(prefixsum==suffixsum){
            return true;
        }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,6,2,1};
    boolean isSubarray=subArraySum(arr);
    System.out.println("Equal partition possible "+isSubarray);
   



    }
}