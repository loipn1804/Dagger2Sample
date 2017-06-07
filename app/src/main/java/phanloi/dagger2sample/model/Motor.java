package phanloi.dagger2sample.model;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 06, 2017
 */

public class Motor {

    private int mRpm;

    public Motor(int rpm) {
        mRpm = rpm;
    }

    public int getRpm(){
        return mRpm;
    }

    public void accelerate(int value){
        mRpm = mRpm + value;
    }

    public void brake(){
        mRpm = 0;
    }
}
