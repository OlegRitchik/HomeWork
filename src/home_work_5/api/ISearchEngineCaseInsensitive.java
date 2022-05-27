package home_work_5.api;

public interface ISearchEngineCaseInsensitive extends ISearchEngine{
    long searchCaseInsensitive(String text, String word);
}
