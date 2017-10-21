# jsonsettings-lib
A simple json settings library to get and set values

# Dependencies:
Gson: https://github.com/google/gson
 
# Sample:  
<br>public static main(String[] args){
    <br>
    <br>&#8195;File f = new File(fullpathtofile);
    <br>&#8195;JsonSetting settings = new JsonSettings(f);
    <br>
    <br>&#8195;settings.setAsString("key", "value");
    <br>
    <br>&#8195;settings.save();
    <br>
    <br>&#8195;String string = settings.getAsString("key");
    <br> 
    <br>&#8195;System.out.println(string);
<br>}
