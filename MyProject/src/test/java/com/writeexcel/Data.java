package com.writeexcel;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

public class Data {
	@Test
	public void data() throws InvalidFormatException, IOException {
		WriteExcel.writing("m");

	}

}
