package com.bootcamp.demo.democalculator.controller;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@ResponseBody
public class DatabaseController {

  // belongs to Class
  private final static int[] database = new int[] {10, -3, 9};

  private final static Map<String, Integer> familyInfo = new HashMap<>();

  // Design an API, get the value from array by index
  // index value checking
  // index range: if / try catch
  @GetMapping(value = "/database/getValue/{index}")
  public String get(@PathVariable String index) {
    try {
      int idx = Integer.parseInt(index);
      return String.valueOf(database[idx]);
    } catch (NumberFormatException e) {
      return "the index should be an integer value.";
    } catch (ArrayIndexOutOfBoundsException e) {
      return "the index is out of range of the array size.";
    }
  }

  // API: sorting (decending)
  // stream / Collection
  @GetMapping(value = "/database/sorting")
  public void sort() {

    Comparator<Integer> decending = (i1, i2) -> i1.compareTo(i2) > 0 ? -1 : 1;

    int[] newArr = Arrays.stream(database)//
        .boxed() //
        .sorted(decending) //
        .mapToInt(e -> e.intValue()) //
        .toArray();

    for (int i = 0; i < database.length; i++) {
      database[i] = newArr[i];
    }
  }

  // API: return the array
  @GetMapping(value = "/database/arr")
  public String arr() {
    return Arrays.toString(database);
  }

  @GetMapping(value = "/database/Family")
  public Map<String, Integer> getFamilyInfo(@RequestParam String name, @RequestParam int age) {
    familyInfo.put(name, age);
    return familyInfo;
  }
//https://tw.openrice.com/zh/taipei/restaurants?landmarkId=33025&tabIndex=0
// public String getFamilyInfo(@PathVariable String lang,//
// @PathVariable country 
// @PathVariable restaurants 
// @RequestParam String landmarkId
// @RequestParam String tabIndex 


}

