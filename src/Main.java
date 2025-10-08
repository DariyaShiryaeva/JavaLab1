import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CheckInput checkInput = new CheckInput();
    Random ran = new Random();
    int n = 0;
    boolean check = false;

    System.out.println(
        "Добрый день! Вы рассматриваете лабораторную работу №1, введите номер задания, которое хотите проверить");

    // Первый цикл для проверки, что введено целое число и номер задания
    while (true) {
      System.out.print("Введите номер задания: ");
      String input = scanner.nextLine();
      if (CheckInput.isInteger(input)) {
        n = Integer.parseInt(input);
        if (n >= 1 && n <= 20) {
          break;
        } else {
          System.out.println("Ошибка! Число должно быть от 1 до 20.");
        }
      } else {
        System.out.println(
            "Ошибка ввода! Нужно ввести номер задания, а не текст. Пожалуйста, повторите попытку ввода.");
      }
    }

    System.out.println("Вы выбрали задание №" + n);
    Test test = new Test();

    switch (n) {
      case 1:
        double number;
        while (true) {
          System.out.println("Введите число, дробную часть которого желаете найти");
          String input = scanner.nextLine();
          if (CheckInput.isDouble(input)) {
            number = Double.parseDouble(input);
            break;
          } else {
            System.out.println(
                "Ошибка ввода! Нужно ввести число, не текст. Пожалуйста, повторите попытку ввода.");
          }
        }
        double out = test.fraction(number);
        System.out.println(out);
        break;

      case 2:
        String character;
        while (true) {
          System.out.println("Введите символ от 0 до 9:");
          character = scanner.next();
          if (character.equals("-0")) {
            character = "0";
          }
          if (CheckInput.isInteger(character)) {
            if (character.length() == 1) {
              break;
            } else {
              System.out.println("Ошибка! Число должно быть от 0 до 9.");
            }
          } else {
            System.out.println(
                "Ошибка ввода! Нужно ввести число от 0 до 9, а не текст. Пожалуйста, повторите попытку ввода.");
          }
        }
        int result = test.charToNum(character.charAt(0));
        System.out.println("Результат: " + result);
        scanner.nextLine();
        break;

      case 3:
        System.out.println("Введите число, в двузначности которого хотите убедиться");
        int num3 = CheckInput.getInteger(scanner);
        boolean res3 = test.is2Digits(num3);
        System.out.println(res3);
        break;

      case 4:
        System.out.println("Введите первое число: ");
        int x4 = CheckInput.getInteger(scanner);
        System.out.println("Введите второе число: ");
        int y4 = CheckInput.getInteger(scanner);
        System.out.println("Введите третье число: ");
        int z4 = CheckInput.getInteger(scanner);
        boolean flag = test.isInRange(x4, y4, z4);
        if (flag) {
          System.out.println(flag);
          System.out.println(z4 + " находится в промежутке между " + x4 + " и " + y4);
        } else {
          System.out.println(flag);
          System.out.println(z4 + " находится вне промежутка между " + x4 + " и " + y4);

        }
        break;

      case 5:
        System.out.println("Введите первое число: ");
        int x5 = CheckInput.getInteger(scanner);
        System.out.println("Введите второе число: ");
        int y5 = CheckInput.getInteger(scanner);
        System.out.println("Введите третье число: ");
        int z5 = CheckInput.getInteger(scanner);
        boolean OUT = test.isEqual(x5, y5, z5);
        if (OUT) {
          System.out.println(OUT);
          System.out.println("Числа равны друг другу");
        } else {
          System.out.println(OUT);
          System.out.println("Числа не равны друг другу");
        }
        break;

      case 6:
        System.out.println("Введите число, модуль которого хотите найти: ");
        int num6 = CheckInput.getInteger(scanner);
        int res6 = test.abs(num6);
        System.out.println("Результат: " + res6);
        break;

      case 7:
        System.out.print(
            "Введите число для проверки на делимости на 5 или на 3, но не на оба сразу: ");
        int num7 = CheckInput.getInteger(scanner);
        boolean res7 = test.is35(num7);
        System.out.println("Результат: " + res7);
        break;

      case 8:
        System.out.println("Введите первое число: ");
        int x8 = CheckInput.getInteger(scanner);
        System.out.println("Введите второе число: ");
        int y8 = CheckInput.getInteger(scanner);
        System.out.println("Введите третье число: ");
        int z8 = CheckInput.getInteger(scanner);
        int res8 = test.max3(x8, y8, z8);
        System.out.println("Максимум из трех чисел: " + res8);
        break;

      case 9:
        System.out.println("Метод возвращает сумму чисел x и y. Однако, если сумма попадает");
        System.out.println("в диапазон от 10 до 19, метод вернет число 20.");
        System.out.println("Введите первое число: ");
        int x9 = CheckInput.getInteger(scanner);
        System.out.println("Введите второе число: ");
        int y9 = CheckInput.getInteger(scanner);
        int res9 = test.sum2(x9, y9);
        System.out.println("Результат: " + res9);
        break;

      case 10:
        System.out.print("Введите число от 1 до 7, чтобы узнать день недели: ");
        int num10 = CheckInput.getInteger(scanner);
        String res10 = test.day(num10);
        System.out.println("Это " + res10);
        break;

      case 11:
        System.out.println("Метод вернет строку из чисел от 0 до ");
        int num11 = CheckInput.getInteger(scanner);
        String res11 = test.listNums(num11);
        System.out.println(res11);
        break;

      case 12:
        System.out.println("Введите число: ");
        long x12 = CheckInput.getLong(scanner);
        int res12 = test.numLen(x12);
        System.out.println("Количество знаков в введенном числе: " + res12);
        break;

      case 13:
        System.out.println("Введите длину стороны квадрата: ");
        int x13 = CheckInput.getInteger(scanner);
        test.square(x13);
        break;

      case 14:
        System.out.println("Введите высоту треугольника: ");
        int x14 = CheckInput.getInteger(scanner);
        test.rightTriangle(x14);
        break;

      case 15:
        System.out.println("Метод возвращает индекс первого вхождения числа x в массив arr.\n"
            + "Если число не входит в массив – возвращается -1.");
        int m15 = CheckInput.getNumb12(scanner);
        int amount15;
        int[] arr15;
        if (m15 == 1) {
          System.out.println("Введите количество чисел в массиве: ");
          amount15 = CheckInput.getInteger(scanner);
          arr15 = CheckInput.getIntArray(scanner, amount15);
        } else {
          amount15 = MyRandom.getRandNum();
          arr15 = MyRandom.getRandArr(amount15);
        }
        CheckInput.outArray(arr15, amount15);

        System.out.println("Введите число, индекс вхождения которого хотите найти: ");
        int num15 = CheckInput.getInteger(scanner);
        int res15 = test.findFirst(arr15, num15);
        System.out.println("Индекс первого вхождения: " + res15);
        break;

      case 16:
        System.out.println("Метод возвращает наибольшее по модулю (то есть без учета знака)\n"
            + "значение массива arr.");
        int m16 = CheckInput.getNumb12(scanner);
        int amount16;
        int[] arr16;
        if (m16 == 1) {
          System.out.println("Введите количество чисел в массиве: ");
          amount16 = CheckInput.getInteger(scanner);
          arr16 = CheckInput.getIntArray(scanner, amount16);
        } else {
          amount16 = MyRandom.getRandNum();
          arr16 = MyRandom.getRandArr(amount16);
        }
        CheckInput.outArray(arr16, amount16);
        int maxi = test.maxAbs(arr16);
        System.out.println("Наибольшее по модулю число в массиве: " + maxi);
        break;

      case 17:
        System.out.println("Метод возвращает новый массив, который будет содержать все\n"
            + "элементы массива arr, однако в позицию pos будут вставлены значения массива ins.");
        int m17 = CheckInput.getNumb12(scanner);
        int amount17;
        int[] arr17;
        int amountIns;
        int[] ins;
        if (m17 == 1) {
          System.out.println("Введите количество чисел в массиве: ");
          amount17 = CheckInput.getInteger(scanner);
          arr17 = CheckInput.getIntArray(scanner, amount17);
        } else {
          amount17 = MyRandom.getRandNum();
          arr17 = MyRandom.getRandArr(amount17);
        }
        CheckInput.outArray(arr17, amount17);

        System.out.println("Теперь насчет массива ins");
        int num17 = CheckInput.getNumb12(scanner);
        if (num17 == 1) {
          System.out.println("Введите количество чисел в массиве: ");
          amountIns = CheckInput.getInteger(scanner);
          ins = CheckInput.getIntArray(scanner, amountIns);
        } else {
          amountIns = MyRandom.getRandNum();
          ins = MyRandom.getRandArr(amountIns);
        }
        CheckInput.outArray(ins, amountIns);
        System.out.println("Теперь введите значение pos: ");
        int pos;
        do {
          System.out.println("Значение pos не должно превышать размера первого массива" +
              "и быть меньше нуля.");
          pos = CheckInput.getInteger(scanner);
        } while (pos < 0 || pos > amount17);
        int[] outIns = test.add(arr17, ins, pos);
        CheckInput.outArray(outIns, amountIns);
        break;

      case 18:
        System.out.println("Метод возвращает данный массив в обратном порядке");
        int m18 = CheckInput.getNumb12(scanner);
        int amount18;
        int[] arr18;
        if (m18 == 1) {
          System.out.println("Введите количество чисел в массиве: ");
          amount18 = CheckInput.getInteger(scanner);
          arr18 = CheckInput.getIntArray(scanner, amount18);
        } else {
          amount18 = MyRandom.getRandNum();
          arr18 = MyRandom.getRandArr(amount18);
        }
        CheckInput.outArray(arr18, amount18);
        int[] out18 = test.reverseBack(arr18);
        System.out.println("Проводим сложные действия...");
        CheckInput.outArray(out18, amount18);
        break;

      case 19:
        System.out.println("Метод возвращает новый массив, в котором записаны индексы\n"
            + "всех вхождений числа x в массив arr");
        int m19 = CheckInput.getNumb12(scanner);
        int amount19;
        int[] arr19;
        if (m19 == 1) {
          System.out.println("Введите количество чисел в массиве: ");
          amount19 = CheckInput.getInteger(scanner);
          arr19 = CheckInput.getIntArray(scanner, amount19);
        } else {
          amount19 = MyRandom.getRandNum();
          arr19 = MyRandom.getRandArr(amount19);
        }
        CheckInput.outArray(arr19, amount19);
        System.out.println("Индексы какого числа хотите обнаружить? ");
        int x19 = CheckInput.getInteger(scanner);
        int[] out19 = test.findAll(arr19, x19);
        System.out.println("Проводим сложные действия...");
        CheckInput.outArray(out19, out19.length);
        break;

      case 20:
        System.out.println("Метод возвращает строку, в которой будут записаны все\n"
            + "четные числа от 0 до x (включительно).");
        System.out.println("Введите число х: ");
        int x20 = CheckInput.getInteger(scanner);
        String res20 = test.chet(x20);
        System.out.println("Получившаяся строка: " + res20);
        break;
    }
    scanner.close();
  }
}