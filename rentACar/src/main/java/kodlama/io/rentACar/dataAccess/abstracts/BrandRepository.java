package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;

import kodlama.io.rentACar.entities.concreates.Brand;

public interface BrandRepository {
List<Brand> getAll();

	
}
