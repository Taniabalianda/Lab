package ua.lviv.iot.goods.models;

public class GoodsForHome {
    private GoodsForHomeType goodsForHomeType;
    private MaterialOfGoods materialOfGoods;
    private int price;
    private int widthOfGoods;
    private int lenghtOfGoods;

    public GoodsForHome() {

    }

    public GoodsForHome(
            final GoodsForHomeType goodsForHomeType,
            final MaterialOfGoods materialOfGoods,
            final int price,
            final int widthOfGoods,
            final int lenghtOfGoods) {

        this.goodsForHomeType = goodsForHomeType;
        this.materialOfGoods = materialOfGoods;
        this.price = price;
        this.widthOfGoods = widthOfGoods;
        this.lenghtOfGoods = lenghtOfGoods;
    }

    @Override
    public String toString() {
        return "GoodsFotHome [goodsForHomeType=" + goodsForHomeType + ", materialOfGoods=" + materialOfGoods
                + ", price=" + price + ", widthOfGoods=" + widthOfGoods + ", lenghtOfGoods=" + lenghtOfGoods + "]";
    }

    public GoodsForHomeType getGoodsForHomeType() {

        return goodsForHomeType;
    }

    public void setGoodsForHomeType(final GoodsForHomeType goodsForHomeType) {

        this.goodsForHomeType = goodsForHomeType;
    }

    public MaterialOfGoods getMaterialOfGoods() {

        return materialOfGoods;
    }

    public void setMaterialOfGoods(final MaterialOfGoods materialOfGoods) {

        this.materialOfGoods = materialOfGoods;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {

        this.price = price;
    }

    public int getWidthOfGoods() {

        return widthOfGoods;
    }

    public void setWidthOfGoods(final int widthOfGoods) {

        this.widthOfGoods = widthOfGoods;
    }

    public int getLenghtOfGoods() {

        return lenghtOfGoods;
    }

    public void setLenghtOfGoods(final int lengthOfGoods) {

        this.lenghtOfGoods = lengthOfGoods;
    }
}
