package apk.shinohana_yeis;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InicioSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        EditText editTextEmail = findViewById(R.id.editTextEmail);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button buttonLogin = findViewById(R.id.btnLogin);

        buttonLogin.setOnClickListener(v -> {
            String email = editTextEmail.getText().toString();
            String password = editTextPassword.getText().toString();

            // Aquí puedes agregar la lógica para autenticar al usuario
            if (authenticateUser(email, password)) {
                // Si la autenticación es exitosa, ir a la actividad principal
                Intent intent = new Intent(InicioSesion.this, MainActivity.class);
                startActivity(intent);
                finish(); // Cierra la actividad de inicio de sesión
            } else {
                Toast.makeText(InicioSesion.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean authenticateUser(String email, String password) {
        // Lógica de autenticación (esto es solo un ejemplo)
        return email.equals("yeis") && password.equals("1234");
    }
}
