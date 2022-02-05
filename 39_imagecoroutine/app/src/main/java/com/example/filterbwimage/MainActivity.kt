package com.example.filterbwimage

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.net.URL

class MainActivity : AppCompatActivity() {

    /* 1
    * Take our UI Element
    * */
    private lateinit var progressBar : ProgressBar
    private lateinit var imageViewCat : ImageView


    private val IMG_URL_CAT = "https://images.pexels.com/photos/192384/pexels-photo-192384.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=256&w=512"

    /*
    * 4
    * Create coroutine scope
    * */
    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        * 2. get our UI element
        * */
        progressBar = findViewById(R.id.progressBarLoadImageUI)
        imageViewCat = findViewById(R.id.imageViewCatUI)


        /*
        * 5.
        * Run the coroutine
        *
        * */
        coroutineScope.launch {

            //6 get image async
            val originalDeffered = coroutineScope.async(Dispatchers.IO ) { getOriginalImageCatMiauw()}
            val theOriginalImage = originalDeffered.await()


            //8 make image show on screen
            //loadImageCat(theOriginalImage)

            //10 processing the image with filter
            val filteredDeffered = coroutineScope.async(Dispatchers.Default) { applyFilterBW(theOriginalImage) }
            val filteredPhoto = filteredDeffered.await()
            loadImageCat(filteredPhoto)
        }

    }

    /*
    * 3. just see the image on internet
    * (without filter)
    * */
    private fun getOriginalImageCatMiauw() =
        URL(IMG_URL_CAT).openStream().use {
            BitmapFactory.decodeStream(it)
        }
    //code above happended in UI, so the coroutine need to run on dispatch main
    //or in another word, need to declare coroutine main



    //7.
    //lets see the image in app
    private fun loadImageCat(bmp:Bitmap) {
        progressBar.visibility = View.GONE
        imageViewCat.setImageBitmap(bmp)
        imageViewCat.visibility = View.VISIBLE
    }

    //9.
    //make fulter apply on coroutine
    private fun applyFilterBW(originalPhoto: Bitmap) = BWFilter.apply(originalPhoto)
}