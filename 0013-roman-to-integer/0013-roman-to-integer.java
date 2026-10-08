class Solution {
    public int getIntValue(char ch){
        // optimised the space complexity as well 

        int value = 0;
        switch(ch){
        case 'I' : value = 1; break;
        case 'V' : value = 5; break;
        case 'X' : value = 10; break;
        case 'L' : value = 50; break;
        case 'C' : value = 100; break;
        case 'D' : value = 500; break;
        case 'M' : value = 1000; break;
    }
    return value;
    }

    public int romanToInt(String s) {
        int current = 0;
        int next = 0;
        int ans = 0;
        for(int i = 0; i<s.length(); i++){
            current = getIntValue(s.charAt(i));
            next = (i<s.length()-1) ? getIntValue(s.charAt(i+1)) : 0;
            if(current<next){
                ans += (next-current);
                i++;
            }
            else{
                ans+=current;
            }     
        }
        return ans;

    }
}