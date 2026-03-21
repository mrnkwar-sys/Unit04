package boletincrud;

import java.util.ArrayList;

public class CrudDisco {
	
	ArrayList <Disco> listaDiscos;
	
	CrudDisco(){
		listaDiscos = new ArrayList<>();
	}
	
	CrudDisco(ArrayList <Disco> listaDiscos){
		this.listaDiscos = listaDiscos;
	}
	
	public ArrayList <Disco> getListaDiscos(){
		return listaDiscos;
	}
	
	public void addDisc(Disco disc) {
		listaDiscos.add(disc);
	}
	
	public boolean removeDisc(int code) {
		return listaDiscos.removeIf(anyDisc -> anyDisc.getCode() == code);
	}

}
