public class rec5 {
    //stack building approach
    static void isPrimeRec(int num,int divisible){
        if(divisible==1){
            System.out.println("Prime Number");
            return;
        }
        if(divisible>1){
            if(num%divisible==0){
                System.out.println("Not a Prime Number");
                return;
            }
        }
        isPrimeRec(num, divisible-1);
    }
    //stack falling approach
    static int isPrimeRec(int num,int divisible,int result){
        if(divisible==1){
            return 1;
        }
        
        result=isPrimeRec(num, divisible-1,result);
        if(divisible>1){
            if(num%divisible==0){
                //System.out.println("Not a Prime Number");
                result*=0;
            }else{
                result*=1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int num=17;
        System.out.println("Result from stack building approach");
        isPrimeRec(num, num-1);
        System.out.println("Result from stack falling approach");
        System.out.println(isPrimeRec(num,num-1,0)==1?"Prime Number":"Not a Prime Number");
    }
}
