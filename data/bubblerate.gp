set xlabel "Time"
set ylabel "Bubbles / second"
set terminal png
set output 'bubblerate.png'
plot 'bubblerate.dat' using ($1/100):2 with linespoints

