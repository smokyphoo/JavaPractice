package ch03String;

/*
  문제 : 원하는 string으로 시작하거나 끝나는 경우를 찾고싶을때

  해결방법 : startsWith()와 endsWIth를 사용하라
 */
public class Prob08EndsNStarts {

  public static void main(String[] args){
    String str = "Hello World";

    System.out.println(str.startsWith("Hello"));
    System.out.println(str.endsWith("Hello"));
  }

}
