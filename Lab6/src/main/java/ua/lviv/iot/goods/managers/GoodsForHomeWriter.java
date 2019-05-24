package ua.lviv.iot.goods.managers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import ua.lviv.iot.goods.models.GoodsForHome;

public class GoodsForHomeWriter {

	public static void writeToFile(List<GoodsForHome> armaments)
	      throws FileNotFoundException, IOException {
	    File file = new File("out.csv");
	    try (FileOutputStream fos = new FileOutputStream(file);
	        OutputStreamWriter osw = new OutputStreamWriter(fos);
	        BufferedWriter bufWriter = new BufferedWriter(osw);) {
	      for (GoodsForHome goods:armaments) {
	        bufWriter.write(
	            goods.getHeaders() + "\n"
	            		+ goods.toCSV() + "\n"
	        );
	      }
	    } finally {
	      System.out.println();
	    }
	  }

}
