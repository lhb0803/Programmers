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
        boolean movingRight = true;
        while (changes < sum) {
            changes += changesArr[ix];
            if (changes >= sum) {
                break;
            }

            if (movingRight) {
                int tempRix = ix; int tempLix = nameLength;
                int tempR = 1; int tempL = 1;

                while(tempRix + tempR < nameLength && changesArr[tempRix + tempR] == 0) {
                    tempR++;
                }
                while(changesArr[tempLix - tempL] == 0) {
                    tempL++;

                }
                if (tempR > ix + tempL) {
                    leftMove += tempL + ix;
                    ix = tempLix - tempL;
                    movingRight = false;
                }
                else {
                    rightMove += tempR;
                    ix = tempRix + tempR;
                }
            }
            else {
                ix--;
                leftMove++;
            }
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