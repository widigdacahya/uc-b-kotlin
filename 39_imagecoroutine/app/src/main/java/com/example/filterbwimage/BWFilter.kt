package com.example.filterbwimage

import android.graphics.Bitmap
import android.graphics.Color

/*
* To make downloaded Image
* become black and white
*
* */

object BWFilter {

    fun apply(source: Bitmap) : Bitmap {

        val width = source.width
        val height = source.height
        val pixels = IntArray(width*height)

        //get pixel array from source
        source.getPixels(pixels, 0, width, 0,0 ,width,height)

        var R: Int
        var G: Int
        var B: Int
        var index : Int
        var treshHold: Int

        for (y in 0 until height) {
            for(x in 0 until width) {

                //get current index in 2dMatrix
                index = y * width + x

                //get color
                R = Color.red(pixels[index])
                G = Color.green(pixels[index])
                B = Color.blue(pixels[index])

                val grey = (R + G + B) /3
                pixels[index] = Color.rgb(grey,grey,grey)

            }
        }

        //output bitmap
        val bitmapOut = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565)
        bitmapOut.setPixels(pixels, 0 ,width, 0,0, width,height)
        return bitmapOut

    }

}