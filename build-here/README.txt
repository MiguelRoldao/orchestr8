

folder structure:

<root folder>

/orcehstr8/
/orchestr8/gen/
/generators/	-> put your generator .java files here
/your_file.orch8
/Orchestr8.jar


├─ orchestr8
├─ generators
│  └─ 

To build an .orch8 file:

java -jar Orchestr8.jar <your_program_name>.orch8
javac -cp . generators/*.java
javac -cp . bingen/<your_program_name>.java
java -classpath . bingen.<your_program_name>