package org.kie.example.project1;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Guests implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "How many guests")
   private java.lang.Integer number;

   public Guests()
   {
   }

   public java.lang.Integer getNumber()
   {
      return this.number;
   }

   public void setNumber(java.lang.Integer number)
   {
      this.number = number;
   }

   public Guests(java.lang.Integer number)
   {
      this.number = number;
   }

}