package ch03String;

/*
  String과 Integer값을 상호 컨버팅하기(parseInt()사용 불가)

  ex) 123 -> "123"
      "-1" -> -1
 */
public class Fnl01InterconvertStringsAndInteger {

  public static void main(String[] args) {
    String str = "-4321";
    System.out.println(stringToInteger(str)+2);
    System.out.println(integerToString(stringToInteger(str))+2);
  }

  public static int stringToInteger(String str) {
    int result = 0;

    for (int i = str.charAt(0) == '-' ? 1 : 0; i < str.length(); ++i) {
      final int digit = str.charAt(i) - '0';
      result = result * 10 + digit;
    }
    return str.charAt(0) == '-' ? -result : result;
  }

  public static String integerToString(int integer) {
    boolean isNegative = false;

    if( integer < 0){
      isNegative = true;
    }
    StringBuilder s = new StringBuilder();
    do {
      s.append((char)('0'+Math.abs(integer%10)));
      integer/=10;
    }while (integer!=0);

    if(isNegative){
      s.append('-');
    }
    s.reverse();
    return s.toString();
  }

}