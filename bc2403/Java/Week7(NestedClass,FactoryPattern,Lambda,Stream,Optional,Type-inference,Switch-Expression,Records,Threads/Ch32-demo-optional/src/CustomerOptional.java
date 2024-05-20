import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CustomerOptional {
 private Optional<String> name;

 public Optional<String> getName() { // getName() 誰でも分かる, getter/setter should not return Optional<T>
  return this.name;
 }

 public static void main(String[] args) {
 // deserialization/ serialization 序列化
 // {
 // "name" : "John"
 // }

 // Java Object <-> JSON (deserialization/ serialization)
 // Optional<T> cannot be supported by deserialization / serialization


 List<String> names = new ArrayList<>(List.of("Vincent", "Jenny", "Ocscar"));
 // stream
 List<Optional<String>> result = names.stream()// 
 // .map(e -> Optional.ofNullable(e)) //
 .map(Optional::ofNullable) // method reference
 .collect(Collectors.toList());
 System.out.println(result);
}
}
