import tieto.bank.admin.Account
import tieto.bank.admin.AccountType
import tieto.bank.admin.User

class BootStrap {

    def init = { servletContext ->
        User user1 = new User(name:"Kristyna Wasylkiwova");
        user1.save()
        User user2 = new User(name:"Petra Karasova");
        user2.save()

        Account a1 = new Account(balance:200, owner:user1, type:AccountType.Private)
        a1.save()
        Account a2 = new Account(balance:2000, owner:user1, type:AccountType.Private)
        a2.save()

        Account a3 = new Account(balance:-500, owner:user2, type:AccountType.Private)
        a3.save()
        Account a4 = new Account(balance:-10000, owner:user2, type:AccountType.Private)
        a4.save()
        Account a5 = new Account(balance:900, owner:user2, type:AccountType.Private)
        a5.save()

    }
    def destroy = {
    }
}
