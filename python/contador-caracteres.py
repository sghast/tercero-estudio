oracion = input("Ingrese una oracion: ")

numeros, espacios, letras, vocales, consonantes = 0, 0, 0, 0, 0
copia = []

for caracter in oracion:
    if caracter.isdigit():
        numeros += 1
    elif caracter == " ":
        espacios += 1
    elif caracter.isalpha():
        letras += 1
        if caracter.lower() in "aeiou":
            vocales += 1
        else:
            consonantes += 1

#resultados
print(f"Números: {numeros}")
print(f"Espacios: {espacios}")
print(f"Vocales: {vocales}")
print(f"Consonantes: {consonantes}")
print(f"Letras totales: {letras}")
print(f"Caracteres totales: {len(oracion) - espacios}")