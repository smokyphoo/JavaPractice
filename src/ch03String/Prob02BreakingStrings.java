package ch03String;

import java.util.StringTokenizer;

/*
  문제 : 단어별로 추출을 원할경우

  해결방법 : hasMoreTokens() 와 nextToken()을 사용하라
 */
public class Prob02BreakingStrings {
  static String s1 = "Java is great.";

  public static void main(String[] args){
    easiestWay();
    System.out.println();
    tokenizer();
    System.out.println();
    tokenizerWithBar();
  }

  public static void easiestWay(){
    System.out.println("easiestWay");
    System.out.println("*********");

    for(String word : s1.split(" ")){
      System.out.println(word);
    }
  }

  public static void tokenizer(){
    System.out.println("tokenizer");
    System.out.println("*********");

    StringTokenizer st = new StringTokenizer(s1);
    while (st.hasMoreTokens()){
      System.out.println("Token : "+st.nextToken());
    }
  }

  public static void tokenizerWithBar(){
    System.out.println("tokenizerWithBar");
    System.out.println("*********");
    s1 = "Java|is|great,powerful";

    StringTokenizer st = new StringTokenizer(s1,", |",true);
    while (st.hasMoreElements()){
      System.out.println("Token : "+st.nextElement());
    }
  }

}
