public class permStr {
    static void perm (String str, String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }
         for (int i = 0; i < str.length(); i++) {
            perm(str.substring(0, i)+str.substring(i+1), result+str.charAt(i));
            //perm(str.substring(1), result+ch);
            //perm(str.substring(1), ch+result);
         }
    }
    public static void main(String[] args) {
        perm("abc","");
        //String str="abc";
        // String result=str.substring(0, 0)+str.substring(1);
        // System.out.println(result);
    }
}
