CC = g++
CFLAGS = -g -Wall
INCLUDE = -I.
TARGET=demo
EXT = .cc
SRCS = $(wildcard *$(EXT))
OBJS = $(SRCS:$(EXT)=.o)


all: $(TARGET)

run: $(TARGET)
	./$(TARGET)

$(TARGET): $(OBJS)
	$(CC) -o $@ $^ $(CFLAGS) $(INCLUDE) $(LDFLAGS) $(LIBS)

%.o : %$(EXT)
	$(CC) -c $< -o $@ $(CFLAGS) $(INCLUDE)

clean:
	$(RM) $(OBJS) $(TARGET)
