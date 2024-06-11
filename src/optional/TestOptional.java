package optional;

import java.util.Optional;

public class TestOptional {

    public static void main(String[] args) {
        String str = null;

        Optional<String> optional = Optional.ofNullable(str);
       String str1 = Optional.ofNullable(str).orElse("Pranita");
        System.out.println(str1);

        Optional<String> optional1 = Optional.of(str);
        System.out.println(optional1);
    }
}
