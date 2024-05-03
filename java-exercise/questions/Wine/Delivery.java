package Wine;

import java.math.BigDecimal;

public class Delivery {
 private String courier;
 private int fee;

 public Delivery(String courier, int fee) {
  this.courier = courier;
  this.fee = fee;
 }

public int total() {
 return this.fee * WineMaker.subTotal;
}

 
}
