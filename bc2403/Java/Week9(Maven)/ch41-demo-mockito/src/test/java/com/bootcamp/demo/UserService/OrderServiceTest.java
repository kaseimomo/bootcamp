package com.bootcamp.demo.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
 
 @Mock
 private OrderRepository orderRepository;

 @Mock
 private PaymentService paymentService;

 @InjectMocks
 private OrderService orderService;

 @Test
 public void testPlaceOrderAndPaymentSuccess() {
  // set mock
  when(paymentService.proccessPayment(100)).thenReturn(true);
  when(orderRepository.findOrderById(1)).thenReturn("Order 1");

  // test method
  String result = orderService.placeOrder(1, 100);

  // test result
  assertEquals("Order 1", result);

  // verify
  verify(paymentService, times(1)).proccessPayment(100);
  verify(orderRepository, times(1)).findOrderById(1);
 }

 @Test
 public void testPlaceOrderAndPaymentFail() {
  when(paymentService.proccessPayment(100)).thenReturn(false);

  String result = orderService.placeOrder(10, 100);

  assertEquals("Payment failed. Place order cannot proccess...", result);

  verify(paymentService, times(1)).proccessPayment(100);
  verify(paymentService, times(0)).proccessPayment(200);
 }
}
