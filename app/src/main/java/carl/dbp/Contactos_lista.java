package carl.dbp;




import android.annotation.SuppressLint;
import android.app.Fragment;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.Locale;


public class Contactos_lista extends ListFragment implements OnItemClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_lista_contactos, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.Nombres, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.d("test", "onItemClick: "+position);
        Contactos_chat c = new Contactos_chat();
    }

}
/*
class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {

        return new Contactos_chat();

    }
    @Override
    public int getCount() {
// Show 3 total pages.
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        new Contactos_chat();
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return new Contactos_chat().getString(R.string.title_section1).toUpperCase(l);
            case 1:
                return new Contactos_chat().getString(R.string.title_section2).toUpperCase(l);
            case 2:
                return new Contactos_chat().getString(R.string.title_section3).toUpperCase(l);
        }
        return null;
    }
}*/