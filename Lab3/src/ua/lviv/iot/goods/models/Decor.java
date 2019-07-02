package ua.lviv.iot.goods.models;

public class Decor extends GoodsForHome {

    private DecorType type;

    public Decor() {

    }

    public Decor(GoodsForHomeType goodsForHomeType, MaterialOfGoods materialOfGoods, int price,
                 int widthOfGoods, int lenghtOfGoods, DecorType type) {
        this.type = type;
    }

    public DecorType getType() {
        return type;
    }

    public void setType(DecorType type) {
        this.type = type;
    }
}
