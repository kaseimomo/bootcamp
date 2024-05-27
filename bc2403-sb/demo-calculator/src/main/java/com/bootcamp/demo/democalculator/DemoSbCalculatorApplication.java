package com.bootcamp.demo.democalculator;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
// @SpringBootConfiguration -> @Configuration
// @EnableAutoConfiguration

// @ComponentScan: Before application starts,
// 1. scan all java classes (under folder on or below the class annotated @SpringBootApplication) annotated with @Controller, @Service, @Repository, @Configuration
// 2. For example, CalculatorController.java(@Controller). Then spring will create an object for CalculatorController.class, and put it into the spring context.
// 3. When there is a client call the API defined in CalculatorController.class, spring will call the object from spring context and then call the instance method.

public class DemoSbCalculatorApplication {

	private static ApplicationContext context;

	public static ApplicationContext getContext() {
		return context;
	}

	public static void main(String[] args) {
		DemoSbCalculatorApplication.context =
				SpringApplication.run(DemoSbCalculatorApplication.class, args);

		// Definition of Bean in Java
		// - Similiar to java object
		// - but bean cannot be explicitly created by the object behavior
		// - Spring itself will perform component scan, and then create the bean (java object) into sping context
		// - You can just annotate @Controller, @Service, @Repository, @Configuration to indicate the above behavior

		// 在面向對象編程（OOP）中，對象行為（object behavior） 通常指的是對象能夠執行的操作或方法。這些操作是通過定義在類中的方法來實現的。每個對象可以有屬性（fields或attributes）和行為（methods或functions）。然而，有時在使用 Spring Boot 或其他框架時，會感覺缺少對象行為.
		/* @Configuration - 在使用 Spring Boot 時，很多類主要用來配置應用程序或提供工具功能，這些類通常沒有複雜的行為。 AppConfig 主要用來創建和配置 bean，通常不包含業務邏輯，因此看起來缺少對象行為。*/
		/*  */

		// String[] beans = springContext.getBeanDefinitionNames();
		// System.out.println(Arrays.toString(beans));

	}

}
