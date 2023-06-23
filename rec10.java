import java.util.ArrayList ;

public class rec10 {
    //stack building method
    static void countIndex(int arr[],int lastIndex,ArrayList <Integer> result,int searchValue){
        if(lastIndex==arr.length){
            System.out.println(result);
            return;
        }
        if(arr[lastIndex]==searchValue){
            result.add(lastIndex);
        }
        countIndex(arr,lastIndex+1,result,searchValue);
        
    }
    //stack falling method
    static ArrayList<Integer> countIndex(int arr[],int lastIndex,int searchValue) {
        //termination case
        if(lastIndex==-1){
            ArrayList<Integer> indexArr=new ArrayList<>();
            return indexArr;
        }
        ArrayList <Integer> result=new ArrayList<>();
        result=countIndex(arr,lastIndex-1,searchValue);
        if(arr[lastIndex]==searchValue){ 
            result.add(lastIndex);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={10,20,10,20,40,88};
        int searchValue=20;
        ArrayList <Integer> result=new ArrayList<>();
        System.out.println("Result from stack building approach:");
        countIndex(arr,0,result,searchValue);
        System.out.println("Result from stack falling approach:");
        System.out.println(countIndex(arr,arr.length-1, searchValue));
    }
}
