class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int a_index = a.length()-1;
        int b_index = b.length()-1;
        int sum = 0;
        while(a_index>=0 || b_index>=0){
            if(a_index>=0){
                sum+=(a.charAt(a_index) - '0');
                a_index--;
            }
            if(b_index>=0){
                sum+=(b.charAt(b_index) - '0');
                b_index--;
            }
            if(sum == 3){
                sum = 1;
                ans.append("1");
            }
            else if(sum == 2){
                sum = 1;
                ans.append("0");
            }
            else if(sum == 1){
                sum = 0;
                ans.append("1");
            }
            else{
                ans.append("0");
            }
        }
        if(sum == 1){
            ans.append("1");
        }
        return ans.reverse().toString();
    }
}
