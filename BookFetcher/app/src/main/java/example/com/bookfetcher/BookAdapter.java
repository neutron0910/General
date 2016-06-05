package example.com.bookfetcher;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
//creating own base adapter class to  map the data in list view
public class BookAdapter extends BaseAdapter {

    private final MainActivity mainActivity;
    private final ArrayList<Book> books;

    public BookAdapter(MainActivity mainActivity, ArrayList<Book> books) {
        this.mainActivity = mainActivity;
        this.books = books;
    }
// this method will return the total number of books
    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Object getItem(int position) {
        return books.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Book book = books.get(position);
        String name = book.name;
        String author = book.author;
        String price = book.price;

        View view = LayoutInflater.from(mainActivity).inflate(R.layout.list_item_book, null);

        TextView nameTextView = (TextView) view.findViewById(R.id.nameTextView);
        TextView authorTextView = (TextView) view.findViewById(R.id.authorTextView);
        TextView priceTextView = (TextView) view.findViewById(R.id.priceTextView);

        nameTextView.setText(name);
        authorTextView.setText(author);
        priceTextView.setText(price);

        return view;
    }
}
