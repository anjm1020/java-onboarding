package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            sb.append(convert(c));
        }
        answer = sb.toString();
        return answer;
    }

    public static char convert(char c) {
        char res, start;
        int diff;
        if(!Character.isLetter(c)) return res = ' ';
        start = Character.isUpperCase(c) ? 'A' : 'a';
        diff = 25 - (c - start);
        res = (char) (start + diff);
        return res;
    }

    // 더해서 25 만들기
}