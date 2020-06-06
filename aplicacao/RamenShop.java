package aplicacao;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JFileChooser;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import fila.AtualizadorFila;
import fila.FilaDeEspera;
import modelos.*;
import modelos.acrescimos.bebidas.*;
import modelos.acrescimos.carnes.*;
import modelos.acrescimos.extras.*;

import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

public class RamenShop {
	protected JFrame frmRamenshop;
	private String balancoFinal = "";
	private JTextField textFieldNumeroDoPedido;
	protected Ramen ramen;
	protected File path;
	private JTextField textFieldDiretorio;
	public static JTextPane textAreaListaDeEspera;

	public RamenShop() {
		initialize();
	}

	private void initialize() {
		

		Thread atualizaLista = new Thread(new AtualizadorFila());
		atualizaLista.start();
		
		frmRamenshop = new JFrame();
		frmRamenshop.setTitle("RamenShop 1.0");
		frmRamenshop.setResizable(false);
		frmRamenshop.setBounds(100, 100, 800, 700);
		frmRamenshop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRamenshop.getContentPane().setLayout(null);
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fileChooser.setApproveButtonText("Selecionar");
		
		JLabel lblRamenShop = new JLabel("Ramen Shop");
		lblRamenShop.setBounds(266, 0, 241, 50);
		frmRamenshop.getContentPane().add(lblRamenShop);
		lblRamenShop.setFont(new Font("Dialog", Font.BOLD, 24));
		lblRamenShop.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblCardapio = new JLabel("CARDAPIO");
		lblCardapio.setBounds(244, 12, 288, 85);
		frmRamenshop.getContentPane().add(lblCardapio);
		lblCardapio.setFont(new Font("FreeMono", Font.BOLD, 52));
		lblCardapio.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 83, 434, 415);
		frmRamenshop.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panelTamanho = new JPanel();
		panelTamanho.setBounds(0, 0, 225, 165);
		panelTamanho.setBorder(new LineBorder(UIManager.getColor("Panel.background"), 15));
		panel.add(panelTamanho);
		panelTamanho.setLayout(null);
		
		JLabel lblTamanho = new JLabel("TAMANHO");
		lblTamanho.setBounds(22, 31, 195, 27);
		lblTamanho.setFont(new Font("Dialog", Font.BOLD, 22));
		panelTamanho.add(lblTamanho);
		
		//Declaracao dos botoes de selecao
		JRadioButton rdbtnPequeno = new JRadioButton("PEQUENO 9.90");
		JRadioButton rdbtnMedio = new JRadioButton("MEDIO 12.90");
		JRadioButton rdbtnGrande = new JRadioButton("GRANDE 15.90");
		
