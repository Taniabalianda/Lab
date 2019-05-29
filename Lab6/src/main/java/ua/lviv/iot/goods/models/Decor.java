package ua.lviv.iot.goods.models;

public class Decor extends GoodsForHome {

	private DecorType type;

	public Decor() {

	}

	public Decor(final GoodsForHomeType goodsForHomeType, final MaterialOfGoods materialOfGoods, final int price,
			final int widthOfGoods, final int lenghtOfGoods, final DecorType type) {
		this.type = type;
	}
	
	public String getHeaders() {
        return super.getHeaders() + ", " + "type";
      }

      public String toCSV() {
        return super.toCSV() + ", " + type;
      }

	public DecorType getType() {
		return type;
	}

	public void setType(final DecorType type) {
		this.type = type;
	}
}
