public class SNS {

 private String companyName;
 private int facebookFollowers;
 private int instagramFollowers;
 
 public void setCompanyName(String c) {
  this.companyName = c;
 }
 public void setFacebookFollowers(int fb) {
  this.facebookFollowers = fb;
 }
 public void setInstagramFollowers(int ig) {
  this.instagramFollowers = ig;
 }

 public String getCompanyName() {
  return this.companyName;
 }
 public int getFacebookFollowers() {
  return this.facebookFollowers;
 }
 public int getIntstagramFollowers() {
  return this.instagramFollowers;
 }

 public String toString() {
  return "Company name - " + this.companyName
  + "\nFacebook followers=" + this.facebookFollowers
  + "\nInstagram follwers=" + this.instagramFollowers;
 }
 public int totalFans() {
  return Integer.sum(this.facebookFollowers, this.instagramFollowers);
 }
 
 public static void main(String[] args) {
  SNS sns = new SNS();
  sns.setCompanyName("Daiwa");
  sns.setFacebookFollowers(500_000);
  sns.setInstagramFollowers(600);
  System.out.println(sns.toString());
  System.out.println("Total followers=" + sns.totalFans());
 }
}