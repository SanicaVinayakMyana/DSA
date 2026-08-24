public class Reverse_number {
    public int reverseNumber(int n) {
        int rev=0;
        if(n==0){
            return 0;
        }
        for (int i=n;i>0;){
            int r=n%10;
            rev=(rev*10)+r;
            i=n/10;
            n=n/10;

        }
        return rev;
    }
    public static void main(String[] args) {
        int n=283764;
        Reverse_number r=new Reverse_number();
        System.out.println(r.reverseNumber(n));
    }
}
