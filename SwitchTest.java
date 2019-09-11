package Java12;


/**
 * Using Switch Expression in Java
 * @author asharda
 *
 */
public class SwitchTest {

	public static void main(String[] args) {

		int num=1;
		int m =switch(num)
				{
				case 1->5;
				default->10;
				};

				System.out.println("  Value of num seen is "+m);


	}

}
