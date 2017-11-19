package util;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.support.v7.app.AppCompatActivity;

import com.parknride.parknride.SearchParkingFragment;

/**
 * Created by anurag on 19/11/17.
 */

public class ActivityUtils extends AppCompatActivity {

    public static void addFragmentToActivity(FragmentManager fragmentManager,
                                             SearchParkingFragment fragment,
                                             int frameId,
                                             String tag
                                             ){
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(frameId,fragment,tag);
        transaction.commit();
    }
}
