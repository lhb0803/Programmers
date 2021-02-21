class Solution {
    public int solution(int n) {
        int answer = 0;

        String ternaryN = toTernary(n);
        int threePow = 1;

        for (int i=0; i<ternaryN.length(); i++) {
            int intNum = ternaryN.charAt(i) - '0';
            answer += threePow*intNum;
            threePow *= 3;
        }

        return answer;
    }

    private char changeTochar(int n) {
        char c = (char) ('0' + n);
        return c;
    }

    private String toTernary(int n) {
        String toReturn = "";

        if (n < 3) {
            char c = changeTochar(n);
            return toReturn+c;
        }

        else {
            return toTernary(n / 3) + toTernary(n % 3);
        }
    }
}