class Solution {
    public int subarraysWithXorK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int xor = 0;
        int cnt = 0;

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];

            int rem = xor ^ k;

            if (map.containsKey(rem)) {
                cnt += map.get(rem);
            }

            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return cnt;
    }
}