package Java12;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Java12 Features - Files mismatch and using Paths
 * @author asharda
 *
 */
public class PathssTest {

    public static void main(String[] args) throws IOException {

        Path f1=Path.of("Solution.java");
        Path f2=Path.of("Solution.java");
        long diff=Files.mismatch(f1, f2);
        System.out.println(diff);

    }

}
