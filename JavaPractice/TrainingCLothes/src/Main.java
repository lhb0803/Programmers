import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<InputExample> inputList = new ArrayList<>();
        List<Integer> outputList = new ArrayList<>();

        InputExample input1 = new InputExample(5, new int[]{2, 4}, new int[]{1, 3, 5});
        InputExample input2 = new InputExample(5, new int[]{2, 4}, new int[]{3});
        InputExample input3 = new InputExample(3, new int[]{3}, new int[]{1});
        InputExample input4 = new InputExample(5, new int[]{1,2,3,4}, new int[]{2,3,4,5});
        inputList.add(input1); inputList.add(input2); inputList.add(input3); inputList.add(input4);

        int output1 = 5;
        int output2 = 4;
        int output3 = 2;
        int output4 = 4;

        outputList.add(output1); outputList.add(output2); outputList.add(output3); outputList.add(output4);

        int numOfCases = inputList.size();

        for (int i=0; i < numOfCases; i++) {
            System.out.print("case " + (i+1) + ": ");
            InputExample input_i = inputList.get(i);
            printOX(sol.solution(input_i.n, input_i.lost, input_i.reserve), outputList.get(i));
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
    public int[] lost;
    public int[] reserve;

    InputExample(int n, int[] lost, int[] reserve) {
        this.n = n;
        this.lost = lost;
        this.reserve = reserve;
    }

}