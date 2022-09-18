import vsu.ru.silnov.Range;
import vsu.ru.silnov.RangeMap;
import vsu.ru.silnov.RangeSet;

import java.util.Scanner;

public class GUI {

    public void demoInterfaceString(RangeMap<String, Range> rangeMap){
        Scanner scanner = new Scanner(System.in);
        print();
        String line = scanner.nextLine();
        switch (line) {
            case "1" -> {
                System.out.println("Введите ключ:");
                String key = scanner.nextLine();
                System.out.println("Введите начальное число последовательности");
                int from = scanner.nextInt();
                System.out.println("Введите конечное число последовательности");
                int to = scanner.nextInt();
                rangeMap.put(key, from, to);
            }
            case "2" -> {
                System.out.println("Введите ключ");
                String key2 = scanner.nextLine();
                rangeMap.remove(key2);
            }

            case "3" -> {
                System.out.println("Введите ключ");
                String key3 = scanner.nextLine();
                if(rangeMap.containsKey(key3)){
                    System.out.println("Ключ " + key3 + " найден!");
                } else {
                    System.out.println("Ключ не найден!");
                }
            }

            case "4" -> System.out.println(rangeMap.toString());

            case "5" -> System.exit(0);
        }
        demoInterfaceString(rangeMap);
    }

    public void demoInteger(RangeMap<Integer, Range> rangeMap){
        Scanner scanner = new Scanner(System.in);
        print();
        String line = scanner.nextLine();
        switch (line) {
            case "1" -> {
                System.out.println("Введите ключ:");
                String key = scanner.nextLine();
                System.out.println("Введите начальное число последовательности");
                int from = scanner.nextInt();
                System.out.println("Введите конечное число последовательности");
                int to = scanner.nextInt();
                rangeMap.put(Integer.parseInt(key), from, to);
            }
            case "2" -> {
                System.out.println("Введите ключ");
                String key2 = scanner.nextLine();
                rangeMap.remove(Integer.parseInt(key2));
            }

            case "3" -> {
                System.out.println("Введите ключ");
                String key3 = scanner.nextLine();
                if(rangeMap.containsKey(Integer.parseInt(key3))){
                    System.out.println("Ключ " + key3 + " найден!");
                } else {
                    System.out.println("Ключ не найден!");
                }
            }

            case "4" -> System.out.println(rangeMap.toString());

            case "5" -> System.exit(0);
        }
        demoInteger(rangeMap);
    }

    public void demoDouble(RangeMap<Double, Range> rangeMap){
        Scanner scanner = new Scanner(System.in);
        print();
        String line = scanner.nextLine();
        switch (line) {
            case "1" -> {
                System.out.println("Введите ключ:");
                String key = scanner.nextLine();
                System.out.println("Введите начальное число последовательности");
                int from = scanner.nextInt();
                System.out.println("Введите конечное число последовательности");
                int to = scanner.nextInt();
                rangeMap.put(Double.parseDouble(key), from, to);
            }
            case "2" -> {
                System.out.println("Введите ключ");
                String key2 = scanner.nextLine();
                rangeMap.remove(Double.parseDouble(key2));
            }

            case "3" -> {
                System.out.println("Введите ключ");
                String key3 = scanner.nextLine();
                if(rangeMap.containsKey(Double.parseDouble(key3))){
                    System.out.println("Ключ " + key3 + " найден!");
                } else {
                    System.out.println("Ключ не найден!");
                }
            }

            case "4" -> System.out.println(rangeMap.toString());

            case "5" -> System.exit(0);
        }
        demoDouble(rangeMap);
    }


