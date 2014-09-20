package pe.edu.ulima.calculadoramagica;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;

public class ListadosSpinnerActivity extends Activity{
	Spinner spiAlumnos;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_listado_spinner);
	
	
	
	spiAlumnos = (Spinner) findViewById(R.id.spiAlumnos);
	
	
}
	
	
	

}
