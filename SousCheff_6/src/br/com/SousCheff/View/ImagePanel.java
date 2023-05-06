package br.com.SousCheff.View;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	public static String enderecoImagem = "C:\\Users\\User\\eclipse-workspace-SousCheff\\SousCheff_6\\src\\br\\com\\SousCheff\\Model\\fundo.jpg";
	public ImagePanel(String imagePath) {
		try {
			image = ImageIO.read(new File(enderecoImagem));
		} catch (IOException ex) {
			// trate a exceção aqui
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}
}
