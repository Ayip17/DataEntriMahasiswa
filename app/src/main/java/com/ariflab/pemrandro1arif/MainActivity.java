package com.ariflab.pemrandro1arif;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {


    private EditText mNama;
    private EditText mNik;
    private EditText mUmur;
    private EditText mAlamat;
    private EditText mAsalSekolah;
    private EditText mTmpLahir;
    private EditText mTglLahir;


    private TextView tNama;
    private TextView tNik;
    private TextView tUmur;
    private TextView tAlamat;
    private TextView tAsalSekolah;
    private TextView tTmpLahir;
    private TextView tTglLahir;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        mNama = findViewById(R.id.inputNama);
        mNik = findViewById(R.id.inputNik);
        mUmur = findViewById(R.id.inputUmur);
        mAlamat = findViewById(R.id.inputAlamat);
        mAsalSekolah = findViewById(R.id.inputAsalSekolah);
        mTmpLahir = findViewById(R.id.inputTmpLahir);
        mTglLahir = findViewById(R.id.inputTglLahir);


        tNama = findViewById(R.id.txtNama);
        tNik = findViewById(R.id.txtNik);
        tUmur = findViewById(R.id.txtUmur);
        tAlamat = findViewById(R.id.txtAlamat);
        tAsalSekolah = findViewById(R.id.txtAsalSekolah);
        tTmpLahir = findViewById(R.id.txtTmpLahir);
        tTglLahir = findViewById(R.id.txtTglLahir);


    }

//push this
    public void save(View view) {


        String nama = mNama.getText().toString();
        String nik = mNik.getText().toString();
        String umur = mUmur.getText().toString();
        String alamat = mAlamat.getText().toString();
        String asalSekolah = mAsalSekolah.getText().toString();
        String tmplahir = mTmpLahir.getText().toString();
        String tgllahir = mTglLahir.getText().toString();


        tNama .setText("Nama        : "+nama);
        tNik.setText("NIK       : "+nik);
        tUmur.setText("Umur     : "+umur);
        tAlamat.setText("Alamat     : "+alamat);
        tAsalSekolah.setText("Asal sekolah      : "+asalSekolah);
        tTmpLahir.setText("Tempat Lahir      : "+tmplahir);
        tTglLahir.setText("Tanggal Lahir      : "+tgllahir);


    }

}

