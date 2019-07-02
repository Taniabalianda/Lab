package ua.lviv.iot.goodsForHome.models;

public class Dishes extends GoodsForHome {

    private DishesType type;

    public Dishes() {

    }

    public Dishes(GoodsForHomeType goodsForHomeType, MaterialOfGoods materialOfGoods, int price,
                  int widthOfGoods, int lenghtOfGoods, DishesType type) {

        this.type = type;
    }

    public DishesType getType() {
        return type;
    }

    public void setType(DishesType type) {
        this.type = type;
    }
}