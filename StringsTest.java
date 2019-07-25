
package Java12;

/**
 * Java12 Features -String
 * @author asharda
 *
 */
public class StringsTest {

    public static void main(String[] args) {

        String message="This is a test message";
        System.out.println(message.indent(5));//Using Indent
        String message1="100";
        int i=message1.transform(Integer::parseInt); //Using Transform
        System.out.println(i);

    }

}
