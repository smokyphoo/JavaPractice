package ch05Numbers;

/*
  문제 : 숫자를 object로 컨버팅 하고싶을때

  해결방법 : Object wrapper를 사용하라
 */
public class Prob02ConvertingNumbersToObj {

  public static void main(String[] args){
    int i = 42;
    int result =foo(i);
    System.out.println(result);
  }

  public static Integer foo(Integer i){
    System.out.println("Object = "+i);
    return Integer.valueOf(123);
  }
}
