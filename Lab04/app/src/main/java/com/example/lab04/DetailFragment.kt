package com.example.lab04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import android.widget.TextView

class DetailFragment : Fragment() {

    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val locationTextView = view.findViewById<TextView>(R.id.location_text_view)
        viewModel.savedParkingLocation.observe(viewLifecycleOwner, Observer { location ->
            location?.let {
                locationTextView.text = "Saved Location: ${it.latitude}, ${it.longitude}"
            }
        })
    }
}
