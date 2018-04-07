package com.example.evgeniy.facebot_client_android.presentation.videoBridge

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpFragment
import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.evgeniy.facebot_client_android.R
import com.longdo.mjpegviewer.MjpegView
import kotlinx.android.synthetic.main.fragment_video_bridge.*


/**
 * @author evgeniy
 * @since 07.04.18.
 */

interface VideoBridgeView: MvpView{

}

class VideoBridgeFragment(): MvpFragment(), VideoBridgeView {
    @InjectPresenter
    lateinit var presenter: VideoBridgePresenter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_video_bridge, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mjpegview.mode = MjpegView.MODE_FIT_WIDTH
        mjpegview.isAdjustHeight = true
        mjpegview.setUrl("http://www.example.com/mjpeg.php?id=1234")
        mjpegview.startStream()
    }

    override fun onDestroy() {
        mjpegview.stopStream()
        super.onDestroy()
    }

}