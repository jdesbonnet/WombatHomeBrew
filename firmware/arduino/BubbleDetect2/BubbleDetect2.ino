  

void setup() {                
  pinMode(13, OUTPUT);
  Serial.begin(115200);

}

void loop() {
  int a,a0,a1, am1=0;
  int n=0;
  int bubbleStart=0;
    
  while (1) {
    
      // PT reading before IR LED on
      a0 = analogRead(0);
      
      // Illuminate IR LED and take PT reading
      digitalWrite (13,1);
      delay(1);
      a1 = analogRead(0);
      // IR LED off
      digitalWrite (13,0);
     
      // LPF
      a = (7*am1 + a1)/8;
      am1 = a;
     
      if (bubbleStart == 0) {
        if (a < 940) {
            bubbleStart = n;
        }
      } else {
        if (a > 980) {
            Serial.println (n - bubbleStart);
            bubbleStart=0;
        }
      }
      delay(10);
      n++;
  }
}
