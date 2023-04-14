package Test_Calc;

import java.util.List;
import java.util.Scanner;

public class Calc
        implements Sum,Controller {
    int num_1;
    int num_2;
    double sum = 0;
    String znak;


    public Calc(int num_1, int num_2) {
        this.num_1 = num_1;
        this.num_2 = num_2;
    }

    public Calc() {
    }

    public Calc(int num_1) {
        this.num_1 = num_1;
    }

    public int getNum_1() {
        return num_1;
    }

    public void setNum_1(int num_1) {
        this.num_1 = num_1;
    }

    public int getNum_2() {
        return num_2;
    }

    public void setNum_2(int num_2) {
        this.num_2 = num_2;
    }


    /**
     * примитивный метод по получению суммы
     * @param num_1
     * @param num_2
     * @return
     */
    @Override
    public double Sum(int num_1, int num_2) {
        sum = num_1 + num_2;
        System.out.println(sum);
        return sum;
    }


    /**
     * метод по преобразованию суммы (инт) в строку для записи в журнал (лог)
     */
    public String  SumToStr() {
        sum = (double)(num_1) + num_2;
        String res_in_str = Double.toString(sum);
        System.out.println("Сумма сложения двух чисел: " + res_in_str);
        return res_in_str;
    }

    /**
     * финальный метод по  приведению суммы к строке для записи в журнал
     * @return
     */
    public String toStr(){
        String res_str = Double.toString(sum);
        System.out.println("Сумма в журнале: " + res_str);
        return String.valueOf(sum);
    }

    /**
     * общий калькулятор
     */
    @Override
    public void Controller() {
        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            num_1 = 0;
//            num_2 = 0;
//        for (Calc num : nums) {
            System.out.println("Введите первое число: ");
            num_1 = scanner.nextInt();
            System.out.println("Введите знак: ");
            znak = String.valueOf(scanner.next().charAt(0));  // если вдруг пользователь введет больше одного символа
            System.out.println("Введите второе число: ");
            num_2 = scanner.nextInt();
//        }
//        }
    }

    public double TestCalc(){
        if (znak.equals("+")) {
            sum = num_1 + num_2;
            System.out.println("Сложение: " + sum);
        } else if (znak.equals("-")) {
            sum = num_1 - num_2;
            System.out.println("Вычитание: " + sum);
        } else if (znak.equals("*")) {
        sum = num_1 * num_2;
        System.out.println("Умножение: " + sum);
        } if (znak.equals("/")) {
            sum = num_1 / num_2;
            System.out.println("Деление: " + sum);
        }
        return sum;
    }

    public static void Show(List<Calc> nums) {
        for (Calc num : nums) {
            System.out.println(num);
        }
    }

    @Override
    public String toString() {
        return "num_1= " + num_1 + " " + znak + ", num_2= " + num_2;
    }


    public String getZnak() {
        return znak;
    }

    public void setZnak(String znak) {
        this.znak = znak;
    }
}
