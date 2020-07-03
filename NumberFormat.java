import java.util.Locale;

/**
 * Using Number Format
 * @author ashish
 */
public class NumberFormat {
    public static void main(String[] args) {
        java.text.NumberFormat numberFormat= java.text.NumberFormat.getCompactNumberInstance(Locale.US, java.text.NumberFormat.Style.LONG);
        System.out.println(numberFormat.format(100));
        System.out.println(numberFormat.format(1000));
        System.out.println(numberFormat.format(10000));

    }
}
