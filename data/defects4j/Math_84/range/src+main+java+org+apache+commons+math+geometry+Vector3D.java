{
  "filepath": "/tmp/Math-84b/src/main/java/org/apache/commons/math/geometry/Vector3D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector3D",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 539,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Null vector (coordinates: 0, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_I"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " First canonical vector (coordinates: 1, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_I"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Opposite of the first canonical vector (coordinates: -1, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_J"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Second canonical vector (coordinates: 0, 1, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_J"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Opposite of the second canonical vector (coordinates: 0, -1, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_K"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Third canonical vector (coordinates: 0, 0, 1). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_K"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Opposite of the third canonical vector (coordinates: 0, 0, -1).  "
    },
    {
      "type": "field",
      "varNames": [
        "NaN"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " A vector with all coordinates set to NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "POSITIVE_INFINITY"
      ],
      "begin_line": 60,
      "end_line": 61,
      "comment": " A vector with all coordinates set to positive infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_INFINITY"
      ],
      "begin_line": 64,
      "end_line": 65,
      "comment": " A vector with all coordinates set to negative infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 68,
      "end_line": 69,
      "comment": " Default format. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Abscissa. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Ordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Height. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, double, double)",
      "begin_line": 92,
      "end_line": 96,
      "comment": " Simple constructor.\n   * Build a vector from its coordinates\n   * @param x abscissa\n   * @param y ordinate\n   * @param z height\n   * @see #getX()\n   * @see #getY()\n   * @see #getZ()\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 15)",
        "(line 94,col 5)-(line 94,col 15)",
        "(line 95,col 5)-(line 95,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, double)",
      "begin_line": 106,
      "end_line": 111,
      "comment": " Simple constructor.\n   * Build a vector from its azimuthal coordinates\n   * @param alpha azimuth (\u0026alpha;) around Z\n   *              (0 is +X, \u0026pi;/2 is +Y, \u0026pi; is -X and 3\u0026pi;/2 is -Y)\n   * @param delta elevation (\u0026delta;) above (XY) plane, from -\u0026pi;/2 to +\u0026pi;/2\n   * @see #getAlpha()\n   * @see #getDelta()\n   ",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 38)",
        "(line 108,col 5)-(line 108,col 40)",
        "(line 109,col 5)-(line 109,col 40)",
        "(line 110,col 5)-(line 110,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 119,
      "end_line": 123,
      "comment": " Multiplicative constructor\n   * Build a vector from another one and a scale factor. \n   * The vector built will be a * u\n   * @param a scale factor\n   * @param u base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 21)",
        "(line 121,col 5)-(line 121,col 21)",
        "(line 122,col 5)-(line 122,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 133,
      "end_line": 137,
      "comment": " Linear constructor\n   * Build a vector from two other ones and corresponding scale factors.\n   * The vector built will be a1 * u1 + a2 * u2\n   * @param a1 first scale factor\n   * @param u1 first base (unscaled) vector\n   * @param a2 second scale factor\n   * @param u2 second base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 35)",
        "(line 135,col 5)-(line 135,col 35)",
        "(line 136,col 5)-(line 136,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 149,
      "end_line": 154,
      "comment": " Linear constructor\n   * Build a vector from three other ones and corresponding scale factors.\n   * The vector built will be a1 * u1 + a2 * u2 + a3 * u3\n   * @param a1 first scale factor\n   * @param u1 first base (unscaled) vector\n   * @param a2 second scale factor\n   * @param u2 second base (unscaled) vector\n   * @param a3 third scale factor\n   * @param u3 third base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 151,col 5)-(line 151,col 47)",
        "(line 152,col 5)-(line 152,col 47)",
        "(line 153,col 5)-(line 153,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 168,
      "end_line": 173,
      "comment": " Linear constructor\n   * Build a vector from four other ones and corresponding scale factors.\n   * The vector built will be a1 * u1 + a2 * u2 + a3 * u3 + a4 * u4\n   * @param a1 first scale factor\n   * @param u1 first base (unscaled) vector\n   * @param a2 second scale factor\n   * @param u2 second base (unscaled) vector\n   * @param a3 third scale factor\n   * @param u3 third base (unscaled) vector\n   * @param a4 fourth scale factor\n   * @param u4 fourth base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 170,col 5)-(line 170,col 59)",
        "(line 171,col 5)-(line 171,col 59)",
        "(line 172,col 5)-(line 172,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getX()",
      "begin_line": 179,
      "end_line": 181,
      "comment": " Get the abscissa of the vector.\n   * @return abscissa of the vector\n   * @see #Vector3D(double, double, double)\n   ",
      "child_ranges": [
        "(line 180,col 5)-(line 180,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getY()",
      "begin_line": 187,
      "end_line": 189,
      "comment": " Get the ordinate of the vector.\n   * @return ordinate of the vector\n   * @see #Vector3D(double, double, double)\n   ",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getZ()",
      "begin_line": 195,
      "end_line": 197,
      "comment": " Get the height of the vector.\n   * @return height of the vector\n   * @see #Vector3D(double, double, double)\n   ",
      "child_ranges": [
        "(line 196,col 5)-(line 196,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getNorm1()",
      "begin_line": 202,
      "end_line": 204,
      "comment": " Get the L\u003csub\u003e1\u003c/sub\u003e norm for the vector.\n   * @return L\u003csub\u003e1\u003c/sub\u003e norm for the vector\n   ",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getNorm()",
      "begin_line": 209,
      "end_line": 211,
      "comment": " Get the L\u003csub\u003e2\u003c/sub\u003e norm for the vector.\n   * @return euclidian norm for the vector\n   ",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getNormSq()",
      "begin_line": 216,
      "end_line": 218,
      "comment": " Get the square of the norm for the vector.\n   * @return square of the euclidian norm for the vector\n   ",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getNormInf()",
      "begin_line": 223,
      "end_line": 225,
      "comment": " Get the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm for the vector.\n   * @return L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm for the vector\n   ",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getAlpha()",
      "begin_line": 231,
      "end_line": 233,
      "comment": " Get the azimuth of the vector.\n   * @return azimuth (\u0026alpha;) of the vector, between -\u0026pi; and +\u0026pi;\n   * @see #Vector3D(double, double)\n   ",
      "child_ranges": [
        "(line 232,col 5)-(line 232,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getDelta()",
      "begin_line": 239,
      "end_line": 241,
      "comment": " Get the elevation of the vector.\n   * @return elevation (\u0026delta;) of the vector, between -\u0026pi;/2 and +\u0026pi;/2\n   * @see #Vector3D(double, double)\n   ",
      "child_ranges": [
        "(line 240,col 5)-(line 240,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.add(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 247,
      "end_line": 249,
      "comment": " Add a vector to the instance.\n   * @param v vector to add\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 248,col 5)-(line 248,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.add(double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 256,
      "end_line": 258,
      "comment": " Add a scaled vector to the instance.\n   * @param factor scale factor to apply to v before adding it\n   * @param v vector to add\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 257,col 5)-(line 257,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.subtract(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 264,
      "end_line": 266,
      "comment": " Subtract a vector from the instance.\n   * @param v vector to subtract\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 265,col 5)-(line 265,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.subtract(double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 273,
      "end_line": 275,
      "comment": " Subtract a scaled vector from the instance.\n   * @param factor scale factor to apply to v before subtracting it\n   * @param v vector to subtract\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 274,col 5)-(line 274,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.normalize()",
      "begin_line": 281,
      "end_line": 287,
      "comment": " Get a normalized vector aligned with the instance.\n   * @return a new normalized vector\n   * @exception ArithmeticException if the norm is zero\n   ",
      "child_ranges": [
        "(line 282,col 5)-(line 282,col 25)",
        "(line 283,col 5)-(line 285,col 5)",
        "(line 286,col 5)-(line 286,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.orthogonal()",
      "begin_line": 304,
      "end_line": 321,
      "comment": " Get a vector orthogonal to the instance.\n   * \u003cp\u003eThere are an infinite number of normalized vectors orthogonal\n   * to the instance. This method picks up one of them almost\n   * arbitrarily. It is useful when one needs to compute a reference\n   * frame with one of the axes in a predefined direction. The\n   * following example shows how to build a frame having the k axis\n   * aligned with the known vector u :\n   * \u003cpre\u003e\u003ccode\u003e\n   *   Vector3D k \u003d u.normalize();\n   *   Vector3D i \u003d k.orthogonal();\n   *   Vector3D j \u003d Vector3D.crossProduct(k, i);\n   * \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n   * @return a new normalized vector orthogonal to the instance\n   * @exception ArithmeticException if the norm of the instance is null\n   ",
      "child_ranges": [
        "(line 306,col 5)-(line 306,col 39)",
        "(line 307,col 5)-(line 309,col 5)",
        "(line 311,col 5)-(line 317,col 5)",
        "(line 318,col 5)-(line 318,col 51)",
        "(line 319,col 5)-(line 319,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.angle(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 334,
      "end_line": 355,
      "comment": " Compute the angular separation between two vectors.\n   * \u003cp\u003eThis method computes the angular separation between two\n   * vectors using the dot product for well separated vectors and the\n   * cross product for almost aligned vectors. This allows to have a\n   * good accuracy in all cases, even for vectors very close to each\n   * other.\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return angular separation between v1 and v2\n   * @exception ArithmeticException if either vector has a null norm\n   ",
      "child_ranges": [
        "(line 336,col 5)-(line 336,col 53)",
        "(line 337,col 5)-(line 339,col 5)",
        "(line 341,col 5)-(line 341,col 36)",
        "(line 342,col 5)-(line 342,col 44)",
        "(line 343,col 5)-(line 350,col 5)",
        "(line 353,col 5)-(line 353,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.negate()",
      "begin_line": 360,
      "end_line": 362,
      "comment": " Get the opposite of the instance.\n   * @return a new vector which is opposite to the instance\n   ",
      "child_ranges": [
        "(line 361,col 5)-(line 361,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.scalarMultiply(double)",
      "begin_line": 368,
      "end_line": 370,
      "comment": " Multiply the instance by a scalar\n   * @param a scalar\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 369,col 5)-(line 369,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.isNaN()",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n   * Returns true if any coordinate of this vector is NaN; false otherwise\n   * @return  true if any coordinate of this vector is NaN; false otherwise\n   ",
      "child_ranges": [
        "(line 377,col 7)-(line 377,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.isInfinite()",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\n   * Returns true if any coordinate of this vector is infinite and none are NaN;\n   * false otherwise\n   * @return  true if any coordinate of this vector is infinite and none are NaN;\n   * false otherwise\n   ",
      "child_ranges": [
        "(line 387,col 7)-(line 387,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.equals(java.lang.Object)",
      "begin_line": 409,
      "end_line": 434,
      "comment": "\n   * Test for the equality of two 3D vectors.\n   * \u003cp\u003e\n   * If all coordinates of two 3D vectors are exactly the same, and none are\n   * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two 3D vectors are considered to be equal.\n   * \u003c/p\u003e\n   * \u003cp\u003e\n   * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n   * and be equals to each other - i.e, if either (or all) coordinates of the\n   * 3D vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the 3D vector is equal to\n   * {@link #NaN}.\n   * \u003c/p\u003e\n   *\n   * @param other Object to test for equality to this\n   * @return true if two 3D vector objects are equal, false if\n   *         object is null, not an instance of Vector3D, or\n   *         not equal to this Vector3D instance\n   * \n   ",
      "child_ranges": [
        "(line 412,col 5)-(line 414,col 5)",
        "(line 416,col 5)-(line 418,col 5)",
        "(line 420,col 5)-(line 432,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.hashCode()",
      "begin_line": 443,
      "end_line": 449,
      "comment": "\n   * Get a hashCode for the 3D vector.\n   * \u003cp\u003e\n   * All NaN values have the same hash code.\u003c/p\u003e\n   * \n   * @return a hash code value for this object\n   ",
      "child_ranges": [
        "(line 445,col 7)-(line 447,col 7)",
        "(line 448,col 7)-(line 448,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.dotProduct(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 456,
      "end_line": 458,
      "comment": " Compute the dot-product of two vectors.\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the dot product v1.v2\n   ",
      "child_ranges": [
        "(line 457,col 5)-(line 457,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.crossProduct(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 465,
      "end_line": 469,
      "comment": " Compute the cross-product of two vectors.\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the cross product v1 ^ v2 as a new Vector\n   ",
      "child_ranges": [
        "(line 466,col 5)-(line 468,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.distance1(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 479,
      "end_line": 484,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e1\u003c/sub\u003e norm.\n   * \u003cp\u003eCalling this method is equivalent to calling:\n   * \u003ccode\u003ev1.subtract(v2).getNorm1()\u003c/code\u003e except that no intermediate\n   * vector is built\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the distance between v1 and v2 according to the L\u003csub\u003e1\u003c/sub\u003e norm\n   ",
      "child_ranges": [
        "(line 480,col 5)-(line 480,col 44)",
        "(line 481,col 5)-(line 481,col 44)",
        "(line 482,col 5)-(line 482,col 44)",
        "(line 483,col 5)-(line 483,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.distance(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 494,
      "end_line": 499,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n   * \u003cp\u003eCalling this method is equivalent to calling:\n   * \u003ccode\u003ev1.subtract(v2).getNorm()\u003c/code\u003e except that no intermediate\n   * vector is built\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the distance between v1 and v2 according to the L\u003csub\u003e2\u003c/sub\u003e norm\n   ",
      "child_ranges": [
        "(line 495,col 5)-(line 495,col 34)",
        "(line 496,col 5)-(line 496,col 34)",
        "(line 497,col 5)-(line 497,col 34)",
        "(line 498,col 5)-(line 498,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.distanceInf(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 509,
      "end_line": 514,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n   * \u003cp\u003eCalling this method is equivalent to calling:\n   * \u003ccode\u003ev1.subtract(v2).getNormInf()\u003c/code\u003e except that no intermediate\n   * vector is built\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the distance between v1 and v2 according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n   ",
      "child_ranges": [
        "(line 510,col 5)-(line 510,col 44)",
        "(line 511,col 5)-(line 511,col 44)",
        "(line 512,col 5)-(line 512,col 44)",
        "(line 513,col 5)-(line 513,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.distanceSq(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 524,
      "end_line": 529,
      "comment": " Compute the square of the distance between two vectors.\n   * \u003cp\u003eCalling this method is equivalent to calling:\n   * \u003ccode\u003ev1.subtract(v2).getNormSq()\u003c/code\u003e except that no intermediate\n   * vector is built\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the square of the distance between v1 and v2\n   ",
      "child_ranges": [
        "(line 525,col 5)-(line 525,col 34)",
        "(line 526,col 5)-(line 526,col 34)",
        "(line 527,col 5)-(line 527,col 34)",
        "(line 528,col 5)-(line 528,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.toString()",
      "begin_line": 534,
      "end_line": 537,
      "comment": " Get a string representation of this vector.\n   * @return a string representation of this vector\n   ",
      "child_ranges": [
        "(line 536,col 7)-(line 536,col 41)"
      ]
    }
  ]
}