package com.mzenin.theofficequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Level1 extends AppCompatActivity {

    Dialog dialog;
    public int question;
    int answer[]={-1,-1,-1,-1}; //для храненя номеров ответов
    static int position;
    int answerContainerOnClick=0; //для хранения номера нажатой кнопки
    final int[] answerOneLvlOne = {
            R.string.answer1Lvl1Correct,
            R.string.answer1Lvl1Wrong1,
            R.string.answer1Lvl1Wrong2,
            R.string.answer1Lvl1Wrong3
    };

    QuestionsArray array = new QuestionsArray(); //создаем новый объект класса QuestionsArray
    Random random = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_level_activity);

        //устанавливаем нужную цифру в уровень:
        TextView textLevels = findViewById(R.id.textLevels);
        textLevels.setText(R.string.level1);

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Убираем верхнюю парень телефона - строку состояния

        //Вызов диалогового окна
        dialog = new Dialog(this);
        dialog.requestWindowFeature(window.FEATURE_NO_TITLE); //убираем заголовок
        dialog.setContentView(R.layout.preview_dialog_window);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //делаем все остальное прозрачным
        dialog.setCancelable(false); // нелья закрыть системной кнопкой

        //закрытие диалогового окна
        TextView buttonClose = dialog.findViewById(R.id.buttonClose);
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(Level1.this,GameLevels.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e){

                }
                dialog.dismiss(); //закрыть диалог
            }
        });

        Button buttonContinue = dialog.findViewById(R.id.buttonContinue);
        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss(); //закрыть диалог
            }
        });

        dialog.show();

        //кнопка назад
        Button buttonBackToLevels = findViewById(R.id.buttonBackToLevels);
        buttonBackToLevels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    openActivity(GameLevels.class);
                }catch (Exception e){

                }
            }
        });

        // ранломим число, подставляем его как элемент массива
        final TextView textQuestion = findViewById(R.id.line3);
//        question = random.nextInt(10);
//        textQuestion.setText(array.questions1Lvl[question]);
        //в следующих уровнях нужно будет предусмотреть, чтобы вопросы не повторялись
        int index = QuestionsArray.order.get(0);
        textQuestion.setText(array.questions1Lvl[index]);
        //варианты ответов
        final TextView textAnswer1 = findViewById(R.id.answer1);
        final TextView textAnswer2 = findViewById(R.id.answer2);
        final TextView textAnswer3 = findViewById(R.id.answer3);
        final TextView textAnswer4 = findViewById(R.id.answer4);

        //?????????????????????????????????????????????????????
        List<Integer> list = Arrays.asList(0, 1, 2, 3);
        Collections.shuffle(list);
        textAnswer1.setText(array.answersLvl1[index][list.get(0)]);
        textAnswer2.setText(array.answersLvl1[index][list.get(1)]);
        textAnswer3.setText(array.answersLvl1[index][list.get(2)]);
        textAnswer4.setText(array.answersLvl1[index][list.get(3)]);



    }
/////////////////////////////////////////////////////////////////////////////
//    public void makeAnswer(){
//        int random_move = random.nextInt(4);
//        answer[0]=-1;
//        answer[1]=-1;
//        answer[2]=-1;
//        answer[3]=-1;
//        answer[random_move]=position; //в рандомное место в массиве помещаю номер правильного ответа
//    }
//
//    public String checkAnswer(){
//        if(answer[answerContainerOnClick]!=-1){
//            return rightAnswer();
//        }
//        else{
//            return wrongAnswer();
//        }
//    }
/////////////////////////////////////////////////////////////////////////////
    //системная кнопка назад
    @Override
    public void onBackPressed(){
        try{
            openActivity(GameLevels.class);
        }catch (Exception e){

        }
    }

    public void openActivity(Class<?> cls){
        Intent intent = new Intent(this, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

}