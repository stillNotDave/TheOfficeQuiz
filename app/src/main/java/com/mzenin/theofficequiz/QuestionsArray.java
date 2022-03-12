package com.mzenin.theofficequiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class QuestionsArray {
    public static List<Integer> order = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

    static {
        Collections.shuffle(order);
    }

    //Массив для 1 уровня
    final int[] questions1Lvl = {
            R.string.question1,
            R.string.question2,
            R.string.question3,
            R.string.question4,
            R.string.question5,
            R.string.question6,
            R.string.question7,
            R.string.question8,
            R.string.question9,
            R.string.question10
    };

    final int[] answer1Lvl1 = {
            R.string.answer1Lvl1Correct,
            R.string.answer1Lvl1Wrong1,
            R.string.answer1Lvl1Wrong2,
            R.string.answer1Lvl1Wrong3
    };

    final int[] answer2Lvl1 = {
            R.string.answer2Lvl1Correct,
            R.string.answer2Lvl1Wrong1,
            R.string.answer2Lvl1Wrong2,
            R.string.answer2Lvl1Wrong3
    };

    final int[] answer3Lvl1 = {
            R.string.answer3Lvl1Correct,
            R.string.answer3Lvl1Wrong1,
            R.string.answer3Lvl1Wrong2,
            R.string.answer3Lvl1Wrong3
    };

    final int[] answer4Lvl1 = {
            R.string.answer4Lvl1Correct,
            R.string.answer4Lvl1Wrong1,
            R.string.answer4Lvl1Wrong2,
            R.string.answer4Lvl1Wrong3
    };

    final int[] answer5Lvl1 = {
            R.string.answer5Lvl1Correct,
            R.string.answer5Lvl1Wrong1,
            R.string.answer5Lvl1Wrong2,
            R.string.answer5Lvl1Wrong3
    };

    final int[] answer6Lvl1 = {
            R.string.answer6Lvl1Correct,
            R.string.answer6Lvl1Wrong1,
            R.string.answer6Lvl1Wrong2,
            R.string.answer6Lvl1Wrong3
    };

    final int[] answer7Lvl1 = {
            R.string.answer7Lvl1Correct,
            R.string.answer7Lvl1Wrong1,
            R.string.answer7Lvl1Wrong2,
            R.string.answer7Lvl1Wrong3
    };

    final int[] answer8Lvl1 = {
            R.string.answer8Lvl1Correct,
            R.string.answer8Lvl1Wrong1,
            R.string.answer8Lvl1Wrong2,
            R.string.answer8Lvl1Wrong3
    };

    final int[] answer9Lvl1 = {
            R.string.answer9Lvl1Correct,
            R.string.answer9Lvl1Wrong1,
            R.string.answer9Lvl1Wrong2,
            R.string.answer9Lvl1Wrong3
    };

    final int[] answer10Lvl1 = {
            R.string.answer10Lvl1Correct,
            R.string.answer10Lvl1Wrong1,
            R.string.answer10Lvl1Wrong2,
            R.string.answer10Lvl1Wrong3
    };

    final int[][] answersLvl1 = {
            answer1Lvl1,
            answer2Lvl1,
            answer3Lvl1,
            answer4Lvl1,
            answer5Lvl1,
            answer6Lvl1,
            answer7Lvl1,
            answer8Lvl1,
            answer9Lvl1,
            answer10Lvl1
    };

    final int[] answers = {1,2,3,4,5,6,7,8,9,10};
}
