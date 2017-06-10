package carl.dbp;




import android.annotation.SuppressLint;
import android.app.Fragment;

import android.app.ListFragment;
import android.os.Bundle;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
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
        Toast.makeText(getActivity(), "Item: " + position, Toast.LENGTH_SHORT).show();
    }

}

class SectionsPagerAdapter extends FragmentPagerAdapter {public SectionsPagerAdapter(FragmentManager fm) {
    super(fm);
}@Override
public android.support.v4.app.Fragment getItem(int position) {

        return new Contactos_chat();

}@Override
public int getCount() {
// Show 3 total pages.
    return 1;
}@Override
public CharSequence getPageTitle(int position) {

    return null;
}
}

