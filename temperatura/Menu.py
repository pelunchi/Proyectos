from datos import datos as dt
import os

class Menu:
    def __init__(self):
        self.Registro_operaciones = []

    def media(self):
        instancia = dt()
        media_valor = instancia.media()
        self.Registro_operaciones.append("Media:año:" + instancia.año)
        self.Registro_operaciones.append(media_valor)
        os.system("cls")
        print("Media de temperatura global de 2024:", media_valor, "grados celcius")


    def madiana(self):
        instancia = dt()
        mediana_valor = instancia.mediana()
        self.Registro_operaciones.append("Mediana:año:" + instancia.año)
        self.Registro_operaciones.append(mediana_valor)
        os.system("cls")
        print("Mediana de temperatura global de 2024:", mediana_valor, "grados celcius")


    def moda(self):
        instancia = dt()
        moda_valor = instancia.moda()
        self.Registro_operaciones.append("Moda:año:" + instancia.año)
        self.Registro_operaciones.append(moda_valor)
        os.system("cls")
        print("Moda de temperatura global de 2024:", moda_valor, "grados celcius")
    
    
    def max(self):
        instancia = dt()
        max_valor = instancia.max()
        self.Registro_operaciones.append("Maximo año:" + instancia.año)
        self.Registro_operaciones.append(max_valor)
        os.system("cls")
        print("Temperatura maxima de 2024:", max_valor, "grados celcius")
    
    
    def min(self):
        instancia = dt()
        min_valor = instancia.min()
        self.Registro_operaciones.append("Minimo:año:" + instancia.año)
        self.Registro_operaciones.append(min_valor)
        os.system("cls")
        print("Temperatura minima de 2024:", min_valor, "grados celcius")

    
    def Registro(self):
        if len(self.Registro_operaciones) % 2!= 0:
            self.Registro_operaciones.append("Dummy value")
        else:
            os.system("cls")
            print("No hay datos de busqueda aun")
        for i in range(0, len(self.Registro_operaciones), 2):
            print("Tipo de Busqueda:",self.Registro_operaciones[i],"\n")
            print("Datos Resultantes",self.Registro_operaciones[i+1]),"\n"
            print("---------------------------------------------------------")



    def menu():
        menu = Menu()
        input("Bienvenido al programa de recolecion de temperatura global")
        while True:
            opcion = int(input("Ingrese una opcion \n1.media\n2.mediana\n3.moda\n4.Max\n5.Min\n6.Registros\n7.Salir\n "))
            if opcion == 1:
                menu.media()
            elif opcion == 2:
                menu.madiana()
            elif opcion == 3:
                menu.moda()
            elif opcion == 4:
                menu.max()
            elif opcion == 5:
                menu.min()
            elif opcion == 6:
                os.system("cls")
                menu.Registro()
            elif opcion == 7:
                os.system("cls")
                print("Bye")
                break
