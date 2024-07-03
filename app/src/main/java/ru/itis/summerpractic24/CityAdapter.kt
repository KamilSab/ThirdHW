package ru.itis.summerpractic24

import android.util.Printer
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.itis.summerpractic24.databinding.ItemCityBinding

class CityAdapter(
    private val list: List<City>,
    private val onClicked: (City) -> Unit
) : RecyclerView.Adapter<CityHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityHolder {
        return CityHolder(
            ItemCityBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            onClicked = onClicked)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: CityHolder, position: Int) {
        holder.onBind(list[position])
    }
}