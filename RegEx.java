import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Example using Reg Ex
 * @author ashish
 */
public class RegEx {


    public static void main(String[] args) {

        Pattern pattern= Pattern.compile("Java");
        Matcher matcher=pattern.matcher("I like Java");
        System.out.println(matcher.find());

    }
}
