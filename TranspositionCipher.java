/**
 * Created by zhiqinhuang on 2/7/17.
 * Columnar cipher
 */
public class TranspositionCipher {
    final static int[] KEYWORD={1,0,2,4,3};
    final static int keyLength=5;

    public void work(String content){
        int remainder=content.length()%keyLength;
        int row;
        int k=0;
        if (remainder==0){
            row=content.length()/keyLength;
        }else{
            row=content.length()/keyLength+1;
        }
        char [][] cache=new char[row][5];
        for(int i=0;i<row;i++){
            for(int j:KEYWORD){
                if(k<content.length()) {
                    cache[i][j] = content.charAt(k);
                    k++;
                }else{
                    cache[i][j]= '%';
                }
            }
        }
        for(int j=0;j<5;j++) {
            for (int i=0; i < row; i++) {
                System.out.print(cache[i][j]);
            }
        }
    }
}
