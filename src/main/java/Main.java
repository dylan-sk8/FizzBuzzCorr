import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new FizzBuzz(100).generateList().toString());

        FizzBuzz fb = new FizzBuzz(100);
        List<String> numbers = fb.generateList();
        System.out.println(numbers.toString());
        fb.generateList();
    }
}
