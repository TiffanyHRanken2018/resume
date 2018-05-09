package tharris.ranken.edu.resume

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //************************************************************************************************//


        var buttonWorkExperience = findViewById<Button>(R.id.buttonWorkHistory)

        buttonWorkExperience.setOnClickListener {
            println("You clicked the WORK EXPERIENCE button!")

            var showWorkExperiencePage = Intent(getApplicationContext(),
                    WorkHistoryActivity::class.java)
            startActivity(showWorkExperiencePage)
        }
    //************************************************************************************************//
        var buttonEducation = findViewById<Button>(R.id.buttonEducation)

        buttonEducation.setOnClickListener {
            println("You clicked the EDUCATION button!")

            var showEducationPage = Intent(getApplicationContext(),
                   EducationActivity::class.java)
            startActivity(showEducationPage)
        }
        //************************************************************************************************//


        var call = findViewById<Button>(R.id.buttonCall)

            call.setOnClickListener{
                println("You clicked the CALL ME button!")

                var phoneUri = Uri.parse("tel:16364661655")
                var callIntent = Intent(Intent.ACTION_DIAL, phoneUri)
                startActivity(callIntent)
            }

        //************************************************************************************************//

        var emailMe = findViewById<Button>(R.id.buttonEmail)

        emailMe.setOnClickListener {
            println("You Clicked the EMAIL ME button!")

            val emailIntent = Intent(Intent.ACTION_SEND)
            val myEmail = arrayOf("TiffanyH1018@outlook.com")
            emailIntent.type =" plain/text"
            emailIntent.putExtra(Intent.EXTRA_EMAIL, myEmail)
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Regarding Your Resume!")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "This email is in regards to your job inquiry.")

            startActivity(emailIntent)
        }
    }
}
