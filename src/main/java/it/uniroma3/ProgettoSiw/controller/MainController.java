package it.uniroma3.ProgettoSiw.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * The MainController is a Spring Boot Controller to handle
 * the generic interactions with the home pages, and that do not refer to specific entities
 */
@Controller
public class MainController {

	public MainController() {
		super();
	}

	/**
	 * This method is called when a GET request is sent by the user to URL "/" or "/index".
	 * This method prepares and dispatches the home view.
	 *
	 * @return the name of the home view
	 */
	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		return "home";
	}

	/**
	 * This method is called when a GET request is sent by the user to URL "/fornitori".
	 * This method prepares and dispatches the welcome view.
	 *
	 * @return the name of the fornitori view
	 */
	@RequestMapping(value = { "/fornitore" }, method = RequestMethod.GET)
	public String fornitori(Model model) {
		return "fornitore";
	}


	/**
	 * This method is called when a GET request is sent by the user to URL "/categoria".
	 * This method prepares and dispatches the home view.
	 *
	 * @return the name of the categoria view
	 */
	@RequestMapping(value = { "/categoria" }, method = RequestMethod.GET)
	public String categoria(Model model) {
		return "categoria";
	}

	/**
	 * This method is called when a GET request is sent by the user to URL "/prodotto".
	 * This method prepares and dispatches the home view.
	 *
	 * @return the name of the prodotto view
	 */
	@RequestMapping(value = { "/prodotto" }, method = RequestMethod.GET)
	public String prodotto(Model model) {
		return "prodotto";
	}


	/**
	 * This method is called when a GET request is sent by the user to URL "/welcome".
	 * This method prepares and dispatches the welcome view.
	 *
	 * @return the name of the welcome view
	 */
	@RequestMapping(value = { "/paginaAdmin" }, method = RequestMethod.GET)
	public String welcome(Model model) {
		UserDetails details = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String role = details.getAuthorities().iterator().next().getAuthority();     // get first authority
		model.addAttribute("username", details.getUsername());
		model.addAttribute("role", role);

		return "paginaAdmin";
	}

	/**
	 * This method is called when a GET request is sent by the user to URL "/pagina".
	 * This method prepares and dispatches the welcome view.
	 *
	 * @return the name of the welcome view
	 */
	@RequestMapping(value = { "/admin" }, method = RequestMethod.GET)
	public String Pagina(Model model) {
		UserDetails details = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String role = details.getAuthorities().iterator().next().getAuthority();     // get first authority
		model.addAttribute("username", details.getUsername());
		model.addAttribute("role", role);

		return "admin";
	}

	/**
	 * This method is called when a GET request is sent by the user to URL "/admin".
	 * This method prepares and dispatches the admin view.
	 *
	 * @return the name of the admin view
	 */
	@RequestMapping(value = { "/inserimentoProdotto" }, method = RequestMethod.GET)
	public String admin(Model model) {
		UserDetails details = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String role = details.getAuthorities().iterator().next().getAuthority();    // get first authority
		model.addAttribute("username", details.getUsername());
		model.addAttribute("role", role);

		return "inserimentoProdotto";
	}
}