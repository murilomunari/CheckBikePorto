package br.com.domain.repository;

import br.com.domain.entity.Bicicleta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BicicletaRepository implements Repository<Bicicleta, Long> {

    private static List<Bicicleta> bicicletas;

    static {
        bicicletas = new ArrayList<>();

        Bicicleta traill = new Bicicleta(1L, "Modelo para montanhas");
        Bicicleta bmx = new Bicicleta(2L, "Bicicleta bmx");
        Bicicleta speed = new Bicicleta(3L, "Biciccleta para corrida");
        Bicicleta urbana = new Bicicleta(4L, "Bicicleta para a cidade");
        Bicicleta dobravel = new Bicicleta(5L, "Biciccleta dobravel");

        bicicletas.addAll(Arrays.asList(traill, bmx, speed, urbana, dobravel));
    }


    @Override
    public List<Bicicleta> findAll() {
        return bicicletas;
    }

    @Override
    public Bicicleta findById(Long id) {
        for (int i = 0; i< bicicletas.size(); i++){
            if (bicicletas.get(i).getId().equals(id)){
                return bicicletas.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Bicicleta> findByName(String nome) {
        List<Bicicleta> bicicletasEncontradas = new ArrayList<>();
        for (Bicicleta b : bicicletas){
            if (b.getNome().equalsIgnoreCase(nome)){
                bicicletasEncontradas.add(b);
            }
        }
        return bicicletasEncontradas;
    }

    @Override
    public Bicicleta persist(Bicicleta b) {
        b.setId(bicicletas.size()+1L);
        bicicletas.add(b);
        return b;
    }
}
