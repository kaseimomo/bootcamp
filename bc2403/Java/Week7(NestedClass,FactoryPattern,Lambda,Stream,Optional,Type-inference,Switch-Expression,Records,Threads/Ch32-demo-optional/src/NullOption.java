import java.util.List;
import java.util.Optional;

public class NullOption {
    public static void main(String[] args) throws Exception {
        System.out.println(upperName("Steven")); // Optional[STEVEN]
        System.out.println(upperName("Steven").get()); // STEVEN
        System.out.println(upperName(null)); // Optional.empty

        Optional<String> result = upperName(null);

        // 1. ifPresent()
        result.ifPresent(e -> {
            System.out.println("hello" + e.charAt(0)); // e -> T (String.class)
        });

        upperName(null).ifPresent(e -> {
            System.out.println("hello" + e.charAt(0)); // e must be non-null value
        });

        // 2. isPresent()
        Optional<String> name = Optional.of("Charles");
        if (name.isPresent()) {
            System.out.println("example 2 = " + name.get().charAt(0)); // No risk on NPE
        } else {
            System.out.println("example 2 = " + name); // Optional.empty -> you cannot call get()
        }

        // 3. orElse
        // name = Optional.ofNullable(null);
        String user = name.orElse("Jenny");// <- 萬一冇名嗰陣就俾個名你
        System.out.println(user);

        // 4. orElseGet 逼你寫lambda
        String user2 = name.orElseGet(() -> "Jenny"); // Supplier<T>
        System.out.println(user2);

        // 5. orElseThrow
        String user3 = name.orElseThrow(() -> new RuntimeException());
        System.out.println(user3);

        // 6. stream and optional
        CatOptional cat = List
                .of(new CatOptional(3, "Charles"), new CatOptional(6, "Oscar"),
                        new CatOptional(10, "Jenny"),
                        new CatOptional(4, "Tommy"))
                .stream().filter(e -> "Chalres".equals(e.getName())).findFirst() // Optional<CatOptional>
                .orElse(new CatOptional(0, "Charles")); //
                System.out.println(cat.getAge());

    }

    public static Optional<String> upperName(String name) {
        // if (name == null)
        // throw new IllegalArgumentException();
        if (name != null)
            return Optional.of(name.toUpperCase());
        return Optional.empty(); // optional object, with null inside
    }
}
