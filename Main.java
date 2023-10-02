// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String textt = "Успіхів на курсі";
        System.out.println(textt);
    }

    Scanner board = new Scanner(System.in);
        System.out.println("Введіть температуру в градусах Цельсія:");
    double cel = board.nextDouble();

    double Fahrenheit = (cel * 9/5) + 32;
    double Kelvin = (cel + 273.16);

        System.out.println("По Цельсію - " + cel);
        System.out.println("По Фаренгейту - " + Fahrenheit);
        System.out.println("По Кельвіну  - " + Kelvin);



    Scanner board = new Scanner(System.in);

        System.out.println("Введіть довжину сторони A ");
    double a = board.nextDouble();

        System.out.println("Введіть довжину сторони B ");
    double b = board.nextDouble();

    double area = (a*b)/2;

        System.out.println("Площа прямокутного трикутника = " + area);







}
}