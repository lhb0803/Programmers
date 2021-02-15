import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        List<Integer> answerList = new LinkedList<>();

        int[] daysTaken = new int[n];

        int counts = 1;
        for (int i=0; i<n; i++) {
            daysTaken[i] = calculateLeftDays(progresses[i], speeds[i]);
            if (i > 0) {
                if (daysTaken[i] <= daysTaken[i-1]) {
                    daysTaken[i] = daysTaken[i-1];
                    counts++;
                }
                else {
                    answerList.add(counts);
                    counts = 1;
                }
            }

           if (i == n-1) {
                answerList.add(counts);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i=0; i<answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    private int calculateLeftDays(int progress, int speed) {
        int r = 0;
        while(progress < 100) {
            progress += speed;
            r++;
        }

        return r;
    }
}