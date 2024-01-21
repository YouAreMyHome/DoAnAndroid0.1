package com.example.doanandroid01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.doanandroid01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        String[] tentruyen = {"Ánh Sáng Cuối Con Đường","Hoa Sơn Tái Khởi","Sát Thủ Mạnh Nhất Chuyển Sinh","Ta Có Một Sơn Trại","Thánh Khư","Tích Trữ 10 vạn vật tư trước ngày tận thế","Nguyên Lai Ta Là Tu Tiên Đại Lão","Tuyệt Thế Võ Thần","Vạn Cổ Chí Tôn"};
        int[] biatruyen = {R.drawable.a,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.k,R.drawable.s};

        GridAdapter gridAdapter = new GridAdapter(MainActivity.this,tentruyen,biatruyen);

        binding.gridView.setAdapter(gridAdapter);

        binding.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "Bạn đã chọn bộ "+tentruyen[position],Toast.LENGTH_SHORT).show();


            }
        });



    }
}