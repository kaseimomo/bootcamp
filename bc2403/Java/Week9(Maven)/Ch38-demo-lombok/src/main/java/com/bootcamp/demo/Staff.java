package com.bootcamp.demo;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Getter
public class Staff {

 int id;
 String name;
 String position;
 LocalDate joinDate;


}
