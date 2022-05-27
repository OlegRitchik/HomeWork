package home_work_5.api;

public interface ISearchEnginePunctuationNormalizer extends ISearchEngine {
    String readTextWithoutPunctuationMarks(String text);
}
