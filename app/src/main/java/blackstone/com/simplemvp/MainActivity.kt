package blackstone.com.simplemvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import blackstone.com.simplemvp.presenter.MainContract
import blackstone.com.simplemvp.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View, View.OnClickListener {

    private lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter()
        presenter.setView(this)

        btConfirm.setOnClickListener(this)

    }

    override fun getUser(fullName: String) {
        tvUser.text = fullName
    }

    override fun onClick(v: View?) {
        presenter.setUser(etName.text.toString(), etAge.text.toString())
    }

}
