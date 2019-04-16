package ch03String;

/*
  문제 : 문자열에서 하나의 문자씩 추출하기

  해결방법 : for문 과 charAt()을 사용하거나 for-each와 String의 toCharArray()를 사용하라
 */
public class Prob04SeparatingChar {

  public static void main(String[] args) {
    String s1 = "Hello, World";
    charAtWithFor(s1);
    toCharArrayWithForEach(s1);
  }

  public static void charAtWithFor(String input) {
    for (int i = 0; i < input.length(); i++) {
      System.out.println("Char : " + i + " is " + input.charAt(i));
    }
  }

  public static void toCharArrayWithForEach(String input) {
    for (char ch : input.toCharArray()) {
      System.out.println(ch);
    }
  }

}
