package Services;

import java.util.ArrayList;
import java.util.List;

import model.Prodotto;

public class ProdottoService {

	private List<Prodotto> prodotti;

	public ProdottoService() {

		this.prodotti = new ArrayList<>();
		Prodotto p1 = new Prodotto();
		p1.setId(1l);
		p1.setNome("Daniele");
		p1.setDescrizione("Software");
		prodotti.add(p1);

		this.prodotti = new ArrayList<>();
		Prodotto p2 = new Prodotto();
		p2.setId(2l);
		p2.setNome("Federico");
		p2.setDescrizione("Fitness");
		prodotti.add(p2);
		
		this.prodotti = new ArrayList<>();
		Prodotto p3 = new Prodotto();
		p3.setId(3l);
		p3.setNome("Riccardo");
		p3.setDescrizione("Proteina");
		prodotti.add(p3);

	}

	public void salvaProdotto(Prodotto prodotto) {
		//TODO 
	}

	public List<Prodotto> listaProdotti(){

		return this.prodotti;
	}

	public Prodotto prodottoById(Long id) {
		Prodotto prodotto = null;
		for(Prodotto p: prodotti) {
			if(p.getId().equals(id))
				prodotto = p;
		}
		return prodotto;
	}

}


