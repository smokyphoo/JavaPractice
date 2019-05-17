package ch06Arrays;

/*
  문제 : 배열의 갯수를 알고싶을때

  해결방법 : length()을 사용하라
 */
public class Prob02Length {
  static int[] arr = new int[5];

  public static void main(String[] args){
    arrInit();
  }

  public static void arrInit(){
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 6;

    System.out.print(arr.length);
  }

}
