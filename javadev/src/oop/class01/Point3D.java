package oop.class01;

public class Point3D extends Point2D{
	private int z;
	
	public Point3D() {
		//반드시 부모클래스의 기본 생성자를 호출함
		this(10,20,30);
		System.out.println("point3d()실행중");
	}

	public Point3D(int x, int y, int z) {
		// TODO Auto-generated constructor stub
		super(x,y);
		this.z=z;
		System.out.println("point3d(x,y,z)실행중");
		
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("z="+getZ());
	}

}