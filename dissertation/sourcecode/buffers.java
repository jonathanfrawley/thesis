protected WebGLBuffer loadVertexBuffer(final ArrayList<VertexData> vertexDatas) {
	WebGLBuffer vertexPosBuffer = glContext.createBuffer();
	glContext.bindBuffer(WebGLRenderingContext.ARRAY_BUFFER, vertexPosBuffer);
	glContext.bufferData(WebGLRenderingContext.ARRAY_BUFFER, 
			Float32Array.create(getVertexPositions(vertexDatas)), 
			WebGLRenderingContext.STATIC_DRAW);
	return vertexPosBuffer;
}

protected WebGLBuffer loadNormalBuffer(final ArrayList<VertexData> vertexDatas) {
	WebGLBuffer normalBuffer = glContext.createBuffer();
	glContext.bindBuffer(WebGLRenderingContext.ARRAY_BUFFER, normalBuffer);
	glContext.bufferData(WebGLRenderingContext.ARRAY_BUFFER, 
			Float32Array.create(getVertexNormals(vertexDatas)), 
			WebGLRenderingContext.STATIC_DRAW);
	return normalBuffer;
}

protected WebGLBuffer loadTexCoordBuffer(final ArrayList<VertexData> vertexDatas) {
	WebGLBuffer texCoordBuffer = glContext.createBuffer();
	glContext.bindBuffer(WebGLRenderingContext.ARRAY_BUFFER, texCoordBuffer);
	glContext.bufferData(WebGLRenderingContext.ARRAY_BUFFER, 
			Float32Array.create(getTexCoords(vertexDatas)), 
			WebGLRenderingContext.STATIC_DRAW);
	return texCoordBuffer;
}
