package com.example.pairs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView ivCard1;
    private ImageView ivCard2;
    private ImageView ivCard3;
    private ImageView ivCard4;
    private ImageView ivCard5;
    private ImageView ivCard6;
    private ImageView ivCard7;
    private ImageView ivCard8;
    private ImageView ivCard9;
    private ImageView ivCard10;
    private ImageView ivCard11;
    private ImageView ivCard12;

    private final ArrayList<Integer> cards = new ArrayList<>(12);
    private int selectedCardsNum = 0;
    private int selectedCardIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setVariables();
        setCards();
    }

    private void setVariables() {
        ivCard1 = findViewById(R.id.ivCard1);
        ivCard2 = findViewById(R.id.ivCard2);
        ivCard3 = findViewById(R.id.ivCard3);
        ivCard4 = findViewById(R.id.ivCard4);
        ivCard5 = findViewById(R.id.ivCard5);
        ivCard6 = findViewById(R.id.ivCard6);
        ivCard7 = findViewById(R.id.ivCard7);
        ivCard8 = findViewById(R.id.ivCard8);
        ivCard9 = findViewById(R.id.ivCard9);
        ivCard10 = findViewById(R.id.ivCard10);
        ivCard11 = findViewById(R.id.ivCard11);
        ivCard12 = findViewById(R.id.ivCard12);

        setCardsPadding();
    }
    
    private void setCardsPadding() {
        ivCard1.setPadding(24, 24, 24, 24);
        ivCard2.setPadding(24, 24, 24, 24);
        ivCard3.setPadding(24, 24, 24, 24);
        ivCard4.setPadding(24, 24, 24, 24);
        ivCard5.setPadding(24, 24, 24, 24);
        ivCard6.setPadding(24, 24, 24, 24);
        ivCard7.setPadding(24, 24, 24, 24);
        ivCard8.setPadding(24, 24, 24, 24);
        ivCard9.setPadding(24, 24, 24, 24);
        ivCard10.setPadding(24, 24, 24, 24);
        ivCard11.setPadding(24, 24, 24, 24);
        ivCard12.setPadding(24, 24, 24, 24);
    }

    private void setCards() {
        ArrayList<Integer> pairsNum = new ArrayList<>(12);
        int num = 1;
        Random random = new Random();

        for (int i = 1; i <= 12; i++) {
            pairsNum.add(num);

            if (i % 2 == 0) {
                num++;
            }
        }

        while (pairsNum.size() > 0) {
            int index = random.nextInt(pairsNum.size());
            cards.add(pairsNum.remove(index));
        }
    }

    public void setCards(View view) {
        cards.subList(0, 12).clear();

        setCardsPadding();
        setCards();
        restart();

        flipSelectedCardBack(ivCard1);
        flipSelectedCardBack(ivCard2);
        flipSelectedCardBack(ivCard3);
        flipSelectedCardBack(ivCard4);
        flipSelectedCardBack(ivCard5);
        flipSelectedCardBack(ivCard6);
        flipSelectedCardBack(ivCard7);
        flipSelectedCardBack(ivCard8);
        flipSelectedCardBack(ivCard9);
        flipSelectedCardBack(ivCard10);
        flipSelectedCardBack(ivCard11);
        flipSelectedCardBack(ivCard12);

        ivCard1.setClickable(true);
        ivCard2.setClickable(true);
        ivCard3.setClickable(true);
        ivCard4.setClickable(true);
        ivCard5.setClickable(true);
        ivCard6.setClickable(true);
        ivCard7.setClickable(true);
        ivCard8.setClickable(true);
        ivCard9.setClickable(true);
        ivCard10.setClickable(true);
        ivCard11.setClickable(true);
        ivCard12.setClickable(true);
    }

    public void flipCard1(View view) {
        int cardNum = cards.get(0);

        flipSelectedCard(cardNum, ivCard1);

        if (selectedCardsNum == 0) {
            selectedCardsNum = cardNum;
            selectedCardIndex = 1;
            return;
        }

        checkCards(cardNum, ivCard1);
    }

    public void flipCard2(View view) {
        int cardNum = cards.get(1);

        flipSelectedCard(cardNum, ivCard2);

        if (selectedCardsNum == 0) {
            selectedCardsNum = cardNum;
            selectedCardIndex = 2;
            return;
        }

        checkCards(cardNum, ivCard2);
    }

    public void flipCard3(View view) {
        int cardNum = cards.get(2);

        flipSelectedCard(cardNum, ivCard3);

        if (selectedCardsNum == 0) {
            selectedCardsNum = cardNum;
            selectedCardIndex = 3;
            return;
        }

        checkCards(cardNum, ivCard3);
    }

    public void flipCard4(View view) {
        int cardNum = cards.get(3);

        flipSelectedCard(cardNum, ivCard4);

        if (selectedCardsNum == 0) {
            selectedCardsNum = cardNum;
            selectedCardIndex = 4;
            return;
        }

        checkCards(cardNum, ivCard4);
    }

    public void flipCard5(View view) {
        int cardNum = cards.get(4);

        flipSelectedCard(cardNum, ivCard5);

        if (selectedCardsNum == 0) {
            selectedCardsNum = cardNum;
            selectedCardIndex = 5;
            return;
        }

        checkCards(cardNum, ivCard5);
    }

    public void flipCard6(View view) {
        int cardNum = cards.get(5);

        flipSelectedCard(cardNum, ivCard6);

        if (selectedCardsNum == 0) {
            selectedCardsNum = cardNum;
            selectedCardIndex = 6;
            return;
        }

        checkCards(cardNum, ivCard6);
    }

    public void flipCard7(View view) {
        int cardNum = cards.get(6);

        flipSelectedCard(cardNum, ivCard7);

        if (selectedCardsNum == 0) {
            selectedCardsNum = cardNum;
            selectedCardIndex = 7;
            return;
        }

        checkCards(cardNum, ivCard7);
    }

    public void flipCard8(View view) {
        int cardNum = cards.get(7);

        flipSelectedCard(cardNum, ivCard8);

        if (selectedCardsNum == 0) {
            selectedCardsNum = cardNum;
            selectedCardIndex = 8;
            return;
        }

        checkCards(cardNum, ivCard8);
    }

    public void flipCard9(View view) {
        int cardNum = cards.get(8);

        flipSelectedCard(cardNum, ivCard9);

        if (selectedCardsNum == 0) {
            selectedCardsNum = cardNum;
            selectedCardIndex = 9;
            return;
        }

        checkCards(cardNum, ivCard9);
    }

    public void flipCard10(View view) {
        int cardNum = cards.get(9);

        flipSelectedCard(cardNum, ivCard10);

        if (selectedCardsNum == 0) {
            selectedCardsNum = cardNum;
            selectedCardIndex = 10;
            return;
        }

        checkCards(cardNum, ivCard10);
    }

    public void flipCard11(View view) {
        int cardNum = cards.get(10);

        flipSelectedCard(cardNum, ivCard11);

        if (selectedCardsNum == 0) {
            selectedCardsNum = cardNum;
            selectedCardIndex = 11;
            return;
        }

        checkCards(cardNum, ivCard11);
    }

    public void flipCard12(View view) {
        int cardNum = cards.get(11);

        flipSelectedCard(cardNum, ivCard12);

        if (selectedCardsNum == 0) {
            selectedCardsNum = cardNum;
            selectedCardIndex = 12;
            return;
        }

        checkCards(cardNum, ivCard12);
    }

    private void flipSelectedCard(int cardNum, ImageView selectedCard) {
        if (cardNum == 1) {
            selectedCard.setImageResource(R.drawable.dragonite);
        } else if (cardNum == 2) {
            selectedCard.setImageResource(R.drawable.gardevoir);
        } else if (cardNum == 3) {
            selectedCard.setImageResource(R.drawable.greedent);
        } else if (cardNum == 4) {
            selectedCard.setImageResource(R.drawable.mamoswine);
        } else if (cardNum == 5) {
            selectedCard.setImageResource(R.drawable.sylveon);
        } else if (cardNum == 6) {
            selectedCard.setImageResource(R.drawable.tsareena);
        }

        selectedCard.setPadding(0, 0, 0, 0);
        selectedCard.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    private void checkCards(int cardNum, ImageView selectedCard) {
        if (selectedCardsNum == cardNum) {
            selectedCard.setClickable(false);
            selectedCardIndex = 0;
            selectedCardsNum = 0;
        } else {
            final Handler handler = new Handler();
            handler.postDelayed(() -> {
                if (selectedCardIndex == 1) {
                    flipCardsBack(selectedCard, ivCard1);
                } else if (selectedCardIndex == 2) {
                    flipCardsBack(selectedCard, ivCard2);
                } else if (selectedCardIndex == 3) {
                    flipCardsBack(selectedCard, ivCard3);
                } else if (selectedCardIndex == 4) {
                    flipCardsBack(selectedCard, ivCard4);
                } else if (selectedCardIndex == 5) {
                    flipCardsBack(selectedCard, ivCard5);
                } else if (selectedCardIndex == 6) {
                    flipCardsBack(selectedCard, ivCard6);
                } else if (selectedCardIndex == 7) {
                    flipCardsBack(selectedCard, ivCard7);
                } else if (selectedCardIndex == 8) {
                    flipCardsBack(selectedCard, ivCard8);
                } else if (selectedCardIndex == 9) {
                    flipCardsBack(selectedCard, ivCard9);
                } else if (selectedCardIndex == 10) {
                    flipCardsBack(selectedCard, ivCard10);
                } else if (selectedCardIndex == 11) {
                    flipCardsBack(selectedCard, ivCard11);
                } else if (selectedCardIndex == 12) {
                    flipCardsBack(selectedCard, ivCard12);
                }
            }, 1000);
        }
    }

    private void flipCardsBack(ImageView selectedCard, ImageView otherCard) {
        otherCard.setImageResource(R.drawable.pokemon);
        otherCard.setPadding(24, 24, 24, 24);
        otherCard.setScaleType(ImageView.ScaleType.FIT_CENTER);

        flipSelectedCardBack(selectedCard);
        restart();
    }

    private void flipSelectedCardBack(ImageView selectedCard) {
        selectedCard.setImageResource(R.drawable.pokemon);
        selectedCard.setPadding(24, 24, 24, 24);
        selectedCard.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    private void restart() {
        selectedCardIndex = 0;
        selectedCardsNum = 0;
    }
}