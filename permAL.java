import java.util.ArrayList;

public class permAL {
    static ArrayList<String> perm(String str){
        if(str.length()==0){
            ArrayList<String> list=new ArrayList<>();
            list.add("");
            return list;
        }
        // ArrayList<String> result=new ArrayList<>();
        ArrayList<String> list=perm(str.substring(1));
        char firstChar=str.charAt(0);
        ArrayList<String> result=new ArrayList<>();
        for(String s:list){
            for(int i=0;i<=s.length();i++){
                StringBuilder sb=new StringBuilder(s);
                sb.insert(i,firstChar);
                result.add(sb.toString());
            }
            // //to add in front(pre)
            // result.add(firstChar+s);
            // //to add after(post)
            // result.add(s+firstChar);
        }
        return result;
    }
    public static void main(String[] args) {
        // ArrayList<String> result=perm("abc");
        System.out.println(perm("abc"));
        //System.out.println(result);
        // String s="a";
        // System.out.println(s.length());
    }
}
