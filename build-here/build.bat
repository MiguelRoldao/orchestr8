set file=castlevania

java -jar Orchestr8.jar %file%.orch8
javac -cp . generators/*.java
javac -cp . bin/%file%.java
java -classpath . bin.%file%

pause