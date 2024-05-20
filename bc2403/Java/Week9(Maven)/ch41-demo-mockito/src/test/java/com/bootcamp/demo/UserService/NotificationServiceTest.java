package com.bootcamp.demo.UserService;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class NotificationServiceTest {
 
 @Mock
 private EmailService emailService;

 @Mock 
 private SMSService smsService;

 @InjectMocks
 private NotificationService notificationService;

 @Test
 public void testSendNotification(){
  when(emailService.sentEmail("Hello")).thenReturn(true);
  when(smsService.sendSMS("Hello")).thenReturn(true);

  boolean result = notificationService.sentNotification("Hello");

  assertTrue(result);

  verify(emailService, times(1)).sentEmail("Hello");
  verify(smsService, times(1)).sendSMS("Hello");
 }

}
