package com.payfood.payfood.entrandoComoUsuario;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import com.payfood.payfood.R;

import framework.Tela;

public class TelaRecuperarSenha extends Tela {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_recuperar_senha);

    }

    public void onClickRecuperarSenha(View view) {
        //startActivity(new Intent(this, TelaRecuperarSenha.class));
    }
}
