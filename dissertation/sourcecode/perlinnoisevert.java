uniform mat4 uMVMatrix;
uniform mat4 uPMatrix;

attribute vec3 aVertexPosition;
attribute vec2 aTextureCoord;

varying vec3 vTexCoord3D;

void main(void) {
	gl_Position = uMVMatrix * vec4(aVertexPosition, 1.0);

	vTexCoord3D = vec3(aTextureCoord,0);
}
