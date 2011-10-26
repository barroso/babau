package br.com.fortes;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class IndexController {

	private final Result result;

	public IndexController(Result result) {
		this.result = result;
	}

	@Path("/")
	public void index() {
		result.include("variable", "DEP! ta funfando...<br>");
	}

	@Path("/babau")
	public void babau() {
		result.include("variable", "babau");
	}
}
