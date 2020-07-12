// hash table
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = numCounts(nums);
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();
    }

    private Map<Integer, Integer> numCounts(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if (!count.containsKey(num)) {
                count.put(num, 1);
            } else {
                count.put(num, count.get(num) + 1);
            }
        }
        return count;
    }
}

// ======================================================================

// ======================================================================
