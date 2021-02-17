import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<InputExample> inputList = new ArrayList<>();
        List<String> outputList = new ArrayList<>();

        InputExample input1 = new InputExample(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"});
        InputExample input2 = new InputExample(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"});
        InputExample input3 = new InputExample(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"});
        inputList.add(input1); inputList.add(input2); inputList.add(input3);

        String output1 = "leo";
        String output2 = "vinko";
        String output3 = "mislav";
        outputList.add(output1); outputList.add(output2); outputList.add(output3);

        int numOfCases = inputList.size();

        for (int i=0; i < numOfCases; i++) {
            System.out.print("case " + (i+1) + ": ");
            InputExample input_i = inputList.get(i);
            printOX(sol.solution(input_i.participant, input_i.completion), outputList.get(i));
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
    public String[] participant;
    public String[] completion;

    InputExample(String[] participant, String[] completion) {
        this.participant = participant;
        this.completion = completion;
    }

}