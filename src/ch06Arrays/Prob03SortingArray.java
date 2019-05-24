package ch06Arrays;

import java.util.Arrays;

/*
  문제 : 퀵소팅을 하고싶을때

  해결방법 : Arrays.sort()를 사용하라
 */
public class Prob03SortingArray {

  public static void main(String[] args) {
    int[] intArray = new int[10];

    for (int index = 0; index < intArray.length; index++) {
      intArray[index] = (int) (Math.random() * 10);
    }

    Arrays.sort(intArray);
    for (int result : intArray) {
      System.out.println(result);
    }

    System.out.println("================");
    for (int index = 0; index < intArray.length; index++) {
      System.out.println("index " + index + ", result : " + intArray[index]);
    }
  }

}
