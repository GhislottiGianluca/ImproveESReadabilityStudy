/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 26 12:45:47 GMT 2024
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.lang3.ArraySorter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

public class ArraySorter_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      short[] shortArray0 = new short[0];
      short[] shortArray1 = ArraySorter.sort(shortArray0);
      assertArrayEquals(new short[] {}, shortArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      Object[] objectArray1 = ArraySorter.sort(objectArray0, (Comparator<? super Object>) comparator0);
      assertSame(objectArray1, objectArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Object[] objectArray1 = ArraySorter.sort(objectArray0, (Comparator<? super Object>) comparator0);
      assertSame(objectArray0, objectArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer[] integerArray0 = new Integer[5];
      Integer integer0 = new Integer((-2553));
      integerArray0[0] = integer0;
      integerArray0[1] = integerArray0[0];
      integerArray0[2] = integerArray0[0];
      integerArray0[3] = integerArray0[0];
      integerArray0[4] = integerArray0[0];
      Integer[] integerArray1 = ArraySorter.sort(integerArray0);
      assertSame(integerArray0, integerArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long[] longArray0 = new long[3];
      long[] longArray1 = ArraySorter.sort(longArray0);
      assertSame(longArray1, longArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[7];
      int[] intArray1 = ArraySorter.sort(intArray0);
      assertSame(intArray0, intArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      float[] floatArray0 = new float[0];
      float[] floatArray1 = ArraySorter.sort(floatArray0);
      assertSame(floatArray1, floatArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = ArraySorter.sort(doubleArray0);
      assertArrayEquals(new double[] {}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[0];
      char[] charArray1 = ArraySorter.sort(charArray0);
      assertSame(charArray0, charArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = ArraySorter.sort(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) 87L;
      objectArray0[1] = (Object) 'z';
      // Undeclared exception!
      try { 
        ArraySorter.sort(objectArray0, (Comparator<? super Object>) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Long cannot be cast to java.lang.Character
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        ArraySorter.sort(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ComparableTimSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = objectArray0[0];
      // Undeclared exception!
      try { 
        ArraySorter.sort(objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.ComparableTimSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = ArraySorter.sort((Object[]) null, (Comparator<? super Object>) comparator0);
      assertNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String[] stringArray1 = ArraySorter.sort(stringArray0);
      assertSame(stringArray0, stringArray1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer[] integerArray0 = ArraySorter.sort((Integer[]) null);
      assertNull(integerArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      short[] shortArray0 = new short[1];
      short[] shortArray1 = ArraySorter.sort(shortArray0);
      assertSame(shortArray1, shortArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      short[] shortArray0 = ArraySorter.sort((short[]) null);
      assertNull(shortArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long[] longArray0 = new long[0];
      long[] longArray1 = ArraySorter.sort(longArray0);
      assertSame(longArray1, longArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long[] longArray0 = ArraySorter.sort((long[]) null);
      assertNull(longArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = ArraySorter.sort(intArray0);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = ArraySorter.sort((int[]) null);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      float[] floatArray0 = new float[3];
      float[] floatArray1 = ArraySorter.sort(floatArray0);
      assertSame(floatArray0, floatArray1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      float[] floatArray0 = ArraySorter.sort((float[]) null);
      assertNull(floatArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = ArraySorter.sort(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = ArraySorter.sort((double[]) null);
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[1];
      char[] charArray1 = ArraySorter.sort(charArray0);
      assertSame(charArray0, charArray1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = ArraySorter.sort((char[]) null);
      assertNull(charArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ArraySorter.sort(byteArray0);
      assertSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = ArraySorter.sort((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArraySorter arraySorter0 = new ArraySorter();
  }
}
