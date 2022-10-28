package com.smallbusiness.starter.views.reactdemo;

import com.smallbusiness.starter.views.MainLayout;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@NpmPackage(value = "sass", version = "1.55.0")

@NpmPackage(value = "@vitejs/plugin-react", version = "2.1.0")
@NpmPackage(value = "react", version = "18.2.0")
@NpmPackage(value = "@types/react", version = "18.0.21")
@NpmPackage(value = "react-dom", version = "18.2.0")
@NpmPackage(value = "@types/react-dom", version = "18.0.6")

@PageTitle("React render and (S)CSS testing")
@Route(layout = MainLayout.class)
@Tag("react-render-sample-view")
@JsModule("./views/reactdemo/react-render-sample-view.ts")
public class ReactRenderSampleView extends LitTemplate {
}
