"""Write names in the file.

It reads all the names from the file: school_master.csv and writes into the file: names.txt
"""

def main():
    INPUT_FILE = "school_master.csv"
    OUTPUT_FILE = "names.txt"

    with open(INPUT_FILE) as fin:
        header_line = fin.readline();
        print(header_line)
        data_lines = fin.readlines()

        names = map(lambda y: y+"\n", map(lambda x: x.split(",")[1].strip(), data_lines))
        print(f"names: {names}")
        with open(OUTPUT_FILE, "w") as fout:
            fout.writelines(names)

#boiler-plate logic
if __name__ == "__main__":
    main()