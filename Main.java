import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Put your solutions below
  }

  public static int countSub(String word, String target)
  {
    String sentence = "gagagigo the giga risen";
    String target = "ga";
    int count = 0;

    for (int i = 0; i < sentence.length()-5; i++)
    {
      String L = sentence.substring(i, i+6);
      if (L.equals(target))
      {
        count++;
      }
    }
    return count;
  }

  public static int countProperContains(String word, String target)
  {
    
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
