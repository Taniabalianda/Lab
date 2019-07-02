package ua.lviv.iot.goods.models;

public class Furniture extends GoodsForHome {

	private FurnitureType type;

	public Furniture() {

	}

	public Furniture(final GoodsForHomeType goodsForHomeType, final MaterialOfGoods materialOfGoods, final int price,
			final int widthOfGoods, final int lenghtOfGoods, final FurnitureType type) {
		this.type = type;
	}

	public FurnitureType getType() {
		return type;
	}

	public void setType(final FurnitureType type) {
		this.type = type;
	}
}
