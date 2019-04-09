package ua.lviv.iot.goods.models;

public class Furniture extends GoodsForHome {

    private FurnitureType type;

    public Furniture()  {

    }

    public Furniture(GoodsForHomeType goodsForHomeType, MaterialOfGoods materialOfGoods, int price,
                     int widthOfGoods, int lenghtOfGoods, FurnitureType type) {
        this.type = type;
    }

    public FurnitureType getType() {
        return type;
    }

    public void setType(FurnitureType type) {
        this.type = type;
    }
}
