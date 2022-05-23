from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")

    car = Car("QWERTY123", Account("Luis Miguel", "1952847"))
    print(vars(car))
    print(vars(car.driver))

    