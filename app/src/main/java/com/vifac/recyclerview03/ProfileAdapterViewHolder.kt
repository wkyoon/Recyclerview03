package com.vifac.recyclerview03

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.vifac.recyclerview02.ProfileData
import com.vifac.recyclerview03.databinding.ItemRecyclerEx02Binding
import com.vifac.recyclerview03.databinding.ItemRecyclerExBinding

sealed class ProfileAdapterViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    class PuppleViewHolder(private val binding: ItemRecyclerExBinding) : ProfileAdapterViewHolder(binding)
    {
        fun bind(item: ProfileData) {
            binding.tvRvName.text = item.name
            binding.tvRvAge.text = item.age.toString()
            //Glide.with(itemView).load(item.img).into(imgProfile)
        }
    }

    class TealViewHolder(private val binding: ItemRecyclerEx02Binding) : ProfileAdapterViewHolder(binding)
    {
        fun bind(item: ProfileData) {
            binding.tvRvName.text = item.name
            binding.tvRvAge.text = item.age.toString()
            //Glide.with(itemView).load(item.img).into(imgProfile)
        }
    }

}