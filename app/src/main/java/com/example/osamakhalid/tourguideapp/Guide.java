package com.example.osamakhalid.tourguideapp;

/**
 * Created by Osama Khalid on 1/21/2017.
 */
public class Guide {
    String urduWord=null;
    String engWord;
    int Imageid=-1;

    public Guide(){}
    public Guide(String urduWord,String engWord,int Imageid){     //Dress
        this.urduWord=urduWord;
        this.engWord=engWord;
        this.Imageid=Imageid;
        }

    public Guide(String urduWord,String engWord){     //Language
        this.urduWord=urduWord;
        this.engWord=engWord;
    }
    public Guide(String engWord,int Imageid){    //Famous,Restaurants
        this.Imageid=Imageid;
        this.engWord=engWord;

    }
    public boolean hasImage(){
        if(Imageid==-1){
            return false;
            }
        else
        return true;
    }
    public boolean hasUrduWord(){
        if(urduWord==null){
            return false;
        }
        else
            return true;
    }

    public int getImageid() {
        return Imageid;
    }

    public String getEngWord() {
        return engWord;
    }

    public String getUrduWord() {
        return urduWord;
    }
}
