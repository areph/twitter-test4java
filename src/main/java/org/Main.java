package org;

import java.util.stream.IntStream;

/**
 * Created by areph on 2016/08/03.
 */
public class Main {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 10).forEach(System.out::println);
    }
}
