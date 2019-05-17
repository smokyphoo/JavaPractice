package ch06Arrays;

import java.util.Arrays;

/*
  문제 : 이진 탐색(binary search)를 하고싶을때

  해결방법 :
 */
public class Prob05BinarySearch {

  public static void main(String[] args){
    int[] intArray = new int[5];
    for(int index = 0; index < intArray.length; index++){
      intArray[index] = index*3;
      System.out.println(intArray[index]);
    }
    int result = Arrays.binarySearch(intArray,12);
    System.out.println(result);
    System.out.println(intArray[result]);
  }

}
