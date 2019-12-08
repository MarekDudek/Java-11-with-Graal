package org.example.java11withgraal;

import java.util.concurrent.Callable;

final class RunLombok implements Callable<String> {

    @Override
    public String call() {

        final SomeBean bean = SomeBean.builder().
                name("a bean").
                number(1).
                build();

        return bean.toString();
    }
}
