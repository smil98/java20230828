package Home.backjun.harder1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class GroupWordChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 입력으로 받을 단어의 개수

        int count = 0; // 그룹 단어의 개수를 저장할 변수

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 그룹 단어인지 검사하는 함수
    private static boolean isGroupWord(String word) {
        Set<Character> uniqueChars = new HashSet<>();

        char prevChar = ' '; // 이전 문자를 저장할 변수

        for (char currentChar : word.toCharArray()) {
            if (prevChar != currentChar) { // 이전 문자와 다르면
                if (uniqueChars.contains(currentChar)) {
                    return false; // 이미 등장한 문자가 다시 등장한 경우
                }
                uniqueChars.add(currentChar); // 새로운 문자 추가
            }
            prevChar = currentChar;
        }

        return true; // 그룹 단어인 경우
    }
}

