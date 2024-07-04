import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//primero tendo que hacer el extends JFrame
public class Bienvenida extends JFrame {
    public JTextField usuario;
    public JTextField contraseña;
    //creo el metodo constructor
    public Bienvenida(){
        super("Catucuamba Ariel e Isaac Valenzuela");
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

        //Preparese inge que se viene un diseñazo
        panel.setBackground(Color.gray);

        JLabel dise1 = new JLabel("");
        dise1.setOpaque(true);
        dise1.setBounds(15,100,460,15);
        dise1.setBackground(Color.darkGray);

        //este es
        ImageIcon imagen=new ImageIcon("C:\\Users\\OMEN\\IdeaProjects\\t_grupal\\src\\banco.jpg");
        JLabel dise2=new JLabel();
        dise2.setOpaque(true);
        dise2.setBounds(40,130,220,100);
        dise2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(dise2.getWidth(),dise2.getHeight(),Image.SCALE_SMOOTH)));
        dise2.setBackground(Color.WHITE);

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

        JLabel dise6 = new JLabel("");
        dise6.setOpaque(true);
        dise6.setBounds(350,130,100,10);
        dise6.setBackground(Color.darkGray);

        JLabel dise7 = new JLabel("");
        dise7.setOpaque(true);
        dise7.setBounds(350,150,100,10);
        dise7.setBackground(Color.darkGray);



        //Diseñazo


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

        JLabel titulo2= new JLabel("Ingrese su contraseña: ");
        titulo2.setHorizontalAlignment(SwingConstants.LEFT);
        titulo2.setBackground(Color.GRAY);
        titulo2.setOpaque(true);
        titulo2.setBounds(270,130,170,15);
        //Cambia el BIENVENIDO A COLOR ROJO
        titulo2.setForeground(Color.black);
        titulo2.setFont(new Font("arial",Font.BOLD,14));

        JTextField contrasenia= new JTextField();
        contrasenia.setHorizontalAlignment(SwingConstants.LEFT);
        contrasenia.setOpaque(true);
        contrasenia.setFont(new Font("arial",0,20));
        contrasenia.setBackground(Color.LIGHT_GRAY);
        contrasenia.setBounds(270,150,175,30);
        panel.add(contrasenia);

        //creo el boton confrimar contragena
        JButton botoncontrasenia = new JButton("Verificar contraseña");
        botoncontrasenia.setHorizontalAlignment(SwingConstants.CENTER);
        botoncontrasenia.setBackground(Color.WHITE);
        botoncontrasenia.setBounds(270,190,175,30);
        //cambiar el color al texto del boton
        botoncontrasenia.setForeground(Color.red);

        botoncontrasenia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //variable quemada password
                String contra = "123456";

                //Tomo lo que esta en la caja de texto y lo paso a una varible
                String contraIngresada=contrasenia.getText();


                //en ava se pone equals , no ==
                if (contra.equals(contraIngresada) ){
                    opciones ventana_m = new opciones();
                    ventana_m.iniciar();
                    dispose();//es para llamar el otro formulario siempre debe ir
                }
                else{
                    //me muestra un cuadro solo con ese mensaje
                    JOptionPane.showMessageDialog(null,"El password es incorrecto");
                    contrasenia.setText("");

                }




                /*//creamos una instancia de la ventana menu ,
                menu ventana_m = new menu();
                ventana_m.iniciar();
                dispose();//es para llamar el otro formulario*/
            }
        });








        panel.add(titulo);
        panel.add(titulo1);
        panel.add(titulo2);
        panel.add(contrasenia);
        panel.add(botoncontrasenia);
        panel.add(dise1);
        panel.add(dise2);
        panel.add(dise3);
        panel.add(dise4);
        panel.add(dise5);
        //panel.add(dise6);
        //panel.add(dise7);







    }

    public void iniciar(){
        setVisible(true);
        //como va a ser la ventana
        setLocationRelativeTo(null); //QUITA EL TAMAÑO POR DEFAULT
        setSize(500,400);//TAMAÑO DE MI VENTANA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ACABA EL PROGRAMA CUANDO CUANDO CIERRO LA VENTANA
    }




}
