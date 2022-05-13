from car import Car
if __name__ == "__main__":
    print("Hola mundo")
    
    car = Car()
    car.license = "QWERTY123"
    car.driver = "Boby Pulido"
    print(vars(car))

    car2 = Car()
    car2.license = "YTREWQ321"
    car2.driver = "Luis Miguel"
    print(vars(car2))
    