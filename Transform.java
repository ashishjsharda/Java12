package Java12;
import java.util.Arrays;
import java.util.List;

/**
 * Using Transform
 * @author asharda
 *
 */
public class Transform {

	public static void main(String[] args) {
		String s = "Amar,Akbar,Anthony";
		List strList=s.transform(s1 ->{return Arrays.asList(s1.split(","));});
		System.out.println(strList);
	}

}
