
package Java12;

/**
 * Using Switch
 * @author asharda
 *
 */
public class SwitchStatement {


    public static void main(String[] args) {

        int number=2;
        String numExp="";
        String temp=switch(number)
        {
            case 1 -> numExp="1";
            case 2 -> numExp="2";
            default ->numExp="No Number";
        };
        System.out.println("Number seen is "+temp);


    }

}
