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
                "Mon 6/23 - Sunny - 31/17",
                "Tue 6/24 - Foggy - 21/8",
                "Wed 6/25 - Cloudy - 22/17",
                "Thurs 6/26 - Rainy - 18/11",
                "Fri 6/27 - Foggy - 21/10",
                "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                "Sun 6/29 - Sunny - 20/7"
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
