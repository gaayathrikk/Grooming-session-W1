package Strings;

public class Dictionary {
        private static TreeNode root;
        private static String result = "";
    
        public static String longestWord(String[] words) {
            root = new TreeNode();
    
            for (String w : words)
                insert(w);
    
            dfs(root);
    
            return result;
        }
    
        private static void dfs(TreeNode node) {
            if (node == null)
                return;
    
            if (node.word != null) {
                if (node.word.length() > result.length())
                    result = node.word;
                else if (node.word.length() == result.length() && node.word.compareTo(result) < 0)
                    result = node.word;
            }
    
            for (TreeNode child : node.children)
                if (child != null && child.word != null)
                    dfs(child);
        }
    
        private static void insert(String word) {
            TreeNode current = root;
            for (char c : word.toCharArray()) {
                if (current.children[c - 'a'] == null)
                    current.children[c - 'a'] = new TreeNode();
                current = current.children[c - 'a'];
            }
            current.word = word;
        }

        public static void main(String[] args) {
            String[] s = {"w","wo","wor","worl","world"};
            System.out.println(longestWord(s));
        }
    }
    
    class TreeNode {
        TreeNode[] children = new TreeNode[26];
        String word;
    
        TreeNode () {}
    }

