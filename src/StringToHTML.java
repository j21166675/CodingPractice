
    import java.io.*;
import java.util.*;

    /*
     * To execute Java, please define "static void main" on a class
     * named Solution.
     *
     * If you need more classes, simply define them inline.
     */

    class StringToHTML {
        public static void main(String[] args)throws Exception {
            String input = "This is a paragraph with a soft\n" +
                    "line break.\n\n" +
                    "This is another paragraph that has\n" +
                    "> Some text that\n" +
                    "> is in a\n" +
                    "> block quote.\n\n" +
                    "This is another paragraph with a ~~strikethrough~~ word.";
            StringToHTML obj = new StringToHTML();
            System.out.println( obj.retHTMLStr(input));

/*
Expected Output:
"<p>This is a paragraph with a soft<br />line break.</p>

<p>This is another paragraph that has <br />
  <blockquote>Some text that<br />is in a<br />block quote.</blockquote>
</p>

<p>This is another paragraph with a <del>strikethrough</del> word.</p>"

Note:
It's not important to produce this specific output! We only care if the HTML is valid.
*/
        }
        private String retHTMLStr(String str) throws Exception{
            StringBuilder sb = new StringBuilder("<p>");
            char temp = 'a';
            boolean blockFlag = false;
            boolean delFlag = false;
            if(str == null) { throw new Exception("Null Pointer");}
            if(str.length() == 0) return "No String to Convert";
            Map<Character, String> map = getHTMLTag();
            for(char ch: str.toCharArray()){

                if(map.containsKey(ch)){
                    if(ch =='\n' && temp == '\n'){
                        if(blockFlag){
                            sb.append("</blockquote></p>");
                            blockFlag = false;
                        }
                        else
                            sb.append("</p>");
                    }
                    else if(ch == '\n'){
                        if(blockFlag){
                            sb.append("</blockquote>");
                            blockFlag = false;
                        }
                        else{
                            sb.append(map.get(ch));
                        }
                    }
                    else if(ch == '>'){

                        sb.append(map.get(ch));
                        blockFlag = true;
                    }
                    else if(ch == '~' && temp == '~'){
                        if(delFlag){
                            sb.append("</del>");
                            delFlag = false;
                        }
                        else{
                            sb.append(map.get(ch));
                            delFlag = true;
                        }
                    }


                }

                else{
                    sb.append(ch);
                }
                temp = ch;

            }
            if (sb.lastIndexOf("</p>") != sb.length()-1) sb.append("</p>");
            return sb.toString();
        }


        private Map<Character, String> getHTMLTag(){
            Map<Character, String> map = new HashMap<Character, String>();
            map.put('\n', "<br />");
            map.put('>', "<blockquote>");
            map.put('~', "<del>");

            return map;
        }
    }

