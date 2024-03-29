package com.smallbusiness.starter;

import com.smallbusiness.core.entity.BasePackageForEntity;
import com.smallbusiness.core.repository.BasePackageForRepository;
import com.smallbusiness.core.service.BasePackageForService;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The entry point of the Spring Boot application.
 * <p>
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 */
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
@EntityScan(basePackageClasses = {BasePackageForEntity.class})
@EnableJpaRepositories(basePackageClasses = {BasePackageForRepository.class})
@ComponentScan(basePackageClasses = {Application.class, BasePackageForService.class})


@Theme(value = "my-theme")
@PWA(name = "Vaadin Small Business Starter", shortName = "Vaadin Small Business Starter")

// Lit autocomplete
@NpmPackage(value = "@web-types/lit", version = "latest")

// SCSS in Vite
@NpmPackage(value = "sass", version = "1.55.0")

// Frontend State
@NpmPackage(value = "@adobe/lit-mobx", version = "2.0.0")
@NpmPackage(value = "mobx", version = "^6.3.5")

// From Vaadin
@NpmPackage(value = "line-awesome", version = "1.3.0")
@NpmPackage(value = "@vaadin-component-factory/vcf-nav", version = "1.0.6")

public class Application extends SpringBootServletInitializer implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
