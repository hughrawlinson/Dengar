package me.hughrawlinson.dengar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.media.MediaPlayer;


public class MainActivity extends ActionBarActivity {
    private static final String TAG = "MyActivity";
    MediaPlayer smokeWeed;
    MediaPlayer tdfw;
    MediaPlayer bf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.smokeWeed = MediaPlayer.create(getApplicationContext(), R.raw.swed);
        this.tdfw = MediaPlayer.create(getApplicationContext(), R.raw.td4w);
        this.bf = MediaPlayer.create(getApplicationContext(), R.raw.bf);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void playSmokeWeed(View view){
        smokeWeed.start();
    }

    public void playTDFW(View view){
        tdfw.start();
    }

    public void playbf(View view){
        bf.start();
    }
}
