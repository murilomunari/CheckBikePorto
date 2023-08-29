package br.com.domain.repository;

import br.com.domain.entity.Bicicleta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BicicletaRepository {

    private static List<Bicicleta> bicicletas;

    static {
        bicicletas = new ArrayList<>();

        Bicicleta bmx = new Bicicleta(1L, "BMX", "5000");
        Bicicleta corrida = new Bicicleta(2L, "Bicicleta de corrida", "30000");
        Bicicleta trail = new Bicicleta(3L, "Bicicleta de trail", "10000");

        bicicletas.addAll(Arrays.asList(bmx, corrida, trail));
    }

    public List<Bicicleta> findAll(){
        return  bicicletas;
    }

    public Bicicleta findById(Long id){
        for(int i = 0; i < bicicletas.size(); i++){
            if (bicicletas.get(i).getId().equals(id)){
                return bicicletas.get(i);
            }
        }
        return null;
    }
    public List<Bicicleta> findByName(String modelo){
        List<Bicicleta> bicicletasEncontradas = new ArrayList<>();
        for (Bicicleta b : bicicletas){
            if (b.getModeloBicicleta().equalsIgnoreCase(modelo)){
                bicicletasEncontradas.add(b);
            }
        }
        return bicicletasEncontradas;
    }

    public List<Bicicleta> findByprice(String preco){
        List<Bicicleta> precoCompativel = new ArrayList<>();
        for (Bicicleta b : bicicletas){
            if (b.getPreco().equalsIgnoreCase(preco)){
                precoCompativel.add(b);
            }
        }
        return precoCompativel;
    }

    public Bicicleta persist(Bicicleta b){
        b.setId(bicicletas.size()+ 1L);
        bicicletas.add(b);
        return b;
    }

}
