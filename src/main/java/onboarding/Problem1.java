package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        try {
            checkInputValidation(pobi);
            checkInputValidation(crong);
            answer = calculateResult(calculateScore(pobi), calculateScore(crong));
        } catch (Exception e) {
            answer = -1;
        } finally {
            return answer;
        }
    }

    public static void checkInputValidation(List<Integer> numbers) throws Exception {
        int leftNumber, rightNumber;
        try {
            leftNumber = numbers.get(0);
            rightNumber = numbers.get(1);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }

        if (leftNumber + 1 != rightNumber || leftNumber % 2 == 0 || rightNumber % 2 != 0) {
            throw new IllegalArgumentException();
        }
    }

    public static int calculateScore(List<Integer> numbers) {
        int res = -1;
        for (int curr : numbers) {
            int sumOfNumber = 0, productOfNumber = 1;
            while (curr != 0) {
                int currDigit = curr % 10;
                sumOfNumber += currDigit;
                productOfNumber *= currDigit;
                curr /= 10;
            }
            res = Math.max(res, Math.max(sumOfNumber, productOfNumber));
        }
        return res;
    }

    public static int calculateResult(int pobi, int crong) {
        if (pobi == crong) {
            return 0;
        } else {
            return pobi > crong ? 1 : 2;
        }
    }

}