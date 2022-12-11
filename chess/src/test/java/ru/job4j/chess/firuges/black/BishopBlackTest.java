package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.assertj.core.api.Assertions.assertThat;

class BishopBlackTest {

    @Test
    void whenPositionEqualsStartPosition() {
        BishopBlack bishop = new BishopBlack(Cell.C8);
        Cell result = Cell.C8;
        Cell expected = bishop.position();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCopyIsSuccess() {
        BishopBlack bishop = new BishopBlack(Cell.C8);
        Cell result = bishop.copy(Cell.A6).position();
        Cell expected = new BishopBlack(Cell.A6).position();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenWayIsCorrect() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] result = bishop.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(result).isEqualTo(expected);
    }
}