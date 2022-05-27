package home_work_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class BookReader {
    private final Path pathToFile;
    public BookReader(Path pathToFile) {
        this.pathToFile = pathToFile;
    }

    /**
     * Метод читает файл построчно
     *
     * @return прочитанный текст в строке
     */
    public String readFile() {
        File file = pathToFile.toFile();
        StringBuilder bookBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
            while (scanner.hasNextLine()) {
                bookBuilder.append(scanner.nextLine());
            }
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }
        return bookBuilder.toString();
    }

    /**
     * Метод убирает все знаки пунктуации
     *
     * @return возвращает отформатированный текс
     */
    public String readTextWithoutPunctuationMarks() {
        String str = readFile();
        return str.replaceAll("[,<+>=*/.?:;!()'\"]|(\\s-)|(-\\s)|(--)", " ").replaceAll("\\s+", " ");
    }

    private List<String> getAllWords() {
        String editedText = readTextWithoutPunctuationMarks();
        String[] words = editedText.split(" ");
        return Arrays.asList(words);
    }

    public Set<String> getAllUsedWords() {
        return new HashSet<>(getAllWords());
    }

    private Map<String, Integer> numberOfTimesWordsAreUsed() {

        Map<String, Integer> numberOfTimesWordsIsUsed = new HashMap<>();
        List<String> allWords = getAllWords();
        for (String word : allWords) {
            numberOfTimesWordsIsUsed.compute(word, this::getTargetValue);
        }
        return numberOfTimesWordsIsUsed;
    }

    private Integer getTargetValue(String key, Integer value) {
        return value == null ? 1 : value + 1;
    }

    public List<Map.Entry<String, Integer>> getNumberOfTimesWordsAreUsed(int limit) {
        List<Map.Entry<String, Integer>> wordWithAmountEntries = new ArrayList<>(numberOfTimesWordsAreUsed().entrySet());
        Comparator<Map.Entry<String, Integer>> entryComparator = Map.Entry.comparingByValue();
        wordWithAmountEntries.sort(entryComparator.reversed());
        return wordWithAmountEntries
                .stream()
                .limit(limit)
                .collect(Collectors.toList());
    }
}
