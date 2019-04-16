package ch03String;

import java.util.StringTokenizer;

public class Prob02BreakingSringsFinal {

  final static int MAXFIELDS = 5;
  final static String DELIM = "|";

  public static void main(String[] args){
    printResults("A|B|C|D",process("A|B|C|D"));
    printResults("A||C|D",process("A||C|D"));
    printResults("A||D|E",process("A||D|E"));
  }

  public static String[] process(String line) {
    String[] results = new String[MAXFIELDS];
    StringTokenizer st = new StringTokenizer(line, DELIM, true);
    int i = 0;

    while (st.hasMoreTokens()) {
      String s = st.nextToken();
      if (s.equals(DELIM)) {
        if (i++ >= MAXFIELDS) {
          throw new IllegalArgumentException("입력된 " + line + " 필드가 너무 많습니다");
        }
        continue;
      }
      results[i] = s;
    }
    return results;
  }

  public static void printResults(String input, String[] outputs) {
    System.out.println("Input : " + input);
    for (String s : outputs) {
      System.out.println("Output : " + s + " was " + s);
    }
  }

}
