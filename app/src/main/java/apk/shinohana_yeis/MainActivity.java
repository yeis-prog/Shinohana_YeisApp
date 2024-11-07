package apk.shinohana_yeis;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import modelos.Adaptador;
import modelos.Productos;

public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Toolbar myToolbar = findViewById(R.id.toolbar);
            setSupportActionBar(myToolbar);

            RecyclerView recyclerView = findViewById(R.id.recycler_view);

            // Crear una lista de productos de ejemplo
            List<Productos> productos = new ArrayList<>();
            productos.add(new Productos("Producto 1"));
            productos.add(new Productos("Producto 2"));

            // Configurar el adaptador y el layout manager
            Adaptador adapter = new Adaptador(productos);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(adapter);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.main_menu, menu);
            return true;
        }


        //@Override
        //public boolean onOptionsItemSelected(MenuItem item) {
            //switch (item.getItemId()) {
                //case R.id.action_settings:
                    //return true;
                //case R.id.action_about:
                    //return true;
                //default:
                    //return super.onOptionsItemSelected(item);
            //}
        //}



}