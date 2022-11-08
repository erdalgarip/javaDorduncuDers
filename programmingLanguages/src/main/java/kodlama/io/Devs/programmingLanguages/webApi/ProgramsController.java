package kodlama.io.Devs.programmingLanguages.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.programmingLanguages.business.abstracts.ProgramsService;
import kodlama.io.Devs.programmingLanguages.entities.Programs;

@RestController
@RequestMapping("/api/programs")
public class ProgramsController {

@Autowired	
private ProgramsService programsService;

public ProgramsController(ProgramsService programsService) {
	this.programsService = programsService;
}

@RequestMapping("/getall")
public List<Programs> getAll() {
	
	return programsService.getAll();
}


	
}
