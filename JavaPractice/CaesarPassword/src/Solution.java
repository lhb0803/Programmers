class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int l = 'z' - 'a' + 1;

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                answer += (char)('a' + (c - 'a' + n) % l);
            }
            else if (c >= 'A' && c <= 'Z') {
                answer += (char)('A' + (c - 'A' + n) % l);
            }
            else {
                answer += c;
            }
        }
        return answer;
    }
}