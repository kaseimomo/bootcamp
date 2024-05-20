package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data 
@RequiredArgsConstructor
// @RequiredArgsConstructor(staticName = "Color")
// @ToString,
// @EqualsAndHashCode
// @Getter
// @Setter

// @AllArgsConstructor
// @NoArgsConstructor
public class Book {

 private final String name;
 @NonNull
 private Color color;

 public static void main(String[] args) {

  // Book t1 = new Book();

  // Book b1 = new Book("Charles", Color.BLACK);
  // b1.setColor(Color.RED);
  // b1.setName("ABC");
  // System.out.println(b1.toString());

  // Book b2 = new Book("Charles", Color.BLACK);
  // b2.setColor(Color.RED);
  // b2.setName("ABC");
  // System.out.println(b1.equals(b2));

  // System.out.println(b1.getName() + " " + b1.getColor());
 }
}
