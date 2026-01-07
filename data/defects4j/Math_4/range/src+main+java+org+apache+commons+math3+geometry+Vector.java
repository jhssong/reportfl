{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/Vector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 168,
      "comment": " This interface represents a generic vector in a vectorial space or a point in an affine space.\n * @param \u003cS\u003e Type of the space.\n * @version $Id$\n * @see Space\n * @see Vector\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.getSpace()",
      "begin_line": 36,
      "end_line": 36,
      "comment": " Get the space to which the vector belongs.\n     * @return containing space\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.getZero()",
      "begin_line": 41,
      "end_line": 41,
      "comment": " Get the null vector of the vectorial space or origin point of the affine space.\n     * @return null vector of the vectorial space or origin point of the affine space\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.getNorm1()",
      "begin_line": 46,
      "end_line": 46,
      "comment": " Get the L\u003csub\u003e1\u003c/sub\u003e norm for the vector.\n     * @return L\u003csub\u003e1\u003c/sub\u003e norm for the vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.getNorm()",
      "begin_line": 51,
      "end_line": 51,
      "comment": " Get the L\u003csub\u003e2\u003c/sub\u003e norm for the vector.\n     * @return Euclidean norm for the vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.getNormSq()",
      "begin_line": 56,
      "end_line": 56,
      "comment": " Get the square of the norm for the vector.\n     * @return square of the Euclidean norm for the vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.getNormInf()",
      "begin_line": 61,
      "end_line": 61,
      "comment": " Get the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm for the vector.\n     * @return L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm for the vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.add(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 67,
      "end_line": 67,
      "comment": " Add a vector to the instance.\n     * @param v vector to add\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.add(double, org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 74,
      "end_line": 74,
      "comment": " Add a scaled vector to the instance.\n     * @param factor scale factor to apply to v before adding it\n     * @param v vector to add\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.subtract(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 80,
      "end_line": 80,
      "comment": " Subtract a vector from the instance.\n     * @param v vector to subtract\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.subtract(double, org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 87,
      "end_line": 87,
      "comment": " Subtract a scaled vector from the instance.\n     * @param factor scale factor to apply to v before subtracting it\n     * @param v vector to subtract\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.negate()",
      "begin_line": 92,
      "end_line": 92,
      "comment": " Get the opposite of the instance.\n     * @return a new vector which is opposite to the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.normalize()",
      "begin_line": 98,
      "end_line": 98,
      "comment": " Get a normalized vector aligned with the instance.\n     * @return a new normalized vector\n     * @exception MathArithmeticException if the norm is zero\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.scalarMultiply(double)",
      "begin_line": 104,
      "end_line": 104,
      "comment": " Multiply the instance by a scalar.\n     * @param a scalar\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.isNaN()",
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * Returns true if any coordinate of this vector is NaN; false otherwise\n     * @return  true if any coordinate of this vector is NaN; false otherwise\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.isInfinite()",
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * Returns true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     * @return  true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.distance1(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 127,
      "end_line": 127,
      "comment": " Compute the distance between the instance and another vector according to the L\u003csub\u003e1\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNorm1()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the distance between the instance and p according to the L\u003csub\u003e1\u003c/sub\u003e norm\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.distance(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 136,
      "end_line": 136,
      "comment": " Compute the distance between the instance and another vector according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNorm()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the distance between the instance and p according to the L\u003csub\u003e2\u003c/sub\u003e norm\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.distanceInf(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 145,
      "end_line": 145,
      "comment": " Compute the distance between the instance and another vector according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNormInf()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the distance between the instance and p according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.distanceSq(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 154,
      "end_line": 154,
      "comment": " Compute the square of the distance between the instance and another vector.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003eq.subtract(p).getNormSq()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v second vector\n     * @return the square of the distance between the instance and p\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.dotProduct(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 160,
      "end_line": 160,
      "comment": " Compute the dot-product of the instance and another vector.\n     * @param v second vector\n     * @return the dot product this.v\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.Vector.toString(java.text.NumberFormat)",
      "begin_line": 166,
      "end_line": 166,
      "comment": " Get a string representation of this vector.\n     * @param format the custom format for components\n     * @return a string representation of this vector\n     ",
      "child_ranges": []
    }
  ]
}