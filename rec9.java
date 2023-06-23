public class rec9 {
    //stack building method
    static void valueOcc(int arr[],int lastIndex,int occurrence,int searchValue){
        if(lastIndex==-1){
            System.out.println(occurrence);
            return;
        }
        if(arr[lastIndex]==searchValue){
            occurrence++;
        }
        valueOcc(arr,lastIndex-1,occurrence,searchValue);
        
    }
    //stack falling method
    static int valueOcc(int arr[],int lastIndex,int searchValue) {
        //termination case
        if(lastIndex==(-1)){
            return 0;
        }
        int occurrence=valueOcc(arr,lastIndex-1,searchValue);
        if(arr[lastIndex]==searchValue){ 
            occurrence++;
        }
        return occurrence;
    }
    public static void main(String[] args) {
        int arr[]={10,90,10,20,40,88};
        int searchValue=10;
        System.out.println("Result from stack building approach:");
        valueOcc(arr,arr.length-1,0,searchValue);
        System.out.println("Result from stack falling approach:");
        System.out.println(valueOcc(arr,arr.length-1, searchValue));
    }
}
