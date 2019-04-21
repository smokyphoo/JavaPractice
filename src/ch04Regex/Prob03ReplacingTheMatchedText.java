package ch04Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
  문제 : 일치하는 텍스트 교체

  해결방법 : Matcher클래스의 replaceAll(newString),appendReplacement(StringBuff, newString)
  appendTail(StringBuff)
 */
public class Prob03ReplacingTheMatchedText {

  public static void main(String[] args){
    String patt = "\\bfavor\\b";
    String input = "do me a favor ? Fetch my favorite.";
    System.out.println("Input : "+input);

    Pattern r = Pattern.compile(patt);
    Matcher m = r.matcher(input);
    System.out.println("ReplaceAll : "+m.replaceAll("favour"));
    m.reset();
    StringBuffer sb = new StringBuffer();
    System.out.println("Append methods : ");
    while (m.find()){
      m.appendReplacement(sb,"favor");
    }
    m.appendTail(sb);
    System.out.println(sb.toString());
  }

}
