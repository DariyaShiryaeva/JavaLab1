public class Test {

  //Возвращает дробную часть числа
  public double fraction(double x) {
    return x - (int) x;
  }

  //Метод преобразовывает символ в соответствующее число
  public int charToNum(char x) {
    return (int) x - 48;
  }

  //Проверяет двузначность числа
  public boolean is2Digits(int x) {
    return (x / 10 != 0 && x / 100 == 0);
  }

  //Проверяет, входит ли число num в промежуток [a,b], отношение a и b заранее неизвестно
  public boolean isInRange(int a, int b, int num) {
    if (a > b) {
      return (b < num && num < a);
    } else {
      return (a < num && num < b);
    }
  }

  ;

  //Метод проверяет равенство трех введенных чисел
  public boolean isEqual(int a, int b, int c) {
    return (a == b && a == c);
  }

  ;

  //Метод возвращает модуль числа
  public int abs(int x) {
    if (x < 0) {
      return (x * -1);
    }
    return x;
  }

  ;

  // Метод возвращает true, если число делится нацело либо на 5, либо на 3,
  // При этом, если оно делится и на 3, и на 5, или не делится ни на одно из них
  // Метод вернет false
  public boolean is35(int x) {
    if ((x % 5 == 0 && x % 3 != 0) || (x % 5 != 0 && x % 3 == 0)) {
      return true;
    }
    ;
    return false;
  }

  ;

  //Метод возвращает максимум из трех данных чисел
  public int max3(int x, int y, int z) {
    int max = x;
    if (y > max) {
      max = y;
    }
    if (z > max) {
      max = z;
    }
    return max;
  }

  ;

  //Метод возвращает сумму чисел x и y. Однако, если сумма попадает
  // в диапазон от 10 до 19, то надо вернуть число 20.
  public int sum2(int x, int y) {
    int sum = x + y;
    if (sum >= 10 && sum <= 19) {
      return 20;
    }
    return sum;
  }

  ;

  //Метод принимает число x, обозначающее день недели, и возвращает
  //строку, которая будет обозначать текущий день недели, где 1- это понедельник,
  //а 7 – воскресенье. Если число не от 1 до 7, метод вернет текст “это не день недели”.
  public String day(int x) {
    return switch (x) {
      case 1 -> "понедельник";
      case 2 -> "вторник";
      case 3 -> "среда";
      case 4 -> "четверг";
      case 5 -> "пятница";
      case 6 -> "суббота";
      case 7 -> "воскресенье";
      default -> "это не день недели!";
    };
  }

  ;

  //Метод возвращает строку, в которой будут записаны
  // все числа от 0 до x (включительно).
  public String listNums(int x) {
    String result = "";
    for (int i = 0; i <= x; i++) {
      result += Integer.toString(i) + " ";
    }
    return result;
  }

  ;

  //  Метод возвращает строку, в которой будут записаны все
//   четные числа от 0 до x (включительно).
  public String chet(int x) {
    String result = "";
    for (int i = 0; i <= x; i += 2) {
      result += Integer.toString(i) + " ";
    }
    return result;
  }

  ;

  //метод возвращает количество знаков в числе x.
  public int numLen(long x) {
    int cnt = 0;
    if (x == 0) {
      return 1;
    }
    if (x < 0) {
      x *= -1;
    }
    while (x > 0) {
      cnt++;
      x /= 10;
    }
    return cnt;
  }

  ;

  //Метод выводи квадрат из "*" со сторонами равными х
  public void square(int x) {
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < x; j++) {
        System.out.print('*');
      }
      System.out.println();
    }
  }

  ;

  //метод выводит на экран треугольник из символов ‘*’ у которого
  // х символов в высоту, а количество символов в ряду совпадает
  // с номером строки, при этом треугольник выровнен по правому краю
  public void rightTriangle(int x) {
    for (int i = 1; i <= x; i++) {
      for (int j = 0; j < x - i; j++) {
        System.out.print(' ');
      }
      for (int j = 0; j < i; j++) {
        System.out.print('*');
      }
      System.out.println();
    }
  }

  ;

  //   Метод возвращает индекс первого вхождения числа x в массив arr.
//   Если число не входит в массив – возвращается -1.
  public int findFirst(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }


  //  Метод возвращает наибольшее по модулю (то есть без учета знака)
//   значение массива arr.
  public int maxAbs(int[] arr) {
    if (arr == null || arr.length == 0) {
      return 0;
    }
    int max = arr[0] < 0 ? -arr[0] : arr[0];
    for (int i = 1; i < arr.length; i++) {
      int cur = arr[i] < 0 ? -arr[i] : arr[i];
      if (cur > max) {
        max = cur;
      }
    }
    return max;
  }

  //  Метод возвращает новый массив, который будет содержать все
//   элементы массива arr, однако в позицию pos будут вставлены значения массива ins.
  public int[] add(int[] arr, int[] ins, int pos) {
    int newLength = arr.length + ins.length;
    int[] result = new int[newLength];
    for (int i = 0; i < pos; i++) {
      result[i] = arr[i];
    }
    for (int i = 0; i < ins.length; i++) {
      result[pos + i] = ins[i];
    }
    for (int i = pos; i < arr.length; i++) {
      result[ins.length + i] = arr[i];
    }
    return result;
  }


  //Возвращает данный массив в обратном порядке
  public int[] reverseBack(int[] arr) {
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[i] = arr[arr.length - 1 - i];
    }
    return result;
  }

  //  Метод возвращает новый массив, в котором записаны индексы
//   всех вхождений числа x в массив arr
  public int[] findAll(int[] arr, int x) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        count++;
      }
    }
    int[] result = new int[count];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        result[index] = i;
        index++;
      }
    }
    return result;
  }
}