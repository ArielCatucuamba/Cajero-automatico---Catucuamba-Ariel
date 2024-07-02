import javax.swing.*;
import java.awt.*;

public class saldo extends JFrame {
    public saldo(){
        setTitle("Cajero Banco Pichincha");
        //dimensiones de mi cajero
        setSize(500,700);
        //Me pondra a mi ventana en el medio de la pantalla
        setLocationRelativeTo(null);
        //acabara el programa cuando de a la X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creo el panel
        JPanel panel=new JPanel();
        this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        this.getContentPane().add(panel);
        panel.setLayout(null);


        JLabel titulo = new JLabel("BANCO PICHINCHA");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setOpaque(true);
        titulo.setBackground(Color.YELLOW);
        titulo.setBounds(5,5,475,30);
        //cambair el tipo de letra , estilo y tamaño
        titulo.setFont(new Font("arial",Font.BOLD,14));

        JLabel titulo1= new JLabel("BIENVENIDO");
        titulo1.setHorizontalAlignment(SwingConstants.CENTER);
        titulo1.setOpaque(true);
        titulo1.setBounds(5,55,475,30);
        //Cambia el BIENVENIDO A COLOR ROJO
        titulo1.setForeground(Color.RED);
        titulo1.setFont(new Font("arial",Font.BOLD,20));

    }

    public void iniciar(){
        setVisible(true);
        //como va a ser la ventana
        setLocationRelativeTo(null); //QUITA EL TAMAÑO POR DEFAULT
        setSize(500,700);//TAMAÑO DE MI VENTANA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ACABA EL PROGRAMA CUANDO CUANDO CIERRO LA VENTANA
    }
}
