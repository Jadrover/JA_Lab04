package com.example.lab04

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.maps.model.LatLng

class SharedViewModel : ViewModel() {
    private val _savedParkingLocation = MutableLiveData<LatLng>()
    val savedParkingLocation: LiveData<LatLng> get() = _savedParkingLocation

    fun saveParkingLocation(location: LatLng) {
        _savedParkingLocation.value = location
    }
}
