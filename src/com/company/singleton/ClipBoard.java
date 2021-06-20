package com.company.singleton;
// private contructor and public getInstance() --> singleton design pattern
public class ClipBoard {

    private String content;

    private static ClipBoard clipBoard;

    //private constructor
    private ClipBoard(){
        System.out.println("Clipboard object created.");
    }

    //public getInstance() method
    public static ClipBoard getInstance(){
        if(clipBoard == null){ //true for the first time
            clipBoard = new ClipBoard();
        }
        return clipBoard;
    }

    //copy
    public void copy(String text){
        this.content = text;
    }

    //paste
    public void paste(){
        System.out.println(this.content);
    }
}
