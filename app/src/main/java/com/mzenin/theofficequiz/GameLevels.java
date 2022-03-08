package com.mzenin.theofficequiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_levels);

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Убираем верхнюю парень телефона - строку состояния

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    openActivity(MainActivity.class);
                }catch (Exception e){

                }
            }
        });

        //кнопка для перехода на 1 лвл
        TextView textView1 = findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    openActivity(Level1.class);
                }catch (Exception e){
                    //пусто
                }
            }
        });

    }

    // функция для открытия новой активности
    public void openActivity(Class<?> cls){
        Intent intent = new Intent(this, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try{
            openActivity(MainActivity.class);
        }catch (Exception e){

        }
    }
}

