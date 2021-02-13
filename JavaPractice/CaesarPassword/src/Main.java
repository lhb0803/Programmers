import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<InputExample> inputList = new ArrayList<>();
        List<String> outputList = new ArrayList<>();

        InputExample input1 = new InputExample("AB", 1);
        InputExample input2 = new InputExample("z", 1);
        InputExample input3 = new InputExample("a B z", 4);

        inputList.add(input1); inputList.add(input2); inputList.add(input3);

        String output1  = "BC";
        String output2  = "a";
        String output3  = "e F d";
        outputList.add(output1); outputList.add(output2); outputList.add(output3);

        int numOfCases = inputList.size();

        for (int i=0; i < numOfCases; i++) {
            System.out.print("case " + (i+1) + ": ");
            InputExample input_i = inputList.get(i);
            printOX(sol.solution(input_i.s, input_i.n), outputList.get(i));
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
    public String s;
    public int n;

    InputExample(String s, int n) {
        this.s = s;
        this.n = n;
    }

}