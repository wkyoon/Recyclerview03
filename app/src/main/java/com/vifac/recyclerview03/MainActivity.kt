package com.vifac.recyclerview03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vifac.recyclerview02.ProfileAdapter
import com.vifac.recyclerview02.ProfileData
import com.vifac.recyclerview03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    lateinit var profileAdapter: ProfileAdapter
    val datas = mutableListOf<ProfileData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecycler()
    }
    private fun initRecycler() {
        profileAdapter = ProfileAdapter(this)
        binding.rvProfile.adapter = profileAdapter

        datas.apply {
            add(ProfileData(img = R.mipmap.ic_launcher_round, name = "mary", age = 24))
            add(ProfileData(img = R.mipmap.ic_launcher_round, name = "jenny", age = 26))
            add(ProfileData(img = R.mipmap.ic_launcher_round, name = "jhon", age = 27))
            add(ProfileData(img = R.mipmap.ic_launcher_round, name = "ruby", age = 21))
            add(ProfileData(img = R.mipmap.ic_launcher_round, name = "yuna", age = 23))

            profileAdapter.datas = datas
            profileAdapter.notifyDataSetChanged()

        }
    }
}