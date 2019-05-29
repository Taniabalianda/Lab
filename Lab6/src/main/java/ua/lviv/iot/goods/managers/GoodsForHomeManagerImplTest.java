package ua.lviv.iot.goods.managers;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.goods.models.Decor;
import ua.lviv.iot.goods.models.DecorType;
import ua.lviv.iot.goods.models.Dishes;
import ua.lviv.iot.goods.models.DishesType;
import ua.lviv.iot.goods.models.Furniture;
import ua.lviv.iot.goods.models.FurnitureType;
import ua.lviv.iot.goods.models.GoodsForHome;
import ua.lviv.iot.goods.models.GoodsForHomeType;
import ua.lviv.iot.goods.models.MaterialOfGoods;

public class GoodsForHomeManagerImplTest {
	private List<GoodsForHome> goods;

	public void setUp() {

		goods = new ArrayList<>();

	}

	@BeforeEach
	public void beforeEach() {

		goods = new ArrayList<>();

		goods.add(new GoodsForHome(GoodsForHomeType.DECOR, MaterialOfGoods.GLASS, 2000, 40, 1));
		goods.add(new Decor(GoodsForHomeType.DISHES, MaterialOfGoods.STEEl, 2500, 30, 2, DecorType.CANDLES));
		goods.add(new Dishes(GoodsForHomeType.FURNITURE, MaterialOfGoods.WOOD, 3000, 20, 3, DishesType.CHIlDRENDISHES));
		goods.add(new Furniture(GoodsForHomeType.DISHES, MaterialOfGoods.GLASS, 1000, 100, 4, FurnitureType.CHAIR));
		goods.add(new GoodsForHome(GoodsForHomeType.DECOR, MaterialOfGoods.WOOD, 500, 10, 5));


	}

	@Test
	void testSortLenghtAscending() {
		GoodsForHomeManagerImpl.sortByLenghtAcsending(goods);
		Assertions.assertEquals(0, goods.get(0).getLenghtOfGoods());
	}

	@Test
	void testSortLenghtDescending() {
		GoodsForHomeManagerImpl.sortByLenghtDescending(goods);
		Assertions.assertEquals(5, goods.get(0).getLenghtOfGoods());
	}

	@Test
	void testSortWidthAscending() {
		GoodsForHomeManagerImpl.sortByWidthAcsending(goods);
		Assertions.assertEquals(0, goods.get(0).getWidthOfGoods());
	}

	@Test
	void testSortWidthDescending() {
		GoodsForHomeManagerImpl.sortByWidthDecsending(goods);
		Assertions.assertEquals(40, goods.get(0).getWidthOfGoods());
	}
}