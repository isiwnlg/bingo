package bingo.asp;

import java.util.LinkedHashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class ASPPageElement extends ASPObject{
   protected ASPPageElement() {
      super(null);
   }
   private static final Logger logger = LoggerFactory.getLogger(ASPPageElement.class);
   
   private String id;
   private Set<String> clazz = new LinkedHashSet<String>();//LQW 会不会太重量级了呢？
   private String style;
   private String title;
   
   
   public void clearClazz(){
      this.clazz.clear();
   }
   
   public boolean addClazz(String clazz){
      return this.clazz.add(clazz);
   }
   
   public boolean removeClazz(String clazz){
      return this.clazz.remove(clazz);
   }
   //**getter and setters
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public Set<String> getClazz() {
      return clazz;
   }
   
   public String getStyle() {
      return style;
   }
   public void setStyle(String style) {
      this.style = style;
   }
   public String getTitle() {
      return title;
   }
   public void setTitle(String title) {
      this.title = title;
   }
}
