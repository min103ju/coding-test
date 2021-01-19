import java.util.*;
import java.time.LocalDateTime;

public class UniqueEmailAddress2 {
    
    public static void main(String[] args) {

        System.out.println("start : " + LocalDateTime.now());

        String emails[] = {
            "test.email+james@coding.com",
            "test.e.mail+toto.jane@coding.com",
            "testemail+tom@cod.ing.com"
        };

        System.out.println("result : " + solve(emails));

        System.out.println("end : " + LocalDateTime.now());
        
    }

    public static int solve(String[] emails) {

        Set<String> set = new HashSet<>();

        for(String email : emails) {
            String localName = makeLocalName(email);
            String domainName = makedomainName(email);

            set.add(localName + domainName);
        }

        return set.size();
    }

    private static String makeLocalName(String email){
        StringBuilder sb = new StringBuilder();

        for(char c : email.toCharArray()){
            //1. .은 지나친다.
            if(c == '.'){
                continue;
            }
            //2. + 이후 문자는 등록하지 않는다.
            if(c == '+'){
                break;
            }
            //3. @ 이후 문자는 등록하지 않는다.
            if(c == '@'){
                break;
            }

            sb.append(String.valueOf(c));

        }

        return sb.toString();

    }

    private static String makedomainName(String email){
        return email.substring(email.lastIndexOf('@'));
    }

}
