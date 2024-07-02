import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class verSaldo extends JFrame {
    public verSaldo() {
        setTitle("Cajero Banco Pichincha");
        // dimensiones de mi cajero
        setSize(500, 700);
        // Me pondra a mi ventana en el medio de la pantalla
        setLocationRelativeTo(null);
        // acabara el programa cuando de a la X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creo el panel
        JPanel panel = new JPanel();
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel titulo = new JLabel("BANCO PICHINCHA");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setOpaque(true);
        titulo.setBackground(Color.YELLOW);
        titulo.setBounds(5, 5, 475, 30);
        // cambiar el tipo de letra , estilo y tamaño
        titulo.setFont(new Font("arial", Font.BOLD, 14));

        JLabel titulo1 = new JLabel("BIENVENIDO");
        titulo1.setHorizontalAlignment(SwingConstants.CENTER);
        titulo1.setOpaque(true);
        titulo1.setBounds(5, 55, 475, 30);
        // Cambia el BIENVENIDO A COLOR ROJO
        titulo1.setForeground(Color.RED);
        titulo1.setFont(new Font("arial", Font.BOLD, 20));

        JLabel titulo2 = new JLabel("Saldo disponible");
        titulo2.setHorizontalAlignment(SwingConstants.CENTER);
        titulo2.setOpaque(true);
        titulo2.setBounds(5, 100, 475, 30);
        titulo2.setForeground(Color.black);
        titulo2.setFont(new Font("arial", Font.BOLD, 16));

        JLabel titulo3 = new JLabel(" "+opciones.monto+" ");
        titulo3.setHorizontalAlignment(SwingConstants.CENTER);
        titulo3.setOpaque(true);
        titulo3.setBounds(5, 150, 475, 50);
        titulo3.setForeground(Color.BLUE);
        titulo3.setFont(new Font("arial", Font.BOLD, 50));

        // boton regresar
        JButton botonregresar = new JButton("Volver al menú");
        botonregresar.setHorizontalAlignment(SwingConstants.CENTER);
        botonregresar.setBackground(Color.pink);
        botonregresar.setBounds(160, 240, 175, 50);
        // cambiar el color al texto del boton
        botonregresar.setForeground(Color.red);

        botonregresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opciones venta = new opciones(); // la instancia se hace a la ventana que quiero iniciar al tocar el boton
                venta.iniciar();
                dispose();
            }
        });

        panel.add(titulo);
        panel.add(titulo1);
        panel.add(titulo2);
        panel.add(titulo3);
        panel.add(botonregresar);
    }

    public void iniciar() {
        setVisible(true);
        // como va a ser la ventana
        setLocationRelativeTo(null); // QUITA EL TAMAÑO POR DEFAULT
        setSize(500, 700); // TAMAÑO DE MI VENTANA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ACABA EL PROGRAMA CUANDO CUANDO CIERRO LA VENTANA
    }
}