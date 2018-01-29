/*
	制作一个说明书的过程：
		A:写代码
		B:加入文档注释
		C:通过javadoc工具生成说明书
			格式：javadoc -d 目录 -author -version ArrayTool.java
				  javadoc -d doc -author -version ArrayTool.java
			注意：javadoc: 错误 - 找不到可以文档化的公共或受保护的类。
				说明类的权限不够大，用public修饰即可
*/
/**
* 这是针对数组进行操作的工具类
* @author fqy
* @version V1.0
*/
public class ArrayTool {

	//把构造方法私有
	/**
	* 这是私有构造方法
	*/
	private ArrayTool(){}

	/**
	* 遍历数组，格式是：[元素1, 元素2, ...]
	* @param arr 需要被遍历的数组
	*/
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) {
				System.out.print(arr[x]);
			}else {
				System.out.print(arr[x]+", ");
			}
		}
		System.out.println("]");
	}

	/**
	* 获取数组中的最大值
	* @param arr 被获取最大值的数组
	* @return int 返回数组中的最大值
	*/
	public static int getMax(int[] arr) {
		int max = arr[0];

		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}

		return max;
	}
}