package com.remotetiger.viewpager_tabs_week2;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Abhimanyu on 9/26/2017.
 */

public class SecondFragment extends Fragment {

    SeekBar sb;
    ImageView rimg;
    Context c;
    private final int CAMERA_REQUEST_CODE = 0;
    int[] img = {R.drawable.carrick, R.drawable.costa, R.drawable.degea, R.drawable.herera, R.drawable.mata,
            R.drawable.oscar};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Context c = getContext();
        View v = inflater.inflate(R.layout.second_fragment, container, false);
        sb = (SeekBar)v.findViewById(R.id.seekbar);
        rimg = (ImageView)v.findViewById(R.id.imageview);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                askPermission(Manifest.permission.CAMERA,CAMERA_REQUEST_CODE);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        return v;
    }

    public SecondFragment(){
    }

    private void askPermission(String permission, int requestCode){
        if(ContextCompat.checkSelfPermission(getActivity(), permission)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(getActivity(), new String[]{permission}, requestCode);
        }else{
            Random r = new Random();
            //Toast.makeText(getActivity(), "Permission has already granted", Toast.LENGTH_LONG).show();
            //rimg.setImageResource(R.drawable.costa);
            int n = r.nextInt(6);
            rimg.setImageResource(img[n]);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

        if(grantResults.length>0&&grantResults[0] == PackageManager.PERMISSION_GRANTED){
            Toast.makeText(getActivity(), "Permission Granted", Toast.LENGTH_LONG).show();
        }else
            Toast.makeText(getActivity(), "Permission Denied", Toast.LENGTH_LONG).show();

    }
}



