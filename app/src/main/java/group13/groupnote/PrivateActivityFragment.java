package group13.groupnote;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class PrivateActivityFragment extends Fragment {

    public PrivateActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_private, container, false);

        //TODO:READ NOTE DATA FROM SQLite
        //List<String> data = readDataFromDB();

        String[] fake = {
                "OOP",
                "tesco",
                "dinner on Sun",
                "Talk",
                "Group study"
        };
        List<String> data = new ArrayList<String>(Arrays.asList(fake));

        ArrayAdapter<String> mPrivateNoteAdapter =
                new ArrayAdapter<String>(
                        getActivity(), // The current context (this activity)
                        R.layout.list_item_note, // The name of the layout ID.
                        R.id.list_item_note_textview, // The ID of the textview to populate.
                        data);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_private);
        listView.setAdapter(mPrivateNoteAdapter);

        return rootView;
    }

    private List<String> readDataFromDB () {
        //TODO:READ NOTE DATA FROM SQLite
        List<String> data = new ArrayList<>();
        return data;
    }
}
