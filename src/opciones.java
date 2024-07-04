import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opciones extends JFrame {
    public static int monto = 200; // Variable para almacenar el monto

    public opciones() {
        setTitle("Cajero Banco Pichincha");
        // dimensiones de mi cajero
        setSize(500, 400);
        // Me pondra a mi ventana en el medio de la pantalla
        setLocationRelativeTo(null);
        // acabara el programa cuando de a la X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creo el panel
        JPanel panel = new JPanel();
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.getContentPane().add(panel);
        panel.setLayout(null);
        //Preparese inge que se viene un diseñazo
        panel.setBackground(Color.gray);

        //Segundo diseño monstruoso

        ImageIcon imagen=new ImageIcon("C:\\Users\\OMEN\\IdeaProjects\\t_grupal\\src\\banco.jpg");
        JLabel dise2=new JLabel();
        dise2.setOpaque(true);
        dise2.setBounds(40,130,220,140);
        dise2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(dise2.getWidth(),dise2.getHeight(),Image.SCALE_SMOOTH)));
        dise2.setBackground(Color.WHITE);

        //borde inferior
        JLabel dise3 = new JLabel("");
        dise3.setOpaque(true);
        dise3.setBounds(15,300,460,15);
        dise3.setBackground(Color.darkGray);

        JLabel dise4 = new JLabel("");
        dise4.setOpaque(true);
        dise4.setBounds(15,100,15,200);
        dise4.setBackground(Color.darkGray);

        JLabel dise5 = new JLabel("");
        dise5.setOpaque(true);
        dise5.setBounds(460,100,15,200);
        dise5.setBackground(Color.darkGray);

        //borde superior
        JLabel dise1 = new JLabel("");
        dise1.setOpaque(true);
        dise1.setBounds(15,100,460,15);
        dise1.setBackground(Color.darkGray);

        //aaaaaaaaaaaaaaaa

        JLabel titulo = new JLabel("BANCO PICHINCHA");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setOpaque(true);
        titulo.setBackground(Color.YELLOW);
        titulo.setBounds(15,10,460,50);
        //cambair el tipo de letra , estilo y tamaño
        titulo.setFont(new Font("arial",Font.BOLD,20));

        JLabel titulo1= new JLabel("BIENVENIDO");
        titulo1.setHorizontalAlignment(SwingConstants.CENTER);
        titulo1.setOpaque(true);
        titulo1.setBackground(Color.YELLOW);
        titulo1.setBounds(15,55,460,30);
        //Cambia el BIENVENIDO A COLOR ROJO
        titulo1.setForeground(Color.RED);
        titulo1.setFont(new Font("arial",Font.BOLD,20));

        // boton saldo
        JButton botonsaldo = new JButton("Ver saldo");
        botonsaldo.setHorizontalAlignment(SwingConstants.CENTER);
        botonsaldo.setBackground(Color.white);
        botonsaldo.setBounds(270,200,175,30);
        // cambiar el color al texto del boton
        botonsaldo.setForeground(Color.red);

        // boton retiro
        JButton botonretiro = new JButton("Retiro");
        botonretiro.setHorizontalAlignment(SwingConstants.CENTER);
        botonretiro.setBackground(Color.white);
        botonretiro.setBounds(270,165,175,30);
        // cambiar el color al texto del boton
        botonretiro.setForeground(Color.red);

        // boton deposito
        JButton botondeposito = new JButton("Deposito");
        botondeposito.setHorizontalAlignment(SwingConstants.CENTER);
        botondeposito.setBackground(Color.white);
        botondeposito.setBounds(270,130,175,30);
        // cambiar el color al texto del boton
        botondeposito.setForeground(Color.red);

        // boton salir
        JButton botonsalir = new JButton("Salir");
        botonsalir.setHorizontalAlignment(SwingConstants.CENTER);
        botonsalir.setBackground(Color.white);
        botonsalir.setBounds(270,235,175,30);
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
        panel.add(dise1);
        panel.add(dise3);
        panel.add(dise4);
        panel.add(dise5);
        panel.add(dise2);



    }

    public void iniciar() {
        setVisible(true);
        // como va a ser la ventana
        setLocationRelativeTo(null); // QUITA EL TAMAÑO POR DEFAULT
        setSize(500, 400); // TAMAÑO DE MI VENTANA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void incrementarMonto(int cantidad) {
        monto += cantidad;
    }

    public static void decrementarMonto(int cantidad) {
        monto -= cantidad;
    }
}