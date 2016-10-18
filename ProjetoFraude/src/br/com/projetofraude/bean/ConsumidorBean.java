package br.com.projetofraude.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.projetofraude.model.Consumidor;
import br.com.projetofraude.model.Consumidor.TipoConsumidor;
import br.com.projetofraude.dao.ConsumidorDao;



@ManagedBean(name = "consumidorBean")
@SessionScoped
public class ConsumidorBean {

	private Consumidor consumidor = new Consumidor();
    private ConsumidorDao consumidorDao = new ConsumidorDao();
    
    public ConsumidorBean() {
    }
    
    public String adicionarConsumidor(){
    	consumidorDao.addConsumidor(consumidor);
    	consumidor.clear();
        return "consumidor";
    }

	public Consumidor getConsumidor() {
		return consumidor;
	}

	public void setConsumidor(Consumidor consumidor) {
		this.consumidor = consumidor;
	}
	
	public List<Consumidor> getListaConsumidor() {
	        List<Consumidor> lp;
	        lp= consumidorDao.getListaConsumidores();//getLista
	        return lp;
	 }
	 
	public TipoConsumidor[] getTiposConsumidor() {
			return TipoConsumidor.values();
	}
    
    
}
