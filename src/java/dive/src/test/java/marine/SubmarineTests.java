package marine;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Advent of code instructions available here : https://adventofcode.com/2021/day/2
class SubmarineTests {
    @Test
    void should_move_on_given_instructions() {

      assertThat(Submarine.move()).isEqualTo(1690020);
    }

}
