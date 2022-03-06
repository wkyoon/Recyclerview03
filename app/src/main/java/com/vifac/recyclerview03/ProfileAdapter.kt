package com.vifac.recyclerview02

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.vifac.recyclerview03.ProfileAdapterViewHolder
import com.vifac.recyclerview03.R
import com.vifac.recyclerview03.databinding.ItemRecyclerEx02Binding
import com.vifac.recyclerview03.databinding.ItemRecyclerExBinding


class ProfileAdapter(private val context: Context) : RecyclerView.Adapter<ProfileAdapterViewHolder>() {

    val OLDER = 0
    val YOUNGGER = 1

    var datas = mutableListOf<ProfileData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapterViewHolder {

        return when(viewType){
            OLDER -> ProfileAdapterViewHolder.PuppleViewHolder(
                    ItemRecyclerExBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
            false
                    )
                )
            YOUNGGER -> ProfileAdapterViewHolder.TealViewHolder(
                ItemRecyclerEx02Binding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
        false
                )
            )
            else  -> throw IllegalArgumentException("Invalid ViewType Provided")
        }

    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: ProfileAdapterViewHolder, position: Int) {

        when(holder){
            is ProfileAdapterViewHolder.PuppleViewHolder -> holder.bind(datas[position] )
            is ProfileAdapterViewHolder.TealViewHolder -> holder.bind(datas[position] )

        }

    }

    override fun getItemViewType(position: Int): Int {
        return if (datas[position].age > 25) OLDER else YOUNGGER
    }


}