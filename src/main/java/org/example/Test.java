package org.example;

import lombok.Builder;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Test {
    @Builder.Default
    private final boolean foo = true;
}
