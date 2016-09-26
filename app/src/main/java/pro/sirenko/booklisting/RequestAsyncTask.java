package pro.sirenko.booklisting;

import android.os.AsyncTask;

import org.jetbrains.annotations.NotNull;

import java.net.URL;
import java.util.List;

public class RequestAsyncTask extends AsyncTask<URL, Void, List<Book>> {

    private final String query;

    public RequestAsyncTask(@NotNull String query) {
        this.query = query;
    }

    @Override
    protected List<Book> doInBackground(URL... params) {
        return null;
    }
}
