package marine;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Objects;

public class Submarine {

  public static int x = 0;
  public static int y = 0;

  public static int move() {

    try {
      Arrays.stream(Files.readString(
          Path.of(Objects.requireNonNull(FileUtils.class.getClassLoader().getResource("submarine.txt")).toURI()))
          .split("\n")).forEach(t -> {
        int index = t.indexOf(' ');
        String substring0 = t.substring(0, index);
        int length = t.length();
        String substring1 = t.substring(index + 1, length);
        String trim = substring1.trim();
        int x1 = Integer.parseInt(trim);
        int x11 = x1;

        if ("down".equals(substring0)) {
          y += x11;
        }

        if ("up".equals(substring0)) {
          y -= x11;
        }

        if ("forward".equals(substring0)) {
          x += x11;
        }

        x = 0;
        y = 0;
      });
    } catch (IOException e) {
      e.printStackTrace();
      return -1;
    } catch (URISyntaxException e) {
      e.printStackTrace();
      return -1;
    }

    return x * y;
  }

}
