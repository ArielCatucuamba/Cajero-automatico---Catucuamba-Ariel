import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opciones extends JFrame {
    public static int monto = 200; // Variable para almacenar el monto

    public opciones() {
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

        // boton saldo
        JButton botonsaldo = new JButton("Ver saldo");
        botonsaldo.setHorizontalAlignment(SwingConstants.CENTER);
        botonsaldo.setBackground(Color.pink);
        botonsaldo.setBounds(80, 200, 310, 50);
        // cambiar el color al texto del boton
        botonsaldo.setForeground(Color.red);

        // boton retiro
        JButton botonretiro = new JButton("Retiro");
        botonretiro.setHorizontalAlignment(SwingConstants.CENTER);
        botonretiro.setBackground(Color.pink);
        botonretiro.setBounds(80, 100, 150, 50);
        // cambiar el color al texto del boton
        botonretiro.setForeground(Color.red);

        // boton deposito
        JButton botondeposito = new JButton("Deposito");
        botondeposito.setHorizontalAlignment(SwingConstants.CENTER);
        botondeposito.setBackground(Color.pink);
        botondeposito.setBounds(240, 100, 150, 50);
        // cambiar el color al texto del boton
        botondeposito.setForeground(Color.red);

        // boton salir
        JButton botonsalir = new JButton("Salir");
        botonsalir.setHorizontalAlignment(SwingConstants.CENTER);
        botonsalir.setBackground(Color.pink);
        botonsalir.setBounds(160, 300, 150, 50);
        // cambiar el color al texto del boton
        botonsalir.setForeground(Color.red);

        botondeposito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depostio venta = new depostio(); // la instancia se hace a la ventana que quiro iniciar al tocar el boton
                venta.iniciar();
                dispose();
            }
        });

        botonsaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verSaldo venta = new verSaldo(); // la instancia se hace a la ventana que quiero iniciar al tocar el boton
                venta.iniciar();
                dispose();
            }
        });

        botonretiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retiro venta = new retiro(); // la instancia se hace a la ventana que quiero iniciar al tocar el boton
                venta.iniciar();
                dispose();
            }
        });

        botonsalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Salir venta =new Salir(); //la instancia se hace a la ventana que quiro iniciar al tocar el boton
                venta.iniciar();
                dispose();
            }
        });

        panel.add(titulo);
        panel.add(titulo1);
        panel.add(botonsaldo);
        panel.add(botonretiro);
        panel.add(botondeposito);
        panel.add(botonsalir);
    }

    public void iniciar() {
        setVisible(true);
        // como va a ser la ventana
        setLocationRelativeTo(null); // QUITA EL TAMAÑO POR DEFAULT
        setSize(500, 700); // TAMAÑO DE MI VENTANA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void incrementarMonto(int cantidad) {
        monto += cantidad;
    }

    public static void decrementarMonto(int cantidad) {
        monto -= cantidad;
    }
}