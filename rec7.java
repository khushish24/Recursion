public class rec7 {
    static String s="abaaa";
    //stack building method
    static void isPalStr(String str){
        if(str.length()==1||str.length()==0){
            System.out.println("Palindrome String");
            return;
        } 
        if(str.charAt(0)!=str.charAt(str.length()-1)){
            System.out.println("Not a Palindrome String");
            return;
        }
        isPalStr(str.substring(1,str.length()-1));
 }
        
        
    //stack falling method
    static String isPalString(String str){
        if(str.length()==1){
            return str;
        }
            String result= isPalString(str.substring(1));
            result+=str.charAt(0);
            return result;
    }
    public static void main(String args[]) {
      System.out.println("Result from stack building approach:");
      isPalStr(s);
      System.out.println("Result from stack falling approach:");
      System.out.println(isPalString(s).equals(s)?"Palimdrome String":"Not a Palimdrome String");
    }
}