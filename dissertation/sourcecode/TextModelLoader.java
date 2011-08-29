protected ArrayList<VertexData> getVerticesDataFromStr(String formattedString) {
	ArrayList<VertexData> vertexDatas = new ArrayList<VertexData>();
	String[] lines = formattedString.split("\n");

	for (String line : lines) {
		if(line.equals(""))
		{
			continue;
		}
		String[] tokens = line.split("\\s");
		if( ! tokens[0].equals("//")) {
			float posX = Float.parseFloat(tokens[0]);
			float posY = Float.parseFloat(tokens[1]);
			float poxZ = Float.parseFloat(tokens[2]);

			float normalX = Float.parseFloat(tokens[3]);
			float normalY = Float.parseFloat(tokens[4]);
			float normalZ = Float.parseFloat(tokens[5]);

			float uCoord = Float.parseFloat(tokens[6]);
			float vCoord = Float.parseFloat(tokens[7]);

			vertexDatas.add(new VertexData(posX, posY, poxZ, 
						normalX, normalY, normalZ, 
						uCoord, vCoord));
		}
	}
	return vertexDatas;
}
