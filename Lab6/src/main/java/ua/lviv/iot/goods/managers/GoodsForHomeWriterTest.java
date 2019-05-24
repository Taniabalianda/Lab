package ua.lviv.iot.goods.managers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.goods.models.GoodsForHome;
import ua.lviv.iot.goods.models.GoodsForHomeType;
import ua.lviv.iot.goods.models.Decor;
import ua.lviv.iot.goods.models.DecorType;
import ua.lviv.iot.goods.models.Dishes;
import ua.lviv.iot.goods.models.DishesType;
import ua.lviv.iot.goods.models.Furniture;
import ua.lviv.iot.goods.models.FurnitureType;
import ua.lviv.iot.goods.models.MaterialOfGoods;

public class GoodsForHomeWriterTest {

	private List<GoodsForHome> goods;

	  public void setUp() {
	    goods = new ArrayList<>();
	  }

	  @BeforeEach
	  public void beforeEach() {

	    goods = new ArrayList<>();
	    goods.add(new GoodsForHome(GoodsForHomeType.DECOR, MaterialOfGoods.GLASS, 2000, 10, 10));
	    goods.add(new Decor(GoodsForHomeType.DISHES, MaterialOfGoods.STEEl, 3000, 20, 20, DecorType.CANDLES));
	    goods.add(new Dishes(GoodsForHomeType.FURNITURE, MaterialOfGoods.WOOD, 4000, 30, 30, DishesType.CHIlDRENDISHES));
	    goods.add(new Furniture(GoodsForHomeType.DECOR, MaterialOfGoods.GLASS, 5000, 40, 40, FurnitureType.CHAIR));
	    goods.add(new GoodsForHome(GoodsForHomeType.DISHES, MaterialOfGoods.STEEl, 6000, 50, 50));
	  }

	  @Test
	  public void testWriteToFile() throws FileNotFoundException, IOException {
	    GoodsForHomeWriter.writeToFile(goods);
	    File file = new File("out.csv");
	    try (FileInputStream fis = new FileInputStream(file);
	        InputStreamReader isr = new InputStreamReader(fis);
	        BufferedReader bufReader = new BufferedReader(isr);) {
	    	String line = null;
	      String lines = "";
	      while ((line = bufReader.readLine()) != null) {
	        lines += line + "\n";
	      }
	      lines = lines.substring(0, lines.length() - 1);
	      System.out.println(lines);
	      Assertions.assertEquals(
	          "goodsForHome, materialOfGoods, price, widthOfGoods, lenghtOfGoods\n"
	          + "DECOR, GLASS, 2000, 10, 10\n"
	          + "goodsForHome, materialOfGoods, price, widthOfGoods, lenghtOfGoods, type\n"
	          + "DISHES, STEEl, 3000, 20, 20, CANDLES\n"
	          + "goodsForHome, materialOfGoods, price, widthOfGoods, lenghtOfGoods, type\n"
	          + "FURNITURE, WOOD, 4000, 30, 30, CHIlDRENDISHES\n"
	          + "goodsForHome, materialOfGoods, price, widthOfGoods, lenghtOfGoods, type\n"
	          + "DECOR, GLASS, 5000, 40, 40, CHAIR\n"
	          + "goodsForHome, materialOfGoods, price, widthOfGoods, lenghtOfGoods\n"
	          + "PISTOLS, 5000.0, MIDDLE, ATTACK, COLDIER, 5",lines);
	    } finally {
	      System.out.println();
	    }
	  }
}
