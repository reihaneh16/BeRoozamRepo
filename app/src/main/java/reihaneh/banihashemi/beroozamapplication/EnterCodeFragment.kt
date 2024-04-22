package reihaneh.banihashemi.beroozamapplication

import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class EnterCodeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the fragment's layout XML
        val rootView = inflater.inflate(R.layout.fragment_enter_code, container, false)

        // Resolve the window background attribute
        val windowBackground = TypedValue()
        context?.theme?.resolveAttribute(android.R.attr.windowBackground, windowBackground, true)

        // Set the background of the fragment's root view to the window background
        rootView.setBackgroundResource(windowBackground.resourceId)

        return rootView
    }
}
