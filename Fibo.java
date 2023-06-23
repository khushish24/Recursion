public class Fibo {
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    static void fib(int n){
        if(n<=1){
            System.out.println(n);
            return;
        }
        fib(n-1);
        fib(n-2);
    }
    public static void main(String[] args) {
        //fib(7);
        System.out.println(fibo(50));
    }
}
