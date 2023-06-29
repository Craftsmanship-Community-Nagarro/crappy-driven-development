package marine;

import java.util.List;

public class Submarine {

  public static int x = 0;
  public static int y = 0;

  public static int move(List<String> instructions) {

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

      if ("forward".equals(substring0)) {
        x += x11;
        n++;
        continue;
      }

      x = 0;
      y = 0;
    }

    return x*y;
  }

}
