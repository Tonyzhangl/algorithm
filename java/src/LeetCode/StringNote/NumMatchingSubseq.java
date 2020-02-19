package LeetCode.StringNote;

import java.util.ArrayList;

/**
* @Description:    匹配子序列的单词数，https://leetcode-cn.com/problems/number-of-matching-subsequences/
* @Author:         kirago
* @CreateDate:     2020/2/19 12:57 PM
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class NumMatchingSubseq {

    // 自实现，其实这就是暴力解法，当s 很长的时候就会导致每次遍历words中的元素都会对s进行比对的时间变长，所以多了方法二中的优化方法，通过
    // 尽量的减少对s的比对判断
    public int numMatchingSubseq(String s,String[] words){
        int count=0;
        for(int i=0;i<words.length;i++){
            count += isSubsequence(words[i],s) ? 1 :0;
        }
        return count;
    }

    private boolean isSubsequence(String s,String t){
        char[] str = s.toCharArray();
        int j=-1;
        for(int i=0;i<str.length;i++){
            j = t.indexOf(str[i], j+1);
            if(j==-1){
                return false;
            }
        }
        return true;
    }

    // 借鉴解法
    class Node{
        int index;
        String word;
        public Node(String w, int i){
            index = i;
            word = w;
        }
    }
    public int numMatchingSubseq1(String s,String[] words){
        int ans =0;
        ArrayList<Node>[] heads = new ArrayList[26];
        for(int i=0;i<26;i++){
            heads[i] = new ArrayList<Node>();
        }
        for(String word:words){
            heads[word.charAt(0)-'a'].add(new Node(word, 0));
        }
        for(char c:s.toCharArray()){
            ArrayList<Node> old_buckets = heads[c-'a'];
            heads[c-'a'] = new ArrayList<Node>();
            for(Node node:old_buckets){
                node.index++;
                if(node.index == node.word.length()){
                    ans++;
                }else{
                    heads[node.word.charAt(node.index) - 'a'].add(node);
                }
            }
            old_buckets.clear();
        }
        return ans;
    }
}
