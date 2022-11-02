package com.geektech.homework3_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geektech.homework3_8.databinding.FragmentFirstBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private var personList = arrayListOf<PersonType>()
    private lateinit var adapter:PersonAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()

        adapter = PersonAdapter(personList,this::onItemClick)
        binding.recyclerMain.adapter =adapter
    }

    private fun onItemClick(position:Int){
        findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(personList, position))
    }

    private fun loadData() {
        personList.add(PersonType("Naruto Uzumaki", "alive", "https://i1.sndcdn.com/artworks-000139163741-dk8qn7-t500x500.jpg"))
        personList.add(PersonType("Jiraiya","dead","https://pbs.twimg.com/media/EDua4dpXsAEGhfX.jpg"))
        personList.add(PersonType("Hidan","???","https://i.pinimg.com/originals/8b/f7/19/8bf71907ab6eaff00a8fd89c2d1546d9.jpg"))
        personList.add(PersonType("Sasuke Uchiha","alive","https://aniyuki.com/wp-content/uploads/2022/04/aniyuki-sasuke-uchiha-avatar-1.jpg"))
        personList.add(PersonType("Might Guy","alive","https://i.pinimg.com/originals/1b/f5/27/1bf527b825107610a52302f81907f273.jpg"))
        personList.add(PersonType("Kakashi Hatake","alive","https://i.pinimg.com/originals/17/b2/86/17b2860d84a83c785f0944296f33310a.jpg"))
        personList.add(PersonType("Gaara","alive","https://avatarfiles.alphacoders.com/322/322318.png"))
        personList.add(PersonType("Minato Namikadze","dead","https://pm1.narvii.com/6286/5034f8e1dee25474cb1f6916e3bcde1cb63f5aae_hq.jpg"))
        personList.add(PersonType("Nara Shikamaru","alive","https://i.pinimg.com/736x/6a/60/c0/6a60c02cdfa4a5aa8deb5c2c25336fbd.jpg"))
        personList.add(PersonType("Deidara","dead","https://i.pinimg.com/736x/de/d0/55/ded05583cc353bebf69f1c258939c2b3.jpg"))
        personList.add(PersonType("Алтынай","МОЯ ЖИЗНЬ","https://lh3.googleusercontent.com/sdtS4upXtG1D6b2tS7SOhrO964SnsmQG1KGQzdGb48g-OOAoRV3XdyyEqyj_a3SCo2p4CUWF7gykl60ZOK8MV2B0F6IhuzWTiQzPY18_74uYBH6Egr3Bya14unN2KA2uuG6Jcfd3WgfBMUVhplyXNYZRi7alCA9YtVwqD5WwGtOrI7jJp_gfao2F0X5m6QGeDUngCEafzJeqCclS3i8MEAqHaFbbHqwFSnnUltpBWH9_iLlfHMGiyEjdlyWrxZpb5_xWijHcGbdwENDgi3f0tTgZQCI7VTpfSd-Yv8qjaa_uHcgKaEbGvSR7oPaE77fDifmvEut4UrhQtfaXG4xeAciow_kNzZmLA5vCrNHuGVa2nzK0gAss70shnXpFZt-Qgfm-79GXXLom9cthiWq9rWq7imoLtep2ueUdvqORUstcRvM54qcB_u9iwkHyNx61iRuQVgflNSp-CxwwtT_VLvFUTCfCVf6N9KIXEQDixCrFVaqZEhiN4lOezVaZq-zgFIaH_WwCqRP-wpABKEQJf82M1ACRRV8A5hFMGnaswaVqSno_q1RxI4aCW5kB8ohf3rZocXKc42iQLR-0Jq8H5x_rYZJq8iD8LEzWB5hQhgDmCbouhJTXndyBKaZREJCg9WG_1bA6DVP8JgS9MH_7RE341Iw3gz_m9hyPq2t6xHEGsL1G_6kHfV5sswBad5-mLnZbJxd1UjgnS7rRxGdsKYv2X4D1xVMigyeyYwG0a4ONxgnxGsX4waNJ67vD5IVhJSAKPNv-jT5NirXvTG7Xs2otfknNK5gVT1ZBbrw4hfmLd6UOYOhZEwhxHC2cSB0M8zMC2ayJ0xyR6VmVBOIlwgSElUp_7rnLMEACKrP6ApUtsxGSdY3buTI4jt0cvWFUqQdZFl5dbu_1CqC8kRk7Fc2pbyG9ut12S7I2udgp0vc7=w469-h625-no?authuser=0"))
    }
}