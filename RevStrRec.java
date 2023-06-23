public class RevStrRec {
    static String reverse(String str){
        if(str.length()==1){
        //return String.valueOf(str.charAt(0));
        return str;
         }
         String smallString=str.substring(1);
         String smallResult=reverse(smallString);
         //processing logic
         char firstChar=str.charAt(0);
         return smallResult+firstChar;
        }
    public static void main(String[] args) {
        String rev= reverse("khushi");
        System.out.println(rev);
    }
}
