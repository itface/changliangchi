
public class Test {

	/**
	 * ����ʱ������������ű���ʱ�����ɵĸ������������ַ����ͳ����ȣ��ͷ������ã���ͽӿڵ�ȫ�޶������ֶε����ƺ������������������ƺ���������
	 * Java��8�ֻ�������(Byte, Short, Integer, Long, Character, Boolean, Float, Double), 
	 * ��Float��Double����, �������ֶ�ʵ���˳�����, ��������ֻ�ڴ��ڵ���-128����С�ڵ���127ʱ��ʹ�ó����ء�
	 * @param args
	 */
	public static void main(String[] args){
		Integer a = 127;
		 Integer b = 127;
		 System.out.println("����127:");
		 System.out.println(a == b);
		 System.out.println("*****************");
		 a = 128;
		 b = 128;
		 System.out.println("����128:");
		 System.out.println(a == b);
		 System.out.println("*****************");
		 a = -128;
		 b = -128;
		 System.out.println("����-128:");
		 System.out.println(a == b);
		 System.out.println("*****************");
		 a = -129;
		 b = -129;
		 System.out.println("����-129:");
		 System.out.println(a == b);
		 System.out.println("*****************");
		 // ����Boolean
		 System.out.println("����Boolean");
		 Boolean c = true;
		 Boolean d = true;
		 System.out.println(c == d);
		 d = new Boolean(true);
		 System.out.println(c == d);
	}
}
