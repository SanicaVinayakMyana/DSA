public class Count_Digits {
    public int countDigit(int n) {
        int count=0;
        if(n==0){
            return 1;
        }
        for (int i=n;i>0;){
            i=n/10;
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Count_Digits c=new Count_Digits();
        int ans=c.countDigit(47859);
        System.out.println(ans);
    }
}
