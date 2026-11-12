package V1;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Main {
	private static JPanel renderPanel (Component[] components, int vSize, int hSize) {
		JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(vSize, hSize, 5, 5));
        panel.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
            );
		for (int i = 0; i< components.length; i++) {
			panel.add(components[i]);
		}
		return panel;
	}
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
        	
        	ArrayList<Colaborador> colaboradores = new ArrayList<>();

            JFrame mainFrame = new JFrame("Sistema de Folha de Pagamento");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setSize(640, 350);
            mainFrame.setLocationRelativeTo(null);

            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new GridLayout(7, 1, 5, 5));
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
                    cadastrarColaboradorPadraoFrame.setSize(640, 315);
                    cadastrarColaboradorPadraoFrame.setLocationRelativeTo(null);
                    cadastrarColaboradorPadraoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    JLabel cadastrarColaboradorPadraoLabel =
                        new JLabel("Cadastrar colaborador padrão", SwingConstants.CENTER);
                    cadastrarColaboradorPadraoLabel.setFont(
                        new Font("Arial", Font.BOLD, 20)
                    );

                    JTextField cadastrarColaboradorPadraoMatriculaTextField =
                        new JTextField();

                    JTextField cadastrarColaboradorPadraoNomeTextField =
                        new JTextField();

                    JButton addColaboradorPadraoBtn =
                        new JButton("Cadastrar colaborador");
                    
                    Component[] cadastrarColaboradorPadraoComponents = {
                    	cadastrarColaboradorPadraoLabel,
                    	new JLabel("Matrícula do colaborador", SwingConstants.CENTER),
                    	cadastrarColaboradorPadraoMatriculaTextField,
                    	new JLabel("Nome do colaborador", SwingConstants.CENTER),
                    	cadastrarColaboradorPadraoNomeTextField,
                    	addColaboradorPadraoBtn
                    };
                    
                    cadastrarColaboradorPadraoFrame.add(renderPanel(cadastrarColaboradorPadraoComponents, 6, 1));

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
                cadastrarColaboradorComissionadoFrame.setSize(640, 455);
                cadastrarColaboradorComissionadoFrame.setLocationRelativeTo(null);
                cadastrarColaboradorComissionadoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JLabel cadastrarColaboradorComissionadoLabel =
                    new JLabel("Cadastrar colaborador comissionado", SwingConstants.CENTER);
                cadastrarColaboradorComissionadoLabel.setFont(
                    new Font("Arial", Font.BOLD, 20)
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
                
                Component[] cadastrarColaboradorComissionadoComponents = {
                		cadastrarColaboradorComissionadoLabel,
                    	new JLabel("Matrícula do colaborador", SwingConstants.CENTER),
                    	cadastrarColaboradorComissionadoMatriculaTextField,
                    	new JLabel("Nome do colaborador", SwingConstants.CENTER),
                    	cadastrarColaboradorComissionadoNomeTextField,
                    	new JLabel("Valor das vendas do colaborador", SwingConstants.CENTER),
                    	cadastrarColaboradorComissionadoValorVendasTextField,
                    	new JLabel("Percentual de comissão do colaborador", SwingConstants.CENTER),
                    	cadastrarColaboradorComissionadoPercentualComissaoTextField,
                    	addColaboradorComissionadoBtn
                    };

                cadastrarColaboradorComissionadoFrame.add(renderPanel(cadastrarColaboradorComissionadoComponents, 10, 1));

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

                JFrame cadastrarColaboradorProducaoFrame = new JFrame("Sistema de Folha de Pagamento");
                cadastrarColaboradorProducaoFrame.setSize(640, 455);
                cadastrarColaboradorProducaoFrame.setLocationRelativeTo(null);
                cadastrarColaboradorProducaoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JPanel cadastrarColaboradorProducaoPanel = new JPanel();
                cadastrarColaboradorProducaoPanel.setLayout(new GridLayout(10, 1, 5, 5));
                cadastrarColaboradorProducaoPanel.setBorder(
                    BorderFactory.createEmptyBorder(20, 20, 20, 20)
                );

                JLabel cadastrarColaboradorProducaoLabel =
                    new JLabel("Cadastrar colaborador comissionado");
                cadastrarColaboradorProducaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
                cadastrarColaboradorProducaoLabel.setFont(
                    new Font("Arial", Font.BOLD, 20)
                );

                JTextField cadastrarColaboradorProducaoMatriculaTextField =
                    new JTextField();

                JTextField cadastrarColaboradorProducaoNomeTextField =
                    new JTextField();

                JTextField cadastrarColaboradorProducaoQuantidadePecasTextField =
                    new JTextField();

                JTextField cadastrarColaboradorProducaoValorPorPecaTextField =
                    new JTextField();

                JButton addColaboradorProducaoBtn =
                    new JButton("Cadastrar colaborador");
                
                Component[] cadastrarColaboradorProducaoComponents = {
                		cadastrarColaboradorProducaoLabel,
                		new JLabel("Matrícula do colaborador", SwingConstants.CENTER),
                		cadastrarColaboradorProducaoMatriculaTextField,
                		new JLabel("Nome do colaborador", SwingConstants.CENTER),
                		cadastrarColaboradorProducaoNomeTextField,
                		new JLabel("Quantidade de peças produzidas pelo colaborador", SwingConstants.CENTER),
                		cadastrarColaboradorProducaoQuantidadePecasTextField,
                		new JLabel("Valor por peça produzida", SwingConstants.CENTER),
                		cadastrarColaboradorProducaoValorPorPecaTextField,
                		addColaboradorProducaoBtn
                };

                cadastrarColaboradorProducaoFrame.add(renderPanel(cadastrarColaboradorProducaoComponents, 10, 1));

                addColaboradorProducaoBtn.addActionListener(ev -> {
                    try {
                        String matricula =
                        		cadastrarColaboradorProducaoMatriculaTextField.getText().trim();
                        String nome =
                        		cadastrarColaboradorProducaoNomeTextField.getText().trim();
                        String quantidadePecas =
                        		cadastrarColaboradorProducaoQuantidadePecasTextField.getText().trim();
                        String valorPorPeca =
                        		cadastrarColaboradorProducaoValorPorPecaTextField.getText().trim();

                        if (matricula.isEmpty() || nome.isEmpty() || quantidadePecas.isEmpty() || quantidadePecas.isEmpty()) {
                            JOptionPane.showMessageDialog(
                            		cadastrarColaboradorProducaoFrame,
                                "Preencha todos os campos.",
                                "Atenção",
                                JOptionPane.WARNING_MESSAGE
                            );
                            return;
                        }

                        ColaboradorProducao colaborador = new ColaboradorProducao();

                        colaborador.setMatricula(matricula);
                        colaborador.setNome(nome);
                        colaborador.setQuantidadePecas(Integer.parseInt(quantidadePecas));
                        colaborador.setValorPorPeca(Float.parseFloat(valorPorPeca.replace(",", ".")));

                        colaboradores.add(colaborador);

                        JOptionPane.showMessageDialog(
                        		cadastrarColaboradorProducaoFrame,
                            "Colaborador cadastrado com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE
                        );

                        cadastrarColaboradorProducaoFrame.dispose();

                    } catch (Exception ex) {
                        ex.printStackTrace();

                        JOptionPane.showMessageDialog(
                        		cadastrarColaboradorProducaoFrame,
                            "Erro ao cadastrar o colaborador.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                });

                cadastrarColaboradorProducaoFrame.setVisible(true);
            });

            gerarFolhaPagamentoBtn.addActionListener(e -> {
            	if (colaboradores.isEmpty()) {
                    JOptionPane.showMessageDialog(
                    		mainFrame,
                            "Nenhum colaborador cadastrado."
                    );
            	}
            	
            	JFrame
            	gerarFolhaPagamentoFrame = new JFrame("Folha de pagamento");
            	gerarFolhaPagamentoFrame.setSize(640, 350);
            	gerarFolhaPagamentoFrame.setLocationRelativeTo(null);
            	gerarFolhaPagamentoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            	gerarFolhaPagamentoFrame.setLayout(new BorderLayout());

            	JPanel gerarFolhaPagamentoHeaderPanel = new JPanel();

            	JLabel gerarFolhaPagamentoHeaderLabel =
            	    new JLabel("Folha de pagamento");
            	gerarFolhaPagamentoHeaderPanel.add(gerarFolhaPagamentoHeaderLabel);

            	JPanel gerarFolhaPagamentoMainPanel = new JPanel();
            	gerarFolhaPagamentoMainPanel.setLayout(
            	    new BoxLayout(gerarFolhaPagamentoMainPanel, BoxLayout.Y_AXIS)
            	);

            	JScrollPane gerarFolhaPagamentoMainScrollPane =
            	    new JScrollPane(gerarFolhaPagamentoMainPanel);
            	gerarFolhaPagamentoMainScrollPane.setVerticalScrollBarPolicy(
            	    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
            	);
            	gerarFolhaPagamentoMainScrollPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
                
            	colaboradores.forEach(colaborador -> {
            		String tipo = colaborador.getClass().getTypeName();
            		
            		JPanel colaboradorPanel = new JPanel();
            		colaboradorPanel.add(new JLabel("Colaborador:", SwingConstants.CENTER));
            		colaboradorPanel.setLayout(
                    	    new BoxLayout(colaboradorPanel, BoxLayout.Y_AXIS)
                    	);
            		colaboradorPanel.setBorder(
                            BorderFactory.createEmptyBorder(20, 20, 20, 20)
                        );
            		
            		JPanel colaboradorInnerPanel1 = new JPanel();
            		colaboradorInnerPanel1.setLayout(new BoxLayout(colaboradorInnerPanel1, BoxLayout.X_AXIS));
            		JPanel colaboradorInnerPanel2 = new JPanel();
            		colaboradorInnerPanel2.setLayout(new BoxLayout(colaboradorInnerPanel2, BoxLayout.X_AXIS));

            		colaboradorInnerPanel1.add(new JLabel("Matrícula: " + colaborador.getMatricula()));
            		colaboradorInnerPanel1.add(Box.createHorizontalGlue());
            		colaboradorInnerPanel1.add(new JLabel("Nome: " + colaborador.getNome()));
            		colaboradorInnerPanel1.add(Box.createHorizontalGlue());
            		colaboradorInnerPanel1.add(new JLabel("Salário base: " + colaborador.getSalarioBase()));
            		
            		System.out.println("Colaborador:\nMatrícula: " + colaborador.getMatricula() + "\tNome: " + colaborador.getNome() + "\tSalário base: " + colaborador.getSalarioBase());
            		switch (tipo) {
        			case "V1.ColaboradorComissionado":
        				colaboradorInnerPanel2.add(new JLabel("Tipo: Comissionado"));
                		colaboradorInnerPanel2.add(Box.createHorizontalGlue());
        				colaboradorInnerPanel2.add(new JLabel("Comissão: " + ((ColaboradorComissionado) colaborador).calcularComissao()));
                		colaboradorInnerPanel2.add(Box.createHorizontalGlue());
        				colaboradorInnerPanel2.add(new JLabel("Salário final: " + ((ColaboradorComissionado) colaborador).calcularSalarioFinal()));
        				System.out.println("Tipo: Comissionado\tComissão: " + ((ColaboradorComissionado) colaborador).calcularComissao() + "\tSalário final: " + ((ColaboradorComissionado) colaborador).calcularSalarioFinal() + "\n");
        				break;
        			case "V1.ColaboradorProducao":
        				colaboradorInnerPanel2.add(new JLabel("Tipo: Produção"));
                		colaboradorInnerPanel2.add(Box.createHorizontalGlue());
        				colaboradorInnerPanel2.add(new JLabel("Produtividade: " + ((ColaboradorProducao) colaborador).calcularProdutividade()));
                		colaboradorInnerPanel2.add(Box.createHorizontalGlue());
        				colaboradorInnerPanel2.add(new JLabel("Salário final: " + ((ColaboradorProducao) colaborador).calcularSalarioFinal()));
        				System.out.println("Tipo: Produção\tProdutvidade: " + ((ColaboradorProducao) colaborador).calcularProdutividade() + "\tSalário final: " + ((ColaboradorProducao) colaborador).calcularSalarioFinal() + "\n");
        				break;
            		default:
            			colaboradorInnerPanel2.add(new JLabel("Tipo: Padrão"));
            			break;
            		}
            		
            		colaboradorPanel.add(colaboradorInnerPanel1);
            		colaboradorPanel.add(colaboradorInnerPanel2);
            		gerarFolhaPagamentoMainPanel.add(colaboradorPanel);
            	});

            	gerarFolhaPagamentoFrame.add(
            	    gerarFolhaPagamentoHeaderPanel,
            	    BorderLayout.NORTH
            	);
            	gerarFolhaPagamentoFrame.add(
            	    gerarFolhaPagamentoMainScrollPane,
            	    BorderLayout.CENTER
            	);
            	gerarFolhaPagamentoFrame.setVisible(true);
            });

            exibirResumoBtn.addActionListener(e -> {
                int quantidadeColaboradores = colaboradores.size();

                if (quantidadeColaboradores <= 0) {
                    JOptionPane.showMessageDialog(
                        mainFrame,
                        "Nenhum colaborador cadastrado."
                    );
                    return;
                }

                float somaSalarios = 0;

                for (Colaborador colaborador : colaboradores) {
                    somaSalarios += colaborador.calcularSalarioFinal();
                }

                float mediaSalarios = somaSalarios / quantidadeColaboradores;

                JFrame exibirResumoFrame =
                    new JFrame("Sistema de Folha de Pagamento");
                exibirResumoFrame.setSize(640, 215);
                exibirResumoFrame.setLocationRelativeTo(mainFrame);
                exibirResumoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JPanel exibirResumoPanel = new JPanel(
                    new BorderLayout(10, 15)
                );

                exibirResumoPanel.setBorder(
                    BorderFactory.createEmptyBorder(20, 20, 20, 20)
                );

                JLabel exibirResumoLabel = new JLabel(
                    "Resumo da folha",
                    SwingConstants.CENTER
                );

                exibirResumoLabel.setFont(
                    new Font("Arial", Font.BOLD, 20)
                );

                JPanel exibirResumoContentPanel = new JPanel(
                    new GridLayout(3, 1, 5, 5)
                );

                JLabel exibirResumoQuantidadeLabel = new JLabel(
                    "Quantidade de colaboradores: "
                    + quantidadeColaboradores,
                    SwingConstants.CENTER
                );

                JLabel exibirResumoSomaLabel = new JLabel(
                    String.format(
                        java.util.Locale.forLanguageTag("pt-BR"),
                        "Soma dos salários: R$ %.2f",
                        somaSalarios
                    ),
                    SwingConstants.CENTER
                );

                JLabel exibirResumoMediaLabel = new JLabel(
                    String.format(
                        java.util.Locale.forLanguageTag("pt-BR"),
                        "Média dos salários: R$ %.2f",
                        mediaSalarios
                    ),
                    SwingConstants.CENTER
                );

                exibirResumoContentPanel.add(exibirResumoQuantidadeLabel);
                exibirResumoContentPanel.add(exibirResumoSomaLabel);
                exibirResumoContentPanel.add(exibirResumoMediaLabel);

                exibirResumoPanel.add(
                    exibirResumoLabel,
                    BorderLayout.NORTH
                );

                exibirResumoPanel.add(
                    exibirResumoContentPanel,
                    BorderLayout.CENTER
                );

                exibirResumoFrame.add(exibirResumoPanel);

                exibirResumoFrame.setVisible(true);
            });
        });
    }
}
