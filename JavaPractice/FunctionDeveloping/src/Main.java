import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<InputExample> inputList = new ArrayList<>();
        List<int[]> outputList = new ArrayList<>();

        InputExample input1 = new InputExample(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        InputExample input2 = new InputExample(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
        InputExample input3 = new InputExample(new int[]{95, 95, 95, 95, 95, 95}, new int[]{1, 1, 1, 1, 1, 1});
        inputList.add(input1); inputList.add(input2); inputList.add(input3);

        int[] output1 = new int[]{2, 1};
        int[] output2 = new int[]{1, 3, 2};
        int[] output3 = new int[]{6};

        outputList.add(output1); outputList.add(output2); outputList.add(output3);

        int numOfCases = inputList.size();

        for (int i=0; i < numOfCases; i++) {
            System.out.print("case " + (i+1) + ": ");
            InputExample input_i = inputList.get(i);
            printOX(sol.solution(input_i.progresses, input_i.speeds), outputList.get(i));
            System.out.println("------------------------------------------");
        }
    }

    private static void printOX(int[] myAnswer, int[] answer) {
        if (Arrays.equals(myAnswer, answer)) {
            System.out.println("O");
        }
        else {
            System.out.println("X");
            System.out.print("answer = [" );
            for (int a: answer) {
                System.out.print(a + " ");
            }
            System.out.println("]");
            System.out.print("mine   = [");
            for (int a: myAnswer) {
                System.out.print(a + " ");
            }
            System.out.println("]");
        }
    }
}

class InputExample {
    public int[] progresses;
    public int[] speeds;

    InputExample(int[] progresses, int[] speeds) {
        this.progresses = progresses;
        this.speeds = speeds;
    }
}
