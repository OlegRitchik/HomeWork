package home_work_5.search;

import home_work_5.api.ISearchEngine;
import home_work_5.api.ISearchEngineCaseInsensitive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngineCaseInsensitive implements ISearchEngineCaseInsensitive {
    private final ISearchEngine searchEngine;

    public SearchEngineCaseInsensitive(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        return this.searchEngine.search(text, word);
    }

    @Override
    public long searchCaseInsensitive(String text, String word) {
        long counter = 0;
        String regex = "\\b" + word.toLowerCase() + "\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text.toLowerCase());
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
}