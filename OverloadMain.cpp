package PolyOverload;
  class Multiply{
  int getMultiply(int num1, int num2)  {
   return(num1*num2);}
  float getMultiply(float num1, float num2) {
  return(num1*num2);}
public String getMultiply(double d, double e) {
  // TODO Auto-generated method stub
   return null;}}
public class OverloadMain {
public static void main(String[] args) {
 // TODO Auto-generated method stub
  Multiply m = new Multiply();
  System.out.println("Multiplication of Two integer number = "+ m.getMultiply(5, 6));
System.out.println("Multiplication of Two integer number = "+ m.getMultiply(12.2f, 11.2f));}}

