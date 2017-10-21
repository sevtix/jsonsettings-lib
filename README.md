# jsonsettings-lib
A simple json settings library to get and set values

Dependencies:
  Gson: https://github.com/google/gson
  
Usage:  
    public static main(String[] args){ File f = new File(fullpathtofile); JsonSetting settings = new JsonSettings(f); settings.setAsString("key", "value"); settings.save(); String string = settings.getAsString("key"); System.out.println(string); }
