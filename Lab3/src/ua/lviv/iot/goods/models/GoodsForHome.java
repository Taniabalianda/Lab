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
            GoodsForHomeType goodsForHomeType,
            MaterialOfGoods materialOfGoods,
            int price,
            int widthOfGoods,
            int lenghtOfGoods) {

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

    public void setGoodsForHomeType(GoodsForHomeType goodsForHomeType) {
        this.goodsForHomeType = goodsForHomeType;
    }

    public MaterialOfGoods getMaterialOfGoods() {
        return materialOfGoods;
    }

    public void setMaterialOfGoods(MaterialOfGoods materialOfGoods) {
        this.materialOfGoods = materialOfGoods;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWidthOfGoods() {
        return widthOfGoods;
    }

    public void setWidthOfGoods(int widthOfGoods) {
        this.widthOfGoods = widthOfGoods;
    }

    public int getLenghtOfGoods() {
        return lenghtOfGoods;
    }

    public void setLenghtOfGoods(int lenghtOfGoods) {
        this.lenghtOfGoods = lenghtOfGoods;
    }
}
