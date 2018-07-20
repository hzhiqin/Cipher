/**
 * Created by zhiqinhuang on 2/16/17.
 */
public class LetterFrequency {
    static final int LENGTH=26;
    double[] frequencyDetect(String cipher){
        int total=cipher.length();
        double[] amount=new double[LENGTH];
        for(int i=0;i<total;i++){
            amount[cipher.charAt(i)-97]=amount[cipher.charAt(i)-97]+1;
        }
        double[] result=new double[LENGTH];
        for(int j=0;j<LENGTH;j++){
            result[j]=amount[j]/total;
        }
        return result;
    }
}
