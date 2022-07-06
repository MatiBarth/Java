import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class juegoSorteo extends JFrame implements ActionListener {
	private JLabel seleccion,nro,nroSorteado,nrosor,acerto,resul;
	private JButton subir,bajar,salir,sortear;
	private int elegido=0;	
	private ganaste ganastee;
	public juegoSorteo(){
		setLayout(null);

		ganastee=new ganaste();
		ganastee.setBounds(70,20,200,120);
		
		seleccion=new JLabel("Seleccion de numero:");
		seleccion.setBounds(10,10,150,20);
		add(seleccion);
		
		nro=new JLabel("-");
		nro.setBounds(20,55,100,20);
		add(nro);
		
		subir=new JButton("^");
		subir.setBounds(70,40,45,20);
		add(subir);
		subir.addActionListener(this);
		
		bajar=new JButton("˅");
		bajar.setBounds(70,70,45,20);
		add(bajar);
		bajar.addActionListener(this);
		
		salir=new JButton("Salir");
		salir.setBounds(20,110,90,20);
		add(salir);
		salir.addActionListener(this);
		
		sortear=new JButton("Sortear");
		sortear.setBounds(200,40,130,30);
		add(sortear);
		sortear.addActionListener(this);
		
		nroSorteado=new JLabel("Numero Sorteado:");
		nroSorteado.setBounds(200,80,110,20);
		add(nroSorteado);
		
		nrosor=new JLabel("-");
		nrosor.setBounds(315,80,50,20);
		add(nrosor);
		
		acerto=new JLabel("Acerto?");
		acerto.setBounds(200,120,50,20);
		add(acerto);
		
		resul=new JLabel("-");
		resul.setBounds(315,120,50,20);
		add(resul);

	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==subir){
			if(elegido>9){
				elegido=10;
			}else {
				elegido++;
			}
			nro.setText(String.valueOf(elegido));
		}
		
		if(e.getSource()==bajar){
			if(elegido<2){
				elegido=1;
			}else {
				elegido--;
			}
			nro.setText(String.valueOf(elegido));
		}
		
		if(e.getSource()==salir){
			System.exit(0);
		}
		
		if(e.getSource()==sortear){
			if(elegido==0){
				setTitle("Debe seleccionar un numero!");
			}
			else {
				int ele=1+(int)(Math.random()*10);
				nrosor.setText(String.valueOf(ele));
				if(ele==elegido){
					resul.setText("Si");
					ganastee.setVisible(true);
				}
				else {
					resul.setText("No");
				}
			}
		}
	}
	
	public static void main(String[] arg){
		juegoSorteo js=new juegoSorteo();
		js.setBounds(0,0,370,200);
		js.setVisible(true);
	}

}
