public class rec4 {
    //stack building approach
    static void sumOfSeries(int num,double result){
        if(num==0){
            System.out.println(result);
            return;
        }
        result+=num/(Math.pow(num,num));
        sumOfSeries(num-1, result);
    }
    //stack falling approach
    static double sumOfSeries(int num){
        if(num==0){
            return 0;
        }
        double result=sumOfSeries(num-1);
        result+=num/(Math.pow(num,num));
        return result;
    }
    public static void main(String[] args) {
        int num=3;
        System.out.println("Result from stack building approach");
        sumOfSeries(num,0);
        System.out.println("Result from stack falling approach");
        System.out.println(sumOfSeries(num));
    }
}
