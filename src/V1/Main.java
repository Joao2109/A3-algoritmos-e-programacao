package V1;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
        	
        	ArrayList<Colaborador> colaboradores = new ArrayList<>();

            JFrame mainFrame = new JFrame("Sistema de Folha de Pagamento");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setSize(640, 450);
            mainFrame.setLocationRelativeTo(null);

            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new GridLayout(7, 1, 10, 10));
            mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            JLabel mainLabel = new JLabel("Sistema de Folha de Pagamento");
            mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
            mainLabel.setFont(new Font("Arial", Font.BOLD, 20));

            JButton cadastrarColaboradorPadraoBtn = new JButton("Cadastrar colaborador padrão");

            JButton cadastrarColaboradorComissionadoBtn = new JButton("Cadastrar colaborador comissionado");

            JButton cadastrarColaboradorProducaoBtn = new JButton("Cadastrar colaborador de produção");

            JButton gerarFolhaPagamentoBtn = new JButton("Gerar folha de pagamento");

            JButton exibirResumoBtn = new JButton("Exibir resumo");

            JButton sairBtn = new JButton("Sair");

            mainPanel.add(mainLabel);
            mainPanel.add(cadastrarColaboradorPadraoBtn);
            mainPanel.add(cadastrarColaboradorComissionadoBtn);
            mainPanel.add(cadastrarColaboradorProducaoBtn);
            mainPanel.add(gerarFolhaPagamentoBtn);
            mainPanel.add(exibirResumoBtn);
            mainPanel.add(sairBtn);

            mainFrame.add(mainPanel);
            mainFrame.setVisible(true);

            sairBtn.addActionListener(e -> {
            	mainFrame.dispose();
                System.exit(0);
            });

            cadastrarColaboradorPadraoBtn.addActionListener(e -> {

                    JFrame addColaboradorPadraoFrame = new JFrame("Cadastrar colaborador padrão");
                    addColaboradorPadraoFrame.setSize(640, 450);
                    addColaboradorPadraoFrame.setLocationRelativeTo(null);
                    addColaboradorPadraoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    JPanel addColaboradorPadraoPanel = new JPanel();
                    addColaboradorPadraoPanel.setLayout(new GridLayout(6, 1, 10, 10));
                    addColaboradorPadraoPanel.setBorder(
                        BorderFactory.createEmptyBorder(20, 20, 20, 20)
                    );

                    JLabel addColaboradorPadraoLabel =
                        new JLabel("Cadastrar colaborador padrão");
                    addColaboradorPadraoLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    addColaboradorPadraoLabel.setFont(
                        new Font("Arial", Font.BOLD, 20)
                    );

                    JLabel addColaboradorPadraoMatriculaLabel =
                        new JLabel("Matrícula do colaborador");
                    addColaboradorPadraoMatriculaLabel.setHorizontalAlignment(
                        SwingConstants.CENTER
                    );

                    JLabel addColaboradorPadraoNomeLabel =
                        new JLabel("Nome do colaborador");
                    addColaboradorPadraoNomeLabel.setHorizontalAlignment(
                        SwingConstants.CENTER
                    );

                    JTextField addColaboradorPadraoMatriculaTextField =
                        new JTextField();

                    JTextField addColaboradorPadraoNomeTextField =
                        new JTextField();

                    JButton addColaboradorPadraoBtn =
                        new JButton("Cadastrar colaborador");

                    addColaboradorPadraoPanel.add(addColaboradorPadraoLabel);
                    addColaboradorPadraoPanel.add(addColaboradorPadraoMatriculaLabel);
                    addColaboradorPadraoPanel.add(addColaboradorPadraoMatriculaTextField);
                    addColaboradorPadraoPanel.add(addColaboradorPadraoNomeLabel);
                    addColaboradorPadraoPanel.add(addColaboradorPadraoNomeTextField);
                    addColaboradorPadraoPanel.add(addColaboradorPadraoBtn);

                    addColaboradorPadraoFrame.add(addColaboradorPadraoPanel);

                    addColaboradorPadraoBtn.addActionListener(ev -> {
                        try {
                            String matricula =
                                addColaboradorPadraoMatriculaTextField.getText().trim();
                            String nome =
                                addColaboradorPadraoNomeTextField.getText().trim();

                            if (matricula.isEmpty() || nome.isEmpty()) {
                                JOptionPane.showMessageDialog(
                                    addColaboradorPadraoFrame,
                                    "Preencha a matrícula e o nome do colaborador.",
                                    "Atenção",
                                    JOptionPane.WARNING_MESSAGE
                                );
                                return;
                            }

                            Colaborador colaborador = new ColaboradorPadrao();

                            colaborador.setMatricula(matricula);
                            colaborador.setNome(nome);

                            colaboradores.add(colaborador);

                            JOptionPane.showMessageDialog(
                                addColaboradorPadraoFrame,
                                "Colaborador cadastrado com sucesso!",
                                "Sucesso",
                                JOptionPane.INFORMATION_MESSAGE
                            );

                            addColaboradorPadraoFrame.dispose();

                        } catch (Exception ex) {
                            ex.printStackTrace();

                            JOptionPane.showMessageDialog(
                                addColaboradorPadraoFrame,
                                "Erro ao cadastrar o colaborador.",
                                "Erro",
                                JOptionPane.ERROR_MESSAGE
                            );
                        }
                    });

                    addColaboradorPadraoFrame.setVisible(true);
            });

            cadastrarColaboradorComissionadoBtn.addActionListener(e -> {
                JOptionPane.showMessageDialog(
                		mainFrame,
                        "Cadastro de colaborador comissionado"
                );
            });

            cadastrarColaboradorProducaoBtn.addActionListener(e -> {
                JOptionPane.showMessageDialog(
                		mainFrame,
                        "Cadastro de colaborador de produção"
                );
            });

            gerarFolhaPagamentoBtn.addActionListener(e -> {
                JOptionPane.showMessageDialog(
                		mainFrame,
                        "Gerando folha de pagamento..."
                );
            });

            exibirResumoBtn.addActionListener(e -> {
                JOptionPane.showMessageDialog(
                		mainFrame,
                        "Exibindo resumo..."
                );
            });
        });
    }
}
