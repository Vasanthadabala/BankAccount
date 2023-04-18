class DebitAccount {
    var Dbalance: Double = (0..1000).random().toDouble()
    fun Action() {
        println("What would to you like to do")
        println("1.Check Balance")
        println("2.Depoist Money")
        println("3.Withdraw Money")
        println("4.Close the system")
        print("Choose An Option(1,2,3,4):")
        val option = readLine()!!.toInt()
        when(option)
        {
            1->Balance()
            2->{
                print("Depositing Amount:")
                Deposit(readLine()!!.toDouble())
                DebitBalance()
            }
            3->{print("WithDraw Amount:")
                WithDraw(readLine()!!.toDouble())
                DebitBalance()
            }
            4->{
                println("Exiting The System")
            }
        }
    }
        fun Balance() {
            println("The Debit Balance is:$Dbalance$")
        }

        fun Deposit(amount: Double){
            Dbalance = Dbalance + amount
            println("Amount Deposited is:$amount$")
        }

        fun WithDraw(amount: Double) {
            if (Dbalance == 0.0) {
                println("Can't Withdraw,No Money On This Account:$Dbalance$")
            } else if (amount > Dbalance) {
                println("Not Enough Money On This Account! The Current Balance is $Dbalance$")
            } else {
                Dbalance = Dbalance - amount
                println("Amount WithDrawn:$amount$")
            }
        }

        fun DebitBalance() {
            println("The Remaining DebitAccount Balance is:$Dbalance$")

        }
}
class CreditAccount
{
    var Cbalance:Double=(0..1000).random().toDouble()
    fun Action() {
        println("What would to you like to do")
        println("1.Check Balance")
        println("2.Depoist Money")
        println("3.Withdraw Money")
        println("4.Close the system")
        print("Choose An Option(1,2,3,4):")
        val option = readLine()!!.toInt()
        when(option)
        {
            1->Balance()
            2->{
                print("Depositing Amount:")
                Deposit(readLine()!!.toDouble())
                CreditBalance()
            }
            3->{print("WithDraw Amount:")
                WithDraw(readLine()!!.toDouble())
                CreditBalance()
            }
            4->{
                println("Exiting The System")
            }
        }
    }
    fun Balance()
    {
        println("The Credit Balance is:${-Cbalance}$")
    }
    fun Deposit(amount:Double) {
        if (Cbalance==0.0) {
            println("This is Completely Paid off!Do not Deposit Money $Cbalance")
        } else if (amount == Cbalance) {
            Cbalance=0.0
            println("You have paid Off This Account")
        } else {
            Cbalance = -Cbalance + amount
            println("Amount Deposited is:$amount$")
        }
    }
    fun WithDraw(amount:Double)
    {
        Cbalance=Cbalance-amount
        println("Amount WithDrawn:$amount$")
    }
    fun CreditBalance()
    {
        println("The Remaining CreditAccount Balance is:$Cbalance$")
    }
}
class CheckingAccount
{
    var Sbalance:Double=0.0//Savings Account=S
    fun Action() {
        println("What would to you like to do")
        println("1.Check Balance")
        println("2.Depoist Money")
        println("3.Withdraw Money")
        println("4.Close the system")
        print("Choose An Option(1,2,3,4):")
        val option = readLine()!!.toInt()
        when(option)
        {
            1->Balance()
            2->{
                print("Depositing Amount:")
                Deposit(readLine()!!.toDouble())
                CheckingBalance()
            }
            3->{print("WithDraw Amount:")
                WithDraw(readLine()!!.toDouble())
                CheckingBalance()
            }
            4->{
                println("Exiting The System")
            }
        }
    }
    fun Balance()
    {
        println("The Checking Balance is:$Sbalance$")
    }
    fun Deposit(amount:Double)
    {
        Sbalance=Sbalance+amount
        println("Amount Deposited is:$amount$")
    }
    fun WithDraw(amount:Double)
    {
        Sbalance=Sbalance-amount
        println("Amount WithDrawn:$amount$")
    }
    fun CheckingBalance()
    {
        println("The Remaining CheckingAccount Balance is:$Sbalance$")
    }
}
fun main()
{
    println("Welcome to  Your Banking System")
    println("What Type Of Account Would You Like To Create")
    println("1.Debit Account")
    println("2.Credit Account")
    println("3.Checking Account")
    println("4.Exit the System")
    print(" Choose An Option(1,2,3,4):")
    val Option=readLine()!!.toInt()
    when(Option)
    {
        1-> {
            println("The Selected Option is 1")
            println("You Have Created Debit Account")
            val Type1=DebitAccount()
            Type1.Balance()
            Type1.Action()
        }
        2-> {
            println("The Selected Option is 2")
            println("You Have Created Credit Account")
            val Type2=CreditAccount()
            Type2.Balance()
            Type2.Action()
        }
        3-> {
            println("The Selected Option is 3")
            println("You Have Created checking Account")
            val Type3=CheckingAccount()
            Type3.Balance()
            Type3.Action()
        }
        4->{
            println("The Selected Option is 4")
            println("The System Is Closed")
        }
    }
}