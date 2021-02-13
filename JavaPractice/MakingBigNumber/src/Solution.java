class Solution {
    public String solution(String number, int k) {

        int i = 0;
        while(k > 0) {
            char cAti = number.charAt(i);
            char cAtiPlusOne = number.charAt(i+1);

            if (cAti < cAtiPlusOne) {
                number = number.substring(0, i) + number.substring(i+1);
                k--;

                if ((i > 0) && (number.charAt(i-1) < number.charAt(i))) {
                    i--;
                }
                if (i < 0) {
                    i = 0;
                }
            }
            else {
                i++;
            }

            if (i == number.length()-1) {
                number = number.substring(0, number.length()-k);
                k = 0;
            }
        }

        return number;
    }
}
