from gtts import gTTS
import os

# Some Mobile Legends Heroes
arr = [
    "Aldous",
    "Layla",
    "Karina",
    "Lancelot",
    "Lolita",
    "Khufra",
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
    "Lunox",
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
    "Balmond",
    "Saber",
    "Alice",
    "Nana",
    "Akai",
    "Bane",
    "Bruno",
    "Clint",
    "Rafaela",
    "Eudora",
    "Minotaur",
    "Lolita",
    "Hayabusa",
    "Freya",
    "Natalia",
    "Kagura",
    "Chou",
    "Sun",
    "Alpha",
    "Ruby",
    "Yi Sun Shin",
    "Cyclops",
    "Hilda",
    "Aurora",
    "Vexana",
    "Roger",
    "Gatotkaca",
    "Irithel",
    "Grock",
    "Odette",
    "Diggie",
    "Hylos",
    "Zhask",
    "Helcurt",
    "Pharsa",
    "Lesley",
    "Jawhead",
    "Valir",
    "Martis",
    "Uranus",
    "Hanabi",
    "Chang'e",
    "Selena",
    "Kaja",
    "Claude",
    "Vale",
    "Leomord",
    "Hanzo",
    "Kimmy",
    "Thamuz",
    "Harith"
]

# Language in which you want to convert
lang = 'en'


for val in arr:
    
    fname = "audio_%s.mp3" % val
    
    myobj = gTTS(text=val, lang=lang, slow=False)
    
    # This Line will Actually save MP3 file in your directory.
    myobj.save(fname)
    
    # pkg install sox -y
    os.system("play %s" % fname)
    
    # Uncomment if you want to 
    # remove the Audio File after playing.
    #os.remove(fname)