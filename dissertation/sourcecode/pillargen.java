protected void generateTriangles() {
	ArrayList<Triangle> res = new ArrayList<Triangle>();

	float angle = (totalAngle/numSlices);
	for (int i=0; i < numSlices ; i++) {

		float x1 = x + (cos(degreeToRad( angle * i )) * radius);
		float y1 = y + (sin(degreeToRad( angle * i )) * radius);

		if((i+1) <= numSlices) { //Defensive coding, shouldn't not happen.
			float x2 = x + (cos(degreeToRad( angle * (i+1) )) * radius);
			float y2 = y + (sin(degreeToRad( angle * (i+1) )) * radius);

			res.addAll(extrudeLineSegTo3D(x1,y1, x2,y2, lowY, highY));
		}
	}

	this.triangles = res;
}

