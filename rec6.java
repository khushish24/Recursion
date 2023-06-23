public class rec6 {
    static int n=153;
    static int count(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
    //stack building approach
    static void isArmstrong(int num,int result){
        if(num==0){
            System.out.println(result==n?"ArmStrong Number":"Not a Armstrong number");
            return;
        }
        int singleDigit=num%10;
        result+=Math.pow(singleDigit,count(n));
        isArmstrong(num/10, result);
    }
    //stack falling approach
    static int isArmstrong(int num){
        if(num==0){
            return 0;
        }
        int result=isArmstrong(num/10);
        int singleDigit=num%10;
        result+=Math.pow(singleDigit,count(n));
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Result from stack building approach");
        isArmstrong(n, 0);
        System.out.println("Result from stack falling approach");
        System.out.println(isArmstrong(n)==n?"ArmStrong Number":"Not a Armstrong number");
    }
}
