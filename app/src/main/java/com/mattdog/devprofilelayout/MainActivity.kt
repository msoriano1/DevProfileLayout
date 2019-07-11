package com.mattdog.devprofilelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Blueprint is used for positioning and layout, not colors
    //Match constraint (click constraints in Layout in Attributes) makes the size fill up the constraint size
    //Turn on Autoconnect (upper left side, magnet shaped) automatically generates constraints based on where you drop the widget)
    //Clear all contraints button (S shape in the upper left) removes all constraints in the page
    //Infer constraints (magic wand shape in the upper left) guesses and places the most appropriate constraints
    //Guidelines (I shape in the upper left) allows the adding of guidelines
    //Image Attributes: scaletype: center-crop fills up the image view
    //Image Attributes: Layout: match constraints lets the image view stretch until the constraints
    //Right click set of images then create vertical/horizontal chain to create a consistent contraints
    //Right click set of images then cycle chain to change spacing between images on the chain
    //Right click set of images then Align then Vertical Align to lock in their vertical alignment

}
