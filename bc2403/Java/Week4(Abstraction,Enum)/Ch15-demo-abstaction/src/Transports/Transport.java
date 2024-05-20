package Transports;

import java.math.BigDecimal;

public interface Transport {
 int noOfPassenger = 100;
 double distance = 2.0d; // km
 double minute = 60.0d;


 // Implicitly public
 double arrivalTime();
}
