package Transports;

import java.math.BigDecimal;

public class Bus implements Transport {
 
 private int seats;
 private double speed;

 @Override
 public double arrivalTime() {
  return BigDecimal.valueOf(this.speed) //
  .divide(BigDecimal.valueOf(distance)) //
  .multiply(BigDecimal.valueOf(minute)) //
  .doubleValue();
 }

}
