package Objectception;

import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> dictionary;
  
    public SimpleDictionary() {
        this.dictionary = new HashMap<String, String>();
    }
  
    // Add a word and its translation to the dictionary
    public void add(String word, String translation) {
        // Store keys in lowercase for case-insensitive lookup
        this.dictionary.put(word.toLowerCase(), translation.toLowerCase());
    }
  
    // Get the translation of a word
    public String translate(String word) {
      return this.dictionary.get(word.toLowerCase());
    }
  }
  
