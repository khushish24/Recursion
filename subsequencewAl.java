import java.util.ArrayList;

public class subsequencewAl {
    static ArrayList<String> getAllSubsequences(String str){
        //Termination case
        if(str.length()==0){
            ArrayList<String> list=new ArrayList<>();
            list.add("");
            return list;
        }
        //list is just for traversing
        //we have to make another arraylist which can extract element 
        //into another arraylist,using for loop
        //small problem (make a string smaller)
        char firstChar=str.charAt(0);
        ArrayList<String> result=new ArrayList<>();
        ArrayList<String> list=getAllSubsequences(str.substring(1));
        for(String s:list){
            //not to include
            result.add(s);
            //to include
            result.add(firstChar+s);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> result=getAllSubsequences("abc");
        System.out.println(result);   
    }
}