package com.buka.exercicio3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.buka.exercicio3.models.Car;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.CarViewHolder> {
    private ArrayList<Car> cars = new ArrayList<>();

    // TODO: Passo 6 - Crie um constructor com um parâmetro do tipo OnCarItemClickedListener
    // TODO: Passo 7 - Guarde o valor do parâmetro num campo privado com o mesmo nome
    // Nota: o objecto do tipo OnCarItemClickedListener aqui passado é o que será notificado caso algum
    // carro do RecyclerView for clicado

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View carView = inflater.inflate(R.layout.item_car, parent, false);
        return new CarViewHolder(carView);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        Car car = cars.get(position);
        holder.carTextView.setText(car.getManufacturer() + " " + car.getModel() + " " + car.getYear());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public void setCars(ArrayList<Car> cars) {
        if (cars != null) {
            this.cars = cars;
            notifyDataSetChanged();
        }
    }

    // TODO: Passo 5 - Crie uma interface OnCarItemClickedListener com um método onCarItemClickedListener
    // Nota: as classes que implementam esta interface podem ser notificados sobre os carros clicados

    class CarViewHolder extends RecyclerView.ViewHolder {
        TextView carTextView;

        public CarViewHolder(@NonNull View carView) {
            super(carView);
            carTextView = carView.findViewById(R.id.textview_car);

            // TODO: Passo 2 - Use o método setOnClickListener para detectar cliques feitos nos itens do RecyclerView
            // TODO: Passo 3 - Obtenha a posição do item clicado
            // TODO: Passo 4 - Obtenha da ArrayList deste adapter, o objecto Car relacionado ao item clicado
            // TODO: Passo 10 - Chame o método onCarItemClicked passando o carro selecionado para notificar o MainActivity
        }
    }
}
