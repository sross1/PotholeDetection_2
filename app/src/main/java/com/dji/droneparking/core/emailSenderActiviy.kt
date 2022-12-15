package com.dji.droneparking.core


import android.accounts.AccountManager
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity
import com.dji.droneparking.R


///**
// * This is the first activity in the app. Its purpose is to host ConnectionFragment.kt upon startup
// * and request app permissions.
// */
//class emailSenderActiviy : AppCompatActivity() {
//
//
//    class Photos : Activity() {


//  public class Photos extends Activity {
//
//      @Override
//      public void onCreate(Bundle savedInstanceState) {
//          super.onCreate(savedInstanceState);
//          setContentView(R.layout.activity_photos);
//          getActionBar().setDisplayHomeAsUpEnabled(true);
//      }
//
//      @Override
//      public boolean onCreateOptionsMenu(Menu menu) {
//          getMenuInflater().inflate(R.menu.activity_photos, menu);
//          return true;
//      }
//
//        public override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            setContentView(R.layout.Activity_Photos)
//
//            // your image fetching code
//            // Get Image form mnt/sdcard/YOUR_FLODER/my_image.png
//            ImageView my_Image = (ImageView)findViewById(R.id.my_Image);
//            Imagepath="/sdcard/YOUR_FLODER/"+my_iamge+".png";
//            bitmap = BitmapFactory.decodeFile(Imagepath);
//
//            // fetch mail code
//            // This Will fetch merchant's Email id from Deivce.
//            val emailPattern: Pattern = Patterns.EMAIL_ADDRESS // API level 8+
//
//
//            val manager = getSystemService(ACCOUNT_SERVICE) as AccountManager
//            //Account[] accounts = AccountManager.get(getApplicationContext()).getAccounts();
//            //Account[] accounts = AccountManager.get(getApplicationContext()).getAccounts();
//            val accounts = manager.accounts
//
//            for (account in accounts) {
//                if (emailPattern.matcher(account.name).matches()) {
//                    possibleEmail = account.name
//                }
//            }
//
//            // write button click event
//            val i = Intent(Intent.ACTION_SEND)
//            i.type = "image/png"
//            i.putExtra(Intent.EXTRA_CC, arrayOf<String>(possibleEmail))
//            i.putExtra(Intent.EXTRA_SUBJECT, "Mail With Image attachment")
//            startActivity(Intent.createChooser(i2, "Send Email..."))
//
//            // put intent code in click event
//        }
//    }
//
//}