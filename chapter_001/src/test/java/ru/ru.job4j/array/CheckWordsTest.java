package ru.ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Dmitry Poklonov (d.poklonov@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class CheckWordsTest {
    /**
     * Test Checkwords.
     */
    @Test
    public void whenSmallWordHideInBigWord() {
        CheckWords checker = new CheckWords();
        String origin = "Привет";
        String sub = "иве";
        char[] arrBig = checker.createArr(origin);
        char[] arrSmall = checker.createArr(sub);
        boolean result = checker.innerCheck(arrSmall, arrBig);
        assertThat(result, is(true));
    }
}