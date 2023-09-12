package br.com.domain.repository;

import br.com.domain.entity.Bicicleta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BicicletaRepository implements Repository<Bicicleta, Long> {

    private static List<Bicicleta> bicicletas = new ArrayList<>();
    private static long nextId = 4; // Próximo ID disponível após os IDs iniciais

    static {
        Bicicleta bmx = new Bicicleta(1L, "BMX", 5000.0);
        Bicicleta corrida = new Bicicleta(2L, "Bicicleta de corrida", 30000.0);
        Bicicleta trail = new Bicicleta(3L, "Bicicleta de trail", 10000.0);

        bicicletas.addAll(Arrays.asList(bmx, corrida, trail));
    }

    @Override
    public List<Bicicleta> findAll() {
        return bicicletas;
    }

    @Override
    public Bicicleta findById(Long id) {
        for (Bicicleta b : bicicletas) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public List<Bicicleta> findByName(String texto) {
        List<Bicicleta> bicicletasEncontradas = new ArrayList<>();
        for (Bicicleta b : bicicletas) {
            if (b.getModeloBicicleta().equalsIgnoreCase(texto)) {
                bicicletasEncontradas.add(b);
            }
        }
        return bicicletasEncontradas;
    }

    public List<Bicicleta> findByPrice(double preco) {
        List<Bicicleta> precoCompativel = new ArrayList<>();
        for (Bicicleta b : bicicletas) {
            if (b.getPreco() == preco) {
                precoCompativel.add(b);
            }
        }
        return precoCompativel;
    }

    @Override
    public Bicicleta persist(Bicicleta b) {
        b.setId(nextId++);
        bicicletas.add(b);
        return b;
    }
}
