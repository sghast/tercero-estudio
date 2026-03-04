gana = False

# reglas del juego: qué le gana a qué
ganadas = {
    "piedra": "tijera",
    "tijera": "papel",
    "papel": "piedra"
}

while not gana:
    print("Turno del jugador 1")
    print("piedra | papel | tijera")
    jugador1 = input().lower()

    print("Turno del jugador 2")
    print("piedra | papel | tijera")
    jugador2 = input().lower()

    # validar entradas
    if jugador1 not in ganadas or jugador2 not in ganadas:
        print("Entrada inválida, intenten otra vez\n")
        continue

    # empate
    if jugador1 == jugador2:
        print("Empate, vuelvan a jugar\n")

    # jugador 1 gana
    elif ganadas[jugador1] == jugador2:
        print("Gana jugador 1")
        gana = True

    # jugador 2 gana
    else:
        print("Gana jugador 2")
        gana = True