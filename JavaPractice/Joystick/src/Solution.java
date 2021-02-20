class Solution {
    public int solution(String name) {
        int nameLength = name.length();
        int[] changesArr = new int[nameLength];

        int changes = 0;
        int rightMove = 0;
        int leftMove = 0;

        int sum = 0;
        for (int i=0; i<nameLength; i++) {
            int temp = clickChange(name.charAt(i));
            changesArr[i] = temp;
            sum += temp;
        }

        int ix = 0;
        while (changes < sum) {
            changes += changesArr[ix];
            if (changes >= sum) {
                break;
            }

            int aStreak = 1;
            while (ix + aStreak < nameLength && changesArr[ix + aStreak] == 0) {
                aStreak++;
            }

            if (aStreak >= nameLength - aStreak) {
                leftMove += nameLength-aStreak;
            }
            else if (ix != nameLength-1){
                rightMove += aStreak;
            }

            ix = ix + aStreak;
        }

        return changes + rightMove + leftMove;
    }

    private int clickChange(char c) {
        int clicks = 0;
        if (c >= 'B' && c <= 'N') {
            clicks += c - 'A';
        }
        else if (c > 'N' && c <= 'Z'){
            clicks += 'Z' - c + 1;
        }
        return clicks;
    }
}