package kodlama.io.Devs.programmingLanguages.business.abstracts;

import java.util.List;

import kodlama.io.Devs.programmingLanguages.entities.Programs;

public interface ProgramsService {

List<Programs>	getAll();

Programs getById(int id);

void add(Programs programs) throws Exception;

void update(Programs programs);

void delete(Programs programs);



	
}
