package marine;

import lombok.Getter;

import java.util.List;

@Getter
public class Submarine {

  private int x;
  private int y;

  public Submarine(int horizontal, int depth) {
    this.x = horizontal;
    this.y = depth;
  }

  public void move(List<Instruction> instructions) {

    int n = 0;
    while (n < instructions.size()) {

      Instruction instruction = instructions.get(n);
      String text = instruction.getT();

      if ("down".equals(text)) {
        y += instruction.getX();
        n++;
        continue;
      }

      if ("up".equals(text)) {
        y -= instruction.getX();
        n++;
        continue;
      }

      x += instruction.getX();
      n++;
    }
  }

}