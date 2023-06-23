public class rec13 {
    //stack building method
      static void insertElement(String str,int index,StringBuilder result){
        if(index==str.length()-1){
            System.out.println(result);
            return;
        }
        if(str.charAt(index)==str.charAt(index+1)){
            result.insert(index+1,'*');
        }
        insertElement(result.toString(), index+1,result);
      }
    //stack falling method
   static String insertElement(String str,int index){
        if(index==str.length()-1){
            return str;
        }
        StringBuilder result=new StringBuilder(insertElement(str, index+1));
         if(str.charAt(index)==str.charAt(index+1)){
            result.insert(index+1,'*');
        }
       return result.toString();
    }
    public static void main(String[] args) {
        String str="aabbcc";
        StringBuilder result=new StringBuilder(str);
        System.out.println("Result from stack building approach:");
        insertElement(str, 0,result);
        System.out.println("Result from stack falling approach:");
        System.out.println(insertElement(str,0));
    }
}