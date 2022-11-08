package kodlama.io.Devs.programmingLanguages.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.programmingLanguages.entities.Programs;

@Repository
public interface ProgramRepository {

List<Programs> getAll();

Programs getByid(int id);
void add(Programs programs);
void update(Programs programs);
void delete(Programs programs);
	
	
}
