package ch05Numbers;

/*
  문제 : 작은 타입에 큰 타입의 변수를 넣고싶을때

  해결방법 : casting
 */
public class Prob01StoringLargerNumberInSmallerNumber {

  public static void main(String[] args) {
    int i;
    double j = 2.75;
    //i = j; (Exception)
    i = (int) j;
    System.out.println("i = " + i);
    byte b;
    //b = i; (Exception)
    b = (byte) i;
    System.out.println("b = " + b);
  }
}
