package com.company.singleton;

import com.company.singleton.ClipBoard;

public class Main {

    public static void main(String[] args) {

        //these two instatnces refer to one object
        ClipBoard clipBoard1 = ClipBoard.getInstance();
        ClipBoard clipBoard2 = ClipBoard.getInstance();

        clipBoard1.copy("abc");
        clipBoard1.paste(); // output: abc

        clipBoard1.paste(); // output: abc

        clipBoard2.copy("xyz");
        clipBoard1.paste(); // output: xyz
        clipBoard2.paste(); // output: xyz
        clipBoard1.copy("pqr");
        clipBoard2.paste(); // output: pqr

        ClipBoard clipBoard3 = ClipBoard.getInstance();
        clipBoard3.paste(); // output: pqr
    }
}
