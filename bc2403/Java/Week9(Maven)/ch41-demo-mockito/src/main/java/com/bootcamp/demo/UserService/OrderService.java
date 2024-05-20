package com.bootcamp.demo.UserService;

public class OrderService {
 private OrderRepository orderRepository;
 private PaymentService paymentService;

 public OrderService(OrderRepository orderRepository,
   PaymentService paymentService) {
  this.orderRepository = orderRepository;
  this.paymentService = paymentService;
 }

 public String placeOrder(int orderId, int amount) {
  if (paymentService.proccessPayment(amount)) {
   return orderRepository.findOrderById(orderId);
  }
  return "Payment failed. Place order cannot proccess...";
 }
}
