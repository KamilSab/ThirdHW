package ru.itis.summerpractic24

import android.renderscript.ScriptGroup.Binding
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import ru.itis.summerpractic24.databinding.ItemCityBinding

class CityHolder(
    private val binding: ItemCityBinding,
    private val onClicked: (City) -> Unit
): ViewHolder(binding.root) {

    fun onBind(city: City) {
        binding.run {
            tvCity.text = city.name
            tvDesc.text = city.desc
            ivImage.load(city.url)

            root.setOnClickListener {
                onClicked.invoke(city)
            }


        }
    }
}