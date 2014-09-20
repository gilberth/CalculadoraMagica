package pe.edu.ulima.calculadoramagina.adaptars;

import java.util.List;

import pe.edu.ulima.calculadoramagia.model.Alumno;
import pe.edu.ulima.calculadoramagica.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ListadoAlumnoAdapter extends BaseAdapter {

	private List<Alumno> mAlumnos;
	private LayoutInflater mInflater;

	public ListadoAlumnoAdapter(List<Alumno> alumnos, Context context) {

		mAlumnos = alumnos;
		mInflater = LayoutInflater.from(context);

	}

	@Override
	public int getCount() {

		return mAlumnos.size();

	}

	@Override
	public Object getItem(int position) {

		return mAlumnos.get(position);

	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View view = mInflater.inflate(
		
		mInflater.inflate(R.layout.item_listado_alumnos, null);
		
		
		return null;
	}

}
