public class rec12 {
    //stack building method
      static void replaceElement(String str,int index,StringBuilder result){
        if(index==str.length()-1){
            System.out.println(result);
            return;
        }
        if(str.charAt(index)==str.charAt(index+1)){
            result.setCharAt(index+1,'#');
        }
        //replaceElement(result.toString(), index+1,result);
        replaceElement(str, index+1,result);
      }
    //stack falling method
    static String replaceElement(String str,int index){
        if(index==str.length()-1){
            //StringBuilder result=new StringBuilder(str);
            return str;
        }
        StringBuilder result=new StringBuilder(replaceElement(str, index+1));
         if(str.charAt(index)==str.charAt(index+1)){
            result.setCharAt(index+1,'#');
        }
       return result.toString();
    }
    public static void main(String[] args) {
        String str="aaabbbcc";
        StringBuilder result=new StringBuilder(str);
        System.out.println("Result from stack building approach:");
        replaceElement(str, 0,result);
        System.out.println("Result from stack falling approach:");
        System.out.println(replaceElement(str,0));
    }
}
