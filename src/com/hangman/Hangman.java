package com.hangman;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Hangman {
    private String word;
    private String currentWord;
    private int lives;
    private final List<Character> guessedLetters = new ArrayList<>();
    private final List<Character> triedLetters = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void playGame() {
        lives = 7;
        word = getRandomWord("wordsList.txt").toLowerCase();
        currentWord = word.replaceAll("\\w", "*");

        System.out.println("\nGame Started");
        System.out.println("---------------------------------------------");
        System.out.println("Pick a letter:");

        while (lives != 0) {
            char c = scanner.next().charAt(0);

            if (!triedLetters.contains(c)) {
                triedLetters.add(c);
            }

            if (word.contains(Character.toString(c))) {
                currentWord = revealLetter(c);
            } else {
                lives--;
            }

            System.out.println("Current word: " + currentWord);
            System.out.println("Tried letters: " + triedLetters.toString());
            System.out.println("Lives remaining: " + lives);

            if (winGame()) {
                System.out.println("\nYou won!!!");
                System.out.println("Do you wanna play again?? (press y/n)");

                if (scanner.next().charAt(0) == 'y') {
                    playAgain();
                }
            }

            if (lostGame()) {
                System.out.println("\nGAME OVER!!!" + " The word was: " + word);
                System.out.println("Do you wanna play again?? (press y/n)");

                if (scanner.next().charAt(0) == 'y') {
                    playAgain();
                }
            }
        }
    }

    public void playAgain() {
        playGame();
    }

    public boolean winGame() {
        return word.equals(currentWord);
    }

    public boolean lostGame() {
        return lives == 0;
    }

    public String revealLetter(char c) {
        if (word.contains(Character.toString(c)) && !guessedLetters.contains(c)) {
            guessedLetters.add(c);
        }

        return word.replaceAll("[^" + guessedLetters.stream().map(String::valueOf).collect(Collectors.joining()) + "]", "*");
    }

    public String getRandomWord(String filename) {
        Random random = new Random();
        List<String> wordsList = new ArrayList<>();

        try {
            wordsList = Files.readAllLines(Paths.get("src/com/hangman/" + filename), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Error on file reading");
        }

        return wordsList.get(random.nextInt(wordsList.size()));
    }
}