import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        int numOfCards = numbers.length();
        String[] cardArr = new String[numOfCards];
        Set<Integer> answerSet = new HashSet<>();

        for (int i=0; i<numOfCards; i++) {
            String num = numbers.substring(i,1);
            cardArr[i] = num;
        }

        for (int n=1; n<numOfCards+1; n++) { // n = number of cards which are picked
            int[] cardIx = new int[n];
            for (int k=0; k<numOfCards+1-n; k++) {


            }

        }

        answer = answerSet.size();

        return answer;
    }

    private boolean isPrime(int num) {
        int[] eratosArr = new int[num+1];
        for (int i=1; i<num+1; i++) {
            eratosArr[i] = 0;
        }
        eratosArr[2] = 1;

        for (int i=2; i<num+1; i++) {
            if (eratosArr[i] == 1) {
                for (int j=2*i; j<num+1; j+=i) {
                    eratosArr[j] = 0;
                }
            }
        }

        return eratosArr[num] == 1;
    }
}