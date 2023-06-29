package marine;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Instruction {
  private final String t;
  private final int x;

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
}