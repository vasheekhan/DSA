

class palindrome{
    public static void main(String args[]){
        String a="";
        // String b="";
      char[] arr=a.toCharArray();
    int i=0;
    int j=arr.length-1;
     while (i<=j){
       if(arr[i]==arr[j]){
        i++;
        j--;
        continue;
       } 
       System.out.println("Not palindrome");
       return;
     }
System.out.println("Palindrome");
    }
}