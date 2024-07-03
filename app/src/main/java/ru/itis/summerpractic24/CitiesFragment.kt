package ru.itis.summerpractic24

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import ru.itis.summerpractic24.databinding.FragmentCitiesBinding

class CitiesFragment : Fragment(R.layout.fragment_cities) {
    private var binding: FragmentCitiesBinding? = null

    private var adapter: CityAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCitiesBinding.bind(view)

        initAdapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun initAdapter() {
        binding?.run {
            adapter = CityAdapter(
                list = CityRepository.cities,
                onClicked = {
                    findNavController()
                        .navigate(R.id.action_citiesFragment_to_infoScreenFragment)

                }
            )

            rvCity.adapter = adapter
            rvCity.layoutManager = LinearLayoutManager(requireContext())
        }
    }
}