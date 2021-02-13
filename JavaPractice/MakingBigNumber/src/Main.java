import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<InputExample> inputList = new ArrayList<>();
        List<String> outputList = new ArrayList<>();

        InputExample input1 = new InputExample("1924", 2);
        InputExample input2 = new InputExample("1231234", 3);
        InputExample input3 = new InputExample("4177252841", 4);
        InputExample input4 = new InputExample("9999", 3);
        InputExample input5 = new InputExample("21110", 2);
        InputExample input6 = new InputExample("10000", 4);
        InputExample input7 = new InputExample("87654321", 3);
        String fuckingLongString_in = "";
//        for (int i=0; i<50000; i++) {
//            fuckingLongString_in += "18";
//        }
        InputExample input8 = new InputExample("181818", 3);
        inputList.add(input1); inputList.add(input2); inputList.add(input3); inputList.add(input4);
        inputList.add(input5); inputList.add(input6); inputList.add(input7); inputList.add(input8);

        String output1 = "94";
        String output2 = "3234";
        String output3 = "775841";
        String output4 = "9";
        String output5 = "211";
        String output6 = "1";
        String output7 = "87654";
        String output8 = "888";
//        for (int i=0; i<50000; i++) {
//            output8 += "8";
//        }

        outputList.add(output1); outputList.add(output2); outputList.add(output3); outputList.add(output4);
        outputList.add(output5); outputList.add(output6); outputList.add(output7); outputList.add(output8);

        int numOfCases = inputList.size();

        for (int i=7; i < numOfCases; i++) {
            System.out.print("case " + (i+1) + ": ");
            InputExample input_i = inputList.get(i);
            printOX(sol.solution(input_i.number, input_i.k), outputList.get(i));
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
    public String number;
    public int k;

    InputExample(String number, int k) {
        this.number = number;
        this.k = k;
    }

}