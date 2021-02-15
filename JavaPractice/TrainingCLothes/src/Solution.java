import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new LinkedList<>();
        List<Integer> reserveList = new LinkedList<>();
        List<Integer> saveList = new LinkedList<>();
        for (int lostStudent : lost) {
            lostList.add(lostStudent);
        }

        for (int reserveStudent : reserve) {
            if (lostList.contains(reserveStudent)) {
                lostList.remove(Integer.valueOf(reserveStudent));
            }
            else {
                reserveList.add(reserveStudent);
            }
        }

        for (int lostStudent : lostList) {
            for (int candidate=lostStudent-1; candidate<=lostStudent+1; candidate+=2) {
                if (reserveList.contains(candidate)) {
                    reserveList.remove(Integer.valueOf(candidate));
                    saveList.add(lostStudent);
                    break;
                }
            }
        }

        int answer = n - lostList.size() + saveList.size();
        return answer;
    }
}