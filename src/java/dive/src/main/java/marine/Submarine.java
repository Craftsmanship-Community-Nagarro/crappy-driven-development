package marine;

import java.util.List;

public class Submarine {

  private int x;
  private int y;

  public Submarine(int horizontal, int depth) {
    this.x = horizontal;
    this.y = depth;
  }

  public void move(List<String> instructions) {

    int n = 0;
    while (n < instructions.size()) {

      String t = instructions.get(n);
      int index = t.indexOf(' ');
      String substring0 = t.substring(0, index);
      int length = t.length();
      String substring1 = t.substring(index + 1, length);
      String trim = substring1.trim();
      int x1 = Integer.parseInt(trim);
      int x11 = x1;

      if ("down".equals(substring0)) {
        y += x11;
        n++;
        continue;
      }

      if ("up".equals(substring0)) {
        y -= x11;
        n++;
        continue;
      }

      x += x11;
      n++;
    }
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }
}
