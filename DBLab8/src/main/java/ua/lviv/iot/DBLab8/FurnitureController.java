package ua.lviv.iot.DBLab8;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.goodsForHome.models.Furniture;

@RestController
@RequestMapping(value = "/Furniture")
public class FurnitureController {
  @Autowired
  FurnitureRepository furnitureRepository;
 
  @GetMapping("/Furniture")
  public List getAllTickets() {
    return  (List) furnitureRepository.findAll();
  }

  @GetMapping("/Furniture/{id}")
  public Furniture getTicket(@PathVariable Integer id) {
    return furnitureRepository.findById(id).get();
  }

  
  @PostMapping("/Furniture")
    public Furniture createFurniture(@RequestBody Furniture furniture) {
	Furniture savedFurniture = furnitureRepository.save(furniture);
    return savedFurniture;
  }
  
  @PutMapping("/Furniture/{id}")
   public  Furniture updateFurniture(
      @RequestBody Furniture changedFurniture, @PathVariable Integer id) {
	furnitureRepository.save(changedFurniture);
    return changedFurniture;
  }
  
  @DeleteMapping("/Furniture/{id}")
  public String deleteTicket(@PathVariable Integer id) {
    furnitureRepository.deleteById(id);
    return String.format("Furniture id #%d successfully deleted", id);
  }
  
}
