package com.example.breached;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapFragment extends Fragment implements OnMapReadyCallback {

    MapView mMapView;
    private GoogleMap googleMap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_area, container, false);

        mMapView = rootView.findViewById(R.id.map);
        mMapView.onCreate(savedInstanceState);

        mMapView.onResume(); // needed to get the map to display immediately

        try {
            MapsInitializer.initialize(getActivity().getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
        mMapView.getMapAsync(this);

        return rootView;
    }

    @Override
    public void onMapReady(GoogleMap map) {
        googleMap = map;

        LatLng currentLocation = new LatLng(32.986071, -96.751336);
        googleMap.addMarker(new MarkerOptions().position(currentLocation).title("Your location"));
        CameraPosition cameraPosition = new CameraPosition.Builder().target(currentLocation).zoom(15).build();
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        ArrayList<Point> points = Point.getPoints();
        for (Point p : points) {
            currentLocation = new LatLng(p.lat, p.lng);
            BitmapDescriptor icon;
            switch (p.title) {
                case "DWI":
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED);
                    break;
                case "PUBLIC INTOXICATION":
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW);
                    break;
                case "ARREST WARRANT":
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE);
                    break;
                case "TRESPASSING":
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA);
                    break;
                case "DRUGS":
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE);
                    break;
                case "THEFT":
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE);
                    break;
                case "SEXUAL ASSAULT":
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET);
                    break;
                case "ACCIDENT":
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN);
                    break;
                case "SUICIDE":
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN);
                    break;
                case "DAMAGES":
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE);
                    break;
                case "ASSAULT":
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET);
                    break;
                default:
                    icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED);
            }

            googleMap.addMarker(new MarkerOptions().position(currentLocation).
                    title(p.title).
                    icon(icon));
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }
}
