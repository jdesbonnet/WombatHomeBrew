set xlabel "Sample (100Hz sample rate)"
set ylabel "IR phototransistor"

set terminal png
#set size 800,600
set output 'bubble.png'

plot 't.t' using 2 with linespoints

