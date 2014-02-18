
public class Test {

	/**
	 * 运行时常量池用来存放编译时期生成的各种字面量（字符串和常量等）和符号引用（类和接口的全限定名、字段的名称和描述符、方法的名称和描述符）
	 * Java的8种基本类型(Byte, Short, Integer, Long, Character, Boolean, Float, Double), 
	 * 除Float和Double以外, 其它六种都实现了常量池, 但是它们只在大于等于-128并且小于等于127时才使用常量池。
	 * @param args
	 */
	public static void main(String[] args){
		Integer a = 127;
		 Integer b = 127;
		 System.out.println("等于127:");
		 System.out.println(a == b);
		 System.out.println("*****************");
		 a = 128;
		 b = 128;
		 System.out.println("等于128:");
		 System.out.println(a == b);
		 System.out.println("*****************");
		 a = -128;
		 b = -128;
		 System.out.println("等于-128:");
		 System.out.println(a == b);
		 System.out.println("*****************");
		 a = -129;
		 b = -129;
		 System.out.println("等于-129:");
		 System.out.println(a == b);
		 System.out.println("*****************");
		 // 测试Boolean
		 System.out.println("测试Boolean");
		 Boolean c = true;
		 Boolean d = true;
		 System.out.println(c == d);
		 d = new Boolean(true);
		 System.out.println(c == d);
	}
}
