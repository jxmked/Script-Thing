"""
Using JSON as database, we can do some basic
register and login

By registering, the software will prompt to enter unique username
and password.
The username must be contains a-Z case insensitive letters and
some 0-9 numbers from 5 to 13 characters
The password must be contains a-Z case insensitive letter and 
some 0-9 numbers with some '-' and '_' characters from 3 to 20 characters.
If the condition from above has been met the new account will be
registered and save into json file.

By logging in, the software will prompt to enter a registered
username and a password for that username.
If the condition from above has been met, the software will
tell if you have been logged in then exit, otherwise will prompt
to enter a registered username or password.


Author: Jovan
"""

import re
import json

class User:

  def __init__(self):
    ## Must be 5 to 13 chars only
    self.__valid_uname_chars = r"^[a-zA-Z0-9]{5,13}$"

    ## Must be 3 to 20 chars only
    self.__valid_pwd_chars = r"^[a-zA-Z0-9\_\-]{3, 20}$"

    self.jsonDBFile = "./db.json"
    self.uname = ""
    self.pwd = ""
    self.objKey = "accounts"

  def doValidUname(self):
    return bool(re.match(self.__valid_uname_chars, self.uname))

  def doValidPwd(self):
    return bool(re.match(self.__valid_pwd_chars, self.pwd))

  def doCheckUsernameExists(self):
    try:
      with open(self.jsonDBFile, "r") as file:
        parsed = json.loads(file.read())

        return self.uname in parsed['accounts']

    except FileNotFoundError:

      try: 
        ## Create file if not exists
        with open(self.jsonDBFile, "w+") as file:
          json.dump({f"{self.objKey}": {}}, file)

      except:
        print("Interpreter doesn't have write access to storage")
        raise SystemExit(1)

    except BaseException as be:
      pass

    return False

  def doRegister(self):
    accounts = {}

    try:
      with open(self.jsonDBFile, "r") as file:
        try: 
          # Try to read the file content
          # If does fail, just overwrite the content
          # with new 1
          parsed = json.loads(file.read())
          accounts = parsed.get("accounts", {})

        except:
          pass

        accounts[str(self.uname)] = str(self.pwd)

      with open(self.jsonDBFile, "w") as file:
        ## Overwrite file contents with new update
        json.dump({f"{self.objKey}": accounts}, file)

      print("Data stored")

    except BaseException as be:
      print("Failed to store data")
      raise SystemExit(1)

  def doLogin(self):
    accounts = {}

    try:
      with open(self.jsonDBFile, "r") as file:
        accounts.update(json.loads(file.read())[self.objKey])

        if self.uname in accounts and accounts[self.uname] == self.pwd:
          return True

      return False

    except:
      print("Empty database!")
      raise SystemExit(1)

    return False

while True:
  print("---------------------------")
  print("1. Register")
  print("2. Login")

  try: 
    mode = int(input("Please, enter the mode: "))
  except ValueError:
    print("\nInavlid input\n")
    continue

  obj = User()

  if mode == 1: # Register mode
    ## Validate and check username
    while True:
      obj.uname = input("Username: ")

      if not obj.doValidUname(): #Invalid chars
        print("Username is not valid\n")
        continue

      if obj.doCheckUsernameExists():
        ## Username taken
        print("Username is already occupied")
        continue

      break

  elif mode == 2: 
    ## Validate and check username
    while True:
      obj.uname = input("Username: ")

      if not obj.doValidUname(): #Invalid chars
        print("Username is not valid\n")
        continue

      if not obj.doCheckUsernameExists():
        ## Not Existing
        print("Username does not exists")
        continue

      break

  ## We can prevent duplicated code
  ## by doing this but this is inefficient
  if mode == 1 or mode == 2:
    ## Validate password
    while True:
      pwd = input("Password: ")
      obj.pwd = pwd

      if obj.doValidPwd():
        print("Password is not valid\n")
        continue

      break

    if mode == 1:
      obj.doRegister()

    elif mode == 2:
      if obj.doLogin():
        print("Logged in")
        raise SystemExit(0)

      else:
        print("Failed to log in")
        raise SystemExit(0)

## 6-1-2023
