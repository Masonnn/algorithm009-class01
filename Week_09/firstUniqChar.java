class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (hashMap.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}