package ch03String;

/*
  String과 Integer값을 상호 컨버팅하기(parseInt()사용 불가)

  ex) 123 -> "123"
      "-1" -> -1
 */
public class Fnl01InterconvertStringsAndInteger {

  public static void main(String[] args){
    String str = "-1234";
    int integer = -1234;

    System.out.println(stringToInteger(str)+1);
    System.out.println(integerToString(integer)+"a");

  }

  public static int stringToInteger(String str){
    int result = 0;
    for(int i = 1; i<=str.length();i++){
      int a = str.charAt(i) -'0';

    }
    if(str.charAt(0) == '-'){
      result *= -1;
    }

    return 0;
  }

  public static String integerToString(int integer){
    integer
    return null;
  }
}