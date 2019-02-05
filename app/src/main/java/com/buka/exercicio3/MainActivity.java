package com.buka.exercicio3;

import android.os.Bundle;

import com.buka.exercicio3.models.Car;
import com.buka.exercicio3.utils.CarArrayListGenerator;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

// TODO: Passo 8 - Faça o MainActivity implementar a interface OnCarItemClickedListener
// Nota: Ao implementar esta interface, o MainActivity poderá receber o carro selecionado
// pelo usuário no RecyclerView
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO: Passo 1 - Crie uma segunda activity (classe e layout) que exibirá os detalhes de um carro
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Car> cars = CarArrayListGenerator.generateCars();

        RecyclerView carsRecyclerView = findViewById(R.id.recyclerview_cars);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        carsRecyclerView.setLayoutManager(linearLayoutManager);

        // TODO: Passo 9 - Passe a instância do MainActivity ao construtor do CarsAdapter
        CarsAdapter carsAdapter = new CarsAdapter();
        carsRecyclerView.setAdapter(carsAdapter);

        carsAdapter.setCars(cars);
    }

    // TODO: Passo 11 - No método onCarItemClicked, instancie um intent que terá como destino a activity que criou
    // TODO: Passo 12 - Passe todos os atributos do carro como argumento no Intent
    // TODO: Passo 13 - Use o método startActivity para iniciar a activity passando o intent

    // Passos para a activity que criou
    // TODO: Passo 14 - Recupere na nova activity todos os argumentos do intent
    // TODO: Passo 15 - Mostre na activity os detalhes do carro
}
