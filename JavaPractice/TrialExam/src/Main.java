import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<InputExample> inputList = new ArrayList<>();
        List<int[]> outputList = new ArrayList<>();

        InputExample input1 = new InputExample(new int[]{1, 2, 3, 4, 5});
        InputExample input2 = new InputExample(new int[]{1, 3, 2, 4, 2});
        InputExample input3 = new InputExample(new int[]{1, 2, 2, 4, 2});
        inputList.add(input1); inputList.add(input2);

        int[] output1 = new int[]{1};
        int[] output2 = new int[]{1, 2, 3};

        outputList.add(output1); outputList.add(output2);

        int numOfCases = inputList.size();

        for (int i=0; i < numOfCases; i++) {
            System.out.print("case " + (i+1) + ": ");
            InputExample input_i = inputList.get(i);
            printOX(sol.solution(input_i.answers), outputList.get(i));
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
    public int[] answers;

    InputExample(int[] answers) {
        this.answers = answers;
    }
}
