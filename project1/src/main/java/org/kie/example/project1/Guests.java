package org.kie.example.project1;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Guests implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("How many max number of guests?")
   private int max_num;

   @org.kie.api.definition.type.Label("How many min number of guests")
   private int min_num;

   private Integer number;

   public Guests()
   {
   }

   public int getMax_num()
   {
      return this.max_num;
   }

   public void setMax_num(int max_num)
   {
      this.max_num = max_num;
   }

   public int getMin_num()
   {
      return this.min_num;
   }

   public void setMin_num(int min_num)
   {
      this.min_num = min_num;
   }

   public java.lang.Integer getNumber()
   {
      return this.number;
   }

   public void setNumber(java.lang.Integer number)
   {
      this.number = number;
   }

   public Guests(int max_num, int min_num, java.lang.Integer number)
   {
      this.max_num = max_num;
      this.min_num = min_num;
      this.number = number;
   }

}