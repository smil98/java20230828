package bakjun;


class Solution {
    public String solution(String code) {
        int mode = 0;
        String cmp = "";
        String ret="";
        int i;

        for(i = 0; i < code.length(); i++) {
            cmp = code.substring(i, i+1);
            if(mode == 0) {
                if(cmp.equals("1")) {
                    mode = 1;
                } else if(i % 2 == 0) {
                    ret +=  code.charAt(i);
                }
            } else if(mode == 1) {
                if(cmp.equals("1")) {
                    mode = 0;
                } else if(i % 2 != 0) {
                    ret += code.charAt(i);
                }
            }
        }

        if(ret.isEmpty()) {
            ret = "EMPTY";
        }


        return ret;
    }
}