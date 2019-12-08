package org.example.java11withgraal;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

@Builder
@EqualsAndHashCode
@ToString
final class SomeBean {
    @NonNull
    public final String name;
    public final int number;
}
