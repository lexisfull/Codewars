package task;

import java.util.Arrays;
import java.util.Collections;


/*
 *
 * Ваша задача — создать функцию,
 * которая может принимать в качестве аргумента
 * любое неотрицательное целое число и возвращать его
 * с цифрами в порядке убывания. По сути, переставьте цифры,
 * чтобы получить максимально возможное число.
 */
public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(123456789));
    }

    public static int sortDesc(final int num) {
        String[] str = String.valueOf(num).split("");
        Arrays.sort(str, Collections.reverseOrder());
        return Integer.valueOf(String.join("", str));
    }
}
