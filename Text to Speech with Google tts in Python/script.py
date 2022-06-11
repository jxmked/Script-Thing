from gtts import gTTS
import os


# Some Mobile Legends Heroes
arr = [
    "Aldous",
    "Layla",
    "Karina",
    "Lancelot",
    "Lolita",
    "Kuhfra",
    "Gord",
    "Fanny",
    "Gusion",
    "Harley",
    "Lapu-Lapu",
    "Tigreal",
    "Franco",
    "Johnson",
    "Belerick",
    "Julian",
    "Aamon",
    "Lunix",
    "Brody",
    "Moscov",
    "Karrie",
    "Miya",
    "Zilong",
    "Alucard",
    "Angela",
    "Floryn",
    "Mathilda",
    "Estes",
    "Done"
]

# Language in which you want to convert
lang = 'en'


for val in arr:
    myobj = gTTS(text=val, lang=lang, slow=False)
  
    myobj.save("audio_{}.mp3".format(val))
    
    # pkg install sox -y
    os.system("play audio_{}.mp3".format(val))