package com.xiaoheixian.firstletter.dto;

import java.util.List;

/**
 * @author xian
 * @date 2019/1/29 15:51
 */
public class FirstLetterList {

    private String firstWord;

    private List<FirstLetter> firstLetterList;

    public List<FirstLetter> getFirstLetterList() {
        return firstLetterList;
    }

    public void setFirstLetterList(List<FirstLetter> firstLetterList) {
        this.firstLetterList = firstLetterList;
    }

    public String getFirstWord() {
        return firstWord;
    }

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }
}
