/*
 * @Author: 柚岩龙蜥
 * @Date: 2024-05-26 22:37:56
 * @LastEditors: 柚岩龙蜥
 * @LastEditTime: 2024-05-26 22:41:32
 * @FilePath: \code\src\Calculator.java
 * @Description:  
 * 
 */

public class Calculator 
{
	private static int result; // 静态变量，用于存储运行结果
	
    public void add(int n) 
    {
        result = result + n;
    }
    public void substract(int n) 
    {
        result = result - 1;  //Bug: 正确的应该是 result = result - n
    }
    public void multiply(int n) 
    {
    	 // 此方法尚未写好
    }         
    public void divide(int n) 
    {
        result = result / n;
    }
    public void square(int n)
    {
        result = n * n;
    }
    public void squareRoot(int n) 
    {
        for (; ;) ;      //Bug : 死循环
    }
    public void clear() // 将结果清零
    {     
        result = 0;
    }
    public int getResult()
    {
        return result;
    }
}
