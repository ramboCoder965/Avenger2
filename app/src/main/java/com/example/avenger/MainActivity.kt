package com.example.avenger

import android.content.Context
import android.content.Intent
import android.content.Intent.*
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*

var globalV = 1
var currentParagraph = 1

val dumbName = "paragraphText"
var dumbPage = 0





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1.movementMethod = ScrollingMovementMethod()




        val rollButton: Button = findViewById(R.id.button)//rollbutton name needs changed
        val calcbutton: Button = findViewById(R.id.calcButton)//either delete or rename
        var choiceThingy: TextView = findViewById(R.id.diceValue)//choiceA text view
        var oldInputValue = 1
        var inputValue = 1 //used in loading page
        setbookText(pNums)//Initializes the pnums array

        // Code here executes on main thread after user presses button

        rollButton.setOnClickListener {  textView1.text = pNums[loadParagraph(
            oldInputValue,
            paraInputField,
            applicationContext
        )]}


         calcbutton.setOnClickListener {diceValue.text = loadParagraph(
             oldInputValue,
             paraInputField,
             applicationContext
         ).toString() }
        //oldInputValue = loadParagraph(oldInputValue, paraInputField, applicationContext)


// BELOW CODE WILL LAUNCH MAIN ACTIVITY 2 and replace the above
calcbutton.setOnClickListener{//launches a new activity
    val intent = Intent(this, MainActivity2::class.java)
  startActivity(intent)}


       // val intent = Intent(this, MainActivity2::class.java)
        //startActivity(intent)



    }
}

fun displayChoices(currentParagraph: Int): Int {//can change compeltely NOT USED YET

    var nextParagraph = currentParagraph + 1//does nothing

return nextParagraph;

}

fun loadParagraph(oldInputValue: Int, paraInputField: TextInputEditText, context: Context): Int {



        var inputValue = paraInputField.text.toString()
        var inputValueInt = Integer.parseInt(inputValue.toString()).toInt()

        if (inputValueInt == 22)
        {
            //load new activity picture
        }

        if (inputValueInt > 420.0)
        {

                Toast.makeText(context, "heehawwww", Toast.LENGTH_LONG).show()
              inputValueInt = globalV
        }
        globalV = inputValueInt
      //  oldInputValue = inputValueInt
        return inputValueInt

//textView1.text = pNums[inputValueInt]

}



fun dsixRoll(): Int
{
    var dsixRoll =  (1..6).random()


    //diceValue.text = dsixRoll.toString()
    return dsixRoll

}
//  BELOW CODE WILL LAUNCH MAIN ACTIVITY 2
//calcbutton.setOnClickListener{//launches a new activity
//    val intent = Intent(this, MainActivity2::class.java)
//    startActivity(intent)}

fun checkPic(packageContext: Context): Boolean
{
    if ( globalV == 22 )
    {

    }


   return false

}


