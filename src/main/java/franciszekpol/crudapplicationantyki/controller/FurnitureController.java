package franciszekpol.crudapplicationantyki.controller;

import franciszekpol.crudapplicationantyki.model.Furniture;
import franciszekpol.crudapplicationantyki.service.FurnitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/furniture")
public class FurnitureController {

    private FurnitureService furnitureService;

    @Autowired
    public FurnitureController(FurnitureService furnitureService) {
        this.furnitureService = furnitureService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Furniture>> getAllFurniture(){
        List<Furniture> furnitureList = furnitureService.getFurniture();
        return new ResponseEntity<>(furnitureList, HttpStatus.OK);
    }

    @GetMapping("/latest")
    public ResponseEntity<List<Furniture>> getLatestFurniture(){
        List<Furniture> furnitureList = furnitureService.getLatestFurniture();
        return new ResponseEntity<>(furnitureList, HttpStatus.OK);
    }

    @GetMapping("/cheapest")
    public ResponseEntity<List<Furniture>> getCheapestFurniture(){
        List<Furniture> furnitureList = furnitureService.getCheapestFurniture();
        return new ResponseEntity<>(furnitureList, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Furniture> getFurnitureById (@PathVariable("id") Long id){
        Furniture furniture = furnitureService.findFurnitureById(id);
        return new ResponseEntity<>(furniture, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Furniture> addFurniture(@RequestBody Furniture furniture) throws IOException {
        Furniture newFurniture = furnitureService.addFurniture(furniture);
        return new ResponseEntity<>(newFurniture, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Furniture> updateFurniture(@RequestBody Furniture furniture){
        Furniture updateFurniture = furnitureService.updateFurniture(furniture);
        return new ResponseEntity<>(updateFurniture, HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFurniture(@PathVariable("id") Long id){
        furnitureService.deleteFurniture(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
