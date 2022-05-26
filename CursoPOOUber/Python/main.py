from car import Car
from account import Account
from user import User
from driver import Driver

if __name__ == "__main__":
    print("Hola mundo")

    car = Car("QWERTY123", Account("Luis Miguel", "1952847", "luis77@gmail.com", "HASTAQUEMEOLVIDSE123"))
    print(vars(car))
    print(vars(car.driver))

    first_user = User("Freddy Vega", "14455820", "freddy@platzi.com", "nuncaparesdeaprender")
    print(vars(first_user))

    first_driver = Driver("Alejandro Lopez", "18550223", "alex@schutz.com", "nosoynazi")
    print(vars(first_driver))

    