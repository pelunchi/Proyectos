import pandas as pd
import sqlite3

class datos:
    def __init__(self):
        while True:
            self.año = input("La temperatura de que año: 2022,2023,2024\n")
            if self.año == "2022":
                conn = sqlite3.connect('tempdatabase2022.db')
                break
            elif self.año == "2023":
                conn = sqlite3.connect('tempdatabase2023.db')
                break
            elif self.año == "2024":
                conn = sqlite3.connect('tempdatabase2024.db')
                break
        self.df = pd.read_sql_query('SELECT * FROM tabla_datos', conn)
        conn.close()

    
    def media(self):
        media = self.df['temp_mes'].mean()
        return media
    
    
    def mediana(self):
        mediana = self.df['temp_mes'].median()
        return mediana
    
    
    def moda(self):
        moda = self.df['temp_mes'].mode()
        return moda
    
    def max(self):
        max = self.df['temp_mes'].max()
        return max
    
    def min(self):
        min = self.df['temp_mes'].min()
        return min

