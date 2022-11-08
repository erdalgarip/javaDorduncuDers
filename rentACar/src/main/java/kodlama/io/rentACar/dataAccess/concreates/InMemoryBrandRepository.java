package kodlama.io.rentACar.dataAccess.concreates;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concreates.Brand;


@Repository
public class InMemoryBrandRepository implements BrandRepository {

List<Brand>	brands;
	
	public InMemoryBrandRepository() {

	   brands = new ArrayList<Brand>();
	   brands.add(new Brand(1,"KİA"));
	   brands.add(new Brand(2,"MERCEDES"));
	   brands.add(new Brand(3,"RENAULT"));
	   brands.add(new Brand(4,"AUDİ"));
	   brands.add(new Brand(5,"CHEVROLET"));
}

	@Override
	public List<Brand> getAll() {
		
		return brands;
	}

}
