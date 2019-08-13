package br.com.etecia.princesas;

import android.widget.EditText;

public class Object_Livro{

   static EditText txtTitulo, txtAutor, txtDescricao;

    public String getTxtTitulo() {
        return txtTitulo.findViewById(R.id.txtTitulo).toString();
    }

    public void setTxtTitulo(EditText txtTitulo) {
        this.txtTitulo = txtTitulo;
    }

    public String getTxtAutor() {
        return txtAutor.findViewById(R.id.txtAutor).toString();
    }

    public void setTxtAutor(EditText txtAutor) {
        this.txtAutor = txtAutor;
    }

    public String getTxtDescricao() {
        return txtDescricao.findViewById(R.id.txtDescricao).toString();
    }

    public void setTxtDescricao(EditText txtDescricao) {
        this.txtDescricao = txtDescricao;
    }
}
