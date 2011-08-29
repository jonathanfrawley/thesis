protected Vector3 generateNormalFromTri(Triangle tri) {
	// *k
	// | \ 
	// |  \   
	// |   \
	// |    \ 
	// ^b    \ 
	// |      \ 
	// |   a   \ 
	// *l-->----m*
	Vector3 k = new Vector3(tri.getX1(), tri.getY1(), tri.getZ1());
	Vector3 l = new Vector3(tri.getX2(), tri.getY2(), tri.getZ2());
	Vector3 m = new Vector3(tri.getX3(), tri.getY3(), tri.getZ3());

	Vector3 a = m.subtract(l);
	Vector3 b = k.subtract(l);

	Vector3 cross = a.crossProduct(b);

	try{
		Vector3 res = cross.normalize();
		return res;
	}catch(Exception e) {
		System.err.println("Cannot normalize vector");
		e.printStackTrace();
		return null;
	}
}
