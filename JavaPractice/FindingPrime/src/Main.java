import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<String> inputList = new ArrayList<>();
        List<Integer> outputList = new ArrayList<>();

        String input1 = "17";
        String input2 = "011";
        inputList.add(input1); inputList.add(input2);

        int output1  = 3;
        int output2  = 2;
        outputList.add(output1); outputList.add(output2);

        int numOfCases = inputList.size();

        for (int i=0; i < numOfCases; i++) {
            System.out.print("case " + (i+1) + ": ");
            printOX(sol.solution(inputList.get(i)), outputList.get(i));
            System.out.println("------------------------------------------");
        }
    }

    private static void printOX(int myAnswer, int answer) {
        if (myAnswer == answer) {
            System.out.println("O");
        }
        else {
            System.out.println("X");
            System.out.println("answer = " + answer);
            System.out.println("mine   = " + myAnswer);
        }
    }
}