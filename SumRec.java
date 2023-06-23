

public class SumRec {
    static void sod(int n,int  sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        int singleDigit=n%10;
        sum+=singleDigit;
        sod(n/10,sum);
    }
    static int sod(int n){
        if(n==0){
            return 0;
            //initial value of sum
        }
        int sum=sod(n/10);
        int singleDigit=n%10;
        sum=sum+singleDigit;
        return sum;
    }
    public static void main(String[] args) {
        //sod(123,0);
        int mSum=sod(12343);
        System.out.println(mSum);

    }
}
