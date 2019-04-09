package blackstone.com.simplemvp.presenter

interface MainContract {

    interface View {
        fun getUser(fullName: String)
    }

    interface Presenter {
        fun setView(view: MainContract.View)
        fun setUser(sung: String, name: String)
    }

}