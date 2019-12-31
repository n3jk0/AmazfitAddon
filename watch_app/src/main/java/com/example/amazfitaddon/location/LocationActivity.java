package com.example.amazfitaddon.location;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.amazfitaddon.R;

import java.util.HashMap;
import java.util.Map;

public class LocationActivity extends AppCompatActivity {
    private static final Map<String, Location> LOCATION_MAP = new HashMap<>();
    private static final Map<String, String> ADRESS_NUMBERS = new HashMap<>();

    TextView statusBar;
    LocationManager locationManager;
    BluetoothAdapter bluetoothAdapter;


    static {
//        TODO: add some from Ljubljana - Novo mesto
        LOCATION_MAP.put("Maribor", new Location(46.554649, 15.645881));
        LOCATION_MAP.put("Fram", new Location(46.453872, 15.638675));
        LOCATION_MAP.put("Slovenska Bistrica", new Location(46.391991, 15.572810));
        LOCATION_MAP.put("Slovenske Konjice", new Location(46.337307, 15.422497));
        LOCATION_MAP.put("Celje", new Location(46.231022, 15.260290));
        LOCATION_MAP.put("Vransko", new Location(46.245659, 14.952250));
        LOCATION_MAP.put("Trojane", new Location(46.188221, 14.886122));
        LOCATION_MAP.put("Lukovica", new Location(46.168750, 14.691093));
        LOCATION_MAP.put("Domžale", new Location(46.137878, 14.593840));
        LOCATION_MAP.put("Ljubljana", new Location(46.056946, 14.505752));

//        Maybe with +386 ...
        ADRESS_NUMBERS.put("Ljubezen moja", "041692228");
        ADRESS_NUMBERS.put("Nejc", "070701664");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        statusBar = findViewById(R.id.statusBar);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    }

    public void getLocationAndSendSMS(View view) {

    }
}
