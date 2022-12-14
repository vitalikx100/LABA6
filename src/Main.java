import functions.*;
import functions.basic.*;

import java.io.*;

public class Main{
    public static void main(String[] args) {
        double leftX=0;
        double rightX=5;
        double values[]={-1.0,1.0,3.0,5.0,7.0};

        LinkedListTabulatedFunction temp1=null;
        try {
            temp1=new LinkedListTabulatedFunction(leftX,rightX,values);
        } catch (InappropriateFunctionPointException e) {
            throw new RuntimeException(e);
        }
        System.out.println(temp1.toString());

        try {
            Object temp2= temp1.clone();
            System.out.println(temp2.equals(temp1));


            System.out.println(temp1.hashCode());
            System.out.println();
            System.out.println(temp2.hashCode());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
