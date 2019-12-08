package org.example.java11withgraal;

import static java.lang.System.out;

public final class Java11WithGraalMain {

    public static void main(final String[] args) {

        out.println("This is Java 11 with Graal VM application");

        final SomeBean bean =
                SomeBean.builder().
                        name("a bean").
                        number(1).
                        build();

        out.println("Lombok bean: " + bean);
    }
}
