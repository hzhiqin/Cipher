/**
 * Created by zhiqinhuang on 2/9/17.
 */
public class SubstitutionCipher {
    static final int KEY=10;
    static final int LEFT=0;
    static final int RIGHT=1;

    public String work(String plainText){
        char[] pT=plainText.toCharArray();
        for (int i=0;i<pT.length;i++) {
            if(pT[i]<'K'){
                pT[i]=(char)(pT[i]+16);
            }else {
                pT[i]=(char)(pT[i]-10);
            }
        }
        return String.valueOf(pT);
    }
}
