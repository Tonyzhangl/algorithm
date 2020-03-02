package LeetCode.RecallNote;


import java.util.ArrayList;
import java.util.List;

/**
* @Description:    字母大小写全排列,https://leetcode-cn.com/problems/letter-case-permutation/
* @Author:         kirago
* @CreateDate:     2020/3/2 10:19 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class LetterCasePermutation {

    public List<String> letterCasePermutation(String S){
        List<StringBuilder> ans = new ArrayList<>();

        ans.add(new StringBuilder());

        for(char c:S.toCharArray()){
            int n = ans.size();
            if(Character.isLetter(c)){
                for(int i=0;i<n;i++){
                    ans.add(new StringBuilder(ans.get(i)));
                    ans.get(i).append(Character.toLowerCase(c));
                    ans.get(n+i).append(Character.toUpperCase(c));
                }
            }else {
                for(int i=0;i<n;i++){
                    ans.get(i).append(c);
                }
            }

        }

        List<String> res = new ArrayList<>();
        for(StringBuilder sb: ans){
            res.add(sb.toString());
        }
        return res;
    }


    public static void main(String[] args){
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        letterCasePermutation.letterCasePermutation("abc");
    }

}
