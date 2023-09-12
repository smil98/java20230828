package Home.backjun.harder1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CommonLetterMap {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       Map<Character, Integer> map = new HashMap<>();
       int maxOccurace = 0;

       String str = br.readLine().toLowerCase();
       for(char c : str.toCharArray()) {
           map.put(c, map.getOrDefault(c, 0)+1);
       }

       StringBuilder maxLetters = new StringBuilder();
       for(Map.Entry<Character, Integer> entry : map.entrySet()) {
           if(entry.getValue() > maxOccurace) {
               maxLetters = new StringBuilder(entry.getKey().toString());
               maxOccurace = entry.getValue();
           } else if(entry.getValue() == maxOccurace) {
               maxLetters.append(entry.getKey().toString());
           }
       }

       if(maxLetters.toString().length() > 1) {
           bw.write("?");
       } else {
           bw.write(maxLetters.toString().toUpperCase());
       }

        br.close();
        bw.flush();
        bw.close();
    }
}






