package com.ueasy.test;

public class TestMacJavaEnvironment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Java����ʱ�����汾:\n"+System.getProperty("java.version"));

		   System.out.println("Java ����ʱ������Ӧ��:\n"+System.getProperty("java.vendor"));

		   System.out.println("Java ��Ӧ�̵�URL:\n"+System.getProperty("java.vendor.url"));

		   System.out.println("Java��װĿ¼:\n"+System.getProperty("java.home"));

		   System.out.println("Java ������淶�汾:\n"+System.getProperty("java.vm.specification.version"));

		   System.out.println("Java ���ʽ�汾��:\n"+System.getProperty("java.class.version"));
		   
		   System.out.println("Java��·����\n"+System.getProperty("java.class.path"));

		   System.out.println("���ؿ�ʱ������·���б�:\n"+System.getProperty("java.library.path"));

		   System.out.println("Ĭ�ϵ���ʱ�ļ�·��:\n"+System.getProperty("java.io.tmpdir"));

		   System.out.println("Ҫʹ�õ� JIT ������������:\n"+System.getProperty("java.compiler"));

		   System.out.println("һ��������չĿ¼��·��:\n"+System.getProperty("java.ext.dirs"));

		   System.out.println("����ϵͳ������:\n"+System.getProperty("os.name"));

		   System.out.println("����ϵͳ�ļܹ�:\n"+System.getProperty("os.arch"));

		   System.out.println("����ϵͳ�İ汾:\n"+System.getProperty("os.version"));

		   System.out.println("�ļ��ָ������� UNIX ϵͳ���ǡ�/����:\n"+System.getProperty("file.separator"));

		   System.out.println("·���ָ������� UNIX ϵͳ���ǡ�:����:\n"+System.getProperty("path.separator"));

		   System.out.println("�зָ������� UNIX ϵͳ���ǡ�/n����:\n"+System.getProperty("line.separator"));

		   System.out.println("�û����˻�����:\n"+System.getProperty("user.name"));

		   System.out.println("�û�����Ŀ¼:\n"+System.getProperty("user.home"));
		   
		   System.out.println("�û��ĵ�ǰ����Ŀ¼:\n"+System.getProperty("user.dir")); 

	}

}
