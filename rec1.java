public class rec1 {
    //stack building method
    static void powerofNum(int num,int pow,int result){
        if(pow==0){
            System.out.println(result);
            return;
        }
        result*=num;
        powerofNum(num,pow-1,result);
    }
    //stack falling mathod
    static int powerOfNum(int num,int pow){
        if(pow==0){
            return num;
        }
        int result=powerOfNum(num, pow-1);
        if(pow>=1){
           result*=num;
        }
        return result;
    }
    public static void main(String[] args) {
        int num=2;
        int pow=5;
        System.out.println("Result from stack building approach");
        powerofNum(num,pow,num);
        System.out.println("Result from stack falling approach");
        System.out.println(powerOfNum(num, pow));
    }
}
