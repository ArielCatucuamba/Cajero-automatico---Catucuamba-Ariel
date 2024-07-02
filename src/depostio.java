import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class depostio extends JFrame {
    public depostio() {
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

        JLabel titulo2 = new JLabel("Ingrese el monto que desea depositar : ");
        titulo2.setHorizontalAlignment(SwingConstants.CENTER);
        titulo2.setOpaque(true);
        titulo2.setBounds(5, 100, 475, 30);
        titulo2.setForeground(Color.black);
        titulo2.setFont(new Font("arial", Font.BOLD, 16));

        JTextField retiro = new JTextField();
        retiro.setHorizontalAlignment(SwingConstants.CENTER);
        retiro.setOpaque(true);
        retiro.setFont(new Font("arial", 0, 20));
        retiro.setBackground(Color.LIGHT_GRAY);
        retiro.setBounds(170, 150, 175, 30);

        // Boton retirar
        JButton botonretirar = new JButton("Depositar");
        botonretirar.setHorizontalAlignment(SwingConstants.CENTER);
        botonretirar.setBackground(Color.pink);
        botonretirar.setBounds(170, 200, 175, 50);
        // cambiar el color al texto del boton
        botonretirar.setForeground(Color.red);

        // boton regresar
        JButton botonregresar = new JButton("Volver al menú");
        botonregresar.setHorizontalAlignment(SwingConstants.CENTER);
        botonregresar.setBackground(Color.pink);
        botonregresar.setBounds(170, 260, 175, 50);
        // cambiar el color al texto del boton
        botonregresar.setForeground(Color.red);

        botonregresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opciones venta = new opciones(); // la instancia se hace a la ventana que quiro iniciar al tocar el boton
                venta.iniciar();
                dispose();
            }
        });

        botonretirar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int cantidad = Integer.parseInt(retiro.getText());
                    opciones.incrementarMonto(cantidad);
                    retiro.setText("");
                    JOptionPane.showMessageDialog(panel, "Depósito exitoso. Nuevo saldo: " + opciones.monto);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Por favor, ingrese un monto válido.");
                }
            }
        });

        panel.add(titulo);
        panel.add(titulo1);
        panel.add(titulo2);
        panel.add(retiro);
        panel.add(botonretirar);
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