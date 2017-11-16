# BarcodeScanGoogleVision
An implementation of Google's Vision Api to scan bar codes


to use this library:

Step 1. Add the JitPack repository to your build file 
--------------------------------------------------------
***gradle***
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}



***maven***

	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>


Step 2. Add the dependency
----------------------------

***gradle***

	dependencies {
		compile 'com.github.User:Repo:Tag'
	}
  
  
  ***maven***
  
  	<dependency>
	    <groupId>com.github.User</groupId>
	    <artifactId>Repo</artifactId>
	    <version>Tag</version>
	</dependency>
