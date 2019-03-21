package com.joseluis.platzigram.model;

public class PictureCard {
    private String cardimage;
    private String cardusername;
    private String cardLikeTime;
    private String cardLikeNumber;

    public PictureCard() {
        super();
    }

    public PictureCard(String cardimage, String cardusername, String cardLikeTime, String cardLikeNumber) {
        this.cardimage = cardimage;
        this.cardusername = cardusername;
        this.cardLikeTime = cardLikeTime;
        this.cardLikeNumber = cardLikeNumber;
    }

    public String getCardimage() {
        return cardimage;
    }

    public void setCardimage(String cardimage) {
        this.cardimage = cardimage;
    }

    public String getCardusername() {
        return cardusername;
    }

    public void setCardusername(String cardusername) {
        this.cardusername = cardusername;
    }

    public String getCardLikeTime() {
        return cardLikeTime;
    }

    public void setCardLikeTime(String cardLikeTime) {
        this.cardLikeTime = cardLikeTime;
    }

    public String getCardLikeNumber() {
        return cardLikeNumber;
    }

    public void setCardLikeNumber(String cardLikeNumber) {
        this.cardLikeNumber = cardLikeNumber;
    }
}
