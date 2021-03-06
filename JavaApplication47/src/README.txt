-----------------------------------------------------
                  JavaLayer 0.3.0

 Project Homepage :
   http://www.javazoom.net/javalayer/javalayer.html 

 JAVA and MP3 online Forums :
   http://www.javazoom.net/services/forums/index.jsp
-----------------------------------------------------

DESCRIPTION :
-----------
JavaLayer is a 100% JAVA library that decodes/plays/converts MPEG 1/2/2.5 Layer 1/2/3
(i.e. MP3) in real time. This is a non-commercial project and anyone can add his 
contribution. JavaLayer is licensed under GPL (see LICENSE.txt).


FAQ : 
---

- How to install Javalayer ?
  Before running JavaLayer you must set PATH and CLASSPATH for JAVA
  and you must add jl020.jar to the CLASSPATH.

- Do I need JMF to run JavaLayer player ?
  No, JMF is not required. You just need a JVM JavaSound 1.0 compliant.
  (i.e. JVM1.3 or higher).

- How to run the MP3TOWAV converter ?
  java javazoom.jl.converter.jlc -v -p output.wav yourfile.mp3
  (Note : MP3TOWAV converter should work under jdk1.1.x, jdk1.2.x, jdk1.3.x)

- How to run the simple MP3 player ?
  java javazoom.jl.player.jlp localfile.mp3
   or
  java javazoom.jl.player.jlp -url http://www.aserver.com/remotefile.mp3
  Note : MP3 simple player only works under JVM that supports JavaSound 1.0 (i.e JDK1.3.x+)

- How to run the advanced (threaded) MP3 player ?
  java javazoom.jl.player.advanced.jlap localfile.mp3

- Does simple MP3 player support streaming ?
  Yes, use the following command to play music from stream :
  java javazoom.jl.player.jlp -url http://www.shoutcastserver.com:8000

- Does JavaLayer support MPEG 2.5 ?
  Yes, it works fine for all files generated with LAME.

- How to get ID3v1 or ID3v2 tags from JavaLayer API ?
  The API doesn't provide this feature (yet).

- How much memory JavaLayer needs to run ?
  Here are our benchmark notes :
    - Heap use range : 1380KB to 1900KB - 370 classes loaded. 
    - Footprint : ~8MB under WinNT4 + J2SE 1.3 (Hotspot).
    - CPU usage : ~12% under PIII 800Mhz/WinNT4+J2SE 1.3 (Hotspot).
