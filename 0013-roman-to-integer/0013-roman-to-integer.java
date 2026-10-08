class Solution {
    public int getIntValue(char ch){
        int value = 0;
        switch(ch){
        case 'I' : value = 1; break;
        case 'V' : value = 5; break;
        case 'X' : value = 10; break;
        case 'L' : value = 50; break;
        case 'C' : value = 100; break;
        case 'D' : value = 500; break;
        case 'M' : value = 1000; break;
        default : value = 0;
    }
    return value;
    }

    public int romanToInt(String s) {
        StringBuilder sb = new StringBuilder(s);
        int current = 0;
        int next = 0;
        int ans = 0;
        for(int i = 0; i<sb.length(); i++){
            current = (i>=0) ? getIntValue(sb.charAt(i)) : 0;
            next = (i<sb.length()-1) ? getIntValue(sb.charAt(i+1)) : 0;
            if(current<next){
                int subtract = next-current;
                ans += subtract;
                i++;
            }
            else{
                ans+=current;
            }     
        }
        return ans;

    }
}