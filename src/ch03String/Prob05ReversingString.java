package ch03String;

import java.util.Stack;
import java.util.StringTokenizer;

/*
  문제 : 문자열 뒤집기

  해결방법 : StringBuilder 또는 StringTokenizer와 Stack을 사용하는것를 사용하여 뒤집을수있음

  왜 ? : StringBuilder의 메서드중 reverse()로 간단히 처리가능하거나
  Stack은 LIFO (Last In First Out)이기에 뒤집을수있음

  * Think Data Structures Algorithms and Information Retrieval in Java 의 stacks 참고
 */
public class Prob05ReversingString {

  public static void main(String[] args){
    String s1 = "Hello, World";
    stringBuilderReverse(s1);
    stackWithTokenizer(s1);
  }

  public static void stringBuilderReverse(String input){
    System.out.println(input+"->"+new StringBuilder(input).reverse());
  }

  //Tokenizer를 통한 단어별 뒤집기
  public static void stackWithTokenizer(String input){
    Stack<String> myStack = new Stack<>();
    StringTokenizer st = new StringTokenizer(input);
    while (st.hasMoreTokens()) {
      myStack.push(st.nextToken());
    }

    System.out.print('"' + input + '"' + " 뒤집으면 :\n\t\"");
    while (!myStack.empty()) {
      System.out.print(myStack.pop());
      System.out.print(' ');
    }
    System.out.println('"');
  }

}
