public class SortedArrRec {
    static boolean isSortedArray(int arr[],int index){
        if(arr.length-1==index){
           return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isSortedArray(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(isSortedArray(arr, 0)?"Array is Sorted":"Array is not Sorted");
    }
}
