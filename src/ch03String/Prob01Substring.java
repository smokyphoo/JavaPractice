package ch03String;

/*
  문제 : 원하는 위치의 문자열에서 문자열을 추출하기

  해결방법 : String 오브젝트의 substring() 메서드를 사용하라
 */
public class Prob01Substring {

  public static void main(String[] args){
    String s1 = "Java is great.";
    System.out.println(s1);
    String s2 = s1.substring(5);
    System.out.println(s2);
    String s3 = s1.substring(5,7);
    System.out.println(s3);
    String s4 = s1.substring(5,s1.length());
    System.out.println(s4);
  }

}
