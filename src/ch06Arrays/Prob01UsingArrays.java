package ch06Arrays;

import java.util.Calendar;

/*
  문제 : 배열 사용하기

 */
public class Prob01UsingArrays {

  public static void main(String[] args){
    int[] monthLen1;
    monthLen1 = new int[12];

    int[] monthLen2 = new int[12];

    int[] monthLen3 = {
        31,28,31,30,
        31,30,31,31,
        30,31,30,31
    };

    final int MAX = 10;
    Calendar[] days = new Calendar[MAX];

  }
}
