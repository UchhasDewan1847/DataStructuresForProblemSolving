class Trie{
    Boolean isLeaf;
    HashMap<Character, Trie> children;
    Trie(){
        isLeaf = false;
        children = new HashMap<>();
    }
    public void insert(String word){
        Trie current = this;
        for(Character c : word.toCharArray()){
            current.children.putIfAbsent(c, new Trie());
            current = current.children.get(c);
        }
        current.isLeaf = true;
    }
    public boolean search(String key)
    {
 
        Trie curr = this;
        for (char c: key.toCharArray())
        {
            curr = curr.children.get(c);
            if (curr == null) {
                return false;
            }
        }

        return curr.isLeaf;
    }
}
