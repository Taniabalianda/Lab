package ua.lviv.iot.goods.managers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.goods.models.GoodsForHome;
import ua.lviv.iot.goods.models.GoodsForHomeType;
import ua.lviv.iot.goods.models.MaterialOfGoods;

public class GoodsForHomeManagerImpl implements GoodsForHomeManager {
	private List<GoodsForHome> goods;

	public GoodsForHomeManagerImpl() {

	}

	public GoodsForHomeManagerImpl(List<GoodsForHome> goods) {
		this.goods = goods;
	}
	
	@Override
	public void addGoods(final GoodsForHome goodsForHome) {
	}
	
	interface SearchableCriteria<T> {
		boolean matchCriteria(T criteria);
	}
	
	public List<GoodsForHome> filterGoodsByCriteria(final SearchableCriteria<GoodsForHome> criteria) {
		return goods.stream().filter(goods -> criteria.matchCriteria(goods)).collect(Collectors.toList());
	}

	public List<GoodsForHome> filterByGoodsForHomeTypeEquals(final GoodsForHomeType goodsForHomeType) {
		return filterGoodsByCriteria(criteria -> criteria.getGoodsForHomeType().compareTo(goodsForHomeType) == 0);
	}

	public List<GoodsForHome> filterByMaterialOfGoodsEquals(final MaterialOfGoods materialOfGoods) {
		return filterGoodsByCriteria(criteria -> criteria.getMaterialOfGoods().compareTo(materialOfGoods) == 0);
	}

	public static void sortByWidthAcsending(final List<GoodsForHome> goods) {
		Collections.sort(goods, Comparator.comparing(GoodsForHome::getWidthOfGoods));
	}
	
	public static void sortByWidthDecsending(final List<GoodsForHome> goods) {
		Collections.sort(goods, Comparator.comparing(GoodsForHome::getWidthOfGoods).reversed());
	}

	public static void sortByLenghtAcsending(final List<GoodsForHome> goods) {
		Collections.sort(goods, Comparator.comparing(GoodsForHome::getLenghtOfGoods));
	}
	
	public static void sortByLenghtDescending(final List<GoodsForHome> goods) { 
		Collections.sort(goods, Comparator.comparing(GoodsForHome::getLenghtOfGoods).reversed()); 
	} 


	public List<GoodsForHome> getGoods() {
		return goods;
	}

	public void setGoods(List<GoodsForHome> goods) {
		this.goods = goods;

	}
}