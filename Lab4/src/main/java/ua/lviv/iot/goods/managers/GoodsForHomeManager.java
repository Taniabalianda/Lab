package ua.lviv.iot.goods.managers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.goods.models.GoodsForHome;
import ua.lviv.iot.goods.models.MaterialOfGoods;

public class GoodsForHomeManager {
	private List<GoodsForHome> goods;

	public GoodsForHomeManager() {

	}

	public GoodsForHomeManager(List<GoodsForHome> goods) {
		this.goods = goods;
	}

	public List<GoodsForHome> fimdByPrice(int price) {
		List<GoodsForHome> goodsList = goods;
		List<GoodsForHome> findGoodsList = goodsList.stream().filter(goods -> goods.getPrice() == price)
				.collect(Collectors.toList());
		return findGoodsList;
	}

	public List<GoodsForHome> fimdByMaterialOfGoods(MaterialOfGoods materialOfGoods) {
		List<GoodsForHome> goodsList = goods;
		List<GoodsForHome> findGoodsList = goodsList.stream()
				.filter(goods -> goods.getMaterialOfGoods() == materialOfGoods).collect(Collectors.toList());
		return findGoodsList;
	}

	public List<GoodsForHome> sortByWidth(boolean descending) {
		Comparator<GoodsForHome> comparator = (GoodsForHome obj1, GoodsForHome obj2) -> Integer
				.compare((obj1.getWidthOfGoods()), (obj2.getWidthOfGoods()));
		List<GoodsForHome> goodsList = goods;
		goodsList.sort(comparator);
		if (descending) {
			Collections.reverse(goodsList);
		}
		return goodsList;
	}

	public List<GoodsForHome> sortByLenght(boolean descending) {
		Comparator<GoodsForHome> comparator = (GoodsForHome obj1, GoodsForHome obj2) -> Integer
				.compare((obj1.getLenghtOfGoods()), (obj2.getLenghtOfGoods()));
		List<GoodsForHome> goodsList = goods;
		goodsList.sort(comparator);
		if (descending) {
			Collections.reverse(goodsList);
		}
		return goodsList;
	}

	public List<GoodsForHome> getGoods() {
		return goods;
	}

	public void setGoods(List<GoodsForHome> goods) {
		this.goods = goods;

	}
}