class BitManipulation{
    public static void main(String[] args) {
        // printAllBits(5);
    //   boolean res= isBitSet(5,3);
    // oddAndEven(1000000003);
   setIthBit(3,0);
      
    }
 public static void printAllBits(int nums){
     for(int i=7;i>=0;i--){
        System.out.print((nums>>i)&(1));
     }
     System.out.println();
    }
 public static boolean isBitSet(int nums,int pos){
        int res=(nums>>pos)&1;
        return (res==0)?false:true;
    }
 public static void oddAndEven(int nums){
        if(isBitSet(nums,0)) {
      System.out.println("then number is odd"); }else{
         System.out.println("the number is even");
      }


    }
public static void setIthBit(int nums,int bits){
    printAllBits(nums);
int res=nums|(1<<bits);
printAllBits(res);

}
public static void toggleIthBit(int nums,int bits){
    int res=nums^(1<<bits);
    printAllBits((res));
}





}