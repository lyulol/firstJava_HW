package guru.qa;

public class FirstJavaLesson {
    public static void main(String[] args) {
        intOperations(76, 53);
        intDoubleOperations(12, 3.5);
        logicOperations();
        comparisonOperations(15, 12);
        overflowOperations();
    }

    public static void intOperations(int a, int b) {
        System.out.println("Операции с int:");
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Деление: " + (a / b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Остаток от деления: " + (a % b));
    }

    public static void intDoubleOperations(int c, double d) {
        System.out.println("Операции с int и double:");
        System.out.println("Сложение: " + (c + d));
        System.out.println("Вычитание: " + (c - d));
        System.out.println("Деление: " + (c / d));
        System.out.println("Умножение: " + (c * d));
        System.out.println("Остаток от деления: " + (c % d));
    }

    public static void logicOperations() {
        String status = "employee";
        int age = 28;
        int childrenNumber = 2;

        System.out.println("Логические операции:");
        System.out.println("Логическое И - статус employee и возраст меньше 30: " + (status.equals("employee") && age < 30));
        System.out.println("Логическое ИЛИ - возраст больше 30 ИЛИ количество детей больше 1: " + (age > 30 || childrenNumber > 1));
        System.out.println("Логическое отрицание - статус НЕ student: " + !(status.equals("student")));
    }

    public static void comparisonOperations(int a, int b) {
        System.out.println("Операторы сравнения:");
        System.out.println("a больше b: " + (a > b));
        System.out.println("a меньше b: " + (a < b));
        System.out.println("a больше или равно b: " + (a >= b));
        System.out.println("a меньше или равно b: " + (a <= b));
    }

    public static void overflowOperations() {
        double maxDouble = Double.MAX_VALUE;
        float maxFloat = -Float.MAX_VALUE;

        System.out.println("Переполнение при сложении: " + (maxDouble + maxDouble));
        System.out.println("Переполнение при умножении: " + (maxFloat * 2));
    }

}