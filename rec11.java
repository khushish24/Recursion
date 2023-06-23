import java.util.ArrayList ;

public class rec11 {
    //stack building method
    static void replaceValue(int arr[],int lastIndex,ArrayList <Integer> result,int searchValue,int value){
        if(lastIndex==arr.length){
            System.out.println(result);
            return;
        }
        if(arr[lastIndex]==searchValue){
            result.add(value);
        }else{
            result.add(arr[lastIndex]);
        }
        replaceValue(arr,lastIndex+1,result,searchValue,value);
        
    }
    //stack falling method
    static ArrayList<Integer> replaceValue(int arr[],int lastIndex,int searchValue,int value) {
        //termination case
        if(lastIndex==-1){
            ArrayList<Integer> indexArr=new ArrayList<>();
            return indexArr;
        }
        ArrayList <Integer> result=new ArrayList<>();
        result=replaceValue(arr,lastIndex-1,searchValue,value);
        if(arr[lastIndex]==searchValue){ 
            result.add(value);
        }else{
            result.add(arr[lastIndex]);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={10,20,10,20,40,88};
        int searchValue=20;
        int value=100;
        ArrayList <Integer> result=new ArrayList<>();
        System.out.println("Result from stack building approach:");
        replaceValue(arr,0,result,searchValue,value);
        System.out.println("Result from stack falling approach:");
        System.out.println(replaceValue(arr,arr.length-1, searchValue,value));
    }
}