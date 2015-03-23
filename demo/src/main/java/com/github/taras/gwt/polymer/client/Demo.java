package com.github.taras.gwt.polymer.client;

import com.github.taras.gwt.polymer.client.view.sampler.CheckboxSample;
import com.github.taras.gwt.polymer.client.view.sampler.RadioButtonSample;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Demo implements EntryPoint {

    public void onModuleLoad() {
//        RootPanel.get().add(new PaperTabsView());
//        RootPanel.get().add(new PaperTabsWidgetView());
//        RootPanel.get().add(new PaperElementsSampler());
        RootPanel.get().add(new CheckboxSample());
        RootPanel.get().add(new RadioButtonSample());
    }
}
