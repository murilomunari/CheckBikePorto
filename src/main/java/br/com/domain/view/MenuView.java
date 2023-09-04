package br.com.domain.view;

import br.com.domain.entity.Bicicleta;
import br.com.domain.entity.Cliente;
import br.com.domain.repository.BicicletaRepository;
import br.com.domain.service.ClienteService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MenuView {

    List<Bicicleta> bicicletas = new ArrayList<>();

    private ClienteService service = new ClienteService();

    public void menu() {
        int escolha = 0;

        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n"+
                    "1 - Adicionar Cliente \n" +
                    "2 - Procurar bicicleta pelo nome \n" +
                    "3 - Encerrar programa"));

            switch (escolha) {
                case 1 -> {
                    Cliente cliente = addCliente();
                    if (cliente != null) {
                        JOptionPane.showMessageDialog(null, "Cliente criado:\n" + cliente);
                    }
                }

                case 2 -> {
                    String nome = JOptionPane.showInputDialog("Digite o nome da bicicleta: ");
                    List<Cliente> listaBicicleta = service.findByName(nome);
                    listaBicicleta.forEach(c -> JOptionPane.showMessageDialog(null, c));
                }

                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    System.exit(0);
                }
            }
        } while (escolha != 3);
    }

    public Cliente addCliente() {
        Cliente cliente = new Cliente();

        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inválido.");
            return null;
        }
        cliente.setNome(nome);

        String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente:");
        if (cpf == null || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "CPF inválido.");
            return null;
        }
        cliente.setCPF(cpf);

        BicicletaRepository bicicletaRepository = new BicicletaRepository();
        bicicletas = bicicletaRepository.findAll();

        if (bicicletas.size() > 0) {
            Bicicleta bicicleta = (Bicicleta) JOptionPane.showInputDialog(
                    null, "Escolha a bicicleta", "Tipos de bicicleta",
                    JOptionPane.QUESTION_MESSAGE, null, bicicletas.toArray(), bicicletas.get(0));

            if (bicicleta == null) {
                JOptionPane.showMessageDialog(null, "Cliente não foi criado.");
                return null;
            }

            cliente.addBicicleta(String.valueOf(bicicleta));

            Cliente persist = service.persist(cliente);

            if (persist != null) {
                JOptionPane.showMessageDialog(null, "Cliente criado com sucesso!");
                return persist;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não foi criado.");
            }
        }
        return null;
    }

}
