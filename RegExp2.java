import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Example using Reg Ex
 * @author ashish
 */
public class RegExp2 {


     static public void main(String[] args) {

         Pattern pattern= Pattern.compile("e.+d");
         Matcher matcher=pattern.matcher("end to end testing");
         while(matcher.find()){
             System.out.println("Matched "+matcher.group());
         }
    }
}
