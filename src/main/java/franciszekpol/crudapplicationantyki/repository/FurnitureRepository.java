package franciszekpol.crudapplicationantyki.repository;

import franciszekpol.crudapplicationantyki.model.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FurnitureRepository extends JpaRepository<Furniture, Long> {

    List<Furniture> findTop8ByOrderByIdDesc();

    List<Furniture> findTop4ByOrderByPrice();

    void deleteFurnitureById(Long id);

    Optional<Furniture> findFurnitureById(Long id);
}
