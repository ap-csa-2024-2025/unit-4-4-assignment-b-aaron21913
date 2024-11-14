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
    int count = 0;
    int N = target.length();
    for (int i = 0; i < word.length() - (N-1); i++)
    {
      String sub = word.substring(i, i+N);

      boolean beginOrSpaceBefore;
      int beginOfTarget = i
      beginOrSpaceBefore = (beginOfTarget == 0) || word1.substring(beginOfTarget, beginOfTarget+1).equals(" ")
      if (beginOfTarget == 0)
      {
        beginOrSpaceBefore = true;
      }
      else
      {
        beginOrSpaceBefore = false;
      }
      boolean endOrSpaceAfter;
      int endOfTarget = i + target.length();
      endOrSpaceAfter = (endOfTarget == word.length()) || word.substring(endOfTarget1, endOfTarget+1).equals(" ")
      // i is the number index and target.length jsut gets the length of the target string
      if (endOfTarget == word.length())
      {
        endOrSpaceAfter = true;
      }
      else
      {
        String after = word.substring(endOfTarget, endOfTarget+1);
        if (after.equals(" "))
        {
          endOrSpaceAfter = true;
        }
        else{
          endOrSpaceAfter = false;
        }
      }

      boolean properlyContained = beginOrSpaceBefore && endOrSpaceAfter
      if (sub.equals(target) && properlyContained)
      {
        count++
      }
    }
    return count;

  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
