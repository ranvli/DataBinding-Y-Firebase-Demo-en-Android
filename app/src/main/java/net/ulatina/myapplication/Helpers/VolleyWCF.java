package net.ulatina.myapplication.Helpers;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by ranvli on 12/14/2016.
 */

public final class VolleyWCF {


    // Atributos
    private static VolleyWCF singleton;
    private RequestQueue requestQueue;
    private static Context context;

    private VolleyWCF(Context context) {
        VolleyWCF.context = context;
        requestQueue = getRequestQueue();
    }

    public static synchronized VolleyWCF getInstance(Context context) {
        if (singleton == null) {
            singleton = new VolleyWCF(context);
        }
        return singleton;
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(context.getApplicationContext());
            //requestQueue.start();
        }
        return requestQueue;
    }

    public  void addToRequestQueue(Request req) {

//        RetryPolicy mRetryPolicy = new DefaultRetryPolicy(
//
//                0,
//                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
//                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
//        req.setRetryPolicy(mRetryPolicy);

        getRequestQueue().add(req);
    }



}
