public ArrayList<Point2> getTexCoordsFromSquare(float x1, float y1,
		float x2, float y2) {
	ArrayList<Point2> res = new ArrayList<Point2>();

	res.add(new Point2(x1,y1));
	res.add(new Point2(x1,y2));
	res.add(new Point2(x2,y2));

	res.add(new Point2(x1,y1));
	res.add(new Point2(x2,y2));
	res.add(new Point2(x2,y1));

	return res;
}
