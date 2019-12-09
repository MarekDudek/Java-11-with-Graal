package org.example.java11withgraal;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

final class RunJavaScript implements Callable<String> {

    @Override
    public String call() throws IOException {
        final Path path = Paths.get("src", "main", "resources", "graalvm.json");
        final byte[] bytes = Files.readAllBytes(path);
        final String json = new String(bytes);
        try (Context context = Context.create("js")) {
            final Value parse = context.eval("js", "JSON.parse");
            final Value stringify = context.eval("js", "JSON.stringify");
            final Value result = stringify.execute(parse.execute(json), null, 2);
            return result.asString();
        }
    }
}
