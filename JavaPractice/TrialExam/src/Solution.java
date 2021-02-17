import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {

        int[] supoja = {0, 0, 0};
        for (int i=1; i<=answers.length; i++) {
            int answer = answers[i-1];

            // supoja 1
            int supojaOneRout = i % 5;
            int supojaOneAnswer = 0;
            if (supojaOneRout == 0) {
                supojaOneAnswer = 5;
            }
            else {
                supojaOneAnswer = supojaOneRout;
            }

            if (supojaOneAnswer == answer) {
                supoja[0]++;
            }
            // supoja 2
            int supojaTwoRout = i % 8;
            int supojaTwoAnswer = 0;
            if (supojaTwoRout % 2 == 1) {
                supojaTwoAnswer = 2;
            }
            else {
                if (supojaTwoRout == 2) {
                    supojaTwoAnswer = 1;
                }
                else if (supojaTwoRout == 4) {
                    supojaTwoAnswer = 3;
                }
                else if (supojaTwoRout == 6) {
                    supojaTwoAnswer = 4;
                }
                else {
                    supojaTwoAnswer = 5;
                }
            }
            if (supojaTwoAnswer == answer) {
                supoja[1]++;
            }

            // supoja 3
            int supojaThreeRout = i % 10;
            if (supojaThreeRout == 0) {
                supojaThreeRout = 10;
            }
            int supojaThreeAnswer = 0;
            if (supojaThreeRout <= 2) {
                supojaThreeAnswer = 3;
            }
            else if (supojaThreeRout <= 4) {
                supojaThreeAnswer = 1;
            }
            else if (supojaThreeRout <= 6) {
                supojaThreeAnswer = 2;
            }
            else if (supojaThreeRout <= 8) {
                supojaThreeAnswer = 4;
            }
            else {
                supojaThreeAnswer = 5;
            }
            if (supojaThreeAnswer == answer) {
                supoja[2]++;
            }
        }

        List<Integer> mostCorrectList = new LinkedList<>();
        int maxCorrect = 0;
        for (int i=0; i<3; i++) {
            int correctNum = supoja[i];
            if (correctNum > maxCorrect) {
                mostCorrectList.clear();
                mostCorrectList.add(i+1);
                maxCorrect = correctNum;
            }
            else if (correctNum == maxCorrect) {
                mostCorrectList.add(i+1);
            }
        }

        int[] mostCorrect = new int[mostCorrectList.size()];
        for (int i=0; i<mostCorrectList.size(); i++) {
            mostCorrect[i] = mostCorrectList.get(i);
        }
        return mostCorrect;
    }
}