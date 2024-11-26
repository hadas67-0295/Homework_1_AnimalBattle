package com.example.homework1_animalbattle;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework1_animalbattle.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView playerAnimal;
    private TextView computerAnimal;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerAnimal = findViewById(R.id.player_animal);
        computerAnimal = findViewById(R.id.computer_animal);
        resultText = findViewById(R.id.result_text);

        Button battleButton = findViewById(R.id.button_battle);
        battleButton.setOnClickListener(view -> startBattle());
    }

    private void startBattle() {
        Animal playerAnimalInstance = selectAnimal();
        Animal computerAnimalInstance = selectAnimal();

        playerAnimal.setText(getAnimalEmoji(playerAnimalInstance));
        computerAnimal.setText(getAnimalEmoji(computerAnimalInstance));

        String result = playerAnimalInstance.battle(computerAnimalInstance);
        resultText.setText(result);
        animateResult();
    }

    private Animal selectAnimal() {
        Random random = new Random();
        int choice = random.nextInt(3);
        switch (choice) {
            case 0:
                return new Lion(); // Strength value for Lion
            case 1:
                return new Elephant(); // Strength value for Elephant
            default:
                return new Monkey(); // Strength value for Monkey
        }
    }

    private String getAnimalEmoji(Animal animal) {
        if (animal instanceof Lion) return "🦁";
        if (animal instanceof Elephant) return "🐘";
        if (animal instanceof Monkey) return "🐒";
        return "🐾"; // Default emoji
    }

    private void animateResult() {
        AlphaAnimation animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(500);
        animation.setRepeatCount(1);
        animation.setRepeatMode(AlphaAnimation.REVERSE);

        resultText.startAnimation(animation);
    }
}