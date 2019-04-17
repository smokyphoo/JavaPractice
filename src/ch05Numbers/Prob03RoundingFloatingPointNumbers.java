package ch05Numbers;

/*
  문제 : 반올림이 필요한 경우

  해결방법 : round()
 */
public class Prob03RoundingFloatingPointNumbers {

  static final double THRESHOLD = 0.54;

  public static void main(String[] args) {
    for (double d = 0.1; d <= 1.0; d += 0.05) {
      System.out.println("My way = " + d + "->" + round(d));
      System.out.println("Math way = " + d + "->" + Math.round(d));
    }
  }

  public static int round(double d) {
    return (int) Math.floor(d + 1.0 - THRESHOLD);
  }

}
