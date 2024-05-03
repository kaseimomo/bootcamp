public class Member {
 
 private int consumption;
 
 public void setConsumption(int c) {
  this.consumption = c;
 }

 public int getConsumption() {
  return this.consumption;
 }


 public static void main(String[] args) {
  Member member = new Member();
  member.setConsumption(8_000);
  if (member.getConsumption() >= 10_000) {
   System.out.println("This member spends " + member.getConsumption() + 
   " dollars. Thank you Gold VIP!!");
  } else if(member.getConsumption() >= 5_000) {
   System.out.println("This member spends " + member.getConsumption() + 
   " dollars. Thank you Silver member!!");
  } else {
   System.out.println("This member spends " + member.getConsumption() + 
   " dollars. Thank you.");
  }
 }
}
