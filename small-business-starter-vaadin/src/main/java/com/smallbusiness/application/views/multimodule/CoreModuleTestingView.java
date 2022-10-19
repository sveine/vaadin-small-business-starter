package com.smallbusiness.application.views.multimodule;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.smallbusiness.application.views.MainLayout;

@PageTitle("Core module testing")
@Route(layout = MainLayout.class)
@Tag("core-module-testing-view")
@JsModule("./views/multimodule/core-module-testing-view.ts")

@CssImport("./css/my-core-resources-colors.css")

public class CoreModuleTestingView extends LitTemplate {
    @Id
    Div backendImage;

    public CoreModuleTestingView() {
        var image = new Image("./images/lookoutPoint.png", "");
        backendImage.add(image);
    }
}
