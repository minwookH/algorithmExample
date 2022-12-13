package programmers.hash;

import java.util.ArrayList;

public class Phoneketmon {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Solution solution = new Solution();

        solution.solution(new int[]{3,1,2,3});
    }
}

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int maxCount = nums.length / 2;

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i :
             nums) {
            if (!temp.contains(i)) {
                temp.add(i);
            }
        }

        answer = Math.min(temp.size(), maxCount);

        System.out.println("answer :" + answer);
        return answer;
    }
}