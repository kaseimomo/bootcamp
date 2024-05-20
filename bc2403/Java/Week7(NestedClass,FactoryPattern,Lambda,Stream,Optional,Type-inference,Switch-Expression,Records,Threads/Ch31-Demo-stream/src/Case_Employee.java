import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Case_Employee {
 private String name;
 private String department;
 private double salary;

 public Case_Employee(String name, String department, double salary) {
  this.name = name;
  this.department = department;
  this.salary = salary;
 }

 public String getName() {
  return this.name;
 }

 public String getDepartment() {
  return this.department;
 }

 public double getSalary() {
  return this.salary;
 }

 public static void main(String[] args) {
  List<Case_Employee> employees = new ArrayList<>();
  employees.add(new Case_Employee("Alice", "HR", 60_000));
  employees.add(new Case_Employee("Bob", "IT", 45_000));
  employees.add(new Case_Employee("Carol", "Finance", 75_000));
  employees.add(new Case_Employee("David", "HR", 48_000));
  employees.add(new Case_Employee("Jenny", "IT", 60_000));

  // stream
  // 1. filter salary >= 60000 and dapartment = "IT"
  // 2. map the name of the result set to a list of String

  List<String> name = employees.stream() //
  .filter(e -> e.getSalary() >= 60_000 && "IT".equals(e.getDepartment())) //
  .map(e -> e.getName()) //
  .collect(Collectors.toList());
  System.out.println(name); // [Jenny]



  
// filter
// map
// flatmap
// forEach
// distinct
// count
// sort
// 
 }
}
