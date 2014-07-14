package com.acme;

import info.magnolia.module.blossom.annotation.DialogFactory;
import info.magnolia.module.blossom.annotation.Template;
import info.magnolia.ui.dialog.config.DialogBuilder;
import info.magnolia.ui.framework.config.UiConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Template(id = "acmeModule:pages/main", title = "Main")
@Controller
public class MainTemplate {
	
	@DialogFactory("frontpage-properties")
    public void frontPageProperties(UiConfig cfg, DialogBuilder dialog) {
        dialog.form().tabs(
                cfg.forms.tab("Properties").fields(
                        cfg.fields.text("headline").label("Headline").description("The text to use as a headline")
                )
        );
    }
 
    @RequestMapping("/main")
    public String render() {
        return "pages/mainTemplate.ftl";
    }

}
