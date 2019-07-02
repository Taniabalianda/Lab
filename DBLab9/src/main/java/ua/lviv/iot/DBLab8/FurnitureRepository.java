package ua.lviv.iot.DBLab8;

import org.springframework.data.repository.CrudRepository;

import ua.lviv.iot.goodsForHome.models.Furniture;

public interface FurnitureRepository extends CrudRepository<Furniture, Integer> {

}