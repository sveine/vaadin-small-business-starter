package com.smallbusiness.starter.endpoints;


import com.smallbusiness.core.util.EndpointDebug;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;

@AnonymousAllowed
@Endpoint
public class DebugFrontend extends EndpointDebug {
    @Override
    public void logOnSysErr(String text) {
        super.logOnSysErr(text);
    }
}
