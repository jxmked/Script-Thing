import math
import sys

def calculate_bending_angle(top_diameter, bottom_diameter, height):
    # Convert diameters to radii
    R_top = top_diameter / 2
    R_bottom = bottom_diameter / 2

    # Calculate the difference in diameter
    delta_diameter = top_diameter - bottom_diameter

    # Calculate the slant height
    slant_height = math.sqrt((R_top - R_bottom) ** 2 + height ** 2)

    # Calculate the bending angle
    bending_angle = math.atan(delta_diameter / (2 * math.pi * slant_height))

    # Convert the angle from radians to degrees
    bending_angle_degrees = math.degrees(bending_angle)

    return bending_angle_degrees




# Check if all three arguments are provided

# top_diameter = float(sys.argv[1])
# bottom_diameter = float(sys.argv[2])
# height = float(sys.argv[3])

## 
## Unit: Centimeter
##

top_diameter = 50
bottom_diameter = 40
height = 10

angle = calculate_bending_angle(top_diameter, bottom_diameter, height)


print(f"The bending angle to fit the image to the tumbler is approximately {angle:.3f} degrees.")


