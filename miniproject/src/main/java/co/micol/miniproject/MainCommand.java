package co.micol.miniproject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.miniproject.common.Command;
import co.micol.miniproject.common.Sha256;

public class MainCommand implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		Sha256 passwordEncrytion = new Sha256();
		String sp = passwordEncrytion.sha256("K@me1034");
		System.out.println(sp);
		return "main/main";
	}

}
