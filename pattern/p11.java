//    *
//   * *
//  *   *
// *     *
class p11{
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=3;j>i;j--){
                System.out.print(" ");
            }
           
                System.out.print("*");
          
            if(i!=0){
          for(int j=0;j<2*i-1;j++){
            System.out.print(" ");
          }
           
         System.out.print("*");
          
            }
            System.out.println();
        }
    }
}