package com.sillasca.godie.menupersistencia


import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_i.view.*
import org.w3c.dom.Text
import java.io.File
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter


class ISFragment : Fragment() {


    private lateinit var editecst : EditText
    private lateinit var viutext: TextView
    private lateinit var chowTecstButon : Button
    private lateinit var seibDataButon : Button

    private var texto:String = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var vista = inflater.inflate(R.layout.fragment_i, container, false)


        editecst = view!!.findViewById(R.id.texto_internal)
        viutext = view!!.findViewById(R.id.vista1)
        chowTecstButon = view!!.findViewById(R.id.cargar_internal)
        seibDataButon = view!!.findViewById(R.id.salvar_internal)

        chowTecstButon.setOnClickListener {

                    }

        seibDataButon.setOnClickListener {
            val file = "archivo"
            val mensaje = "Nomás no le hallo xD 3:"
            context!!.openFileOutput(file, Context.MODE_PRIVATE).use {
                it.write(mensaje.toByteArray())
            }
        }


        return vista
    }

}

