package org.example.java11withgraal;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

import java.util.concurrent.Callable;

final class RunJavaScript implements Callable<String> {

    @Override
    public String call() {

        final String json = "{\"GraalVM\":{\"description\":\"Language Abstraction Platform\",\"supports\":[\"combining languages\",\"embedding languages\",\"creating native images\"],\"languages\": [\"Java\",\"JavaScript\",\"Node.js\", \"Python\", \"Ruby\",\"R\",\"LLVM\"]}}";

        try (Context context = Context.create("js")) {
            final Value parse = context.eval("js", "JSON.parse");
            final Value stringify = context.eval("js", "JSON.stringify");
            final Value result = stringify.execute(parse.execute(json), null, 2);
            return result.asString();
        }
    }
}
