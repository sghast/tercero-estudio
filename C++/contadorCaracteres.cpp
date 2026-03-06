#include <iostream>
#include <string>
#include <cctype>

using namespace std;

int main() {
    system("chcp 65001 > nul");

    string oracion;
    int numeros = 0, espacios = 0, letras = 0, vocales = 0, consonantes = 0;

    cout << "Ingrese una oración: ";
    getline(cin, oracion);

    for (char c : oracion) {
        if (isdigit(c)) numeros++;
        else if (isspace(c)) espacios++;
        else if (isalpha(c)) {
            letras++;

            c = tolower(c);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')vocales++;
            else consonantes++;
        }
    }

    cout << "\nNúmeros: " << numeros;
    cout << "\nEspacios: " << espacios;
    cout << "\nLetras: " << letras;
    cout << "\nVocales: " << vocales;
    cout << "\nConsonantes: " << consonantes;
    cout << "\nCaracteres totales: " << letras + numeros;
}