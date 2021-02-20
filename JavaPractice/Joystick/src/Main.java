import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<InputExample> inputList = new ArrayList<>();
        List<Integer> outputList = new ArrayList<>();

        InputExample input1 = new InputExample("JAZ");
        InputExample input2 = new InputExample("JEROEN");
        InputExample input3 = new InputExample("JAN");
        InputExample input4 = new InputExample("BAA");
        InputExample input5 = new InputExample("BBBAAB");
        InputExample input6 = new InputExample("BBBAAAAB");
        inputList.add(input1); inputList.add(input2); inputList.add(input3); inputList.add(input4);
        inputList.add(input5); inputList.add(input6);

        int output1 = 11;
        int output2 = 56;
        int output3 = 23;
        int output4 = 1;
        int output5 = 9;
        int output6 = 9;
        outputList.add(output1); outputList.add(output2); outputList.add(output3); outputList.add(output4);
        outputList.add(output5); outputList.add(output6);

        int numOfCases = inputList.size();

        for (int i=0; i < numOfCases; i++) {
            System.out.print("case " + (i+1) + ": ");
            InputExample input_i = inputList.get(i);
            printOX(sol.solution(input_i.name), outputList.get(i));
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
    public String name;

    InputExample(String name) {
        this.name = name;
    }

}