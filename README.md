# jsonsettings-lib
A simple json settings library to get and set values

Dependencies:
  Gson: https://github.com/google/gson
 
Usage:  
<br>public static main(String[] args){
    <br>File f = new File(fullpathtofile);
    <br>JsonSetting settings = new JsonSettings(f);
    <br>settings.setAsString("key", "value");
    <br>settings.save();
    <br>String string = settings.getAsString("key");
    <br>System.out.println(string);
<br>}
