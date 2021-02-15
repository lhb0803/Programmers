class Solution {
    public String solution(int a, int b) {
        String[] whatDay = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        int days = makeToDays(a, b);
        int dayIx = days % 7;

        String answer = whatDay[dayIx];
        return answer;
    }

    private int makeToDays(int month, int day) {
        while (month > 1) {
            if (month == 2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11) {
                day += 31;
            }
            else if (month == 3) {
                day += 29;
            }
            else {
                day += 30;
            }

            month--;
        }

        return day;
    }
}