		//Acao de selecionar o grande
		rdbtnGrande.setBounds(22, 120, 165, 50);
		panelTamanho.add(rdbtnGrande);
		rdbtnGrande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new RamenGrande();
				rdbtnMedio.setSelected(false);
				rdbtnPequeno.setSelected(false);
			}
		});
		
		//Acao de selecionar o medio
		rdbtnMedio.setBounds(22, 93, 165, 23);
		panelTamanho.add(rdbtnMedio);
		rdbtnMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new RamenMedio();
				rdbtnPequeno.setSelected(false);
				rdbtnGrande.setSelected(false);
			}
		});
		
		//Acao de selecionar o pequeno
		rdbtnPequeno.setBounds(22, 66, 165, 23);
		panelTamanho.add(rdbtnPequeno);
		rdbtnPequeno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new RamenPequeno();
				rdbtnMedio.setSelected(false);
				rdbtnGrande.setSelected(false);
			}
		});
		
		JPanel panelCarne = new JPanel();
		panelCarne.setBounds(213, 0, 225, 165);
		panelCarne.setBorder(new LineBorder(UIManager.getColor("Panel.background"), 15));
		panel.add(panelCarne);
		panelCarne.setLayout(null);
		
		JLabel lblCarne = new JLabel("CARNE");
		lblCarne.setBounds(15, 15, 97, 57);
		lblCarne.setFont(new Font("Dialog", Font.BOLD, 22));
		panelCarne.add(lblCarne);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setBounds(112, 15, 97, 57);
		panelCarne.add(horizontalBox_1);
		
		JLabel lblPorco = new JLabel("PORCO +5.90");
		lblPorco.setBounds(15, 72, 97, 26);
		panelCarne.add(lblPorco);
		
		JButton btnAdicionaPorco = new JButton("+");
		btnAdicionaPorco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new CarnePorco(ramen);
				System.out.println("Adicionado Carne: Porco");
			}
		});
		btnAdicionaPorco.setBounds(165, 72, 44, 26);
		panelCarne.add(btnAdicionaPorco);
		
		JLabel lblBoi = new JLabel("BOI +7.90");
		lblBoi.setBounds(15, 98, 97, 31);
		panelCarne.add(lblBoi);
		
		JButton btnAdicionaBoi = new JButton("+");
		btnAdicionaBoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new CarneBoi(ramen);
				System.out.println("Adicionado Carne: Boi");
			}
		});
		btnAdicionaBoi.setBounds(165, 100, 44, 26);
		panelCarne.add(btnAdicionaBoi);
		
		JLabel lblVegano = new JLabel("VEGANO +3.90");
		lblVegano.setBounds(15, 126, 153, 31);
		panelCarne.add(lblVegano);
		
		JButton btnAdicionaVegano = new JButton("+");
		btnAdicionaVegano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new CarneVegano(ramen);
				System.out.println("Adicionado Carne: Vegano");
			}
		});
		btnAdicionaVegano.setBounds(165, 128, 44, 26);
		panelCarne.add(btnAdicionaVegano);
		
		JPanel panelExtras = new JPanel();
		panelExtras.setBounds(0, 164, 225, 259);
		panelExtras.setBorder(new LineBorder(UIManager.getColor("Panel.background"), 15));
		panel.add(panelExtras);
		panelExtras.setLayout(null);
		
		JLabel lblExtra = new JLabel("EXTRA");
		lblExtra.setBounds(15, 17, 97, 32);
		lblExtra.setFont(new Font("Dialog", Font.BOLD, 22));
		panelExtras.add(lblExtra);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setBounds(112, 17, 97, 32);
		panelExtras.add(horizontalBox_2);
		
		JLabel lblCarneExtra = new JLabel("CARNE EXTRA +4.00");
		lblCarneExtra.setBounds(15, 49, 151, 32);
		panelExtras.add(lblCarneExtra);
		
		JButton btnAdicionaCarneExtra = new JButton("+");
		btnAdicionaCarneExtra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new ExtraCarneExtra(ramen);
				System.out.println("Adicionado Extra: Carne Extra");
			}
		});
		btnAdicionaCarneExtra.setBounds(165, 49, 44, 32);
		panelExtras.add(btnAdicionaCarneExtra);
		
		JLabel lblCremeAlho = new JLabel("CREME ALHO +1.50");
		lblCremeAlho.setBounds(15, 81, 151, 32);
		panelExtras.add(lblCremeAlho);
		
		JButton btnAdicionaCremeAlho= new JButton("+");
		btnAdicionaCremeAlho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new ExtraCremeAlho(ramen);
				System.out.println("Adicionado Extra: Creme de Alho");
			}
		});
		btnAdicionaCremeAlho.setBounds(165, 81, 44, 32);
		panelExtras.add(btnAdicionaCremeAlho);
		
		JLabel lblChilli = new JLabel("CHILLI +2.50");
		lblChilli.setBounds(15, 113, 151, 32);
		panelExtras.add(lblChilli);
		
		JButton btnAdicionaChilli = new JButton("+");
		btnAdicionaChilli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new ExtraChilli(ramen);
				System.out.println("Adicionado Extra: Chilli");
			}
		});
		btnAdicionaChilli.setBounds(165, 113, 44, 32);
		panelExtras.add(btnAdicionaChilli);
		
		JLabel lblCroutons = new JLabel("CROUTONS +2.00");
		lblCroutons.setBounds(15, 145, 151, 32);
		panelExtras.add(lblCroutons);
		
		JButton btnAdicionaCroutons = new JButton("+");
		btnAdicionaCroutons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new ExtraCrouton(ramen);
				System.out.println("Adicionado Extra: Coutons");
			}
		});
		btnAdicionaCroutons.setBounds(165, 145, 44, 32);
		panelExtras.add(btnAdicionaCroutons);
		
		JLabel lblShitake = new JLabel("SHITAKE +6.90");
		lblShitake.setBounds(15, 177, 151, 32);
		panelExtras.add(lblShitake);
		
		JButton btnAdicionaShitake = new JButton("+");
		btnAdicionaShitake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new ExtraShitake(ramen);
				System.out.println("Adicionado Extra: Shitake");
			}
		});
		btnAdicionaShitake.setBounds(165, 177, 44, 32);
		panelExtras.add(btnAdicionaShitake);
		
		JLabel lblTofu = new JLabel("TOFU +2.70");
		lblTofu.setBounds(15, 209, 151, 32);
		panelExtras.add(lblTofu);
		
		JButton btnAdicionaTofu = new JButton("+");
		btnAdicionaTofu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new ExtraTofu(ramen);
				System.out.println("Adicionado Extra: Tofu");
			}
		});
		btnAdicionaTofu.setBounds(165, 209, 44, 32);
		panelExtras.add(btnAdicionaTofu);
		
		JPanel panelBebida = new JPanel();
		panelBebida.setBounds(213, 164, 225, 259);
		panelBebida.setBorder(new LineBorder(UIManager.getColor("Panel.background"), 15));
		panel.add(panelBebida);
		panelBebida.setLayout(null);
		
		JLabel lblBebida = new JLabel("BEBIDA");
		lblBebida.setBounds(15, 22, 97, 27);
		lblBebida.setFont(new Font("Dialog", Font.BOLD, 22));
		panelBebida.add(lblBebida);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		horizontalBox_3.setBounds(112, 12, 97, 27);
		panelBebida.add(horizontalBox_3);
		
		JLabel lblRefrigerante = new JLabel("REFRIGERANTE +5.90");
		lblRefrigerante.setBounds(15, 81, 156, 20);
		panelBebida.add(lblRefrigerante);
		
		JButton btnAdicionaRefrigerante = new JButton("+");
		btnAdicionaRefrigerante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new BebidaRefrigerante(ramen);
				System.out.println("Adicionado Bebida: Refrigerante");
			}
		});
		btnAdicionaRefrigerante.setBounds(165, 78, 44, 27);
		panelBebida.add(btnAdicionaRefrigerante);
		
		JLabel lblOCha = new JLabel("O-CHA  +3.90");
		lblOCha.setBounds(15, 111, 156, 20);
		panelBebida.add(lblOCha);
		
		JButton btnAdicionaOCha = new JButton("+");
		btnAdicionaOCha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new BebidaOCha(ramen);
				System.out.println("Adicionado Bebida: O-Cha");
			}
		});
		btnAdicionaOCha.setBounds(165, 108, 44, 27);
		panelBebida.add(btnAdicionaOCha);
		
		JLabel lblKoCha = new JLabel("KO-CHA +0.00");
		lblKoCha.setBounds(15, 130, 156, 39);
		panelBebida.add(lblKoCha);
		
		JButton btnAdicionaKoCha = new JButton("+");
		btnAdicionaKoCha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ramen = new BebidaKoCha(ramen);
				System.out.println("Adicionado Bebida: Ko-cha");
			}
		});
		btnAdicionaKoCha.setBounds(165, 136, 44, 27);
		panelBebida.add(btnAdicionaKoCha);
		
		
		JButton btnPedir = new JButton("Pedir");
		btnPedir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FilaDeEspera.adiciona(new Pedido(ramen));
				ramen = new RamenGrande();
				textAreaListaDeEspera.setText(FilaDeEspera.toText());
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(446, 83, 336, 401);
		frmRamenshop.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textAreaListaDeEspera = new JTextPane();
		textAreaListaDeEspera.setBounds(0, 5, 324, 396);
		panel_1.add(textAreaListaDeEspera);
		btnPedir.setBounds(124, 505, 194, 25);
		frmRamenshop.getContentPane().add(btnPedir);
			
		JButton btnRetirar = new JButton("Retirar");
		btnRetirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					setBalancoFinal(FilaDeEspera.retornaKey(Integer.parseInt(textFieldNumeroDoPedido.getText()))+"\n");
					FilaDeEspera.retirada(Integer.parseInt(textFieldNumeroDoPedido.getText()));
				} catch (Exception e2) {
					System.out.println("Pedido em andamendo!");
				}
			}
		});
		btnRetirar.setBounds(677, 505, 105, 25);
		frmRamenshop.getContentPane().add(btnRetirar);
		
		JButton btnDirBalancoFinal = new JButton("Escolher");
		btnDirBalancoFinal.setBounds(511, 620, 105, 25);
		frmRamenshop.getContentPane().add(btnDirBalancoFinal);
		
		textFieldDiretorio = new JTextField();
		textFieldDiretorio.setBounds(27, 620, 472, 25);
		frmRamenshop.getContentPane().add(textFieldDiretorio);
		textFieldDiretorio.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Archive.write(path.getAbsolutePath()+"//"+"balanco_final.txt",balancoFinal);
			}
		});
		btnSalvar.setBounds(628, 620, 117, 25);
		frmRamenshop.getContentPane().add(btnSalvar);
		
		JLabel lblNewLabel = new JLabel("Onde deseja salvar o balanco geral?");
		lblNewLabel.setBounds(33, 586, 336, 22);
		frmRamenshop.getContentPane().add(lblNewLabel);
		
		textFieldNumeroDoPedido = new JTextField();
		textFieldNumeroDoPedido.setBounds(464, 505, 201, 25);
		frmRamenshop.getContentPane().add(textFieldNumeroDoPedido);
		textFieldNumeroDoPedido.setColumns(10);
		textFieldNumeroDoPedido.setText("0");
		
		btnDirBalancoFinal.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				switch(fileChooser.showOpenDialog(fileChooser)) {
				case JFileChooser.CANCEL_OPTION:
					System.out.println("Abortado!");
					break;
				case JFileChooser.APPROVE_OPTION:
					 path = fileChooser.getSelectedFile();
					break;
				case JFileChooser.ERROR_OPTION:
					System.exit(1);
				}
				textFieldDiretorio.setText(path.getAbsolutePath());
			}
			
		});
		
		
	}

	public void setBalancoFinal(String string) {
		balancoFinal += string;
	}
	public String getBalancoFinal() {
		return balancoFinal;
	}
}
