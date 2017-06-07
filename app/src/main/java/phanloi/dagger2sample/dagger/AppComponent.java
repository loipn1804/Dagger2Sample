package phanloi.dagger2sample.dagger;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import phanloi.dagger2sample.model.Vehicle;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 07, 2017
 */

@Singleton
@Component(modules = {AppModule.class, VehicleModule.class})
public interface AppComponent {

    Application getApplication();

    Vehicle getVehicle();

    NetComponent plus(NetModule netModule);
}
