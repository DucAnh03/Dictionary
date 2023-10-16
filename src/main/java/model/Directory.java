/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class Directory {
    private String wordEnglish;
    private String wordVietnamese;

    public Directory() {
    }

    public Directory(String wordEnglish, String wordVietnamese) {
        this.wordEnglish = wordEnglish;
        this.wordVietnamese = wordVietnamese;
    }
    

    public String getWordEnglish() {
        return wordEnglish;
    }

    public void setWordEnglish(String wordEnglish) {
        this.wordEnglish = wordEnglish;
    }

    public String getWordVietnamese() {
        return wordVietnamese;
    }

    public void setWordVietnamese(String wordVietnamese) {
        this.wordVietnamese = wordVietnamese;
    }

    
    
    
}
