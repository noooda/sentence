package io.github.noooda.sentence;

import java.util.Map;
import java.util.HashMap;


public class Sentence {
    private String[] words;

    public Sentence(String sentence) {
        this.words = sentence.trim().replaceAll("\\W+$", "").split("\\s+");
    }

    public int words() {
        return this.words.length;
    }

    public Map<String, Integer> frequencies() {
        Map<String, Integer> frequencies = new HashMap<>(); 

        for (String word : this.words) {
            frequencies.put(word, frequencies.getOrDefault(word, 0) + 1);
        }

        return frequencies;
    } 

}