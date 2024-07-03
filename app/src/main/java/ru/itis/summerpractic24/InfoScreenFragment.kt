package ru.itis.summerpractic24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import ru.itis.summerpractic24.databinding.FragmentInfoScreenBinding

class InfoScreenFragment : Fragment(R.layout.fragment_info_screen) {
    private var binding: FragmentInfoScreenBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInfoScreenBinding.bind(view)

        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            findNavController()
                .navigate(R.id.action_infoScreenFragment_to_citiesFragment)
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}