import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import ru.geekBrains.MainApp;

public class MainAppTest {

    /**
     * Тест MainApp.task1()
     * Проверяем на корректность возвращаемого массива
     *
     * */
    @ParameterizedTest
    @ArgumentsSource(Task1ArgumentProvider.class)
    public void testTask1(int[] arr, int[] correct_arr) {
        Assertions.assertArrayEquals(correct_arr, MainApp.task1(arr));
    }

    /**
     * Тест MainApp.task1()
     * Проверяем на то, что возвращает исключение при отсутствии "4" в массиве
     *
     * */
    @Test
    public void testTask1ForException() {
        int[] arr = {1, 2, 44, 24, 3, 7 };
        Throwable thrown = Assertions.assertThrows(RuntimeException.class, () -> {MainApp.task1(arr);});
        Assertions.assertNotNull(thrown.getMessage());
    }

    /**
     * Тест MainApp.task2()
     * Проверяем на то, что корректно возвращается FALSE
     * в случаях, когда нет "1", или нет "4", или есть что то кроме "1" и "4"
     * */
    @ParameterizedTest
    @ArgumentsSource(Task2ArgumentProvider.class)
    public void testTask2ForFalse(int[] arr) {
        Assertions.assertFalse(MainApp.task2(arr));
    }

    /**
     * Тест MainApp.task2()
     * Проверяем на то, что корректно возвращается TRUE
     * когда в массиве только "1" и "4", и присутствуют оба типа значений
     * */
    @Test
    public void testTask2ForTrue() {
        int[] arr = {1, 1, 4, 4, 4, 1, 1 };
        Assertions.assertTrue(MainApp.task2(arr));
    }
}
