class Solution {
// contains() accepts a String, while indexOf() accepts both char and String.
// contains() returns true/false; indexOf() returns the index or -1 if not found.
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ls = new ArrayList<>();
        int index = 0;
        for(int i = 0; i<words.length; i++){
            if(words[i].indexOf(x) != -1){
                ls.add(i);
                index++;
            }
        }
        return ls;
        
    }
}