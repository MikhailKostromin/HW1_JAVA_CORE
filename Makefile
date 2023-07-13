SRC_DIR := src
OUT_DIR := out

JS := javac
JCFLAGS := -sourcepath .$(SRC_DIR)/ -d $(OUT_DIR)

all:
	javac -sourcepath .src/ -d out src/ru/sample/Main.java