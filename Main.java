package Test_Calc;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // V_1 сложение примитивным методом работает
//        Calc first_test = new Calc(12,10);
//        System.out.println(first_test.Sum(first_test.getNum_1(),first_test.getNum_2()));


        // V_2 принятие данных от пользователя
//        Calc second_test = new Calc();
//        second_test.Controller();
//        second_test.Sum(second_test.getNum_1(),second_test.getNum_2());

        // V_3 добавление записи в файл
//        Calc third_test = new Calc(2,10);
//        File file = new File("FileTest");
//        PrintWriter pw = new PrintWriter(file);
//        pw.println(third_test.Sum(third_test.getNum_1(),third_test.getNum_2()));
//
//        pw.close();

        // V_3.5 логирование + запись в файл
//        Calc four_test = new Calc(2,7);
        Logger logger = Logger.getLogger(Logger.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sForm = new SimpleFormatter();
        fh.setFormatter(sForm);
//        logger.log(Level.INFO, "Test");
//        logger.info(four_test.SumToStr(3,7));

        // V_4 добавление выбора знака и переопределение метода сложения
//        Calc five_test = new Calc();
//        five_test.Controller();
//        five_test.TestCalc();

        // V_5 добавление умножения, деления и вычитания. Запись в логирование
        Calc six_test = new Calc();
        six_test.Controller();
        six_test.TestCalc();
        logger.info(six_test.toStr());

        // V_6 Generic... (не понял как привести к обжекту, чтоб компилировалось) к примеру, сложить обджекты нельзя
//        Calc seven_test = new Calc();
//        seven_test.Controller();
//        seven_test.TestCalc();
//        logger.info(seven_test.toStr());




    }
}
