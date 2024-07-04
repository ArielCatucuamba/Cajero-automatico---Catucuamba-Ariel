import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Salir extends JFrame {
    public Salir(){
        setTitle("Muchas gracias por visitar el Banco Pichincha");
        //dimensiones de mi cajero
        setSize(500,400);
        //Me pondra a mi ventana en el medio de la pantalla
        setLocationRelativeTo(null);
        //acabara el programa cuando de a la X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creo el panel
        JPanel panel=new JPanel();
        this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        this.getContentPane().add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.gray);

        // Cuarto diseño monstruoso
        //borde inferior
        JLabel dise3 = new JLabel("");
        dise3.setOpaque(true);
        dise3.setBounds(15,240,460,15);
        dise3.setBackground(Color.darkGray);

        JLabel dise4 = new JLabel("");
        dise4.setOpaque(true);
        dise4.setBounds(15,100,15,150);
        dise4.setBackground(Color.darkGray);

        JLabel dise5 = new JLabel("");
        dise5.setOpaque(true);
        dise5.setBounds(460,100,15,150);
        dise5.setBackground(Color.darkGray);

        //borde superior
        JLabel dise1 = new JLabel("");
        dise1.setOpaque(true);
        dise1.setBounds(15,100,460,15);
        dise1.setBackground(Color.darkGray);

        //aaaaaaaaaaaa

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

        JLabel titulo2= new JLabel("MUCHAS GRACIAS ");
        titulo2.setHorizontalAlignment(SwingConstants.CENTER);
        titulo2.setOpaque(true);
        titulo2.setBounds(150,130,220,30);
        //Cambia el BIENVENIDO A COLOR ROJO
        titulo2.setBackground(Color.gray);
        titulo2.setForeground(Color.black);
        titulo2.setFont(new Font("arial",Font.BOLD,16));



        //Boton salir
        JButton botonsalir = new JButton("OK");
        botonsalir.setHorizontalAlignment(SwingConstants.CENTER);
        botonsalir.setBackground(Color.white);
        botonsalir.setBounds(190,170,150,50);
        //cambiar el color al texto del boton
        botonsalir.setForeground(Color.red);




        botonsalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Bienvenida venta =new Bienvenida(); //la instancia se hace a la ventana que quiro iniciar al tocar el boton
                venta.iniciar();
                dispose();
            }
        });





        panel.add(titulo);
        panel.add(titulo1);
        panel.add(titulo2);
        panel.add(botonsalir);
        panel.add(dise1);
        panel.add(dise3);
        panel.add(dise4);
        panel.add(dise5);


    }
    public void iniciar(){
        setVisible(true);
        //como va a ser la ventana
        setLocationRelativeTo(null); //QUITA EL TAMAÑO POR DEFAULT
        setSize(500,400);//TAMAÑO DE MI VENTANA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ACABA EL PROGRAMA CUANDO CUANDO CIERRO LA VENTANA
    }
}
