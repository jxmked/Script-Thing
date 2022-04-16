# Binary & Decimal
***Written in Python Programming Language***

#### Consist of 2 programs

- Binary to Decimal
- Decimal to Binary

> I will try to explain some part of the program.


# Binary to Decimal

 Convert base-2 Binary digits into Decimal value

> Note: Binary with decimal places like "01100001.11" is now supported.

> Formula: dn-1 ... d3 d2 d1


### Explain

Our binary is `0101`.

Computation will start at first digit of binary. '0'

__1st step:__

Get the length of binary and subtract it into 1 and that is our raised number.

> But in every digit from binary the raised power will be subtracted by 1.

----
__2nd step:__

Map it.

*Table of truth*

> Start at first digit of binary

| Binary Digits | Raised Power |
| :---: | :---: |
| 0 | 3 |
| 1 | 2 |
| 0 | 1 |
| 1 | 0 |

----
__3rd step:__

Raise the base number into specific power from table above.

> Base number is equal to 2.
> Binary is also known as base 2.

***Calculate***

> n2<sup>x</sup>. Where n is a binary digit and x is its raised power.

*Table of truth*
| Calculate | Answer | Total Sum |
| :---: | :---: | :---: |
| 0 * 2 ^ 3 | 0 | 0 |
| 1 * 2 ^ 2 | 4 | 4 |
| 0 * 2 ^ 1 | 0 | 0 |
| 1 * 2 ^ 0 | 1 | ***5*** |

> Note: If binary has decimal value like "0101.11",
> just continue decreasing the raised power in negative state like

| Calculate | Answer | Total Sum |
| :---: | :---: | :---: |
| 0 * 2 ^ 3 | 0 | 0 |
| 1 * 2 ^ 2 | 4 | 4 |
| 0 * 2 ^ 1 | 0 | 0 |
| 1 * 2 ^ 0 | 1 | 5 |
| <td colspan=2>Dot/Period Here |
| 1 * 2 ^ -1 | 0.5 | 5.5 |
| 1 * 2 ^ -2 | 0.25 | 5.75 |

----
__4th step:__

Get the last ***Total Sum*** and that is our output. 

#### "Decimal: 5"

***And where done***

----
# Decimal to Binary
 Convert Decimal into base-2 Binary using subtraction method.
 
> Note: Decimal value with decimal places like 97.75 is not supported

### Explain

__1st step:__

Watch this tutorial video: `https://youtu.be/rsxT4FfRBaM`

> I will try to explain this thing later when I think my explaination is clear. =)

#### Develop by Jovan De Guia

## Socials

- [Github](https://github.com/jxmked)
- [Facebook](https://www.facebook.com/deguia25)

### License under MIT License