package com.example.ColourPrinter.config;

import com.example.ColourPrinter.services.BluePrinter;
import com.example.ColourPrinter.services.ColourPrinter;
import com.example.ColourPrinter.services.GreenPrinter;
import com.example.ColourPrinter.services.RedPrinter;
import com.example.ColourPrinter.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {


    @Bean
    public RedPrinter redPrinter() {
        return new SpanishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new SpanishGreenPrinter();
    }

    @Bean
    public BluePrinter bluePrinter() {
        return new SpanishBluePrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, GreenPrinter greenPrinter, RedPrinter redPrinter) {
        return new ColourPrinterImpl(redPrinter,greenPrinter,bluePrinter);
    }

}
