import java.time.LocalDateTime;
import java.util.*;

public class UniqueEmailAddress1 {
    
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
            String localName =  email.split("@")[0];
            String domainName = email.split("@")[1];

            //1. localName : +이후 문자 제거
            localName = localName.split("\\+")[0];
            
            //2. localName : .제거
            localName = localName.replace(".", "");

            //3. localName + domainName && push
            set.add(localName + "@" + domainName);
        }

        return set.size();
    }

}
