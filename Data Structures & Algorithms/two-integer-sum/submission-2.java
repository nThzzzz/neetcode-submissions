class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] par = new int[2];
        HashMap<Integer, Integer> vistos = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];

            if (vistos.containsKey(complemento)) {
                par[0] = vistos.get(complemento);
                par[1] = i;
                break;
            } else {
                vistos.put(nums[i], i);
            }
        }

        return par;
    }
}
