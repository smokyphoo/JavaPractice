package ch06Arrays;

import java.util.Arrays;

/*
  문제 : 배열을 특정 값으로 채우고싶을때

  해결방법 : fill()을 사용하라
 */
public class Prob07FillArray {

  public static void main(String[] args){
    int[] intArray = new int[5];
    for(int index = 0; index < intArray.length; index++){
      intArray[index] = index*3;
    }
    Arrays.fill(intArray,5);

    for(int result : intArray){
      System.out.println(result);
    }
  }

}
