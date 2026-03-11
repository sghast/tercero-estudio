import pandas as pd

datos = {
    "Nombre": ["Ana", "Luis", "Pedro", "Maria", "Juan"],
    "Edad": [20, 22, 19, 21, 23],
    "Ciudad": ["Quito", "Guayaquil", "Quito", "Cuenca", "Quito"]
}

df = pd.DataFrame(datos)

print(df, end="\n\n")
print(df[df["Ciudad"] == "Quito"]["Nombre"])