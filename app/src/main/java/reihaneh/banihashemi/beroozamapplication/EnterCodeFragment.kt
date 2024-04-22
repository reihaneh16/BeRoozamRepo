package reihaneh.banihashemi.beroozamapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class EnterCodeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the fragment's layout XML
        return inflater.inflate(R.layout.fragment_enter_code, container, false)
    }
}
