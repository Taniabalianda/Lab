package ua.lviv.iot.goods.managers;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.goods.models.GoodsForHome;
import ua.lviv.iot.goods.models.GoodsForHomeType;
import ua.lviv.iot.goods.models.MaterialOfGoods;

public class Main {
    public static void main(String[] args) {
        List<GoodsForHome> goods = new ArrayList<GoodsForHome>();

        goods.add(new GoodsForHome(GoodsForHomeType.DECOR, MaterialOfGoods.GLASS, 2000, 40, 30));
        goods.add(new GoodsForHome(GoodsForHomeType.DISHES, MaterialOfGoods.STEEl, 2500, 30, 20));
        goods.add(new GoodsForHome(GoodsForHomeType.FURNITURE, MaterialOfGoods.WOOD, 3000, 20, 10));
        goods.add(new GoodsForHome(GoodsForHomeType.DISHES, MaterialOfGoods.GLASS, 1000, 60, 70));
        goods.add(new GoodsForHome(GoodsForHomeType.DECOR, MaterialOfGoods.WOOD, 500, 10, 15));

        List<GoodsForHome> sortedGoods =
                (new GoodsForHomeManager(goods).sortByLenght(true));
        System.out.println(sortedGoods);

        List<GoodsForHome> sortedGoods1 =
                (new GoodsForHomeManager(goods).sortByWidth(false));
        System.out.println(sortedGoods1);
    }
}
