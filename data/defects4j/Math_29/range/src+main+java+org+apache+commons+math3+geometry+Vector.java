{
  "filepath": "/tmp/Math-29b/src/main/java/org/apache/commons/math3/geometry/Vector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 166,
      "comment": " This interface represents a generic vector in a vectorial space or a point in an affine space.\n * @param \u003cS\u003e Type of the space.\n * @version $Id$\n * @see Space\n * @see Vector\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.getSpace()",
      "begin_line": 34,
      "end_line": 34,
      "comment": " Get the space to which the vector belongs.\n     * @return containing space\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.getZero()",
      "begin_line": 39,
      "end_line": 39,
      "comment": " Get the null vector of the vectorial space or origin point of the affine space.\n     * @return null vector of the vectorial space or origin point of the affine space\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.getNorm1()",
      "begin_line": 44,
      "end_line": 44,
      "comment": " Get the L\u003csub\u003e1\u003c/sub\u003e norm for the vector.\n     * @return L\u003csub\u003e1\u003c/sub\u003e norm for the vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.getNorm()",
      "begin_line": 49,
      "end_line": 49,
      "comment": " Get the L\u003csub\u003e2\u003c/sub\u003e norm for the vector.\n     * @return Euclidean norm for the vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.getNormSq()",
      "begin_line": 54,
      "end_line": 54,
      "comment": " Get the square of the norm for the vector.\n     * @return square of the Euclidean norm for the vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.getNormInf()",
      "begin_line": 59,
      "end_line": 59,
      "comment": " Get the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm for the vector.\n     * @return L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm for the vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.add(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 65,
      "end_line": 65,
      "comment": " Add a vector to the instance.\n     * @param v vector to add\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.add(double, org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 72,
      "end_line": 72,
      "comment": " Add a scaled vector to the instance.\n     * @param factor scale factor to apply to v before adding it\n     * @param v vector to add\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.subtract(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 78,
      "end_line": 78,
      "comment": " Subtract a vector from the instance.\n     * @param v vector to subtract\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.subtract(double, org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 85,
      "end_line": 85,
      "comment": " Subtract a scaled vector from the instance.\n     * @param factor scale factor to apply to v before subtracting it\n     * @param v vector to subtract\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.negate()",
      "begin_line": 90,
      "end_line": 90,
      "comment": " Get the opposite of the instance.\n     * @return a new vector which is opposite to the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.normalize()",
      "begin_line": 96,
      "end_line": 96,
      "comment": " Get a normalized vector aligned with the instance.\n     * @return a new normalized vector\n     * @exception ArithmeticException if the norm is zero\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.scalarMultiply(double)",
      "begin_line": 102,
      "end_line": 102,
      "comment": " Multiply the instance by a scalar.\n     * @param a scalar\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.isNaN()",
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Returns true if any coordinate of this vector is NaN; false otherwise\n     * @return  true if any coordinate of this vector is NaN; false otherwise\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.isInfinite()",
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Returns true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     * @return  true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.distance1(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 125,
      "end_line": 125,
      "comment": " Compute the distance between the instance and another vector according to the L\u003csub\u003e1\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNorm1()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the distance between the instance and p according to the L\u003csub\u003e1\u003c/sub\u003e norm\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.distance(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 134,
      "end_line": 134,
      "comment": " Compute the distance between the instance and another vector according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNorm()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the distance between the instance and p according to the L\u003csub\u003e2\u003c/sub\u003e norm\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.distanceInf(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 143,
      "end_line": 143,
      "comment": " Compute the distance between the instance and another vector according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNormInf()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the distance between the instance and p according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.distanceSq(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 152,
      "end_line": 152,
      "comment": " Compute the square of the distance between the instance and another vector.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNormSq()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the square of the distance between the instance and p\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.dotProduct(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 158,
      "end_line": 158,
      "comment": " Compute the dot-product of the instance and another vector.\n     * @param v second vector\n     * @return the dot product this.v\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.toString(java.text.NumberFormat)",
      "begin_line": 164,
      "end_line": 164,
      "comment": " Get a string representation of this vector.\n     * @param format the custom format for components\n     * @return a string representation of this vector\n     ",
      "child_ranges": []
    }
  ]
}