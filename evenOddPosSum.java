public class evenOddPosSum {
    static int[] sumEvenOddPos(int num,int pos){
        if(num==0){
            int result[]=new int[2];
            return result;
        }
        //small problem
        //pos to maintain the position of the number
        int arr[]=sumEvenOddPos(num/10,pos+1);
        int digit=num%10;
        if(pos%2!=0){
            arr[0]=arr[0]+digit;
        }else{
            arr[1]=arr[1]+digit;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]=sumEvenOddPos(2789,0);
        System.out.println("Odd sum: "+arr[0]);
        System.out.println("Even sum: "+arr[1]);
    }
}
