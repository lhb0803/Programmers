import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Bridge bridge = new Bridge(bridge_length, weight);

        Queue<Integer> truck_que = new LinkedList<>();
        for (int t_w : truck_weights) {
            truck_que.add(t_w);
        }

        int answer = 0;
        while (!(truck_que.isEmpty() && bridge.isEmpty())) {
            int aTruck;
            if (!truck_que.isEmpty()) {
                aTruck = truck_que.peek();
            }
            else {
                aTruck = weight+1; // nothing to load
            }
            if (bridge.onTruckWeight + aTruck - bridge.onTrucksArr[bridge_length-1]<= bridge.limitWeight) {
                bridge.mountTruck(truck_que.poll());
            }
            else {
                bridge.transferTruck();
            }
            answer++;
        }

        return answer;
    }

    class Bridge {
        public int bridgeLength;
        public int limitWeight;
        public int[] onTrucksArr;
        public int onTruckWeight;

        Bridge(int l, int w) {
            bridgeLength = l;
            limitWeight  = w;
            onTrucksArr = new int[bridgeLength];
            for (int i=0; i<bridgeLength; i++) {
                onTrucksArr[i] = 0;
            }
            onTruckWeight = 0;
        }

        public void mountTruck(int n) {
            onTruckWeight += n;
            transferTruck();
            onTrucksArr[0] = n;
        }

        public void transferTruck() {
            if (onTrucksArr[bridgeLength-1] != 0) {
                onTruckWeight -= onTrucksArr[bridgeLength-1];
            }
            for (int i=bridgeLength-1; i>0; i--) {
                onTrucksArr[i] = onTrucksArr[i-1];
            }
            onTrucksArr[0] = 0;
        }

        public boolean isEmpty() {
            for (int t_w : onTrucksArr) {
                if (t_w != 0) {
                    return false;
                }
            }
            return true;
        }
    }

}