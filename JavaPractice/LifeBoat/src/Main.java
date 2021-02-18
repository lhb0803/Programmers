import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<InputExample> inputList = new ArrayList<>();
        List<Integer> outputList = new ArrayList<>();

        InputExample input1 = new InputExample(new int[] {70, 50, 80, 50}, 100);
        InputExample input2 = new InputExample(new int[] {70, 80, 50}, 100);
        InputExample input3 = new InputExample(new int[] {80}, 100);
        InputExample input4 = new InputExample(new int[] {90, 45, 45, 45, 45}, 135);
        InputExample input5 = new InputExample(new int[] {20, 50, 80, 20, 10}, 100);
        inputList.add(input1); inputList.add(input2); inputList.add(input3); inputList.add(input4);
        inputList.add(input5);

        int output1 = 3;
        int output2 = 3;
        int output3 = 1;
        int output4 = 2;
        int output5 = 2;
        outputList.add(output1); outputList.add(output2); outputList.add(output3); outputList.add(output4);
        outputList.add(output5);

        int numOfCases = inputList.size();

        for (int i=0; i < numOfCases; i++) {
            System.out.print("case " + (i+1) + ": ");
            InputExample input_i = inputList.get(i);
            printOX(sol.solution(input_i.people, input_i.limit), outputList.get(i));
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
    public int[] people;
    public int limit;

    InputExample(int[] people, int limit) {
        this.people = people;
        this.limit = limit;
    }

}