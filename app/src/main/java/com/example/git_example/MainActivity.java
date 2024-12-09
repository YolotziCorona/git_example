package com.example.git_example;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Obtener el fragmento del mapa y notificar cuando esté listo
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }
    }
     // Botón para mostrar ubicaciones guardadas
        Button btnSavedLocations = findViewById(R.id.btn_saved_locations);
        btnSavedLocations.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SavedLocationsActivity.class);
            startActivity(intent);
    
    // Vincular el botón con su ID
        Button btnLogin = findViewById(R.id.btnLogin);

    // Configurar el listener para mostrar un Toast al presionar el botón
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mostrar un mensaje emergente
                Toast.makeText(MainActivity.this, "¡Has presionado el botón de Login!", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Configurar una ubicación inicial
        LatLng sydney = new LatLng(-33.8688, 151.2093); // Coordenadas de Sídney
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 10));

    //pull request
    }
}
