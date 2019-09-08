package com.laine.mauro.simpledagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(SimpleDagger2Application simpleDagger2Application);

    void inject(MainActivity mainActivity);
}
