package com.smallbusiness.starter.views.multimodule;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.smallbusiness.starter.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Core module testing")
@RouteAlias(value = "", layout = MainLayout.class)
@Route(layout = MainLayout.class)
@Tag("core-module-testing-view")
@JsModule("./views/multimodule/core-module-testing-view.ts")

@CssImport("./../../core-module/frontend-lib/css/my-core-backend-colors.scss")

public class CoreModuleTestingView extends LitTemplate {
    @Id
    Div backendImage;

    public CoreModuleTestingView() {
        var image = new Image("./images/lookoutPoint.png", "");
        backendImage.add(image);
    }
}
