package br.com.etecia.princesas;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

class CustomAdapter extends BaseAdapter {

    @Override
    public int getCount() {
        return MainActivity.imagemLivro.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
