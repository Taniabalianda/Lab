package ua.lviv.iot.goodsForHome.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "childType", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "ParentClass")
public class GoodsForHome {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column
    private GoodsForHomeType goodsForHomeType;
	
	@Enumerated(EnumType.STRING)
	@Column
    private MaterialOfGoods materialOfGoods;
	
	@Column
    private int price;
	
	@Column
    private int widthOfGoods;
	
	@Column
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
        return "goodsForHomeType=" + goodsForHomeType + ", materialOfGoods=" + materialOfGoods
                + ", price=" + price + ", widthOfGoods=" + widthOfGoods + ", lenghtOfGoods=" + lenghtOfGoods;
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