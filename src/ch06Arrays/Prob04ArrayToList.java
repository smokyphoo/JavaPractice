package ch06Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
  문제 : 배열을 List로 바꾸고싶을때

  해결방법 : Arrays.asList()를 사용하라, primitive 타입들을 변환할시에는 Object로 변환시켜야한다

  *https://stackoverflow.com/questions/17520964/how-to-create-arraylist-arraylistinteger-from-array-int-in-java
 */
public class Prob04ArrayToList {

  public static void main(String[] args) {
    int[] intArray = new int[5];
    String[] strArray = new String[3];
    strArray[0] = "int";
    strArray[1] = "long";
    strArray[2] = "double";

    for (int index = 0; index < intArray.length; index++) {
      intArray[index] = index + 1;
    }

    List<Integer> intList = new ArrayList<>();
    for (int intValue : intArray) {
      intList.add(intValue);
    }
    System.out.println(intList);

    List<String> strList = new ArrayList<>(Arrays.asList(strArray));
    System.out.println(strList);

  }

}
