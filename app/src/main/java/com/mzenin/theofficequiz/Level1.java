package com.mzenin.theofficequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Level1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_activity_for_levels);


//        //скругление углов картинки
//        final ImageView image = (ImageView)findViewById(R.id.image1);
//        image.setClipToOutline(true);
//        //используя xml файл style_image_universal

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Убираем верхнюю парень телефона - строку состояния
    }
}