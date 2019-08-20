package Java12;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Compact Number Format- New
 * @author asharda
 *
 */
public class CrunchifyJava12 {

	public static void main(String[] args) {

		NumberFormat crunchifyFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		String crunchifyResult = crunchifyFormat.format(100000);
		System.out.println("NumberFormat.Style.SHORT Result: "+crunchifyResult);
	}

}
