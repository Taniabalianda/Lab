package ua.lviv.iot.goods.models;

public class Dishes extends GoodsForHome {

    private DishesType type;

    public Dishes() {

    }

    public Dishes(final GoodsForHomeType goodsForHomeType, final MaterialOfGoods materialOfGoods, final int price,
                  final int widthOfGoods, final int lenghtOfGoods, final DishesType type) {

        this.type = type;
    }

    public DishesType getType() {
        return type;
    }

    public void setType( final DishesType type) {
        this.type = type;
    }
}
