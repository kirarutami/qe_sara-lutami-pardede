package praktikum;
import java.util.*;

public class problem4IndexHuruf{
    public static void main(String[] args) {
        int ResultRow = 0;
        int ResultCol = 0;
        Scanner sc = new Scanner(System.in);
        char[][] IndexHuruf = {{'A','B','C','D', 'E'},{'F','G','H', 'I', 'J'},{'L','M','N','O','P'},{'Q','R','S','T','U'},{'V','W','X','Y','Z'}};
        System.out.println("Masukkan char: ");
        char input = sc.nextLine().toUpperCase().charAt(0); 

        if(input == 'K'){
            input = 'C';
        }
        for (int iterationRow=0;iterationRow<IndexHuruf.length;++iterationRow){
            for(int iterationCol=0;iterationCol<IndexHuruf[iterationRow].length;++iterationCol){
                if(input==IndexHuruf[iterationRow][iterationCol]){
                    ResultCol = iterationCol;
                    ResultRow = iterationRow;
                    break;
                }
            }
        }
        System.out.println(ResultCol+1 + " " +(ResultRow+1));
    }
}

