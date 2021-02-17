import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();

        for (String runner : participant) {
            if (participantMap.getOrDefault(runner, 0) > 0) {
                participantMap.replace(runner, participantMap.get(runner)+1);
            }
            else {
                participantMap.put(runner, 1);
            }
        }

        for (String completeRunner : completion) {
            participantMap.replace(completeRunner, participantMap.get(completeRunner)-1);
        }

        for (String parti : participantMap.keySet()) {
            if (participantMap.get(parti) > 0) {
                return parti;
            }
        }
        return null;
    }
}