package com.jetbrains.records;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Rectangle(
        @JsonProperty("width") int width,
        @JsonProperty("length") int length) {
}
