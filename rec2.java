public class rec2 {
    //stack building approach
    static void countZero(int num,int count){
        if(num==0){
            System.out.println(count);
            return;
        }
        int singleDigit=num%10;
        if(singleDigit==0){
            count++;
        }
        countZero(num/10,count);
    }
    //stack falling approach
    static int countZero(int num){
        if(num==0){
            return 0;
        }
        int count=countZero(num/10);
        int singleDigit=num%10;
        if(singleDigit==0){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num=102030;
        System.out.println("Result from stack building approach");
        countZero(num,0);
        System.out.println("Result from stack falling approach");
        System.out.println(countZero(num));
    }
}
