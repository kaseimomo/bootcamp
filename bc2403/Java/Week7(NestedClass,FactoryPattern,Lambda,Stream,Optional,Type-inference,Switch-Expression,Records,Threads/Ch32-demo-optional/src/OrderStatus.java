import java.util.Arrays;
import java.util.List;

public enum OrderStatus {
 CONFIRMED(1, "Ordered."), //
 PAID(2, "Paid."), //
 READY_TO_SHIP(3, "Ready to ship."), //
 DELIVERED(4, "Delivered."),;

 private final int code;
 private final String desc;

 private OrderStatus(int code, String desc) {
  this.code = code;
  this.desc = desc;
 }

 public int getCode() {
  return this.code;
 }

 public String getDesc() {
  return this.desc;
 }

 public static OrderStatus get(int code) { // 2 -> PAID
  // stream to find enum(code)
  // for (OrderStatus os : values()) { // you can write in OrderValue.values()
  // }

  // What we learn b4 is Array -> List -> Stream
  // Arrays.asList(values()).stream()

  // below method can directly go just Array -> Stream
  return Arrays.stream(values()) //
    .filter(e -> e.getCode() == 2) //
    .findFirst() //
    .orElseThrow(() -> new IllegalArgumentException());
 }
}
