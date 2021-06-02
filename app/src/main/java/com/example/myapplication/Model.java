package com.example.myapplication;

import android.os.Handler;

        import java.util.Arrays;
        import java.util.List;
        import java.util.Random;

public class Model implements Contract.Model {

    // array list of strings from which
    // random strings will be selected
    // to display in the activity
    private List<String> arrayList = Arrays.asList(
            "ABC ","ABC! " +"ABC2","XYZ " +"XYZ2","PQR " +"PQR2","ABC " +"ABC@"
    );

    @Override
    // this method will invoke when
    // user clicks on the button
    // and it will take a delay of
    public void getNextCourse(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(getRandomString());
            }
        }, 1200);
    }

    // method to select random
    // string from the list of strings
    private String getRandomString() {
        Random random = new Random();
        int index = random.nextInt(arrayList.size());
        return arrayList.get(index);
    }
}
