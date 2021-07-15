package com.jetbrains.records;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Car(@JsonProperty("brand") String brand, @JsonProperty("doors") int doors) {
}
