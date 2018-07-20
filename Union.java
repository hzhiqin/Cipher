/**
 * Created by zhiqinhuang on 2/16/17.
 */
public class Union {
    static void combine(String a,String b,String c){
        StringBuffer buffer=new StringBuffer();
        for (int i=0;i<a.length();i++){
            buffer.append(a.charAt(i));
            buffer.append(b.charAt(i));
            buffer.append(c.charAt(i));
        }
        System.out.println(buffer);
    }
}
