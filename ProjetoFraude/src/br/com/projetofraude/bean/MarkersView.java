package br.com.projetofraude.bean;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

@ManagedBean
public class MarkersView implements Serializable {
   
	private static final long serialVersionUID = 1L;
	private MapModel simpleModel;
 
    @PostConstruct
    public void init() {
        simpleModel = new DefaultMapModel();
         
        //Coordenadas
        LatLng coord1 = new LatLng(-28.952962, -49.471081);

         
        //Comando básico para incluir uma marca
        simpleModel.addOverlay(new Marker(coord1, "TESTE"));
       
    }
 
    public MapModel getSimpleModel() {
        return simpleModel;
    }
}
