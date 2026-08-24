public class Pattern18 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            char ch=(char)('A'+ n);
            for(int j=i;j>=1;j--){
                System.out.print((char)(ch-j)+" ");
            }
            System.out.println();
        }
    }
}
//E
//D E
//C D E
//B C D E
//A B C D E
