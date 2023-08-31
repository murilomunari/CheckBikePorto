package br.com.domain.view;

import br.com.domain.entity.Bicicleta;
import br.com.domain.entity.Cliente;
import br.com.domain.repository.BicicletaRepository;
import br.com.domain.service.ClienteService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClienteView {

    List<Bicicleta> bicicletas = new ArrayList<>();

    private ClienteService service = new ClienteService();

    public void menu(){

        int escolha = 0;

        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n"+
                    "1 - Cliente \n" +
                    "2 - Procurar bicicleta pelo nome \n" +
                    "3 - encerrar programa"));

            switch (escolha){
                case 1 -> {
                    Cliente cliente = addCliente();
                    JOptionPane.showMessageDialog(null, cliente);
                    menu();
                }

                case 2 -> {
                    String nome = JOptionPane.showInputDialog("nome da bicicleta: ");
                    List<Cliente> list = service.findByName(nome);
                    list.forEach(c -> {
                        JOptionPane.showMessageDialog(null, c);
                    });

                    menu();
                }

                case 3 -> {

                }
            }
        }while (escolha != 1 || escolha != 2 || escolha != 3 || escolha != 4);
    }

    public Cliente addCliente(){

        Cliente c = null;

        BicicletaRepository bicicletaRepository = new BicicletaRepository();

        bicicletas = bicicletaRepository.findAll();

        if (bicicletas.size() > 0){

            Bicicleta bicicleta = (Bicicleta) JOptionPane.showInputDialog(null, "coloque a bicicleta", "Tipos de bicicleta", JOptionPane.QUESTION_MESSAGE, null, bicicletas.toArray(), bicicletas.get(0));

            if (Objects.isNull(bicicleta)) return c;

            String bicicletas = "";

            do {
                bicicletas = JOptionPane.showInputDialog("Qual Bicicleta quer adicionar");
            }while (bicicletas == "");

            c = new Cliente();
            c.setNome("Murilo").setId(1L).addBicicleta(bicicletas);
            Cliente persist = service.persist(c);

            if (Objects.nonNull(persist)){
                JOptionPane.showInputDialog(null, "A bicicleta foi adicionada!!!!!!!");
            }else {
                JOptionPane.showMessageDialog(null, "A bicicleta não foi adicionada");
            }
        }
        return c;
    }
}
