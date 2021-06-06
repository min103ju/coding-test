import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class PhoneNumberList2 {
    
    public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book, (o1, o2) -> o2.length() - o1.length());

        HashMap<String, String> hm = new HashMap<>();
        for (String str : phone_book) {
            if (hm.get(str) != null) {
                return false;
            }
            for (int i = 1, len = str.length() ; i <= len; i++) {
                hm.put(str.substring(0, i), "");
            }
        };
        return true;
    }
}
