import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> answerStack = new Stack<>();
        Queue<Character> numberQue = new LinkedList<>();

        for (int n=0; n<number.length(); n++) {
            numberQue.add(number.charAt(n));
        }

        answerStack.add(numberQue.poll());
        while(k > 0) {
            if (!numberQue.isEmpty()) {
                char c = numberQue.poll();
                while (!answerStack.isEmpty() && answerStack.peek() < c) {
                    answerStack.pop();
                    k--;
                    if (k <=0 ) {
                        break;
                    }
                }
                answerStack.add(c);
            }

            else {
                for (int i=0; i<k; i++) {
                    answerStack.pop();
                }
                k=0;
            }
        }
        answerStack.addAll(numberQue);

        String answer = "";
        for (int n=0; n<answerStack.size(); n++) {
            answer += answerStack.get(n);
        }

        return answer;
    }
}
