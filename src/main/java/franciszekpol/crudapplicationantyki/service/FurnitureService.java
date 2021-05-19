package franciszekpol.crudapplicationantyki.service;

        import franciszekpol.crudapplicationantyki.model.Furniture;
        import franciszekpol.crudapplicationantyki.repository.FurnitureRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import javax.imageio.ImageIO;
        import java.awt.image.BufferedImage;
        import java.io.*;
        import java.net.URL;
        import java.util.ArrayList;
        import java.util.List;

@Service
public class FurnitureService {

    private FurnitureRepository furnitureRepository;

    @Autowired
    public FurnitureService(FurnitureRepository furnitureRepository) {
        this.furnitureRepository = furnitureRepository;
    }

    public List<Furniture> getLatestFurniture(){
        return new ArrayList<>(furnitureRepository.findTop8ByOrderByIdDesc());
    }

    public List<Furniture> getCheapestFurniture(){
        return new ArrayList<>(furnitureRepository.findTop4ByOrderByPrice());
    }

    public List<Furniture> getFurniture(){
        return new ArrayList<>(furnitureRepository.findAll());
    }

    public Furniture addFurniture(Furniture furniture) throws IOException {

        furniture.setImage(getImageAsByteArray(furniture));
        return furnitureRepository.save(furniture);
    }

    private byte[] getImageAsByteArray(Furniture furniture) throws IOException {
        URL url = new URL(furniture.getImageUrl());
        BufferedImage img = ImageIO.read(url);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(img, "jpg", baos);
        byte[] image = baos.toByteArray();
        return image;
    }

    public Furniture updateFurniture(Furniture furniture){
        return furnitureRepository.save(furniture);
    }

    public void deleteFurniture(Long id){
        furnitureRepository.deleteFurnitureById(id);
    }

    public Furniture findFurnitureById(Long id){
        return furnitureRepository.findFurnitureById(id)
                .orElse(new Furniture());
    }

}
