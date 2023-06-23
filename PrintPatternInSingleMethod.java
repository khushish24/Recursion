public class PrintPatternInSingleMethod {
    static void leftPyramid(int row,int star){
        if(row==0){
            return;
        }
       if(star>0){
        System.out.print("*");
        leftPyramid(row, star-1);
       }else{
        System.out.println();
        leftPyramid(row-1, row-1);
       }
    
    }

    public static void main(String[] args) {
        leftPyramid(5, 5);
    }
}
