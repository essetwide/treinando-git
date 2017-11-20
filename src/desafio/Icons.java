package desafio;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;

public abstract class Icons {

	public static ImageIcon getUser() {
		try {
			return new ImageIcon(new ImageIcon(new URL("http://www.iconsdb.com/icons/preview/purple/user-4-xxl.png"))
					.getImage().getScaledInstance(75, 75, java.awt.Image.SCALE_SMOOTH));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static ImageIcon getDocumento() {
		try {
			return new ImageIcon(new ImageIcon(new URL("http://www.stoswaldsuk.org/media/22643/document-icon-purple_150x150.jpg"))
					.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static ImageIcon getHome() {
		try {
			return new ImageIcon(new ImageIcon(new URL(
					"https://www.cartorio24horas.com.br/solicitar-certidao//images/responsivo/cartorios/cartorio-de-notas.png"))
							.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
