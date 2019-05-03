package ch03String;

/*
  문제 : 문자열 자르고 공백제거

  해결방법 :
  1. trim()사용 하여 앞뒤 공백 없앨수있음
  2. split()사용하여 문자열 나눌수있음(정규식 사용해야함)
 */
public class Prob09SplitNTrim {

  public static void main(String[] args){
    String str1 = " Hello World ";
    String str2 = "서울,대구,부산";
    System.out.println(str1.trim());
    String[] str2Array = str2.split(",");
    for(String res : str2Array){
      System.out.println(res);
    }
  }

}
