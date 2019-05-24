package dailyChallange.day001;

public class CamelCaseSeperation {

  boolean camelCaseSeparation(String[] words, String variableName) {
    List<String> wordList = new ArrayList<>();
    for(String addingWordList : words){
      wordList.add(addingWordList);
      StringBuffer sb = new StringBuffer();
      char[] charArray = addingWordList.toCharArray();
      for(int a=0; a<addingWordList.length();a++){
        String inputStr;
        if(a == 0){
          char b = Character.toUpperCase(charArray[0]);
          sb.append(b);
        }else{
          sb.append(charArray[a]);
        }
        if(a==addingWordList.length()-1){
          String upperCaseLetter = sb.toString();
          wordList.add(upperCaseLetter);
        }
      }
    }

    for(String a : wordList){
      System.out.println(a);
    }

    return false;
  }

}
