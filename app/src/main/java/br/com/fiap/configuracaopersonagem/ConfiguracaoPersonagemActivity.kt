package br.com.fiap.configuracaopersonagem

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_configuracao_personagem.*

class ConfiguracaoPersonagemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracao_personagem)

        btJogar.setOnClickListener(){
        jogar()
        }
    }

    fun jogar(){
        val proximaTela = Intent(this,TelaDadosActivity::class.java)
        proximaTela.putExtra("nome",etNome.text.toString())
        proximaTela.putExtra("classe",spClasse.selectedItem.toString())
        proximaTela.putExtra("sexo",getSexo())
        startActivity(proximaTela)
        finish()
    }

        fun getSexo():String{
        var sexoSlecionado = ""
        if(rgSexo.checkedRadioButtonId == R.id.rbMasculino)  {
          sexoSlecionado = rbMasculino.text.toString()
        }
        else{
          sexoSlecionado =  rbFeminino.text.toString()
        }

        return sexoSlecionado
        }
}
