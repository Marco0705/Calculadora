import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Start {

	// Declaracion atributos
	private JFrame frame;
	private JTextField cajaTexto;
	private JButton botonIgual;
	private JButton botonBarra;
	private JButton botonAsterico;
	private JButton botonMenos;
	private JButton boton9;
	private JButton boton0;
	private JButton boton6;
	private JButton boton3;
	private JButton boton8;
	private JButton boton5;
	private JButton boton2;
	private JButton boton7;
	private JButton boton4;
	private JButton boton1;
	private JButton botonC;
	private JButton botonPar;
	private JButton botonMas;
	private String operacion = "";
	private String contenidoCaja = "";
	private String contenidoCaja2 = "";
	private int num1 = 0;
	private int num2 = 0;
	private float num3 = 0;
	private float num4 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 311, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		cajaTexto = new JTextField();
		cajaTexto.setForeground(new Color(0, 0, 0));
		cajaTexto.setFont(new Font("Arial", Font.PLAIN, 22));
		cajaTexto.setBackground(new Color(255, 255, 255));
		cajaTexto.setEnabled(false);
		cajaTexto.setHorizontalAlignment(SwingConstants.RIGHT);
		cajaTexto.setBounds(10, 21, 279, 54);
		frame.getContentPane().add(cajaTexto);
		cajaTexto.setColumns(10);

		// Instanciamos boton9 y añadimos el ActionListener para poder hacer click
		// @cajaTexto hacemos que el numero 9 aparezca en la pantalla
		boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaTexto.setText(cajaTexto.getText() + 9);
			}
		});
		boton9.setBounds(150, 247, 54, 42);
		frame.getContentPane().add(boton9);

		// Instanciamos botonIgual y añadimos el ActionListener para poder hacer click
		// @contenidoCaja2 recogemos la informacion de la pantalla
		// @if si el contenido esta vacio se bloquean los botones y sale un mensaje de
		// error
		botonIgual = new JButton("=");
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja2 = cajaTexto.getText();
				if (contenidoCaja.equals("") || contenidoCaja2.equals("")) {
					cajaTexto.setForeground(new Color(255, 0, 0));
					cajaTexto.setText("Error");
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
					botonMas.setEnabled(false);
					botonMenos.setEnabled(false);
					botonAsterico.setEnabled(false);
					botonBarra.setEnabled(false);
				} else {
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
					botonMas.setEnabled(false);
					botonMenos.setEnabled(false);
					botonAsterico.setEnabled(false);
					botonBarra.setEnabled(false);

					// Hacemos un casting de contenidoCaja
					num1 = Integer.parseInt(contenidoCaja);
					num2 = Integer.parseInt(contenidoCaja2);

					// Operacion suma
					if (operacion.equals("+")) {
						cajaTexto.setText("" + (num1 + num2));
					}
					// Operacion resta
					else if (operacion.equals("-")) {
						cajaTexto.setText("" + (num1 - num2));
					}
					// Operacion multiplicar
					else if (operacion.equals("*")) {
						cajaTexto.setText("" + (num1 * num2));
					}
					// Operacion dividir
					else if (operacion.equals("/")) {
						num3 = Float.parseFloat(contenidoCaja);
						num4 = Float.parseFloat(contenidoCaja2);

						if (num4 == 0) {
							cajaTexto.setText("Indeterminación");
						} else {
							cajaTexto.setText("" + (num3 / num4));
						}
					}
				}

			}
		});
		botonIgual.setBounds(70, 310, 145, 42);
		frame.getContentPane().add(botonIgual);

		// Instanciamos botonBarra y añadimos el ActionListener para poder hacer click
		// @contenidoCaja recogemos la informacion de la pantalla
		// @if si el contenido esta vacio se bloquean los botones y sale un mensaje de
		// error
		botonBarra = new JButton("/");
		botonBarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja = cajaTexto.getText();
				if (contenidoCaja.equals("")) {
					cajaTexto.setForeground(new Color(255, 0, 0));
					cajaTexto.setText("Error");
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
					botonMas.setEnabled(false);
					botonMenos.setEnabled(false);
					botonAsterico.setEnabled(false);
					botonBarra.setEnabled(false);
				} else {
					operacion = "/";
					cajaTexto.setText("");
					botonPar.setEnabled(false);
					botonMas.setEnabled(false);
					botonMenos.setEnabled(false);
					botonAsterico.setEnabled(false);
					botonBarra.setEnabled(false);
				}

			}
		});
		botonBarra.setBounds(222, 310, 54, 42);
		frame.getContentPane().add(botonBarra);

		// Instanciamos botonAsterico y añadimos el ActionListener para poder hacer
		// click
		// @contenidoCaja recogemos la informacion de la pantalla
		// @if si el contenido esta vacio se bloquean los botones y sale un mensaje de
		// error
		botonAsterico = new JButton("*");
		botonAsterico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja = cajaTexto.getText();
				if (contenidoCaja.equals("")) {
					cajaTexto.setForeground(new Color(255, 0, 0));
					cajaTexto.setText("Error");
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
					botonMas.setEnabled(false);
					botonMenos.setEnabled(false);
					botonAsterico.setEnabled(false);
					botonBarra.setEnabled(false);
				} else {
					operacion = "*";
					cajaTexto.setText("");
					botonPar.setEnabled(false);
					botonMas.setEnabled(false);
					botonMenos.setEnabled(false);
					botonAsterico.setEnabled(false);
					botonBarra.setEnabled(false);
				}
			}
		});
		botonAsterico.setBounds(222, 247, 54, 42);
		frame.getContentPane().add(botonAsterico);

		// Instanciamos botonMenos y añadimos el ActionListener para poder hacer click
		// @contenidoCaja recogemos la informacion de la pantalla
		// @if si el contenido esta vacio se bloquean los botones y sale un mensaje de
		// error
		botonMenos = new JButton("-");
		botonMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja = cajaTexto.getText();
				if (contenidoCaja.equals("")) {
					cajaTexto.setForeground(new Color(255, 0, 0));
					cajaTexto.setText("Error");
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
					botonMas.setEnabled(false);
					botonMenos.setEnabled(false);
					botonAsterico.setEnabled(false);
					botonBarra.setEnabled(false);
				} else {
					operacion = "-";
					cajaTexto.setText("");
					botonPar.setEnabled(false);
					botonMas.setEnabled(false);
					botonMenos.setEnabled(false);
					botonAsterico.setEnabled(false);
					botonBarra.setEnabled(false);
				}
			}
		});
		botonMenos.setBounds(222, 194, 54, 42);
		frame.getContentPane().add(botonMenos);

		// Instanciamos botonMas y añadimos el ActionListener para poder hacer click
		// @contenidoCaja recogemos la informacion de la pantalla
		// @if si el contenido esta vacio se bloquean los botones y sale un mensaje de
		// error
		botonMas = new JButton("+");
		botonMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja = cajaTexto.getText();
				if (contenidoCaja.equals("")) {
					cajaTexto.setForeground(new Color(255, 0, 0));
					cajaTexto.setText("Error");
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
					botonMas.setEnabled(false);
					botonMenos.setEnabled(false);
					botonAsterico.setEnabled(false);
					botonBarra.setEnabled(false);
				} else {
					operacion = "+";
					cajaTexto.setText("");
					botonPar.setEnabled(false);
					botonMas.setEnabled(false);
					botonMenos.setEnabled(false);
					botonAsterico.setEnabled(false);
					botonBarra.setEnabled(false);
				}
			}
		});
		botonMas.setBounds(222, 138, 54, 42);
		frame.getContentPane().add(botonMas);

		// Instanciamos boton0 y añadimos el ActionListener para poder hacer click
		// @cajaTexto hacemos que el numero 0 aparezca en la pantalla
		boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaTexto.setText(cajaTexto.getText() + 0);
			}
		});
		boton0.setBounds(10, 310, 54, 42);
		frame.getContentPane().add(boton0);

		// Instanciamos boton6 y añadimos el ActionListener para poder hacer click
		// @cajaTexto hacemos que el numero 6 aparezca en la pantalla
		boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaTexto.setText(cajaTexto.getText() + 6);
			}
		});
		boton6.setBounds(150, 194, 54, 42);
		frame.getContentPane().add(boton6);

		// Instanciamos boton3 y añadimos el ActionListener para poder hacer click
		// @cajaTexto hacemos que el numero 3 aparezca en la pantalla
		boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaTexto.setText(cajaTexto.getText() + 3);
			}
		});
		boton3.setBounds(150, 138, 54, 42);
		frame.getContentPane().add(boton3);

		// Instanciamos boton8 y añadimos el ActionListener para poder hacer click
		// @cajaTexto hacemos que el numero 8 aparezca en la pantalla
		boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaTexto.setText(cajaTexto.getText() + 8);
			}
		});
		boton8.setBounds(84, 247, 54, 42);
		frame.getContentPane().add(boton8);

		// Instanciamos boton5 y añadimos el ActionListener para poder hacer click
		// @cajaTexto hacemos que el numero 5 aparezca en la pantalla
		boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaTexto.setText(cajaTexto.getText() + 5);
			}
		});
		boton5.setBounds(86, 194, 54, 42);
		frame.getContentPane().add(boton5);

		// Instanciamos boton2 y añadimos el ActionListener para poder hacer click
		// @cajaTexto hacemos que el numero 2 aparezca en la pantalla
		boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaTexto.setText(cajaTexto.getText() + 2);
			}
		});
		boton2.setBounds(86, 138, 54, 42);
		frame.getContentPane().add(boton2);

		// Instanciamos boton7 y añadimos el ActionListener para poder hacer click
		// @cajaTexto hacemos que el numero 7 aparezca en la pantalla
		boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaTexto.setText(cajaTexto.getText() + 7);
			}
		});
		boton7.setBounds(10, 247, 54, 42);
		frame.getContentPane().add(boton7);

		// Instanciamos boton4 y añadimos el ActionListener para poder hacer click
		// @cajaTexto hacemos que el numero 4 aparezca en la pantalla
		boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaTexto.setText(cajaTexto.getText() + 4);
			}
		});
		boton4.setBounds(10, 194, 54, 42);
		frame.getContentPane().add(boton4);

		// Instanciamos boton1 y añadimos el ActionListener para poder hacer click
		// @cajaTexto hacemos que el numero 1 aparezca en la pantalla
		boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaTexto.setText(cajaTexto.getText() + 1);
			}
		});
		boton1.setBounds(10, 138, 54, 42);
		frame.getContentPane().add(boton1);

		// Instanciamos botonC y añadimos el ActionListener para poder hacer click
		// @contenidoCaja reiniciamos su valor
		// @contenidocaja2 reiniciamos su valor
		// Hacemos que el boton C no se bloquee y pueda reiniciar
		botonC = new JButton("C");
		botonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaTexto.setForeground(new Color(0, 0, 0));
				cajaTexto.setText("");
				operacion = "";
				contenidoCaja = "";
				contenidoCaja2 = "";
				boton1.setEnabled(true);
				boton2.setEnabled(true);
				boton3.setEnabled(true);
				boton4.setEnabled(true);
				boton5.setEnabled(true);
				boton6.setEnabled(true);
				boton7.setEnabled(true);
				boton8.setEnabled(true);
				boton9.setEnabled(true);
				boton0.setEnabled(true);
				botonPar.setEnabled(true);
				botonIgual.setEnabled(true);
				botonMas.setEnabled(true);
				botonMenos.setEnabled(true);
				botonAsterico.setEnabled(true);
				botonBarra.setEnabled(true);

			}
		});
		botonC.setBounds(10, 86, 54, 42);
		frame.getContentPane().add(botonC);

		// Instanciamos botonPar y añadimos el ActionListener para poder hacer click
		// @contenidoCaja recogemos la informacion de la pantalla
		// @if si el contenido esta vacio se bloquean los botones y sale un mensaje de
		// error
		botonPar = new JButton("Par");
		botonPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja = cajaTexto.getText();
				if (contenidoCaja.equals("")) {
					cajaTexto.setForeground(new Color(255, 0, 0));
					cajaTexto.setText("Error");
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
					botonMas.setEnabled(false);
					botonMenos.setEnabled(false);
					botonAsterico.setEnabled(false);
					botonBarra.setEnabled(false);
				} else {
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonPar.setEnabled(false);
					botonIgual.setEnabled(false);
					botonMas.setEnabled(false);
					botonMenos.setEnabled(false);
					botonAsterico.setEnabled(false);
					botonBarra.setEnabled(false);

					// Hacemos un casting de contenidoCaja
					num1 = Integer.parseInt(contenidoCaja);

					// Operacion para saber si un numero es par
					if (num1 % 2 == 0) {
						cajaTexto.setText("Par");
					} else {
						cajaTexto.setText("Impar");
					}
				}
			}
		});
		botonPar.setBounds(84, 86, 69, 42);
		frame.getContentPane().add(botonPar);
	}
	
}
