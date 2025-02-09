# Core-Java

# Core Java - Installation Guide

## Step 1: Download Java

Download the latest version of Java SE Development Kit (JDK) from Oracle. Choose the appropriate version for your operating system (Windows, macOS, or Linux).

https://drive.google.com/file/d/1nN2D137N-RFl32wxujyoof71Fc6bjr0j/view?usp=drive_link

## Step 2: Install Java

Locate the downloaded file (.exe or .zip).If it’s a .zip file, extract it using WinRAR.

Open the installer (.exe file) and follow these steps:

Click Next.

Click Next again.

Java will start installing automatically.

After installing, close the installer.

## Step 3: Verify Java Installation

Open Command Prompt (cmd).Type the following command to check the installed Java version:

java -version

If Java is installed correctly, you will see output like:

java version "23.0.1"

## Step 4: Set Up Environment Variables

Open File Explorer and navigate to Program Files in C Drive:

C:\Program Files\Java
C:\Program Files\Java\jdk-23
C:\Program Files\Java\jdk-23\bin

Copy the bin folder path.

Go to Windows Settings → Search for "Environment Variables".Click Edit the system environment variables → Click Environment Variables.

Under System Variables and User Variables, find Path → Click Edit.Click New, then paste the copied Java bin path.Click OK to save the changes.

Step 5: Verify Java Path Configuration

Open Command Prompt (cmd) again.Run the command:

javac -version

If Java is configured correctly, it will display the installed Java Compiler version.Now, Java is successfully installed and configured on your system.

# How To Run A Program

Step 1: Write A Java Program

Write a Java program in Notepad and save it with the .java extension.Example: Example.java.

Step 2: Copy The Path

Copy the path where you have saved the Example.java file.

Step 3: Open Command Prompt

Navigate to your Java folder in Command Prompt (cmd):

C:\Users\91829\Desktop\JAVA>

Step 4: Compile And Run The Program

Compile the Java program using:

javac Example.java

Run the Java program using:

java Example

Output:

Hello World!

Now, your Java program is successfully executed!

