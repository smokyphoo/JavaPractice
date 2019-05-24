package ch06Arrays;

import java.util.Arrays;

/*
  문제 : 배열을 복사하고싶을때

  해결방법 : copyOf(),copyOfRange()를 사용하라
 */
public class Prob06CopyArray {

    public static void main(String[] args){
      int[] intArray = new int[5];

      for(int index = 0; index < intArray.length; index++){
        intArray[index] = index*3;
      }
      int[] otherIntArray1 = Arrays.copyOf(intArray,3);
      System.out.println("otherIntArray1");
      printArray(otherIntArray1);
      int[] otherIntArray2 = Arrays.copyOf(intArray,5);
      System.out.println("otherIntArray2");
      printArray(otherIntArray2);
      int[] otherIntArray3 = Arrays.copyOfRange(intArray,2,5);
      System.out.println("otherIntArray3");
      printArray(otherIntArray3);
    }

    public static void printArray(int[] arr){
      System.out.println("============");
      for(int result : arr){
        System.out.println(result);
      }
      System.out.println("============");
    }

}
