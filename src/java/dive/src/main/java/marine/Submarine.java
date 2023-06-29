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
    instructions.forEach(this::move);
  }

  private void move(Instruction instruction) {


    String text = instruction.getText();

    if ("down".equals(text)) {
      position = position.withDepth(position.getDepth() + instruction.getX());
      return;
    }

    if ("up".equals(text)) {
      position = position.withDepth(position.getDepth() - instruction.getX());
      return;
    }

    position = position.withHorizontal(position.getHorizontal() + instruction.getX());


  }
}