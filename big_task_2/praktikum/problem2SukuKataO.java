package praktikum;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Pattern pattern = Pattern.compile("[^aeiouy]*[aeiouy]+(?:[^aeiouy]*$|[^aeiouy](?=[^aeiouy]))?", Pattern.CASE_INSENSITIVE);
    System.out.println("Masukkan kata: ");
    String kata = sc.nextLine();
    Matcher matcher = pattern.matcher(kata);
    while (matcher.find()) {
      
      // System.out.print(" " +matcher.group());

      if (matcher.group().contains("o")){
        System.out.print("-");
      } else {
        System.out.print(".");
      }
    }
  }
}