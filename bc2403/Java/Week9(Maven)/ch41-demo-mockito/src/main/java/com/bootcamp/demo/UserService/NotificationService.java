package com.bootcamp.demo.UserService;

public class NotificationService {
 private EmailService emailService;
 private SMSService smsService;

 public NotificationService(EmailService emailService, SMSService smsService) {
  this.emailService = emailService;
  this.smsService = smsService;
 }

 public boolean sentNotification(String msg) {
  boolean emailSent = emailService.sentEmail(msg);
  boolean smsSent = smsService.sendSMS(msg);
  return emailSent && smsSent;
 }
}
