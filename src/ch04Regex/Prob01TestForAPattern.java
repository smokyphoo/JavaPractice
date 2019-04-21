package ch04Regex;

import java.util.regex.Pattern;

/*
  문졔 : regex 사용

  해결방법 : java.util.regex 패키지 사용
  * Oracle java 7 Pattern 참고 https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
 */
public class Prob01TestForAPattern {

  public static void main(String[] args) {
    String pattern = "^Q[^u]\\d+\\.";
    String[] input = {
        "QA777. is the next flight. It is on time",
        "Quack,Quack,Quack"
    };

    Pattern p = Pattern.compile(pattern);

    for (String in : input) {
      boolean found = p.matcher(in).lookingAt();
      System.out.println("'" + pattern + "'" + (found ? "match'" : "doesn't match'") + in + "'");
    }
  }

}
