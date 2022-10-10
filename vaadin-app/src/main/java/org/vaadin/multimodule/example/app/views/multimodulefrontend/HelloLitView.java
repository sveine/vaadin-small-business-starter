package org.vaadin.multimodule.example.app.views.multimodulefrontend;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.multimodule.example.app.views.MainLayout;

@PageTitle("Hello Lit")
@Route(layout = MainLayout.class)
@Tag("hello-lit-view")
@JsModule("./views/multimodulefrontend/hello-lit-view.ts")
public class HelloLitView extends LitTemplate {
}
