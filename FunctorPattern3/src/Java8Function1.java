import java.util.function.Function;

public class Java8Function1 {

    public static void main() {

        Function<String, Integer> func = x -> x.length();

        Integer apply = func.apply("mkyong");   // 6

        System.out.println(apply);

    }

}