import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

class MinMax{
    private final Integer min;
    private final Integer max;

    MinMax(Integer min,Integer max) {
        this.min = min;
        this.max=max;
    }

    public  Integer getMin(){
        return min;
    }

    public  Integer getMax(){
        return max;
    }
}
/**
 *Example using Collections
 * @author ashish
 */
public class Teeing {

     public static void main(String[] args) {

         MinMax minmax = Stream.of(2, 11, 1, 5, 7, 8, 12)
                 .collect(Collectors.teeing(
                         minBy(Comparator.naturalOrder()),
                         maxBy(Comparator.naturalOrder()),
                         (Optional<Integer> a, Optional<Integer> b)
                                 -> new MinMax(a.orElse(Integer.MIN_VALUE),
                                 b.orElse(Integer.MAX_VALUE))));

         System.out.println("Min number is "+minmax.getMin());
         System.out.println("Max number is "+minmax.getMax());
    }
}
