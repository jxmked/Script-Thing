#Decimal Number to Binary Converter
def dec2Bin(dec):
	if dec == 0:
		print("0")
		return 0
	
	bit = 1
	arr = [bit]
	
	#Making of Power Of 2 Table
	while 1:
		bit = bit * 2
		if bit >= int(dec):
			break	
		arr.append(bit)
	
	x = dec
	xarr = []
	sum = 0
	
	for i in arr:
		#Getting the highest Power Of 2 that that is below from decimal value
		y = getLess(x, arr)
		
		#Subtracting
		x -= y
		sum += y #For Correction
		xarr.append(y)
		
		if x == 0: #Stop when the decimal value is decrease to 0
			break
	
	print("Decimal Number:", sum, (sum == int(dec))) #Correction
	
	#Prepare the Table and Print =)
	#Simple Logic in Prepare Function
	printTable(prepare(xarr))
	
def prepare(arr):
	lastArr = arr[0]
	txt = "1"
	matchIndex = 1
	xarr = []
	
	while 1:
		xarr.append(lastArr)
		lastArr = int(lastArr / 2)
		
		try :
			if lastArr == 0: #Infinte Loop on Some Decimal Numbers
				raise Exception("") 
					
			if lastArr == arr[matchIndex]:
				txt += "1"
				matchIndex += 1
			else:
				txt += "0"
				
		except:
			if lastArr == 0:
				if len(txt) % 2 != 0: 
					txt = "0" + txt
					xarr.append(xarr[0] * 2)
					xarr.sort(reverse=True)
				
				return {"Binary" : txt, "Bits" : xarr}
				
			txt += "0"

def getLess(dec, arr):
	if dec == 1:
		return 1
		
	for value in reversed(arr):
		if (value <= dec):
			return value

def printTable(arr):
	txt = ""
	for i in range(0, len(arr["Bits"])):
		txt += str(arr["Bits"][i]) + " = " + str(arr["Binary"][i]) + "\n"

#	print("\nTable:")
#	print(txt)
#	print("Power Of 2:", arr["Bits"])
	print("Binary:", arr["Binary"])


while 1:
	dec2Bin(int((input("Decimal Value: "))))
	print() #For new Line
