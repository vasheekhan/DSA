// 1234567
// 2345671
// 3456712
// 4567123
// 5671234
// 6712345
// 7123456
class p4{
    public static void main(String args[]){
    for(int i=1;i<=7;i++){
        for(int j=i;j<=7;j++){
        System.out.print(j);
        }
        for(int k=1;k<i;k++){
            System.out.print(k);
        }
System.out.println("");
    }
}
}