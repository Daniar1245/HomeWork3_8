package com.geektech.homework3_8

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geektech.homework3_8.databinding.ItemPersonBinding

class PersonAdapter(private val personList: List<PersonType>, val onItemClick: (position: Int) -> Unit) :
    RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        return PersonViewHolder(ItemPersonBinding.inflate(
            LayoutInflater.
        from(parent.context), parent, false
        )
        )
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bind(personList[position])
    }

    override fun getItemCount() = personList.size

    inner class PersonViewHolder(private val binding: ItemPersonBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(hero: PersonType) {

            itemView.setOnClickListener{
                onItemClick(adapterPosition)
            }

            binding.textName.text = hero.name
            binding.textLive.text = hero.status
            Glide.with(binding.imgFirst).load(hero.image).into(binding.imgFirst)
        }
    }
}