package ch03String;

/*
  문제 : 문자열비교

  해결방법 :
  1. compareTo() 사전적의미의 비교를함
  2. == : reference 대한 비교
  3. equals() : 값(value)에 대한 비교

  *https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/lang/String.html#compareTo(java.lang.String) //compareTo(api)
  *https://stackoverflow.com/questions/4064633/string-comparison-in-java //compareTo()
  *https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java //== 와 equals에 대한 차이
 */
public class Prob06ComparingString {

  public static void main(String[] args){
    String str1 = "abc";
    String str2 = "edf";
    String str3 = "abc";

    comparingString(str1,str3);
    equalsOperatorString(str1,str3);
    equalsString(str1,str3);
  }

  public static void comparingString(String firstString,String secondString) {
    System.out.println("comparingString : "+firstString.compareTo(secondString));
  }

  public static void equalsOperatorString(String firstString,String secondString) {
    if(firstString==secondString){
      System.out.println("firstString is secondString");
    }else{
      System.out.println("firstString is not secondString");
    }
  }
  public static void equalsString(String firstString,String secondString) {
    System.out.println("equalsString : "+firstString.equals(secondString));
  }

}
