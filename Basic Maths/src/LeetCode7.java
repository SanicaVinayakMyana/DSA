
//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//
//
//
//Example 1:
//
//Input: x = 123
//Output: 321
//Example 2:
//
//Input: x = -123
//Output: -321
//Example 3:
//
//Input: x = 120
//Output: 21

public class LeetCode7 {
    public int reverse(int n) {

        int rev=0;
        if(n==0){
            return 0;
        }
        if(n>0){
            for (int i=n;i>0;){
                int r=n%10;
                if (rev > (Integer.MAX_VALUE - r) / 10) {
                    return 0;
                }
                rev=(rev*10)+r;
                i=n/10;
                n=n/10;


            }

        }
        if(n<0){
            for (int i=n;i<0;){
                int r=n%10;
                if (rev < (Integer.MIN_VALUE - r) / 10) {
                    return 0;
                }
                rev=(rev*10)+r;
                i=n/10;
                n=n/10;


            }

        }

        return rev;
    }
    public static void main(String[] args) {
        int n=237148548;
        LeetCode7 l7=new LeetCode7();
        System.out.println(l7.reverse(n));
    }
}
