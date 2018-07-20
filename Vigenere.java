import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zhiqinhuang on 2/16/17.
 */
public class Vigenere {

    public void work(String cipher) {
        ArrayList<Character> string1 = new ArrayList<>();
        ArrayList<Character> string2 = new ArrayList<>();
        ArrayList<Character> string3 = new ArrayList<>();
        for (int i = 0; i < cipher.length(); i = i + 3) {
            string1.add(cipher.charAt(i));
            try {
                string2.add(cipher.charAt(i + 1));
                string3.add(cipher.charAt(i + 2));
            } catch (IndexOutOfBoundsException e) {
            } finally {
                continue;
            }
        }
        String text1 = Arrays.toString(string1.toArray(new Character[string1.size()])).replace("[", "").replace("]", "").replace(", ", "");
        System.out.println(text1);
        String text2 = Arrays.toString(string2.toArray(new Character[string2.size()])).replace("[", "").replace("]", "").replace(", ", "");
        System.out.println(text2);
        String text3 = Arrays.toString(string3.toArray(new Character[string3.size()])).replace("[", "").replace("]", "").replace(", ", "");
        System.out.println(text3);
    }
}
