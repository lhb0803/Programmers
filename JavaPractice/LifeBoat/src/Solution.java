import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;

        while (left <= right) {
            int weight = people[right];

            while (weight < limit) {
                weight += people[left++];
                if (weight > limit) {
                    left--;
                }
            }
            answer++;
            right--;
        }


        return answer;
    }
}