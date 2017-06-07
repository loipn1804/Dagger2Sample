package phanloi.dagger2sample.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import phanloi.dagger2sample.model.Motor;
import phanloi.dagger2sample.model.Vehicle;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 06, 2017
 */

@Module
public class VehicleModule {

    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor(11);
    }

    @Provides
    @Singleton
    Vehicle provideVehicle(Motor motor) {
        return new Vehicle(motor);
    }
}
