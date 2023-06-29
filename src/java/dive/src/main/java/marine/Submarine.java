package marine;

import lombok.Getter;

import java.util.List;

@Getter
public class Submarine {
  private Position position;

  public Submarine(int horizontal, int depth) {
    this.position = new Position(horizontal, depth);
  }

  public void move(List<Instruction> instructions) {

    int n = 0;
    while (n < instructions.size()) {

      Instruction instruction = instructions.get(n);


      String text = instruction.getText();

      if ("down".equals(text)) {
        position = position.withDepth(position.getDepth() + instruction.getX());
        n++;
        continue;
      }

      if ("up".equals(text)) {
        position = position.withDepth(position.getDepth() - instruction.getX());
        n++;
        continue;
      }

      position = position.withHorizontal(position.getHorizontal() + instruction.getX());


      n++;
    }
  }

}