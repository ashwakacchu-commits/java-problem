import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] counts = new int[10];
        for (int d : digits) {
            counts[d]++;
        }
        
        List<Integer> result = new ArrayList<>();
        
        
        for (int num = 100; num < 1000; num += 2) {
            int d1 = num / 100;
            int d2 = (num / 10) % 10;
            int d3 = num % 10;
            
            int[] currentCounts = new int[10];
            currentCounts[d1]++;
            currentCounts[d2]++;
            currentCounts[d3]++;
            
            if (currentCounts[d1] <= counts[d1] &&
                currentCounts[d2] <= counts[d2] &&
                currentCounts[d3] <= counts[d3]) {
                result.add(num);
            }
        }
        
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        
        return ans;
    }
}
