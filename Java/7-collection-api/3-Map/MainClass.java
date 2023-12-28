import java.util.HashMap;
import java.util.Map;

class MainClass{
    public static void main(String args[]){
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Ram", 80);
        mp.put("Shyam", 92);
        mp.put("Ram", 95);
        System.out.println(mp);

        System.out.println(mp.get("Ram"));

        for(String k : mp.keySet()){
            System.out.println(k + " " + mp.get(k));
        }
    }
}