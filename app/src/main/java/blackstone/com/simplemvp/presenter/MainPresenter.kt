package blackstone.com.simplemvp.presenter

import blackstone.com.simplemvp.data.User

class MainPresenter : MainContract.Presenter {

    private lateinit var view: MainContract.View
    private lateinit var user: User

    override fun setView(view: MainContract.View) {
        this.view = view
    }

    override fun setUser(sung: String, name: String) {
        user = User(sung, name)
        view.getUser("My Name Is ${user.name} ${user.sung}")
    }

}