package ch04Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
  문제 : regex을 통해 일치하는 텍스트 찾기

   해결방법 : Matcher 클래스 start(),end(),groupCount(),group(int i)등을 사용해야함
 */
public class Prob02FindingTheMatchingText {

  public static void main(String[] args){
    String patt = "Q[^u]\\d+\\.";
    Pattern r = Pattern.compile(patt);
    String line = "ORDER QT380. NOW";
    Matcher m = r.matcher(line);
    if(m.find()){
      System.out.println(patt+" matches \""+m.group(0)+"\"in \""+line+"\"");
    }else {
      System.out.println("NO MATCH");
    }
  }
}
