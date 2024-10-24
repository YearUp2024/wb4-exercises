package com.pluralsight;

public class Main {
    static BlackJackGame game;

    public static void main(String[] args) throws Exception {
        game = new BlackJackGame();

        System.out.println("Welcome to BlackJack!");

        int numberOfPlayers = Console.PromptForInt("How many players: ");

        AddPlayersToGame(numberOfPlayers);

        game.DelaCards();
    }

    public static void AddPlayersToGame(int numberOfPlayers){
        for(int i = 0; i <= numberOfPlayers; i++){
            String playerName = Console.PromptForString("Please enter name of player " + i + ": ");
            game.AddPlayer(playerName);
        }
    }
}