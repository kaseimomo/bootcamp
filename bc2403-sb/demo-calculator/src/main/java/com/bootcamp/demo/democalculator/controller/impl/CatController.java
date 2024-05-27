package com.bootcamp.demo.democalculator.controller.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.democalculator.controller.CatOperation;
import com.bootcamp.demo.democalculator.model.Cat;
import com.bootcamp.demo.democalculator.model.Color;

@Controller
@ResponseBody
public class CatController implements CatOperation{

 // Java method returns Java object (Cat)
 //
 @Override
 public Cat test() {
  return new Cat("ABC", 13, new Color[]{Color.BLACK, Color.RED});
 }

 // API return List<Cat>
 @Override
 public List<Cat> getAllCat() {
  return new ArrayList<>(List.of(new Cat("Charles", 13, new Color[]{Color.BROWN, Color.WHITE}),
    new Cat("Amy", 17, new Color[]{Color.WHITE})));
 }

 // API return Cat array
 @Override
 public Cat[] getArrCat() {
  return new Cat[] {new Cat("Charles", 13, new Color[]{Color.RED}),
    new Cat("Jack", 29, new Color[]{Color.BLACK})};
 }
}
