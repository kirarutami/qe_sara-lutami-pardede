import java.util.*;

public class AngkaMunculSekali {
    public static void main(String[] args) {
        String angka = "76523752";
        String[] angkaList = angka.split("");
        Map <String, Integer> angkaMap = new HashMap<>();

        for (String a: angkaList) {
            if(angkaMap.get(a) == null){
                angkaMap.put(a,1);
            }
            else {
                angkaMap.put(a, angkaMap.get(a) +1);
            }
            
        }
        List<String> result = new ArrayList<>();
        for (String a: angkaMap.keySet()){
            if (angkaMap.get(a) == 1){
                result.add(a);
            }
        }
        System.out.print(result);
    }
}
