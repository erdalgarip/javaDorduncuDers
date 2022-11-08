package kodlama.io.Devs.programmingLanguages.dataAccess.concreates;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.programmingLanguages.dataAccess.abstracts.ProgramRepository;
import kodlama.io.Devs.programmingLanguages.entities.Programs;

@Repository
public class InMemoryProgramRepository implements ProgramRepository {

	List<Programs> programs;

	public InMemoryProgramRepository() {

		programs = new ArrayList<Programs>();
		programs.add(new Programs(1, "Java"));
		programs.add(new Programs(2, "Python"));
		programs.add(new Programs(3, "C#"));

	}

	@Override
	public List<Programs> getAll() {

		return programs;
	}

	@Override
	public void add(Programs program) {

		programs.add(program);

	}

	@Override
	public void update(Programs program) {

		for (Programs programlar : programs) {

			if (programlar.getId() == program.getId()) {
				program.setId(programlar.getId());
				program.setName(programlar.getName());

			}

		}

	}

	@Override
	public void delete(Programs program) {
		for (Programs programlar : programs) {

			if (programlar.getId() == program.getId()) {

				programs.remove(program.getId());

			}

		}
	}

	public Programs getByid(int id) {
		for (Programs programlar : programs) {
			if (programlar.getId() == id) {

				return programlar;

			}
		}
		return null;

	}

}
