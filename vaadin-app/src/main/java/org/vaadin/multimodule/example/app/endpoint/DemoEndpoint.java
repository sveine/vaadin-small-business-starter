package org.vaadin.multimodule.example.app.endpoint;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import org.vaadin.multimodule.example.endpoint.EndpointData;

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
