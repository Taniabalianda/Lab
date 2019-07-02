package ua.lviv.iot.DBLab8;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import ua.lviv.iot.goodsForHome.models.Furniture;
import ua.lviv.iot.goodsForHome.models.FurnitureType;
import ua.lviv.iot.goodsForHome.models.GoodsForHomeType;
import ua.lviv.iot.goodsForHome.models.MaterialOfGoods;

@SpringBootApplication
@EntityScan(basePackages = {"ua.lviv.iot.goodsForHome.models"})
public class DbLab8Application {

	public static void main(String[] args) {
		SpringApplication.run(DbLab8Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(FurnitureRepository repository) {      
		return (args) -> {     
			repository.save(new Furniture(GoodsForHomeType.DECOR, MaterialOfGoods.GLASS, 3000, 20, 10, FurnitureType.CHAIR));
			repository.save(new Furniture(GoodsForHomeType.DISHES, MaterialOfGoods.STEEl, 500, 8, 5, FurnitureType.CHAIR));
			

		      repository.findAll().forEach(goodsForHome -> System.out.println(goodsForHome));
		};  
	}

}
