public class Main {
    public static int calculateResult1(int x) {
        return 3*x + 5;    }
    public static double calculateResult2(double a, double b){
        return (a + b) / (a - b);
    }
    public static double calculateResult3(double a, double x, double b) {
        int factorial = 1;        for (double i = 1; i <= (a*x/b); i++)
        {            factorial *= i;
        }        return (factorial);
    }
    public static void main(String[] args) {
        int result1 = calculateResult1(12);
        System.out.println("Результат вычислений №1: " + result1 );
        double result2 = calculateResult2(3.4, 2.2);
        System.out.println("Результат вычислений №2 " + result2);
        double result3 = calculateResult3(6, 2, 3);
        System.out.println("Результат вычислений №3 " + result3);
    }
}