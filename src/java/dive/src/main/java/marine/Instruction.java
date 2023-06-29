package marine;

public class Instruction {
  private final String t;
  private final int x;

  public Instruction(String t, int x) {
    this.t = t;
    this.x = x;
  }

  public String getT() {
    return this.t;
  }

  public int getX() {
    return this.x;
  }
}
