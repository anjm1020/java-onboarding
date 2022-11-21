package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            answer += count(i);
        }

        return answer;
    }

    public static int count(int number) {
        int cnt = 0, digit;
        while (number != 0) {
            digit = number % 10;
            cnt += digit != 0 && digit % 3 == 0 ? 1 : 0;
            number /= 10;
        }
        return cnt;
    }

}
