package br.com.etecia.princesas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    EditText titulo, autor, decricao;



    static String[] dadosLivro = {String.valueOf(Object_Livro.txtTitulo), String.valueOf(Object_Livro.txtAutor),
            String.valueOf(Object_Livro.txtDescricao)};
    static int [] imagemLivro = {R.drawable.livros};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView.findViewById(R.id.gridLivros);

        CustomAdapter customAdapter = new CustomAdapter();
    }
}
