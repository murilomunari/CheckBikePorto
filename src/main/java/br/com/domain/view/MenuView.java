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

    public static void main(String[] args) {
        MenuView menuView = new MenuView();
        menuView.menu();
    }

    public void menu() {
        int escolha = 0;

        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n" +
                    "1 - Adicionar Cliente \n" +
                    "2 - Encerrar programa"));

            if (escolha == 1) {
                Cliente cliente = addCliente();
                if (cliente != null) {
                    System.out.println("Cliente criado:\n" + cliente);
                    informarPecasBicicleta(cliente);
                }
            } else if (escolha == 2) {
                System.out.println("Encerrando o programa.");
                System.exit(0);
            }
        } while (escolha != 2);
    }

    public Cliente addCliente() {
        Cliente cliente = new Cliente();

        String usuario = JOptionPane.showInputDialog("Digite o nome de usuário:");
        if (usuario == null || usuario.isEmpty()) {
            System.out.println("Usuário inválido.");
            return null;
        }
        cliente.setUsuario(usuario);

        String senha = JOptionPane.showInputDialog("Digite a senha:");
        if (senha == null || senha.isEmpty()) {
            System.out.println("Senha inválida.");
            return null;
        }
        cliente.setSenha(senha);

        BicicletaRepository bicicletaRepository = new BicicletaRepository();
        bicicletas = bicicletaRepository.findAll();

        if (bicicletas.size() > 0) {
            Bicicleta bicicletaEscolhida = escolherBicicleta(bicicletas);

            if (bicicletaEscolhida == null) {
                System.out.println("Cliente não foi criado.");
                return null;
            }

            cliente.addBicicleta(String.valueOf(bicicletaEscolhida)); // Adiciona a bicicleta ao cliente

            Cliente persist = service.persist(cliente);

            if (persist != null) {
                System.out.println("Cliente criado com sucesso!");
                return persist;
            } else {
                System.out.println("Cliente não foi criado.");
            }
        }
        return null;
    }

    private Bicicleta escolherBicicleta(List<Bicicleta> bicicletas) {
        Object[] bicicletasArray = bicicletas.toArray();
        Bicicleta bicicletaEscolhida = (Bicicleta) JOptionPane.showInputDialog(
                null, "Escolha a bicicleta", "Tipos de bicicleta",
                JOptionPane.QUESTION_MESSAGE, null, bicicletasArray, bicicletasArray[0]);

        return bicicletaEscolhida;
    }

    private void informarPecasBicicleta(Cliente cliente) {
        String[] pecas = {"guidão", "quadro", "selim", "rodas"};
        String informacaoPecas = "Informe as peças da bicicleta na ordem correta (guidão, quadro, selim e rodas):";

        String pecasEscolhidas = (String) JOptionPane.showInputDialog(
                null, informacaoPecas, "Seleção de Peças",
                JOptionPane.QUESTION_MESSAGE, null, pecas, pecas[0]);

        cliente.getBicicletas().get(0).setPecas(pecasEscolhidas);
        System.out.println("Peças da bicicleta registradas com sucesso!");
    }
}
