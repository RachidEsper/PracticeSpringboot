package com.example.ColourPrinter;

import com.example.ColourPrinter.services.ColourPrinter;
import com.example.ColourPrinter.services.impl.EnglishColorPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log
@SpringBootApplication
public class ColourPrinterApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ColourPrinterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		final ColourPrinter colourPrinter = new EnglishColorPrinterImpl();
		log.info(colourPrinter.print());

	}
}
