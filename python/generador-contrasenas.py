import random
import string

puntuacion_validos = "!#$%&@" 
universo = string.ascii_lowercase + string.ascii_uppercase + string.digits + puntuacion_validos

contrasena = ""

#caracteres obligatorios: mayúscula, minúscula, número y puntuación
obligatorios = []
mayuscula = obligatorios.append(random.choice(string.ascii_uppercase))
minuscula = obligatorios.append(random.choice(string.ascii_lowercase))
numero = obligatorios.append(random.choice(string.digits))
puntuacion = obligatorios.append(random.choice(puntuacion_validos))

for i in range(8): #la longitud de la contraseña puede variar
    caracter = obligatorios.append(random.choice(universo))

random.shuffle(obligatorios) 
#con los caracteres obligatorios incluidos se mezcla para no seguir el mismo patrón (mayuscula > minuscula > numero > puntucuacion)

for i in range (len(obligatorios)):
    contrasena += obligatorios[i]

print(f"Tu contraseña temporal es: {contrasena}\nNO LA COMPARTAS CON NADIE")