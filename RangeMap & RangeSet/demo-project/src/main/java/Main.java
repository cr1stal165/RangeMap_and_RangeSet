import vsu.ru.silnov.Range;
import vsu.ru.silnov.RangeMap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        GUI gui = new GUI();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите коллекцию ");
        System.out.println("1. RangeMap");
        System.out.println("2. RangeSet");
        String line = scanner.nextLine();
        switch (line){
            case "1" -> gui.printMap();
            case "2" -> gui.demoSet();
        }
    }






}
