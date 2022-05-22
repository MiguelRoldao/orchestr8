

folder structure:

<root folder>

/orcehstr8/
/generators/	-> put your generator .java files here
/your_file.orch8
/Orchestr8.jar


To build an .orch8 file:

java -jar Orchestr8.jar <your_file>.orch8
javac -cp . generators/*.java
javac -cp . bin/<your_file>.java
java -classpath . bin.<your_file>