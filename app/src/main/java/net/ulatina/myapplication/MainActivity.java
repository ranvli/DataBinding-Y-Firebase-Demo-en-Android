package net.ulatina.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import net.ulatina.myapplication.Domain.Cliente;
import net.ulatina.myapplication.Helpers.VolleyWCF;
import net.ulatina.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);






        //llama a WS metodo de recuperacion de imagen de backup
        String urlws = "http://192.168.0.101:8080/P2-3/rest/ClienteService";

        StringRequest jsSR = new StringRequest(
                urlws + "/GetCliente/1",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response)
                    {
                        Gson gson = new Gson();
                        Cliente cliente = gson.fromJson(response, Cliente.class);

                        ActivityMainBinding binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
                        binding.setCliente(cliente);


                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        String err = error.getMessage();
                    }
                });


        // Añadir petición a la cola
        VolleyWCF.getInstance(getApplicationContext()).addToRequestQueue(jsSR);


    }
}
