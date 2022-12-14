package com.smallbusiness.core.sampledata;

import dev.hilla.Nonnull;

public class EndpointData {
    public static EnpointJavaRecord getRecordData() {
        return new EnpointJavaRecord("Hey from frontend. I am from a java record backend", 99, 4L);
    }

    public record EnpointJavaRecord (@Nonnull String s, @Nonnull Integer i, @Nonnull Long z){}
}
