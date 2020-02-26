package LeetCode.StringNote;

import java.util.Arrays;
import java.util.HashSet;

/**
* @Description:    实现一个魔法字典,https://leetcode-cn.com/problems/implement-magic-dictionary/
* @Author:         kirago
* @CreateDate:     2020/2/26 3:26 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class MagicDictionary {
    HashSet<String> hashSet;

    public MagicDictionary(){
        hashSet = new HashSet<>();
    }

    public void buildDict(String[] dict){
        hashSet = new HashSet<>(Arrays.asList(dict));
    }

//    自解法，暴力匹配
    public boolean search(String word){
        for(String item:hashSet){
            if(item.length() == word.length()){
                int len = word.length();
                for(int i=0;i<word.length();i++){
                    if((item.substring(0,i)+item.substring(i+1,len)).equals(word.substring(0,i)+word.substring(i+1,len)) && !word.equals(item)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
