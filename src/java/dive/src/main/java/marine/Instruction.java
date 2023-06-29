package marine;

public class Instruction {
  private final String t;
  private final int x;

  public Instruction(String t, int x) {
    this.t = t;
    this.x = x;
  }

  public static Instruction fromText(String t) {
    int index = t.indexOf(' ');
    String substring0 = t.substring(0, index);
    int length = t.length();
    String substring1 = t.substring(index + 1, length);
    String trim = substring1.trim();
    int x1 = Integer.parseInt(trim);
    int x11 = x1;
    Instruction instruction = new Instruction(substring0, x11);
    return instruction;
  }

  public String getT() {
    return this.t;
  }

  public int getX() {
    return this.x;
  }
}
