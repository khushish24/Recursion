public class productArr {
    static int prodArr(int arr[],int index){
        if(index>=arr.length){
            return 1;
        }
        int result=arr[index]*prodArr(arr, index+1);
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(prodArr(arr, 0));
    }
}
