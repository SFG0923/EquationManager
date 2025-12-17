

import org.example.QuadraticEquation;
import org.example.SolverService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SolverServiceTest {

    @Test
    @DisplayName("Должен возвращать больший корень из двух положительных")
    void testGetMaxRootWithTwoPositiveRoots() {
        QuadraticEquation eq = new QuadraticEquation(1, -7, 10);
        SolverService service = new SolverService(eq);
        assertEquals(5.0, service.getMaxRoot(), 0.0001);
    }

    @Test
    @DisplayName("Должен возвращать больший корень при наличии отрицательных")
    void testGetMaxRootWithNegativeRoots() {

        QuadraticEquation eq = new QuadraticEquation(1, 2, -8);
        SolverService service = new SolverService(eq);
        assertEquals(2.0, service.getMaxRoot(), 0.0001);
    }

    @Test
    @DisplayName("Должен возвращать единственный корень, если D=0")
    void testGetMaxRootWithSingleRoot() {

        QuadraticEquation eq = new QuadraticEquation(1, -6, 9);
        SolverService service = new SolverService(eq);
        assertEquals(3.0, service.getMaxRoot(), 0.0001);
    }


    @Test
    @DisplayName("Проверка работы с большими числами")
    void testLargeNumbers() {
        QuadraticEquation eq = new QuadraticEquation(1, 0, -1000000);
        SolverService service = new SolverService(eq);
        assertEquals(1000.0, service.getMaxRoot(), 0.0001);
    }
}