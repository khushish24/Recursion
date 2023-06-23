public class rec8 {
    //stack building method
    static void searchV(int arr[],int lastIndex,int searchValue){
        if(lastIndex==-1){
            System.out.println("Element not found");
            return;
        }
        if(arr[lastIndex]==searchValue){
            System.out.println("Element found");
            return;
        }
        searchV(arr,lastIndex-1,searchValue);
        
    }
    //stack falling method
    static int search(int arr[],int lastIndex,int searchValue) {
        //termination case
        if(lastIndex==(-1)){
            return -1;
        }
        if(arr[lastIndex]==searchValue){ //case for element found
            return lastIndex;
        }
        //small problem
        //returning return value down the stack
        //System.out.println(arr[lastIndex]);
        return search(arr,lastIndex-1,searchValue);
    }
    public static void main(String[] args) {
        int arr[]={10,90,100,20,40,88};
        int searchValue=1;
        System.out.println("Result from stack building approach:");
        searchV(arr,arr.length-1,searchValue);
           System.out.println("Result from stack falling approach:");
        System.out.println(search(arr,arr.length-1, searchValue)>=0?"Element Found":"Element Not found");
    }
}
