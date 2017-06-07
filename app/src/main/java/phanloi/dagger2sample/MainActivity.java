package phanloi.dagger2sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import phanloi.dagger2sample.dagger.DaggerVehicleComponent;
import phanloi.dagger2sample.dagger.VehicleComponent;
import phanloi.dagger2sample.dagger.VehicleModule;
import phanloi.dagger2sample.model.Vehicle;

public class MainActivity extends AppCompatActivity {

    private Vehicle mVehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        mVehicle = component.provideVehicle();

        Toast.makeText(this, String.valueOf(mVehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
