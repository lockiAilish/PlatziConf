package com.platzi.conf.view.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.platzi.conf.R

/**
 * A simple [Fragment] subclass.
 */
class UbicationDetailDialogFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_ubication_detail_dialog, container, false)
    }


}
