package ru.netology.JavaHome5.services;

public class SQRService {
    public int calcSqrt(int bottomLine, int upperLine) {
        int numberOccurence = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bottomLine && i * i <= upperLine) {
                numberOccurence++;
            } else {
                numberOccurence = numberOccurence;
            }
        }
        return numberOccurence;
    }
}

