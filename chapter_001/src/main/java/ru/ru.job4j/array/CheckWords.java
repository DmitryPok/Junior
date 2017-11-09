package ru.ru.job4j.array;

/**
 * array.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class  CheckWords {
    /**
     * Array duplicate.
     *
     * @param smallWord array.
     * @param bigWord   array.
     * @return return boolean value.
     */
    public boolean innerCheck(char[] smallWord, char[] bigWord) {
        int wordCheker = 0;
        for (int ind = 0; ind < smallWord.length; ind++) {
            for (int indx = 0; indx < bigWord.length; indx++) {
                if (smallWord[ind] == bigWord[indx]) {
                    wordCheker++;
                    if (wordCheker == smallWord.length) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}