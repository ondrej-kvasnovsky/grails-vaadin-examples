import tieto.bank.admin.Account
import tieto.bank.admin.AccountType
import tieto.bank.admin.User

class BootStrap {

    def init = { servletContext ->
        new DevData().insert()
    }
    def destroy = {
    }
}
