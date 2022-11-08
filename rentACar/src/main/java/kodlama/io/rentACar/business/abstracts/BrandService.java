package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.entities.concreates.Brand;

public interface BrandService  {

	List<Brand> getAll();
	
}
