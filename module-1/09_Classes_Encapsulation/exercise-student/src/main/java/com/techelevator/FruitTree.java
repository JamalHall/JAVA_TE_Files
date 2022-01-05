package com.techelevator;

public class FruitTree {
    //variables
    public String typeOfFruit;
    public int piecesOfFruitLeft;

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }
    //picked fruit method
    public boolean pickFruit(int numberOfPiecesToRemove){
        if(this.piecesOfFruitLeft>=numberOfPiecesToRemove){
            this.piecesOfFruitLeft = piecesOfFruitLeft-numberOfPiecesToRemove;
            return true;
        } else {
            return false;
        }
    }


    //getters
    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

}


