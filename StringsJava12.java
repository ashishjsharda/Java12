/**
 * Using Java 12 String Methods
 * @author asharda
 *
 */
public class StringsJava12 {

	public static void main(String[] args) {

		String str = "*****\n  Hi\n  \tHello James\rHow are you?\n*****";
		System.out.println(str.indent(0));
		System.out.println(str.indent(3));
		System.out.println(str.indent(-3));
	}

}
