package com.bootcamp.demo.democalculator.controller.impl;

import javax.print.DocFlavor.READER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo.democalculator.config.AppConfig;
import com.bootcamp.demo.democalculator.controller.TestOperation;
import com.bootcamp.demo.democalculator.model.Cat;

@Controller
@ResponseBody
public class TestController implements TestOperation {

 @Autowired 
 // @Autowired - Find the appConfig object spring context, 
 // and then inject to this object ref
 private AppConfig appConfig; // NPE

 @Autowired(required = false)
 private AppConfig appConfig2;

 //  Implication: testController obj depends on cat obj
 @Autowired
 @Qualifier(value = "white") // inject the obj by bean name
 private Cat cat;

 @Autowired
 @Qualifier(value = "white")
 private Cat cat2;

 @Override
 public String testSayHello() {
  return new AppConfig().sayHello();
 }

 @Override
 public String testSayHello2() {
  return appConfig.sayHello(); // NPE id @Autowired(required = false)
  // if (appConfig == appConfig2) // object reference
  //  return "YES"; // yes
  // return "NO";
 }

 @Override
 public String testSayHello3() {
  if (appConfig.equals(appConfig2))
   return "yes"; // yes
  return "no";
 }

 @Override
 public Cat getWhiteCat() {
  return this.cat;
 }

 @Override
 public String getWhiteCat2() {
  if (this.cat == this.cat2)
   return "Yes";
  return "No";
 }



}
