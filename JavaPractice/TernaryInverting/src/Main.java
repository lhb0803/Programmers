import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<InputExample> inputList = new ArrayList<>();
        List<Integer> outputList = new ArrayList<>();

        InputExample input1 = new InputExample(45);
        InputExample input2 = new InputExample(125);

        inputList.add(input1); inputList.add(input2);

        int output1 = 7;
        int output2 = 229;

        outputList.add(output1); outputList.add(output2);

        int numOfCases = inputList.size();

        for (int i=0; i < numOfCases; i++) {
            System.out.print("case " + (i+1) + ": ");
            InputExample input_i = inputList.get(i);
            printOX(sol.solution(input_i.n), outputList.get(i));
            System.out.println("------------------------------------------");
        }
    }

    private static void printOX(Object myAnswer, Object answer) {
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

class InputExample {
    public int n;

    InputExample(int n) {
        this.n = n;
    }

}