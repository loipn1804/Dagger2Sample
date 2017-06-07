package phanloi.dagger2sample.dagger;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 07, 2017
 */

@ActivityScope
@Subcomponent(modules = {NetModule.class})
public interface NetComponent {
    SharedPreferences getSharedPreferences();
}
