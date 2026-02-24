nombre = input("Nombre: ")
edad = int(input("Edad: "))

if edad < 18:
    print("Eres menor de edad, no apto")
    exit()

exp = int(input("Años de experiencia: "))

if exp < 2:
    print(f"{nombre} apto para empleo junior")
elif exp >= 2 and exp <= 5:
    print(f"{nombre} apto para empleo semi-senior")
elif exp > 5:
    print(f"{nombre} apto para empleo senior")
