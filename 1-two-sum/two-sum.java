class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            if (map.containsKey(second)) {
                return new int[] {map.get(second), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    //добавляем число в массив, которое подходит после отрицания для получения target. 
    // ведь target - одноЧисло = ВтороеЧисло. И вот если второе число уже есть в массиве, значит мы его проверили уже и оно подходит к тому, что мы ищем.
}