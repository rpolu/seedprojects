# seedprojects
For Quick start the new Applications 

Steps For Run The Appication

1) Install brew if not installed. 
    
    /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)"
    
2) Install MongoDB Community Edition run the fallowing commnds in terminal.

   => brew tap mongodb/brew
   
   => brew install mongodb-community@4.4
   
3) Start the Mongo DB server 

     => brew services start mongodb-community@4.4
     
4) Stop the MongoDB server  

     => brew services stop mongodb-community@4.4
     
     For More info go through the fallowing blog.
     
     https://docs.mongodb.com/manual/tutorial/install-mongodb-on-os-x/
     
     
5) Download and Install Mongodb Compass for UI Client for Mongodb server

    https://downloads.mongodb.com/compass/mongodb-compass-1.22.1-darwin-x64.dmg

       Default Coonection String :  mongodb://localhost:27017/
       
6) Clone the project and the Application 

       mvn spring-boot:run


     
