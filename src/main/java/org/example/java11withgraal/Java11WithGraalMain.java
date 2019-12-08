package org.example.java11withgraal;

import java.util.concurrent.Callable;

import static java.lang.System.out;

public final class Java11WithGraalMain {

    public static void main(final String[] args) throws Exception {

        out.println("This is Java 11 with Graal VM application");

        out.println("Running Lombok:");
        final Callable<String> callLombok = new RunLombok();
        final String lombokResult = callLombok.call();
        out.println(lombokResult);

        out.println("Running JavaScript:");
        final Callable<String> callJavaScript = new RunJavaScript();
        final String javaScriptResult = callJavaScript.call();
        out.println(javaScriptResult);
    }
}
