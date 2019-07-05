package com.akin.medicart.Admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.akin.medicart.HomeActivity;
import com.akin.medicart.MainActivity;
import com.akin.medicart.R;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView allergyMed, anestheticMed, cardioMed, cnsMed;
    private ImageView contraceptiveMed, digestionMed, earsMed, eyesMed;
    private ImageView hairsMed, noseMed, nutritionMed, painMed;
    private ImageView reproductiveMed, respiratoryMed, skinMed, urinaryMed;

    private Button LogoutBtn, CheckOrdersBtn, maintainProductsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        allergyMed = (ImageView)findViewById(R.id.allergy);
        anestheticMed = (ImageView)findViewById(R.id.anesthetics);
        cardioMed = (ImageView)findViewById(R.id.cardiac);
        cnsMed = (ImageView)findViewById(R.id.cns);
        contraceptiveMed = (ImageView)findViewById(R.id.contraciptive);
        digestionMed = (ImageView)findViewById(R.id.digestion);
        earsMed = (ImageView)findViewById(R.id.ears);
        eyesMed = (ImageView)findViewById(R.id.eyes);
        hairsMed = (ImageView)findViewById(R.id.hairs);
        noseMed = (ImageView)findViewById(R.id.nose);
        nutritionMed = (ImageView)findViewById(R.id.nutrition);
        painMed = (ImageView)findViewById(R.id.pain);
        reproductiveMed = (ImageView)findViewById(R.id.reproduction);
        respiratoryMed = (ImageView)findViewById(R.id.respiration);
        skinMed = (ImageView)findViewById(R.id.skin);
        urinaryMed = (ImageView)findViewById(R.id.urinary);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);
        maintainProductsBtn = (Button) findViewById(R.id.maintain_btn);

        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeActivity.class);
                intent.putExtra("Admin", "Admin");
                startActivity(intent);
            }
        });


        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrderActivity.class);
                startActivity(intent);
            }
        });


        allergyMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "allergyMed");
                startActivity(intent);
            }
        });

        anestheticMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "anestheticMed");
                startActivity(intent);
            }
        });

        cardioMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "cardio");
                startActivity(intent);
            }
        });

        cnsMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "CNS");
                startActivity(intent);
            }
        });

        contraceptiveMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "contraceptive");
                startActivity(intent);
            }
        });

        digestionMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "digestion");
                startActivity(intent);
            }
        });
        earsMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Ears");
                startActivity(intent);
            }
        });
        eyesMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Eye");
                startActivity(intent);
            }
        });
        hairsMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Hairs");
                startActivity(intent);
            }
        });
        noseMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Nose");
                startActivity(intent);
            }
        });
        nutritionMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Nutrition");
                startActivity(intent);
            }
        });
        painMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Pain");
                startActivity(intent);
            }
        });
        reproductiveMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Reproductive");
                startActivity(intent);
            }
        });
        respiratoryMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Respiratory");
                startActivity(intent);
            }
        });
        skinMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Skin");
                startActivity(intent);
            }
        });
        urinaryMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Urinary");
                startActivity(intent);
            }
        });
    }
}
