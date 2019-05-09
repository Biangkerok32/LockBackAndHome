package cari_ustadz.pondokit.id.kuncibackandhome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public void onStart(){
        super.onStart();
        Log.i( "Masuk" ,"onStart");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.i( "Masuk" ,"onRestart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Toast.makeText(this, "bisa", Toast.LENGTH_SHORT).show();
        Log.i( "Masuk" ,"onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i( "Masuk" ,"onPause");
    }

    @Override
    public void onStop(){
        finish();
        super.onStop();
        Log.i( "Masuk" ,"onStop");
    }

    @Override
    public void onDestroy(){
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("belajar.kuncibackandhome.id");
        startActivity(launchIntent);
        super.onDestroy();
        Log.i( "Masuk" ,"onDestroy");
    }
}
