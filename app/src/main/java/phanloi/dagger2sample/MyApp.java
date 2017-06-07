package phanloi.dagger2sample;

import android.app.Application;

import phanloi.dagger2sample.dagger.AppComponent;
import phanloi.dagger2sample.dagger.AppModule;
import phanloi.dagger2sample.dagger.DaggerAppComponent;
import phanloi.dagger2sample.dagger.VehicleModule;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 07, 2017
 */

public class MyApp extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .vehicleModule(new VehicleModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
