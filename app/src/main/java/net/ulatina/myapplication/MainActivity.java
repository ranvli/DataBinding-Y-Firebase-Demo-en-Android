package net.ulatina.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.ulatina.myapplication.Domain.Cliente;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Cliente cliente = new Cliente();
        cliente.setNombre("Randall Vargas Li");
        binding.setUser(cliente);


    }
}
