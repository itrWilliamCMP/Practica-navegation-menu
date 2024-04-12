package william.campos.menudesplegablewilliam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class fragment_configuracion : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //creo una variable que es igual al fragment inflado
        //inflado significa que esta la vista conectado al código
        val root = inflater.inflate(R.layout.fragment_configuracion, container, false)

        //mandar a llamar el boton btn ingresar
        val btnIngresar = root.findViewById<Button>(R.id.btnIngresar)

        btnIngresar.setOnClickListener {

            Toast.makeText(context, "Hola mundo", Toast.LENGTH_LONG).show()
        }

        return root
    }
}

