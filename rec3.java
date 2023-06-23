public class rec3 {
    //stack building approach
    static void sumNum(int num,int result){
        if(num==0){
            System.out.println(result);
            return;
        }
        result+=num;
        sumNum(num-1,result);
    }
    //stack falling approach
    static int sumNum(int num){
        if(num==0){
         return 0;
        }
        int result=sumNum(num-1);
        result+=num;
        return result;
        }
    public static void main(String[] args) {
        int num=10;
        System.out.println("Result from stack building approach");
        sumNum(num,0);
        System.out.println("Result from stack falling approach");
        System.out.println(sumNum(num));
    }
}
