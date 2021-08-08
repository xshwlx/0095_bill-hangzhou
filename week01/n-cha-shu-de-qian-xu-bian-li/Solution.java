class Solution {
    List<Integer> value;

    public void dfs(Node root) {
        value.add(root.val);
        for (Node child : root.children) {
            dfs(child);
        }
    }

    public List<Integer> preorder(Node root) {
        value = new ArrayList<>();
        if (root == null)
            return value;
        dfs(root);
        return value;
    }
}
