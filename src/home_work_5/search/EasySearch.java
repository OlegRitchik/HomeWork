package home_work_5.search;

import home_work_5.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        int index = 0;
        long counter = 0;

        while (index != -1) {
            index = text.indexOf(word, index);

            if (index != -1) {

                if ((isNotWordSymbol(geNextCharAfterWord(index, text, word.length()))
                        || geNextCharAfterWord(index, text, word.length()) == 0)
                        && ((isNotWordSymbol(getICharBeforeWord(index, text))
                        || getICharBeforeWord(index, text) == 0))) {
                    counter++;
                }
                index += word.length() + 1;
            }
        }
        return counter;
    }

    private boolean isNotWordSymbol(char wordSeparatingCharacter) {
        return !Character.isLetterOrDigit(wordSeparatingCharacter);
    }

    private char geNextCharAfterWord(int index, String text, int wordLength) {
        if (index + wordLength >= text.length() - 1) {
            return 0;
        }
        return text.charAt(index + wordLength);
    }

    private char getICharBeforeWord(int index, String text) {
        if (index != 0) {
            return text.charAt(index - 1);
        }
        return 0;
    }
}

