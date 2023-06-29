package marine;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import lombok.SneakyThrows;

public final class FileUtils {
  private FileUtils() {
    throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
  }

  @SneakyThrows
  public static String getInputAsString(String input) {
    return Files.readString(
        Path.of(Objects.requireNonNull(FileUtils.class.getClassLoader().getResource(input)).toURI()));
  }

  @SneakyThrows
  public static String[] getInputAsSeparatedLines(String input) {
    return getInputAsString(input).split("\n");
  }
}
