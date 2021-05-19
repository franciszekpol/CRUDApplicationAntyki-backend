package franciszekpol.crudapplicationantyki;

import franciszekpol.crudapplicationantyki.model.Furniture;
import franciszekpol.crudapplicationantyki.repository.FurnitureRepository;
import org.apache.commons.io.IOUtils;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Component
public class DataLoader implements ApplicationRunner {

    private FurnitureRepository furnitureRepository;

    public DataLoader(FurnitureRepository furnitureRepository) {
        this.furnitureRepository = furnitureRepository;
    }

    public void run(ApplicationArguments args) throws IOException {

        File file = new File("src/main/resources/static/pictures/1.jpg");
        InputStream inputStream = new FileInputStream(file);
        byte[] image = IOUtils.toByteArray(inputStream);
        Furniture furniture = new Furniture("Zabytkowe lustro, Europa Północna, rok około 1890.", "Antyczne lustro z końca XIX wieku.", 1890l, "Europa Północna",null, null, 2400l, null, "Lustro", image);
        furnitureRepository.save(furniture);

        file = new File("src/main/resources/static/pictures/2.jpg");
        inputStream = new FileInputStream(file);
        image = IOUtils.toByteArray(inputStream);
        furniture = new Furniture("Dębowa witryna z okresu międzywojennego", "Dębowa witryna z okresu międzywojennego. Stan bardzo dobry, po profesjonalnej renowacji.", null, null,null, null, 5900l, null, "Witryna", image);
        furnitureRepository.save(furniture);

        file = new File("src/main/resources/static/pictures/3.jpg");
        inputStream = new FileInputStream(file);
        image = IOUtils.toByteArray(inputStream);
        furniture = new Furniture("Biurko w stylu neorenesansowym", "Stare, klasyczne biurko powstało około 1920 r. z drewna dębowego. Mebel w stylu neorenesansowym posiada szuflady i półki oraz proste zdobienia.", 1920l, "Europa Zachodnia",null, "Renesans", 5000l, null, "Biurko", image);
        furnitureRepository.save(furniture);

        file = new File("src/main/resources/static/pictures/4.jpg");
        inputStream = new FileInputStream(file);
        image = IOUtils.toByteArray(inputStream);
        furniture = new Furniture("Fotel Art Deco, Polska, lata 40", "Stan bardzo dobry, po renowacji i wymianie tapicerki", 1940l, "Polska",null, "Art Deco", 3900l, null, "Fotel", image);
        furnitureRepository.save(furniture);

        file = new File("src/main/resources/static/pictures/5.jpg");
        inputStream = new FileInputStream(file);
        image = IOUtils.toByteArray(inputStream);
        furniture = new Furniture("Zabytkowy komplet gabinetowy, Europa Zachodnia, początek XX wieku.", "Antyczny komplet gabinetowy z początku XX wieku. Meble w bardzo dobrym stanie, po profesjonalnej renowacji.", 1910l, "Europa Zachodnia",null, null, 16000l, null, "Biurko", image);
        furnitureRepository.save(furniture);

        file = new File("src/main/resources/static/pictures/6.jpg");
        inputStream = new FileInputStream(file);
        image = IOUtils.toByteArray(inputStream);
        furniture = new Furniture("Biurko Empire, Francja, ok. 1880 rok.", null, 1880l, "Francja",null, "Empire", 12500l, null, "Biurko", image);
        furnitureRepository.save(furniture);

        file = new File("src/main/resources/static/pictures/7.jpg");
        inputStream = new FileInputStream(file);
        image = IOUtils.toByteArray(inputStream);
        furniture = new Furniture("Komplet Foteli, Empire, ok. 1860 rok.", "Stan bardzo dobry, po profesjonalnej renowacji i wymianie tapicerki.", 1860l, "Europa Północna",null, "Empire", 4900l, null, "Krzesło", image);
        furnitureRepository.save(furniture);

        file = new File("src/main/resources/static/pictures/8.jpg");
        inputStream = new FileInputStream(file);
        image = IOUtils.toByteArray(inputStream);
        furniture = new Furniture("Komplet foteli z połowy XX wieku. PO RENOWACJI.", "Stylowe fotele z połowy XX wieku. Stan bardzo dobry po profesjonalnej renowacji, obite nową tkaniną.", 1950l, "Europa Centralna",null, null, 3900l, null, "Fotel", image);
        furnitureRepository.save(furniture);

        file = new File("src/main/resources/static/pictures/9.jpg");
        inputStream = new FileInputStream(file);
        image = IOUtils.toByteArray(inputStream);
        furniture = new Furniture("Rzeźbiona komoda, Francja, ok. 1900 rok.", null, 1900l, "Francja",null, "Renesans", 16000l, null, "Komoda", image);
        furnitureRepository.save(furniture);

        file = new File("src/main/resources/static/pictures/10.jpg");
        inputStream = new FileInputStream(file);
        image = IOUtils.toByteArray(inputStream);
        furniture = new Furniture("Śliczna, wysoka komoda z końca XIX wieku.", "Komoda zwana bieliźniarką lub szyfonierą służyła w dawnych czasach jako komoda na bieliznę i każda szuflada była przeznaczona na kolejny dzień tygodnia.", 1880l, "Europa Północna",null, null, 6900l, null, "Komoda", image);
        furnitureRepository.save(furniture);

        file = new File("src/main/resources/static/pictures/11.jpg");
        inputStream = new FileInputStream(file);
        image = IOUtils.toByteArray(inputStream);
        furniture = new Furniture("Stolik Art Deco, Polska, lata 40.", null, 1940l, "Polska",null, null, 6900l, null, "Stolik", image);
        furnitureRepository.save(furniture);

        file = new File("src/main/resources/static/pictures/12.jpg");
        inputStream = new FileInputStream(file);
        image = IOUtils.toByteArray(inputStream);
        furniture = new Furniture("Zabytkowy fotel, Europa Północna, przełom XIX i XX wieku.", "Antyczny fotel z około 1900 roku.", 1900l, "Europa Północna",null, null, 3500l, null, "Fotel", image);
        furnitureRepository.save(furniture);

        file = new File("src/main/resources/static/pictures/13.jpg");
        inputStream = new FileInputStream(file);
        image = IOUtils.toByteArray(inputStream);
        furniture = new Furniture("Unikatowy szezlong Biedermeier z ok. 1850 roku.", "Unikatowy szezlong Biedermeier z ok. 1850 roku. Stan bardzo dobry, po renowacji  i wymianie tapicerki .", 1850l,null,"Mahoń", null, 14900l, null, "Fotel", image);
        furnitureRepository.save(furniture);

        file = new File("src/main/resources/static/pictures/14.jpg");
        inputStream = new FileInputStream(file);
        image = IOUtils.toByteArray(inputStream);
        furniture = new Furniture("Secesyjna biblioteka, Skandynawia, lata 20.", "Antyczna witryna - biblioteka z około 1920 roku. Wykonana z drewna dębowego. Górna część składa się z przeszklonej witryny z półkami a dolna z pojemnej komody z jedną półką.", 1920l,"Europa Północna","Drewno (dąb)", "Secesja", 7900l, null, "Komoda", image);
        furnitureRepository.save(furniture);

        file = new File("src/main/resources/static/pictures/15.jpg");
        inputStream = new FileInputStream(file);
        image = IOUtils.toByteArray(inputStream);
        furniture = new Furniture("Zabytkowy gabinet, Europa Zachodnia, rok około 1910.", "Antyczny gabinet z początku XX wieku.", 1910l,"Europa Zachodnia","Drewno (dąb)", null, 19500l, null, "Komoda", image);
        furnitureRepository.save(furniture);

    }
}