    public void demoLong(RangeMap<Long, Range> rangeMap){
        Scanner scanner = new Scanner(System.in);
        print();
        String line = scanner.nextLine();
        switch (line) {
            case "1" -> {
                System.out.println("Введите ключ:");
                String key = scanner.nextLine();
                System.out.println("Введите начальное число последовательности");
                int from = scanner.nextInt();
                System.out.println("Введите конечное число последовательности");
                int to = scanner.nextInt();
                rangeMap.put(Long.parseLong(key), from, to);
            }
            case "2" -> {
                System.out.println("Введите ключ");
                String key2 = scanner.nextLine();
                rangeMap.remove(Long.parseLong(key2));
            }

            case "3" -> {
                System.out.println("Введите ключ");
                String key3 = scanner.nextLine();
                if(rangeMap.containsKey(Long.parseLong(key3))){
                    System.out.println("Ключ " + key3 + " найден!");
                } else {
                    System.out.println("Ключ не найден!");
                }
            }

            case "4" -> System.out.println(rangeMap.toString());

            case "5" -> System.exit(0);
        }
        demoLong(rangeMap);
    }

    public void demoFloat(RangeMap<Float, Range> rangeMap){
        Scanner scanner = new Scanner(System.in);
        print();
        String line = scanner.nextLine();
        switch (line) {
            case "1" -> {
                System.out.println("Введите ключ:");
                String key = scanner.nextLine();
                System.out.println("Введите начальное число последовательности");
                int from = scanner.nextInt();
                System.out.println("Введите конечное число последовательности");
                int to = scanner.nextInt();
                rangeMap.put(Float.parseFloat(key), from, to);
            }
            case "2" -> {
                System.out.println("Введите ключ");
                String key2 = scanner.nextLine();
                rangeMap.remove(Float.parseFloat(key2));
            }

            case "3" -> {
                System.out.println("Введите ключ");
                String key3 = scanner.nextLine();
                if(rangeMap.containsKey(Float.parseFloat(key3))){
                    System.out.println("Ключ " + key3 + " найден!");
                } else {
                    System.out.println("Ключ не найден!");
                }
            }

            case "4" -> System.out.println(rangeMap.toString());

            case "5" -> System.exit(0);
        }
        demoFloat(rangeMap);
    }

    public void print(){
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить");
        System.out.println("2. Удалить");
        System.out.println("3. Поиск");
        System.out.println("4. Распечатать коллекцию");
        System.out.println("5. Выйти");
    }

    public void demoSet(){
        RangeSet<Range> rangeSet = new RangeSet<>();
        Scanner scanner = new Scanner(System.in);
        print();
        String line = scanner.nextLine();

        switch (line){
            case "1" -> {
                System.out.println("Введите начальное число последовательности");
                int from = scanner.nextInt();
                System.out.println("Введите конечное число последовательности");
                int to = scanner.nextInt();
                Range range = new Range(from,to);
                rangeSet.add(range);
            }

            case "2" -> {
                System.out.println("Введите начальное число последовательности");
                int from = scanner.nextInt();
                System.out.println("Введите конечное число последовательности");
                int to = scanner.nextInt();
                Range range = new Range(from,to);
                rangeSet.remove(range);
            }

            case "3" -> {
                System.out.println("Введите начальное число последовательности");
                int from = scanner.nextInt();
                System.out.println("Введите конечное число последовательности");
                int to = scanner.nextInt();
                Range range = new Range(from,to);
            }

            case "4" -> System.out.println(rangeSet.toString());

            case "5" -> System.exit(0);
        }
        demoSet();
    }

    public void printMap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип ключа");
        types();
        String line = scanner.nextLine();
        switch(line){
            case "1" -> {
                RangeMap<String,Range> mapString = new RangeMap<>();
                demoInterfaceString(mapString);
            }

            case "2" -> {
                RangeMap<Integer,Range> mapInt = new RangeMap<>();
                demoInteger(mapInt);
            }

            case "3" -> {
                RangeMap<Double,Range> mapDouble = new RangeMap<>();
                demoDouble(mapDouble);
            }

            case "4" -> {
                RangeMap<Long,Range> mapLong = new RangeMap<>();
                demoLong(mapLong);
            }

            case "5" -> {
                RangeMap<Float,Range> mapF = new RangeMap<>();
                demoFloat(mapF);
            }
        }
    }

    public void types(){
        System.out.println("1. String");
        System.out.println("2. Integer");
        System.out.println("3. Double");
        System.out.println("4. Long");
        System.out.println("5. Float");
    }
}
