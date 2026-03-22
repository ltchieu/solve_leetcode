class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord = false;

    public TrieNode(){}
}
class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode curr = root;
        for (char c : word.toCharArray()){
            int index = c - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
        }
        curr.isEndOfWord = true;
    }

    public String searchLCP() {
        TrieNode curr = root;
        StringBuilder lcp = new StringBuilder();

        while (true){
            int count = 0;
            int lastIndex = -1;

            for(int i = 0; i < 26; i++){
                if(curr.children[i] != null){
                    count++;
                    lastIndex = i;
                }
            }

            if(count != 1 || curr.isEndOfWord){
                break;
            }

            lcp.append((char) (lastIndex + 'a'));
            curr = curr.children[lastIndex];
        }
        return lcp.toString();
    }
}
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];

        Trie trie = new Trie();
        for(String s : strs){
            if (s.isEmpty()) return "";
            trie.insert(s);
        }

        return trie.searchLCP();
    }
}
