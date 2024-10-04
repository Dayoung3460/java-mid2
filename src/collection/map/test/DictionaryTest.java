package collection.map.test;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===단어 입력 단계===");
        HashMap<String, String> dictionary = new HashMap<>();
        boolean run = true;
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String textKey = scanner.nextLine();
            if (textKey.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요 (종료는 'q'): ");
            String textValue = scanner.nextLine();

            if (textValue.equals("q")) {
                break;
            }
            dictionary.put(textKey, textValue);
        }

        if (dictionary.size() > 0) {
            System.out.println("===단어 검색 단계===");
            while (true) {
                System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
                String key = scanner.nextLine();
                if (key.equals("q")) {
                    break;
                }

                if (dictionary.containsKey(key)) {
                    System.out.println(key + "의 뜻: " + dictionary.get(key));
                } else {
                    System.out.println(key + "은(는) 사전에 없는 단어입니다.");
                }
            }

        }
    }
}
