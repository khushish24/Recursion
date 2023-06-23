public class FactorialRec {
    static void fact(int n,int result){
        if(n==1 || n==0){
            System.out.println(result);
            return;
        }
        fact(n-1,result*n);
    }
    static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
       return n*fact(n-1);
    }
    public static void main(String[] args) {
        fact(5,1);
        int a=  fact(5);
        System.out.println(a);
    }
}
