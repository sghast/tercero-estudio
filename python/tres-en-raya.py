import tkinter as tk
from tkinter import messagebox

turno = "X"
tablero = [""] * 9
botones = []

victorias = [
    (0,1,2),
    (3,4,5),
    (6,7,8),
    (0,3,6),
    (1,4,7),
    (2,5,8),
    (0,4,8),
    (2,4,6)
]

def jugar(posicion):
    global turno

    if tablero[posicion] == "":
        tablero[posicion] = turno
        botones[posicion].config(text=turno)

        if verificar_ganador():
            messagebox.showinfo("Fin del juego", f"¡Ganó {turno}!")
            reiniciar()
            return

        if "" not in tablero:
            messagebox.showinfo("Fin del juego", "¡Empate!")
            reiniciar()
            return
        cambiar_turno()

def cambiar_turno():
    global turno

    if turno == "X":
        turno = "O"
    else:
        turno = "X"

def verificar_ganador():

    for a, b, c in victorias:
        if tablero[a] == tablero[b] == tablero[c] != "":
            return True
    return False

def reiniciar():
    global tablero, turno

    tablero = [""] * 9
    turno = "X"

    for boton in botones:
        boton.config(text="")

ventana = tk.Tk()
ventana.title("Tres en Raya")
ventana.geometry("300x350")

frame = tk.Frame(ventana)
frame.pack()

for i in range(9):

    boton = tk.Button(
        frame,
        text="",
        width=10,
        height=4,
        font=("Arial", 20),
        command=lambda i=i: jugar(i)
    )

    boton.grid(row=i//3, column=i%3)
    botones.append(boton)

boton_reset = tk.Button(
    ventana,
    text="Reiniciar",
    font=("Arial", 12),
    command=reiniciar
)

boton_reset.pack(pady=10)
ventana.mainloop()