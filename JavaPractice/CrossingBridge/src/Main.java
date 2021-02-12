import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<InputExample> inputList = new ArrayList<>();
        List<Integer> outputList = new ArrayList<>();

        InputExample input1 = new InputExample(2, 10, new int[]{7, 4, 5, 6});
        InputExample input2 = new InputExample(100, 100, new int[]{10});
        InputExample input3 = new InputExample(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10});
        inputList.add(input1); inputList.add(input2); inputList.add(input3);

        int output1  = 8;
        int output2  = 101;
        int output3  = 110;
        outputList.add(output1); outputList.add(output2); outputList.add(output3);

        int numOfCases = inputList.size();

        for (int i=0; i < numOfCases; i++) {
            System.out.print("case " + (i+1) + ": ");
            InputExample input_i = inputList.get(i);
            printOX(sol.solution(input_i.bridge_length, input_i.weight, input_i.truck_weights), outputList.get(i));
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

class InputExample {
    public int bridge_length;
    public int weight;
    public int[] truck_weights;

    InputExample(int b_l, int w, int[] t_ws) {
        bridge_length = b_l;
        weight = w;
        truck_weights = t_ws;
    }

}