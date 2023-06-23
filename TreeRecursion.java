public class TreeRecursion {
    //Branch recursion or multi branch
    static void branch(int n){
        if(n>=3){
            return;
        }
        System.out.println();
        branch(n+1);
        branch(n+2);
    }
    public static void main(String[] args) {
        
    }
}
