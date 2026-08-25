public class PalindromeNumber {
    public boolean isPalindrome(int n) {
        int temp =n;
        int rev=0;
        for(int i=n;i>0;i=i/10){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;

        }


        if(temp==rev)return true;
        else return false;
    }
    public static void main(String[] args) {
        int n=121;
        PalindromeNumber p= new PalindromeNumber();
        System.out.println(p.isPalindrome(n));
    }
}
