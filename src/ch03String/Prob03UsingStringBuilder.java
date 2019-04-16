package ch03String;

/*
  문제 : 스트링을 합쳐야할때

  해결방법 : StringBuilder를 사용하라

  왜 ? : StringBuilder 클래스는 character의 컬렉션임 String은 불변이나 StringBuffer,StringBuilder는 가변적임
  StringBuffer(동기적(Synchronized) Thread-safe)와 StringBuilder(비동기적(not Synchronized)로 나누어졌음
  StringBuffer와 StringBuilder는 AbstractStringBuilder를 상속하므로 같은 메서드들을 사용가능하다

  * Effective Java의 Builder 패턴을 참고
  * https://stackoverflow.com/questions/2971315/string-stringbuffer-and-stringbuilder
  * https://martinfowler.com/bliki/FluentInterface.html
 */
public class Prob03UsingStringBuilder {

  public static void main(String[] args) {
    String s1 = "Hello" + ", " + "World";
    System.out.println(s1);

    StringBuilder s2 = new StringBuilder();
    s2.append("Hello");
    s2.append(",");
    s2.append(" ");
    s2.append("World");
    s2.toString();

    System.out.println(
        new StringBuilder().append("Hello").append(",").append(" ").append("World").toString()
    );
  }

}
