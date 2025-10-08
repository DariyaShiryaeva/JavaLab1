import java.util.Random;

public class MyRandom {

  private static final Random random = new Random();

  public static int getRandNum() {
    return (random.nextInt(10) + 1); // 1-10
  }

  public static int[] getRandArr(int amount) {
    int[] array = new int[amount];
    int randNum;
    for (int i = 0; i < amount; i++) {
      randNum = getRandNum();
      array[i] = randNum;
    }
    return array;
  }


}