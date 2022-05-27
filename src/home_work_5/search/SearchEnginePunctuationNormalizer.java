package home_work_5.search;

import home_work_5.api.ISearchEngine;
import home_work_5.api.ISearchEnginePunctuationNormalizer;

public class SearchEnginePunctuationNormalizer implements ISearchEnginePunctuationNormalizer {

    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        return searchEngine.search(text, word);
    }

    @Override
    public String readTextWithoutPunctuationMarks(String text) {
        return text.replaceAll("[,<+>=*/.?:;!()'\"]|(\\s-)|(-\\s)|(--)", " ").replaceAll("\\s+", " ");
    }
}