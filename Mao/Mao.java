package com.company;

import java.util.*;

public class Mao {
    private static int cardValue(String card) {
        return switch (card.substring(0, card.length() - 1)) {
            case "A" -> 1;
            case "J" -> 11;
            case "Q" -> 12;
            case "K" -> 13;
            default -> Integer.parseInt(card.substring(0, card.length() - 1));
        };
    }

    private static boolean suitsRule(String card1, String card2) {
        char suit1 = card1.charAt(card1.length() - 1);
        char suit2 = card2.charAt(card2.length() - 1);

        return switch (suit1) {
            case 'C' -> suit2 == 'C' || suit2 == 'D';
            case 'D' -> suit2 == 'H' || suit2 == 'S';
            case 'H' -> suit2 == 'H' || suit2 == 'C';
            case 'S' -> suit2 == 'D' || suit2 == 'S';
            default -> false;
        };
    }

    private static boolean differenceRule(String card1, String card2, int d) {
        int val1 = cardValue(card1);
        int val2 = cardValue(card2);
        int diff = Math.abs(val1 - val2);
        return diff == d || diff == d + 1;
    }

    private static boolean divisibilityRule(String[] cards, int x) {
        for (int i = 0; i < cards.length; i++) {
            boolean shouldDiv = i % 2 == 0;
            if ((cardValue(cards[i]) % x == 0) != shouldDiv) {
                return false;
            }
        }
        return true;
    }

    private static String findPlayableCard(String[] playedCards, String[] handCards) {
        boolean suitsToPlay = true;
        Set<Integer> diffValues = new HashSet<>();
        Set<Integer> divValues = new HashSet<>();

        for (int i = 0; i < playedCards.length - 1; i++) {
            suitsToPlay &= suitsRule(playedCards[i], playedCards[i + 1]);
            int diff = Math.abs(cardValue(playedCards[i]) - cardValue(playedCards[i + 1]));
            diffValues.add(diff);
            diffValues.add(diff - 1);
        }

        for (int x = 2; x <= 13; x++) {
            if (divisibilityRule(playedCards, x)) divValues.add(x);
        }

        String lastPlayed = playedCards[playedCards.length - 1];
        for (String card : handCards) {
            if (suitsToPlay && !suitsRule(lastPlayed, card)) continue;
            if (!diffValues.isEmpty() && diffValues.stream().noneMatch(d -> differenceRule(lastPlayed, card, d))) continue;
            if (!divValues.isEmpty() && ((cardValue(card) % divValues.iterator().next() == 0) != (playedCards.length % 2 == 0))) continue;
            return card;
        }

        return "The Mao gods have befallen me!";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] playedCards = new String[5];
        for (int i = 0; i < 5; i++) playedCards[i] = in.next();
        String[] handCards = new String[4];
        for (int i = 0; i < 4; i++) handCards[i] = in.next();

        System.out.println(findPlayableCard(playedCards, handCards));
    }
}
