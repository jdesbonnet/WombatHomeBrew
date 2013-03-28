set xlabel "Bubble duration (10ms time units)"
set ylabel "Count"
set terminal png
set output 'duration.png'
binwidth=2
bin(x,width)=width*floor(x/width)
#plot 'dist.dat' using (bin($1,binwidth)):(1.0) smooth freq with boxes
set xrange [0:80]
plot 'duration.dat' smooth freq with boxes
