package co.tiagoaguiar.codelab.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class


MainActivity extends AppCompatActivity {

//	private View btnImc;
	private RecyclerView rvMain;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

//		btnImc = findViewById(R.id.btn_imc);

		rvMain = findViewById(R.id.main_rv);

		// 1 -> Definer o comportamento de exbição do layout da recyclerview
		// mosaic
		//grid
		// linear (horizontal | vertical)
		rvMain.setLayoutManager(new LinearLayoutManager(this));
		MainAdapter adapter = new MainAdapter();
		rvMain.setAdapter(adapter);



//		btnImc.setOnClickListener(v -> {
//			Intent intent = new Intent(MainActivity.this, ImcActivity.class);
//			startActivity(intent);
//		});


	}

	private class MainAdapter extends RecyclerView.Adapter<MainViewHolder>{

		@NonNull
		@Override
		public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
			return new MainViewHolder(getLayoutInflater().inflate(R.layout.main_item, parent, false));
		}

		@Override
		public void onBindViewHolder(@NonNull MainActivity.MainViewHolder holder, int position) {
			holder.bind(position);
		}

		@Override
		public int getItemCount() {
			return 15;
		}
	}

	// Entenda como sendo a VIEW DA CELULA que está dentro do RecyclerView
	private class MainViewHolder extends RecyclerView.ViewHolder {

		public MainViewHolder(@NonNull View itemView) {
			super(itemView);
		}

		public void bind(int position) {
			TextView textTest = itemView.findViewById(R.id.texview_test);
			textTest.setText("teste de rolage" + position );
		}
	}
}