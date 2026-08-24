public class CountOddDigits {
    public int countOddDigit(int n) {
        int count=0;
        if(n==0){
            return 0;
        }
        for (int i=n;i>0;){
            int r = n%10;
            if(r %2 != 0){
                count++;
            }
            i=n/10;
            n=n/10;


        }
        return count;
    }
    public static void main(String[] args) {
        int n=264373;
        CountOddDigits c= new CountOddDigits();
        System.out.println(c.countOddDigit(n));
    }
}
