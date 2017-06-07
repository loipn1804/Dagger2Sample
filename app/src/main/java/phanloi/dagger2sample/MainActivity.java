package phanloi.dagger2sample;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import phanloi.dagger2sample.dagger.AppComponent;
import phanloi.dagger2sample.dagger.NetComponent;
import phanloi.dagger2sample.dagger.NetModule;
import phanloi.dagger2sample.model.Vehicle;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtLog1)
    TextView txtLog1;
    @BindView(R.id.txtLog2)
    TextView txtLog2;
    @BindView(R.id.txtLog3)
    TextView txtLog3;

    private AppComponent mAppComponent;

    private NetComponent mNetComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mAppComponent = ((MyApp) getApplication()).getAppComponent();

        mNetComponent = mAppComponent.plus(new NetModule(""));

        createVehicle();

        createSharePreferences();
    }

    private void createVehicle() {
        Vehicle vehicle = mAppComponent.getVehicle();

        txtLog1.setText("Vehicle speed " + vehicle.getSpeed());
    }

    private void createSharePreferences() {
        Random random = new Random();
        SharedPreferences preferences = mNetComponent.getSharedPreferences();

        int rand = preferences.getInt("random", 0);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("random", random.nextInt(1000));
        editor.apply();

        txtLog2.setText("Random " + rand);
    }
}
