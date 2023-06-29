package marine;

import static org.assertj.core.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

// Advent of code instructions available here : https://adventofcode.com/2021/day/2
class SubmarineTests {
    @Test
    void should_move_on_given_instructions() {
        var instructions = loadInstructions();

      int result = Submarine.move(instructions);

      assertThat(result).isEqualTo(1690020);
    }

    private List<String> loadInstructions() {
        return Arrays.stream(FileUtils.getInputAsSeparatedLines("submarine.txt"))
//                .map(Instruction::fromText)
                .collect(Collectors.toUnmodifiableList());
    }
}
