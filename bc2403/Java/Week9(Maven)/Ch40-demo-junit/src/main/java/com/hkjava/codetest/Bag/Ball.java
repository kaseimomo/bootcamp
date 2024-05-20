package com.hkjava.codetest.Bag;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Ball {
  private int value;
  private Color color;

  public static Ball of(int value, Color color) {
    return new Ball(value, color);
  }

}
