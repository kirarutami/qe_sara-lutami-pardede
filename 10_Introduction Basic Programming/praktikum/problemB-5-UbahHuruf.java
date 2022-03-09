import java.util.*;
class ubahKata {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan alphabet: ");
        String plaintext = input.nextLine();
        System.out.println("Masukkan jumlah pergesseran: ");
        int shift = input.nextInt();
        String alphabetBob = "";
        char alphabet;
        for(int i=0; i < plaintext.length();i++) 
        {
            alphabet = plaintext.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
             alphabet = (char) (alphabet + shift);
             if(alphabet > 'z') {
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             alphabetBob = alphabetBob + alphabet;
            }
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             alphabet = (char) (alphabet + shift);    
             if(alphabet > 'Z') {
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             alphabetBob = alphabetBob + alphabet;
            }
            else {
             alphabetBob = alphabetBob + alphabet;   
            } 
    }
    System.out.println("Alphabet Bob: " + alphabetBob);
  }
}