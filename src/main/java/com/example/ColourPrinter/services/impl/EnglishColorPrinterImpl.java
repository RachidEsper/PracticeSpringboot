package com.example.ColourPrinter.services.impl;

import com.example.ColourPrinter.services.BluePrinter;
import com.example.ColourPrinter.services.ColourPrinter;
import com.example.ColourPrinter.services.GreenPrinter;
import com.example.ColourPrinter.services.RedPrinter;

public class EnglishColorPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;


    public EnglishColorPrinterImpl( ) {
        this.redPrinter = new EnglishRedPrinterImpl();
        this.greenPrinter = new EnglishGreenPrinterImpl();
        this.bluePrinter = new EnglishBluePrinterImpl();
    }



    @Override
    public String print() {
        return redPrinter.print() + " " + greenPrinter.print() + " " + bluePrinter.print();
    }




}
