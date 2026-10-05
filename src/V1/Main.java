package V1;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
        	
        	ArrayList<Colaborador> colaboradores = new ArrayList<>();

            JFrame frame = new JFrame("Sistema de Folha de Pagamento");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(640, 450);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(7, 1, 10, 10));
            panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            JLabel label = new JLabel("Sistema de Folha de Pagamento");
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 20));

            JButton cadastrarColaboradorPadraoBtn = new JButton("Cadastrar colaborador padrão");

            JButton cadastrarColaboradorComissionadoBtn = new JButton("Cadastrar colaborador comissionado");

            JButton cadastrarColaboradorProducaoBtn = new JButton("Cadastrar colaborador de produção");

            JButton gerarFolhaPagamentoBtn = new JButton("Gerar folha de pagamento");

            JButton exibirResumoBtn = new JButton("Exibir resumo");

            JButton sairBtn = new JButton("Sair");

            panel.add(label);
            panel.add(cadastrarColaboradorPadraoBtn);
            panel.add(cadastrarColaboradorComissionadoBtn);
            panel.add(cadastrarColaboradorProducaoBtn);
            panel.add(gerarFolhaPagamentoBtn);
            panel.add(exibirResumoBtn);
            panel.add(sairBtn);

            frame.add(panel);
            frame.setVisible(true);

            sairBtn.addActionListener(e -> {
                frame.dispose();
                System.exit(0);
            });

            cadastrarColaboradorPadraoBtn.addActionListener(e -> {
            	SwingUtilities.invokeLater(() -> {
            	JFrame addColaboradorPadrao = new JFrame();
            	addColaboradorPadrao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	addColaboradorPadrao.setSize(640, 450);
            	addColaboradorPadrao.setLocationRelativeTo(null);
            	addColaboradorPadrao.setVisible(true);
            	});
            });

            cadastrarColaboradorComissionadoBtn.addActionListener(e -> {
                JOptionPane.showMessageDialog(
                        frame,
                        "Cadastro de colaborador comissionado"
                );
            });

            cadastrarColaboradorProducaoBtn.addActionListener(e -> {
                JOptionPane.showMessageDialog(
                        frame,
                        "Cadastro de colaborador de produção"
                );
            });

            gerarFolhaPagamentoBtn.addActionListener(e -> {
                JOptionPane.showMessageDialog(
                        frame,
                        "Gerando folha de pagamento..."
                );
            });

            exibirResumoBtn.addActionListener(e -> {
                JOptionPane.showMessageDialog(
                        frame,
                        "Exibindo resumo..."
                );
            });
        });
    }
}
