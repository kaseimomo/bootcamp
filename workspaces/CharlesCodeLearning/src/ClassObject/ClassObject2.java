package ClassObject;
public class ClassObject2 {
  private String name;
  private String position;
  private double height;
  private String teamName;
  private String occupation;

  // SETTER
  public void setName(String name) {
    this.name = name;
  }
  public void setPosition(String position) {
    this.position = position;
  }
  public void setHeight(double height) {
    this.height = height;
  }
  public void teamName(String teamName) {
    this.teamName = "McRocky";
  }
  public void setOccupation (String occupation) {
    this.occupation = occupation;
  }


  public ClassObject2() { // Empty Constructor
    // 內容由author決定 - 可以係empty時的default
    this.occupation = "平民A";
  }

  // All arguments contructor
  public ClassObject2(String name, String position, double height) {
    this.teamName = "McRocky";
    this.name = name;
    this.position = position;
    this.height = height;
  }

  public String toString() {
    return "Status(" + "Team: " + this.teamName + " Name: " + this.name //
        + " Position: " + this.position + " Height: " + this.height + ")";
  }


  public static void main(String[] args) {
    ClassObject2 baseBallPlayer = new ClassObject2("Ryan", "Right field", 171);
    System.out.println(baseBallPlayer.toString());

    ClassObject2 baseBallPlayer2 = new ClassObject2();
    baseBallPlayer2.setHeight(172.4);
    baseBallPlayer2.setName("Jason");
    baseBallPlayer2.setPosition("Mid-field");
    System.out.println(baseBallPlayer2);



  }
}
