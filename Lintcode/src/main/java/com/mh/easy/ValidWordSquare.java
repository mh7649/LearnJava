package com.mh.easy;


/**
 * 888. 有效单词词广场
 * 给定一个单词序列，检查它是否构成一个有效单词广场。
 * 一个有效的单词广场满足：如果第k行和第k列读取相同的字符串,并且0≤k<max(numRows numColumns)。
 */
public class ValidWordSquare {

    private static String[] words = {
            "abcd",
            "bnrt",
            "crmy",
            "dtye"
    };

    /**
     * 时间：440ms，空间：27.13MB，代码长度：560
     * @param words 字符数组
     * @return 是否为单词广场
     */
    public static boolean validWordSquare(String[] words) {
        int i = 0, len = words.length;
        for (; i < len; i++) {
            String rowStr = words[i];
            StringBuffer colStr = new StringBuffer();
            for (int j = 0; j < len; j++) {
                colStr.append(words[j], i, i + 1);
            }
            if (!rowStr.equals(colStr.toString())) {
                break;
            }
        }
        return i == len;
    }

    public static void main(String[] args) {
        System.out.println(validWordSquare(words));
    }
}
