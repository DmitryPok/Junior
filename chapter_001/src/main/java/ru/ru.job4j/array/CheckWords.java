package ru.ru.job4j.array;

import java.util.Arrays;
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
     * @param strin strin.
     * @return return array value.
     */

    public char[] createArr(String strin) {
        char[] array = {};
        array = strin.toCharArray();
        return array;
    }

    /**
     * Array duplicate.
     *
     * @param arrSmall array.
     * @param arrBig   array.
     * @return return boolean value.
     */
    public boolean innerCheck(char[] arrSmall, char[] arrBig) {
        boolean[] verd = new boolean[arrSmall.length];
        boolean verdict = true;
        for (int ind = 0; ind < arrSmall.length; ind++) {
            for (int indx = 0; indx < arrBig.length; indx++) {
                if (arrSmall[ind] == arrBig[indx]) {
                    verd[ind] = true;
                    break;
                } else {
                    verd[ind] = false;
                }
            }
        }
        for (int ind = 0; ind < verd.length; ind++) {
            if (verd[ind]) {
                verdict = verd[ind];
                break;
            } else {
                verdict = false;
            }
        }
        return verdict;
    }
}