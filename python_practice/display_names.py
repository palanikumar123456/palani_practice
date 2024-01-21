"""Display names in a list.

It displays the names based on the criteria.

from students data file, copy around 60 student unique names in a separate file, names.txt, using this file, write a python program to display all student names in 
1. uppper case names
2. lower case names
3. camel case names
4. add 'hello' to each name

for above use map function without lambda and with lambda usage

4. filter the names based on 
a) only names with <=5 characters
b) names between 6 to 12 characters
c) names with >12 characters
d) names starting with 'R' character
e) names ending with 'kumar' or 'rao' or 'sarma'
f) names containing with single word only
g) names containing with only 2 words
h) names containing with more than 2 words

for above use filter function without lamba and with lambda usage
"""

def upper_case(s):
    return s.upper()

def lower_case(s):
    return s.lower()

def camel_case(s):
    return s.title()

def add_hello(s):
    return f"hello {s}"


def main():
    INPUT_FILE = "names.txt"
    with open("names.txt") as fin:
        names = list(map(lambda x: x.strip(), fin.readlines()))

    print(f"names: {names}")
    print(f"no.of names: {len(names)}")

    unique_names = set(names)
    print(f"=="*30)
    print(f"names: {unique_names}")
    print(f"no.of names: {len(unique_names)}")

    print("========== without using lambda in map() =====================")
    upper_case_names = list(map(upper_case, unique_names))
    print(f"upper-case names: \n{upper_case_names}")

    lower_case_names = list(map(lower_case, unique_names))
    print(f"\nlower-case names: \n{lower_case_names}")

    camel_case_names = list(map(camel_case, unique_names))
    print(f"\ncamel-case names: \n{camel_case_names}")

    hello_names = list(map(add_hello, unique_names))
    print(f"\nhello names: \n{hello_names}")

    print("========== with using lambda in map() =====================")
    upper_case_names = list(map(lambda s: s.upper(), unique_names))
    print(f"upper-case names: \n{upper_case_names}")

    lower_case_names = list(map(lambda s: s.lower(), unique_names))
    print(f"\nlower-case names: \n{lower_case_names}")

    camel_case_names = list(map(lambda s: s.title(), unique_names))
    print(f"\ncamel-case names: \n{camel_case_names}")

    hello_names = list(map(lambda s: f"hello {s}", unique_names))
    print(f"\nhello names: \n{hello_names}")


if __name__ == "__main__":
    main()