
import java.util.Arrays;

class PrintAllDivisor{
    public static void main(String args[]){
// printAllDivisor(20);
sieve(40);
    }
    public static void printAllDivisor(int num){
       //i have to print all the factor
       //sqrt
       int range=(int)Math.sqrt(num);
       int counter=1;
       while(counter<=range){
        int reminder=num%counter;
        if(reminder==0){
            System.out.print(counter+" ");
            int b=num/counter;
            if(b!=counter){
                 System.out.print(b+" "); 
            }
        }
        counter++;
       }
    }

    public static void sieve(int num){
        boolean arr[]=new boolean[num+1];
        Arrays.fill(arr,true);
        for(int i=2;i<arr.length;i++){
            if(arr[i]==true){//means prime number
              for(int j=i+i;j<arr.length;j=j+i){
                 arr[j]=false;
              }
            }
        }
        for(int i=2;i<arr.length;i++){
            System.out.println(i+" is Prime "+arr[i]);
        }


    }
}
