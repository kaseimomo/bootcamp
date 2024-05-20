package objects;

import java.time.LocalDate;

public class Student {

 private String sid;

 private String name;

 private LocalDate dob;

 public Student(String sid, String name, LocalDate dob) {
  this.sid = sid;
  this.name = name;
  this.dob = dob;
 }

 public String getName() {
  return this.name;
 }

 public LocalDate getDOB() {
  return this.dob;
 }

 public String getSid() {
  return this.sid;
 }

 @Override // override equals() 
 public boolean equals(Object obj) { // 
  if (this == obj)
   return true;
  if (!(obj instanceof Student))
   return false;
  Student student = (Student) obj;
  // return this.name.equals(student.getName()) //
  // && this.dob.compareTo(student.getDOB()) == 0 //
  // && this.sid.equals(student.getSid()); // <- 其實關鍵係sid
  return this.sid.equals(student.getSid()); // 
 }

 public static void main(String[] args) {
  Student s1 = new Student("S1", "Charles", LocalDate.of(2000, 1, 1));
  Student s2 = new Student(s1.getSid(), s1.getName(), s1.getDOB());
  System.out.println(s1 == s2); // false
  System.out.println(s1.equals(s2)); // true

  Student s3 = new Student("S3", "Charles", LocalDate.of(2000, 1, 1));
  Student s4 = new Student(s3.getSid(), s3.getName(), s3.getDOB());
  System.out.println(s2 == s4); // false
  System.out.println(s2.equals(s4)); // false

 }
}
