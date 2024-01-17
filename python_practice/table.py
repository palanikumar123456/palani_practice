"""multiplication table.

This program takes an input from user and displays the multiplication table for the given number.
"""

def main():
    n = int(input("Enter the multiplicate table number: "))
    for i in range(1, 11):
        print(f"{n}  *  {i:2d}  =  {n*i:3d}")


# boiler-plate logic
if __name__ == "__main__":
    main()