class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void fun(int idx,int target,int candidates[],ArrayList<Integer> al){
        if(target<0) return;
        if(idx>=candidates.length) return;
        if(target==0){
            ans.add(new ArrayList<>(al));
            return;
        }
        al.add(candidates[idx]);
        fun(idx,target-candidates[idx],candidates,al);
        al.remove(al.size()-1);
        fun(idx+1,target,candidates,al);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        fun(0,target,candidates,new ArrayList<>());
        return ans;
    }
}