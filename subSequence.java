public class subSequence {
    static void subS(String str,String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }
        char firstChar=str.charAt(0);
        subS(str.substring(1),result+firstChar);
        subS(str.substring(1),result);
    }
    public static void main(String[] args) {
        subS("abc", "");
    }
}
