package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// classe que representa a interface para o produto
public class FrmProduto extends JFrame {

public FrmProduto(Bolicho principal) {
	setTitle("Bolicho->Produto");
	setSize(320,240);
	setLocationRelativeTo(principal);
	desenhaComponentes();
	setVisible(true);
}

	private void desenhaComponentes(){
		JLabel jblDescricao = new JLabel("Descricao:");
		JLabel jblPreco = new JLabel("Preco:");
		JTextField jtfDescricao = new JTextField(30);
		JTextField jtfPreco = new JTextField(30);
		JButton btnGravar = new JButton("Gravar");
		
		setLayout(new FlowLayout());
		
		add(jblDescricao);
		add(jtfDescricao);
		add(jblPreco);
		add(jtfPreco);
		add(btnGravar);
	}
}
