package Home.backjun.harder1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CommonLetter {
    public static void main(String[] args) throws IOException {
        //case insensitive
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int maxValue = 0;
        List<Integer> maxIndices = new ArrayList<>();

        char[] word = br.readLine().toLowerCase().toCharArray();
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] counter = new int[26];

        for(int i = 0; i < word.length; i++) {
            int index = word[i] - 'a';
            counter[index]++;
        }

        for(int i = 0; i < counter.length; i++) {
            if(Math.max(maxValue, counter[i]) != maxValue) {
                maxValue = counter[i];
                maxIndices.clear();
            }

            if(counter[i] == maxValue) {
                maxIndices.add(i);
            }
        }

        if(maxIndices.size() > 1) {
            bw.write("?");
        } else {
            bw.write(Character.toUpperCase(alphabet[maxIndices.get(0)]));
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
