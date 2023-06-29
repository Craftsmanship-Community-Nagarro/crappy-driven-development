package marine;

public class Position {
    private final int horizontal;
    private final int depth;

  public Position(int horizontal, int depth) {
    this.horizontal = horizontal;
    this.depth = depth;
  }

  public int getHorizontal() {
    return this.horizontal;
  }

  public int getDepth() {
    return this.depth;
  }

  public Position withHorizontal(int horizontal) {
    return this.horizontal == horizontal ? this : new Position(horizontal, this.depth);
  }

  public Position withDepth(int depth) {
    return this.depth == depth ? this : new Position(this.horizontal, depth);
  }
}
