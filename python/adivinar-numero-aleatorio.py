import random

def manejar_advertencia(intentos, advertencias):
    advertencias += 1
    print("Advertencias:", advertencias)

    if advertencias == 3:
        advertencias = 0
        intentos -= 1
        print("Advertencias alcanzadas. -1 intento")
        print("Intentos restantes:", intentos)

    return intentos, advertencias

def jugar():
    numeroR = random.randint(0, 100)
    intentos = 5
    advertencias = 0
    adivinado = False

    print("\t¡ADIVINA EL NÚMERO!")
    print("\n\t      REGLAS")
    print("1. Solo se pueden ingresar NÚMEROS")
    print("2. NO salir del rango indicado (0, 100)")
    print("No cumplir las reglas suma una advertencia")
    print("3 advertencias = 1 intento menos")

    while intentos > 0 and not adivinado:
        dato = input("\nIngresa un número: ")

        if not dato.isdigit():
            print("Solo se admiten números!")
            intentos, advertencias = manejar_advertencia(intentos, advertencias)
            continue

        numero = int(dato)

        if numero < 0 or numero > 100:
            print("Fuera de rango")
            intentos, advertencias = manejar_advertencia(intentos, advertencias)
            continue

        if numero == numeroR:
            print("¡ADIVINASTE!")
            adivinado = True
            break

        intentos -= 1

        if intentos == 0:
            print(f"Te quedaste sin intentos. El número era: {numeroR}")
            break

        if numero > numeroR:
            print("Fallaste! Pista: El número es menor")
        else:
            print("Fallaste! Pista: El número es mayor")

        print("Intentos restantes:", intentos)


if __name__ == "__main__":
    jugar()