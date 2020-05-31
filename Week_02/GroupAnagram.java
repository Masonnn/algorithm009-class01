class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();

        Map<String, List> ans = new HashMap<String, List>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(str);
        }

        return new ArrayList(ans.values());
    }
}


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();

        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];

        for (String str : strs) {
            Arrays.fill(count, 0);
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder stringBuilder = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                stringBuilder.append('#');
                stringBuilder.append(count[i]);
            }
            String key = stringBuilder.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(str);
        }

        return new ArrayList(ans.values());
    }
}

