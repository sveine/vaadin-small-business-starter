package com.smallbusiness.application.endpoints;

import com.smallbusiness.core.sampledata.EndpointData;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;

import javax.annotation.Nonnull;

@AnonymousAllowed
@Endpoint
public class DemoEndpoint {
    @Nonnull
    public EndpointData.EnpointJavaRecord helloFromCoreModule() {
        return EndpointData.getRecordData();
    }

    @SuppressWarnings({"unused"})
    private void dummyForInUse(Object o) {
        helloFromCoreModule();
    }
}
