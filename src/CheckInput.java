import java.util.Scanner;

public class CheckInput {

  public static boolean isInteger(String str) {
    try {
      Integer.parseInt(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  ;

  public static boolean isDouble(String str) {
    try {
      Double.parseDouble(str);
      return true;
    } catch (NumberFormatException | NullPointerException e) {
      return false;
    }
  }

  public static int getInteger(Scanner scanner) {
    int out;
    while (true) {
      String input = scanner.nextLine();
      if (CheckInput.isInteger(input)) {
        out = Integer.parseInt(input);
        break;
      } else {
        System.out.println(
            "Ошибка ввода! Нужно ввести число, не текст. Пожалуйста, повторите попытку ввода: ");
      }
    }
    return out;
  }

  public static long getLong(Scanner scanner) {
    while (true) {
      String input = scanner.nextLine().trim();

      if (isValidLong(input)) {
        return Long.parseLong(input);
      } else {
        System.out.println("Ошибка! Посторонние символы или количество знаков более 19.");
        System.out.println("Введите корректное целое число: ");
      }
    }
  }

  public static boolean isValidLong(String str) {
    int startIndex = 0;
    if (str.charAt(0) == '-') {
      if (str.length() == 1) {
        return false; // Только минус - не число
      }
      startIndex = 1;
    }

    // Проверяем что все остальные символы - цифры
    for (int i = startIndex; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c < '0' || c > '9') {
        return false; // Найден нецифровой символ
      }
    }

    // Дополнительная проверка через parse для диапазона
    try {
      Long.parseLong(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static int[] getIntArray(Scanner scanner, int amount) {
    int[] array = new int[amount];
    int num;
    for (int i = 0; i < amount; i++) {
      System.out.println("Введите " + (i + 1) + " значение массива: ");
      num = getInteger(scanner);
      array[i] = num;
    }
    return array;
  }

  public static int getNumb12(Scanner scanner) {
    System.out.println("Предпочитаете ввести массив вручную или использовать силу рандома? ");
    System.out.println("(1 - вручную, 2 - рандом)");
    int m;
    while (true) {
      String in = scanner.nextLine();
      if (CheckInput.isInteger(in)) {
        m = Integer.parseInt(in);
        if (m >= 1 && m <= 2) {
          break;
        } else {
          System.out.println("Ошибка! 1 или 2.");
        }
      } else {
        System.out.println(
            "Ошибка ввода! Нужно ввести цифру, а не текст. Пожалуйста, повторите попытку ввода.");
      }
    }
    return m;
  }

  public static void outArray(int[] arr, int amount) {
    System.out.println("Ваш массив: ");
    String array = "[ ";
    for (int i = 0; i < amount; i++) {
      array += Integer.toString(arr[i]) + " ";
    }
    array += "]";
    System.out.println(array);
  }
}
