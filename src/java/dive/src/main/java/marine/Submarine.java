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

    for (int n = 0; n < instructions.size(); n++) {

      Instruction instruction = instructions.get(n);


      String text = instruction.getText();

      if ("down".equals(text)) {
        position = position.withDepth(position.getDepth() + instruction.getX());
        continue;
      }

      if ("up".equals(text)) {
        position = position.withDepth(position.getDepth() - instruction.getX());
        continue;
      }

      position = position.withHorizontal(position.getHorizontal() + instruction.getX());


    }
  }

}