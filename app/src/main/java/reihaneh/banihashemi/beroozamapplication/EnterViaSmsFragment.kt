package reihaneh.banihashemi.beroozamapplication

import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class EnterViaSmsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_enter_via_sms, container, false)

        // Set click listener for Enter button
        view.findViewById<Button>(R.id.confirmButton).setOnClickListener {
            // Replace the current fragment with EnterCodeFragment
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, EnterCodeFragment())
                .addToBackStack(null)
                .commit()
        }
        val windowBackground = TypedValue()
        context?.theme?.resolveAttribute(android.R.attr.windowBackground, windowBackground, true)
        view.setBackgroundResource(windowBackground.resourceId)

        return view
    }
}
