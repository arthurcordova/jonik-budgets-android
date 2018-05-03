package br.com.jonik.budget

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.jonik.jonikbudget.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonSignIn.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.buttonSignIn -> {
                startActivity(Intent(this, NewBudgetActivity::class.java))
                finish()
            }
        }
    }


}
