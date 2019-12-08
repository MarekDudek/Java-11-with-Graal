package org.example.java11withgraal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

final class Java11WithGraalMainTest {

    @Test
    void test() {
        assertThat(2 + 2).isEqualTo(4);
    }
}
