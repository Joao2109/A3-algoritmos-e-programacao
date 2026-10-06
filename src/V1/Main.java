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

                    JFrame cadastrarColaboradorPadraoFrame = new JFrame("Cadastrar colaborador padrão");
                    cadastrarColaboradorPadraoFrame.setSize(640, 450);
                    cadastrarColaboradorPadraoFrame.setLocationRelativeTo(null);
                    cadastrarColaboradorPadraoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    JPanel cadastrarColaboradorPadraoPanel = new JPanel();
                    cadastrarColaboradorPadraoPanel.setLayout(new GridLayout(6, 1, 10, 10));
                    cadastrarColaboradorPadraoPanel.setBorder(
                        BorderFactory.createEmptyBorder(20, 20, 20, 20)
                    );

                    JLabel cadastrarColaboradorPadraoLabel =
                        new JLabel("Cadastrar colaborador padrão");
                    cadastrarColaboradorPadraoLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    cadastrarColaboradorPadraoLabel.setFont(
                        new Font("Arial", Font.BOLD, 20)
                    );

                    JLabel cadastrarColaboradorPadraoMatriculaLabel =
                        new JLabel("Matrícula do colaborador");
                    cadastrarColaboradorPadraoMatriculaLabel.setHorizontalAlignment(
                        SwingConstants.CENTER
                    );

                    JLabel cadastrarColaboradorPadraoNomeLabel =
                        new JLabel("Nome do colaborador");
                    cadastrarColaboradorPadraoNomeLabel.setHorizontalAlignment(
                        SwingConstants.CENTER
                    );

                    JTextField cadastrarColaboradorPadraoMatriculaTextField =
                        new JTextField();

                    JTextField cadastrarColaboradorPadraoNomeTextField =
                        new JTextField();

                    JButton addColaboradorPadraoBtn =
                        new JButton("Cadastrar colaborador");

                    cadastrarColaboradorPadraoPanel.add(cadastrarColaboradorPadraoLabel);
                    cadastrarColaboradorPadraoPanel.add(cadastrarColaboradorPadraoMatriculaLabel);
                    cadastrarColaboradorPadraoPanel.add(cadastrarColaboradorPadraoMatriculaTextField);
                    cadastrarColaboradorPadraoPanel.add(cadastrarColaboradorPadraoNomeLabel);
                    cadastrarColaboradorPadraoPanel.add(cadastrarColaboradorPadraoNomeTextField);
                    cadastrarColaboradorPadraoPanel.add(addColaboradorPadraoBtn);

                    cadastrarColaboradorPadraoFrame.add(cadastrarColaboradorPadraoPanel);

                    addColaboradorPadraoBtn.addActionListener(ev -> {
                        try {
                            String matricula =
                            		cadastrarColaboradorPadraoMatriculaTextField.getText().trim();
                            String nome =
                            		cadastrarColaboradorPadraoNomeTextField.getText().trim();

                            if (matricula.isEmpty() || nome.isEmpty()) {
                                JOptionPane.showMessageDialog(
                                		cadastrarColaboradorPadraoFrame,
                                    "Preencha todos os campos.",
                                    "Atenção",
                                    JOptionPane.WARNING_MESSAGE
                                );
                                return;
                            }

                            ColaboradorPadrao colaborador = new ColaboradorPadrao();

                            colaborador.setMatricula(matricula);
                            colaborador.setNome(nome);

                            colaboradores.add(colaborador);

                            JOptionPane.showMessageDialog(
                            		cadastrarColaboradorPadraoFrame,
                                "Colaborador cadastrado com sucesso!",
                                "Sucesso",
                                JOptionPane.INFORMATION_MESSAGE
                            );

                            cadastrarColaboradorPadraoFrame.dispose();

                        } catch (Exception ex) {
                            ex.printStackTrace();

                            JOptionPane.showMessageDialog(
                            		cadastrarColaboradorPadraoFrame,
                                "Erro ao cadastrar o colaborador.",
                                "Erro",
                                JOptionPane.ERROR_MESSAGE
                            );
                        }
                    });

                    cadastrarColaboradorPadraoFrame.setVisible(true);
            });

            cadastrarColaboradorComissionadoBtn.addActionListener(e -> {

                JFrame cadastrarColaboradorComissionadoFrame = new JFrame("Cadastrar colaborador padrão");
                cadastrarColaboradorComissionadoFrame.setSize(640, 450);
                cadastrarColaboradorComissionadoFrame.setLocationRelativeTo(null);
                cadastrarColaboradorComissionadoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JPanel cadastrarColaboradorComissionadoPanel = new JPanel();
                cadastrarColaboradorComissionadoPanel.setLayout(new GridLayout(10, 1, 10, 10));
                cadastrarColaboradorComissionadoPanel.setBorder(
                    BorderFactory.createEmptyBorder(20, 20, 20, 20)
                );

                JLabel cadastrarColaboradorComissionadoLabel =
                    new JLabel("Cadastrar colaborador comissionado");
                cadastrarColaboradorComissionadoLabel.setHorizontalAlignment(SwingConstants.CENTER);
                cadastrarColaboradorComissionadoLabel.setFont(
                    new Font("Arial", Font.BOLD, 20)
                );

                JLabel cadastrarColaboradorComissionadoMatriculaLabel =
                    new JLabel("Matrícula do colaborador");
                cadastrarColaboradorComissionadoMatriculaLabel.setHorizontalAlignment(
                    SwingConstants.CENTER
                );

                JLabel cadastrarColaboradorComissionadoNomeLabel =
                    new JLabel("Nome do colaborador");
                cadastrarColaboradorComissionadoNomeLabel.setHorizontalAlignment(
                    SwingConstants.CENTER
                );

                JLabel cadastrarColaboradorComissionadoValorVendasLabel =
                    new JLabel("Valor das vendas do colaborador");
                cadastrarColaboradorComissionadoValorVendasLabel.setHorizontalAlignment(
                    SwingConstants.CENTER
                );

                JLabel cadastrarColaboradorComissionadoPercentualComissaoLabel =
                    new JLabel("Percentual de comissão do colaborador");
                cadastrarColaboradorComissionadoPercentualComissaoLabel.setHorizontalAlignment(
                    SwingConstants.CENTER
                );

                JTextField cadastrarColaboradorComissionadoMatriculaTextField =
                    new JTextField();

                JTextField cadastrarColaboradorComissionadoNomeTextField =
                    new JTextField();

                JTextField cadastrarColaboradorComissionadoValorVendasTextField =
                    new JTextField();

                JTextField cadastrarColaboradorComissionadoPercentualComissaoTextField =
                    new JTextField();

                JButton addColaboradorComissionadoBtn =
                    new JButton("Cadastrar colaborador");

                cadastrarColaboradorComissionadoPanel.add(cadastrarColaboradorComissionadoLabel);
                cadastrarColaboradorComissionadoPanel.add(cadastrarColaboradorComissionadoMatriculaLabel);
                cadastrarColaboradorComissionadoPanel.add(cadastrarColaboradorComissionadoMatriculaTextField);
                cadastrarColaboradorComissionadoPanel.add(cadastrarColaboradorComissionadoNomeLabel);
                cadastrarColaboradorComissionadoPanel.add(cadastrarColaboradorComissionadoNomeTextField);
                cadastrarColaboradorComissionadoPanel.add(cadastrarColaboradorComissionadoValorVendasLabel);
                cadastrarColaboradorComissionadoPanel.add(cadastrarColaboradorComissionadoValorVendasTextField);
                cadastrarColaboradorComissionadoPanel.add(cadastrarColaboradorComissionadoPercentualComissaoLabel);
                cadastrarColaboradorComissionadoPanel.add(cadastrarColaboradorComissionadoPercentualComissaoTextField);
                cadastrarColaboradorComissionadoPanel.add(addColaboradorComissionadoBtn);

                cadastrarColaboradorComissionadoFrame.add(cadastrarColaboradorComissionadoPanel);

                addColaboradorComissionadoBtn.addActionListener(ev -> {
                    try {
                        String matricula =
                        		cadastrarColaboradorComissionadoMatriculaTextField.getText().trim();
                        String nome =
                        		cadastrarColaboradorComissionadoNomeTextField.getText().trim();
                        String valorVendas =
                        		cadastrarColaboradorComissionadoValorVendasTextField.getText().trim();
                        String percentualComissao =
                        		cadastrarColaboradorComissionadoPercentualComissaoTextField.getText().trim();

                        if (matricula.isEmpty() || nome.isEmpty() || valorVendas.isEmpty() || percentualComissao.isEmpty()) {
                            JOptionPane.showMessageDialog(
                            		cadastrarColaboradorComissionadoFrame,
                                "Preencha todos os campos.",
                                "Atenção",
                                JOptionPane.WARNING_MESSAGE
                            );
                            return;
                        }

                        ColaboradorComissionado colaborador = new ColaboradorComissionado();

                        colaborador.setMatricula(matricula);
                        colaborador.setNome(nome);
                        colaborador.setValorVendas(Integer.parseInt(valorVendas));
                        colaborador.setPercentualComissao(Integer.parseInt(percentualComissao));

                        colaboradores.add(colaborador);

                        JOptionPane.showMessageDialog(
                        		cadastrarColaboradorComissionadoFrame,
                            "Colaborador cadastrado com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE
                        );

                        cadastrarColaboradorComissionadoFrame.dispose();

                    } catch (Exception ex) {
                        ex.printStackTrace();

                        JOptionPane.showMessageDialog(
                        		cadastrarColaboradorComissionadoFrame,
                            "Erro ao cadastrar o colaborador.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                });

                cadastrarColaboradorComissionadoFrame.setVisible(true);
            });

            cadastrarColaboradorProducaoBtn.addActionListener(e -> {
                JOptionPane.showMessageDialog(
                		mainFrame,
                        "Cadastro de colaborador de produção"
                );
            });

            gerarFolhaPagamentoBtn.addActionListener(e -> {
            	if (colaboradores.isEmpty()) {
            		System.out.println("Nenhum colaborador cadastrado");
            		return;
            	}
            	colaboradores.forEach(colaborador -> {
            		String tipo = colaborador.getClass().getTypeName();
            		System.out.println("Colaborador:\nMatrícula: " + colaborador.getMatricula() + "\tNome: " + colaborador.getNome() + "\tSalário base: " + colaborador.getSalarioBase());
            		switch (tipo) {
        			case "V1.ColaboradorComissionado":
        				System.out.println("Tipo: Comissionado\tComissão: " + ((ColaboradorComissionado) colaborador).calcularComissao() + "\tSalário final: " + ((ColaboradorComissionado) colaborador).calcularSalarioFinal() + "\n");
        				break;
        			case "V1.ColaboradorProducao":
        				System.out.println("Tipo: Comissionado\tComissão: " + ((ColaboradorProducao) colaborador).calcularProdutividade() + "\tSalário final: " + ((ColaboradorProducao) colaborador).calcularSalarioFinal() + "\n");
        				break;
            			default:
            				System.out.println("Tipo: Padrão\n");
            				break;
            		}
            	});
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
