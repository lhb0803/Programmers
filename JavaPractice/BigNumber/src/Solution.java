import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        int maxDigit = Integer.toString(max(numbers)).length();
        List<Pair> numPairList = new LinkedList<>();

        for (int num : numbers) {
            Pair pairOfNum = pairEqualDigit(num, maxDigit);
            numPairList.add(pairOfNum);
        }
        numPairList.sort(new ValueComp());

        for (Pair pair : numPairList) {
            if (answer.isEmpty()) {
                if (pair.value == 0) {
                    continue;
                }
            }
            answer += pair.value;
        }

        return answer.isEmpty() ? "0" : answer;
    }

    static private int max(int[] numbers) {
        int maximum = 0;
        for (int number : numbers) {
            if (maximum < number) {
                maximum = number;
            }
        }
        return maximum;
    }

    private Pair pairEqualDigit(int num, int maxDigit) {
        Pair pairOfNum = new Pair(makeEqualDigit(num, maxDigit), num);
        return pairOfNum;
    }

    private String makeEqualDigit(int num, int maxDigit) {
        String numStr = Integer.toString(num);

        while(numStr.length() < maxDigit) {
            numStr += num;
        }

        if (numStr.length() != maxDigit) {
            numStr = numStr.substring(0, maxDigit);
        }

        return numStr;
    }

}

class Pair {
    public String key;
    public Integer value;

    public Pair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }
}

class ValueComp implements Comparator<Pair> {

    @Override
    public int compare(Pair p1, Pair p2) {
        return -p1.key.compareTo(p2.key);
    }
}

class Solution2 extends Solution {
    @Override
    public String solution(int[] numbers) {
        String answer = "";
        List<String> answerList = new ArrayList();

        for (int i=0; i<numbers.length; i++) {
            String number = Integer.toString(numbers[i]);
            int j = 0;
            while (j <= answerList.size()) {
                String numInList = j == answerList.size() ? "" : answerList.get(j);
                if ((number + numInList).compareTo(numInList + number) >= 0) {
                    answerList.add(j, number);
                    break;
                }
                else {
                    j++;
                }
            }
        }

        for (String num : answerList) {
            if (answer.isEmpty()) {
                if (num.equals("0")) {
                    continue;
                }
            }
            answer += num;
        }

        return answer.isEmpty() ? "0" : answer;
    }

}