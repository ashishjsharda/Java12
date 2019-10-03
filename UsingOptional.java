package Java12;
import java.util.Optional;

/**
 * Using Optional
 * @author asharda
 *
 */
public class UsingOptional {

	public static void main(String[] args) {


		String s = "Hi,Hello,Howdy";
		Optional so=s.describeConstable();
		System.out.println(so);
		System.out.println(so.get());
		
	}

}
