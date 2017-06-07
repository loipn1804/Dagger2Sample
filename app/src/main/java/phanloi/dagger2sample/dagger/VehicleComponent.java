package phanloi.dagger2sample.dagger;

import javax.inject.Singleton;

import dagger.Component;
import phanloi.dagger2sample.model.Vehicle;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 06, 2017
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();
}
