import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Solution sol2 = new Solution2();
        List<int[]> inputList = new ArrayList<>();
        List<String> outputList = new ArrayList<>();


        int[] input1 = {6, 10, 2};
        int[] input2 = {3, 30, 34, 5, 9};
        int[] input3 = {1, 111, 10, 100};
        int[] input4 = {0, 0, 0, 0};
        inputList.add(input1); inputList.add(input2); inputList.add(input3); inputList.add(input4);

        String output1  = "6210";
        String output2  = "9534330";
        String output3 = "111110100";
        String output4 = "0";
        outputList.add(output1); outputList.add(output2); outputList.add(output3); outputList.add(output4);

        int numOfCases = inputList.size();

        for (int i=0; i < numOfCases; i++) {
            System.out.print("case " + (i+1) + ": ");
            //printOX(sol.solution(inputList.get(i)), outputList.get(i));
            printOX(sol2.solution(inputList.get(i)), outputList.get(i));
            System.out.println("------------------------------------------");
        }
    }

    private static void printOX(String myAnswer, String answer) {
        if (myAnswer.equals(answer)) {
            System.out.println("O");
        }
        else {
            System.out.println("X");
            System.out.println("answer = " + answer);
            System.out.println("mine   = " + myAnswer);
        }
    }
}
