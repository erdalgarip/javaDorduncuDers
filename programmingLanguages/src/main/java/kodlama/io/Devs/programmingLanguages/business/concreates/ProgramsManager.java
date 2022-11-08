package kodlama.io.Devs.programmingLanguages.business.concreates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.programmingLanguages.business.abstracts.ProgramsService;
import kodlama.io.Devs.programmingLanguages.dataAccess.abstracts.ProgramRepository;
import kodlama.io.Devs.programmingLanguages.entities.Programs;

@Service
public class ProgramsManager implements ProgramsService {

	private ProgramRepository programRepository;

	@Autowired
	public ProgramsManager(ProgramRepository programRepository) {

		this.programRepository = programRepository;
	}

	@Override
	public List<Programs> getAll() {

		return programRepository.getAll();
	}

	@Override
	public void add(Programs programs) throws Exception {

		if (programs.getName().isEmpty()) {

			throw new Exception("Program Adı Boş Olamaz");
		}

		for (Programs programlistesi : programRepository.getAll()) {
			if (programlistesi.getName() == programs.getName()) {
				throw new Exception("Program Adı Tekrar Edemez");
			}

		}

		programRepository.add(programs);

	}

	@Override
	public void update(Programs programs) {

		programRepository.update(programs);

	}

	@Override
	public void delete(Programs programs) {
		programRepository.delete(programs);

	}

	@Override
	public Programs getById(int id) {
		return programRepository.getByid(id);
	}

}
