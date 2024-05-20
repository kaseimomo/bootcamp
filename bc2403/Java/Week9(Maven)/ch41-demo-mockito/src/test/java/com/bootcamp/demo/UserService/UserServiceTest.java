package com.bootcamp.demo.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
 
 @Mock
 private UserRepository userRepository;

 @InjectMocks
 private UserService userService;

 @Test
 public void getUserNmae() {
  // set mock
  when(userRepository.findUserById(1)).thenReturn("Charles Chan");

  // test mothod
  String userName = userService.getUserName(1);

  // test userName
  assertEquals("Charles Chan", userName);

  // verify method call/invocation
  verify(userRepository).findUserById(1);
 }
}
