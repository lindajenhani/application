package view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    // Déclaration d'un bouton pour démarrer l'activité principale (MainActivity)
    private Button btnDomaine1;
    private Button btnDomaine2;
    private Button btnDomaine3;
    private Button btnDomaine4;
    private Button btnDomaine5;
    private Button btnDomaine6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisation du bouton en associant la vue du layout avec la variable Java
        btnDomaine1 = (Button) findViewById(R.id.btnDomaine1);

        // Configuration de l'écouteur de clic pour le bouton "Consultation"
        btnDomaine1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Création d'une nouvelle intention (Intent) pour démarrer MainActivity
                Intent intent = new Intent(MainActivity.this, domaine1.class);

                // Démarrage de l'activité MainActivity
                startActivity(intent);

                // Fermeture de l'activité actuelle (HomeActivity)
                finish();
            }
        });
    }
}


