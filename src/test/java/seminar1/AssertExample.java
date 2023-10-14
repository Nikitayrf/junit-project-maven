package seminar1;

public class AssertExample {
    public static void main(String[] args) {
//        int x = 10;  // Вывод: "Программа продолжает выполнение"
        int x = -10;  // Вывод: java.lang.AssertionError: x должно быть неотрицательным

        // Проверяем, что x неотрицательно с использованием оператора assert
        assert x >= 0 : "x должно быть неотрицательным";
        System.out.println( "Программа продолжает выполнение" );
    }
}

