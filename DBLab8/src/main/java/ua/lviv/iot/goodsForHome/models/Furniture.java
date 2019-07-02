package ua.lviv.iot.goodsForHome.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("childClass")
public class Furniture extends GoodsForHome {

	@Enumerated(EnumType.STRING)
	@Column
	private FurnitureType type;

    public Furniture()  {

    }

    public Furniture(GoodsForHomeType goodsForHomeType, MaterialOfGoods materialOfGoods, int price,
                     int widthOfGoods, int lenghtOfGoods, FurnitureType type) {
    	super(goodsForHomeType, materialOfGoods, price, widthOfGoods, lenghtOfGoods);
        this.type = type;
    }

    public FurnitureType getType() {
        return type;
    }

    public void setType(FurnitureType type) {
        this.type = type;
    }
}
