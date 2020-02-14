package LeetCode.RecallNote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @Description:    电话号码的字母组合,https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
* @Author:         kirago
* @CreateDate:     2020/2/14 3:03 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LetterCombinations {

    private Map<String, String> phone = new HashMap<String, String>(){{
        put("2","abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    private List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits){
        if(digits.length() != 0) {
            backtrack("", digits);
        }
        return ans;
    }

    private void backtrack(String combionations, String next){
        if(next.length() == 0) {
            ans.add(combionations);
        }else {
            String digit = next.substring(0,1);
            String letters = phone.get(digit);
            for(int i=0;i<letters.length();i++) {
                String letter = phone.get(digit).substring(i,i+1);
                backtrack(combionations+letter, next.substring(1));
            }
        }
    }

}
