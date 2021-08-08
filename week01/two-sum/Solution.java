class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(nums[i]*2==target){
                    return new int[]{map.get(nums[i]),i};
                }
            }
            int tmp = target - nums[i];
            if(map.containsKey(tmp)){
                return new int[]{i,map.get(tmp)};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
