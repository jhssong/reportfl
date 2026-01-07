{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/geometry/Vector3D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector3D",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 532,
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
      "begin_line": 58,
      "end_line": 58,
      "comment": " A vector with all coordinates set to NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "POSITIVE_INFINITY"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": " A vector with all coordinates set to positive infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_INFINITY"
      ],
      "begin_line": 66,
      "end_line": 67,
      "comment": " A vector with all coordinates set to negative infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": " Default format. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Abscissa. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Ordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Height. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, double, double)",
      "begin_line": 94,
      "end_line": 98,
      "comment": " Simple constructor.\n   * Build a vector from its coordinates\n   * @param x abscissa\n   * @param y ordinate\n   * @param z height\n   * @see #getX()\n   * @see #getY()\n   * @see #getZ()\n   ",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 15)",
        "(line 96,col 5)-(line 96,col 15)",
        "(line 97,col 5)-(line 97,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, double)",
      "begin_line": 108,
      "end_line": 113,
      "comment": " Simple constructor.\n   * Build a vector from its azimuthal coordinates\n   * @param alpha azimuth (\u0026alpha;) around Z\n   *              (0 is +X, \u0026pi;/2 is +Y, \u0026pi; is -X and 3\u0026pi;/2 is -Y)\n   * @param delta elevation (\u0026delta;) above (XY) plane, from -\u0026pi;/2 to +\u0026pi;/2\n   * @see #getAlpha()\n   * @see #getDelta()\n   ",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 38)",
        "(line 110,col 5)-(line 110,col 40)",
        "(line 111,col 5)-(line 111,col 40)",
        "(line 112,col 5)-(line 112,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 121,
      "end_line": 125,
      "comment": " Multiplicative constructor\n   * Build a vector from another one and a scale factor.\n   * The vector built will be a * u\n   * @param a scale factor\n   * @param u base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 21)",
        "(line 123,col 5)-(line 123,col 21)",
        "(line 124,col 5)-(line 124,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 135,
      "end_line": 139,
      "comment": " Linear constructor\n   * Build a vector from two other ones and corresponding scale factors.\n   * The vector built will be a1 * u1 + a2 * u2\n   * @param a1 first scale factor\n   * @param u1 first base (unscaled) vector\n   * @param a2 second scale factor\n   * @param u2 second base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 35)",
        "(line 137,col 5)-(line 137,col 35)",
        "(line 138,col 5)-(line 138,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 151,
      "end_line": 156,
      "comment": " Linear constructor\n   * Build a vector from three other ones and corresponding scale factors.\n   * The vector built will be a1 * u1 + a2 * u2 + a3 * u3\n   * @param a1 first scale factor\n   * @param u1 first base (unscaled) vector\n   * @param a2 second scale factor\n   * @param u2 second base (unscaled) vector\n   * @param a3 third scale factor\n   * @param u3 third base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 47)",
        "(line 154,col 5)-(line 154,col 47)",
        "(line 155,col 5)-(line 155,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 170,
      "end_line": 175,
      "comment": " Linear constructor\n   * Build a vector from four other ones and corresponding scale factors.\n   * The vector built will be a1 * u1 + a2 * u2 + a3 * u3 + a4 * u4\n   * @param a1 first scale factor\n   * @param u1 first base (unscaled) vector\n   * @param a2 second scale factor\n   * @param u2 second base (unscaled) vector\n   * @param a3 third scale factor\n   * @param u3 third base (unscaled) vector\n   * @param a4 fourth scale factor\n   * @param u4 fourth base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 59)",
        "(line 173,col 5)-(line 173,col 59)",
        "(line 174,col 5)-(line 174,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getX()",
      "begin_line": 181,
      "end_line": 183,
      "comment": " Get the abscissa of the vector.\n   * @return abscissa of the vector\n   * @see #Vector3D(double, double, double)\n   ",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getY()",
      "begin_line": 189,
      "end_line": 191,
      "comment": " Get the ordinate of the vector.\n   * @return ordinate of the vector\n   * @see #Vector3D(double, double, double)\n   ",
      "child_ranges": [
        "(line 190,col 5)-(line 190,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getZ()",
      "begin_line": 197,
      "end_line": 199,
      "comment": " Get the height of the vector.\n   * @return height of the vector\n   * @see #Vector3D(double, double, double)\n   ",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getNorm1()",
      "begin_line": 204,
      "end_line": 206,
      "comment": " Get the L\u003csub\u003e1\u003c/sub\u003e norm for the vector.\n   * @return L\u003csub\u003e1\u003c/sub\u003e norm for the vector\n   ",
      "child_ranges": [
        "(line 205,col 5)-(line 205,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getNorm()",
      "begin_line": 211,
      "end_line": 213,
      "comment": " Get the L\u003csub\u003e2\u003c/sub\u003e norm for the vector.\n   * @return euclidian norm for the vector\n   ",
      "child_ranges": [
        "(line 212,col 5)-(line 212,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getNormSq()",
      "begin_line": 218,
      "end_line": 220,
      "comment": " Get the square of the norm for the vector.\n   * @return square of the euclidian norm for the vector\n   ",
      "child_ranges": [
        "(line 219,col 5)-(line 219,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getNormInf()",
      "begin_line": 225,
      "end_line": 227,
      "comment": " Get the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm for the vector.\n   * @return L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm for the vector\n   ",
      "child_ranges": [
        "(line 226,col 5)-(line 226,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getAlpha()",
      "begin_line": 233,
      "end_line": 235,
      "comment": " Get the azimuth of the vector.\n   * @return azimuth (\u0026alpha;) of the vector, between -\u0026pi; and +\u0026pi;\n   * @see #Vector3D(double, double)\n   ",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getDelta()",
      "begin_line": 241,
      "end_line": 243,
      "comment": " Get the elevation of the vector.\n   * @return elevation (\u0026delta;) of the vector, between -\u0026pi;/2 and +\u0026pi;/2\n   * @see #Vector3D(double, double)\n   ",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.add(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 249,
      "end_line": 251,
      "comment": " Add a vector to the instance.\n   * @param v vector to add\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.add(double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 258,
      "end_line": 260,
      "comment": " Add a scaled vector to the instance.\n   * @param factor scale factor to apply to v before adding it\n   * @param v vector to add\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 259,col 5)-(line 259,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.subtract(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 266,
      "end_line": 268,
      "comment": " Subtract a vector from the instance.\n   * @param v vector to subtract\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 267,col 5)-(line 267,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.subtract(double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 275,
      "end_line": 277,
      "comment": " Subtract a scaled vector from the instance.\n   * @param factor scale factor to apply to v before subtracting it\n   * @param v vector to subtract\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 276,col 5)-(line 276,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.normalize()",
      "begin_line": 283,
      "end_line": 289,
      "comment": " Get a normalized vector aligned with the instance.\n   * @return a new normalized vector\n   * @exception ArithmeticException if the norm is zero\n   ",
      "child_ranges": [
        "(line 284,col 5)-(line 284,col 25)",
        "(line 285,col 5)-(line 287,col 5)",
        "(line 288,col 5)-(line 288,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.orthogonal()",
      "begin_line": 306,
      "end_line": 323,
      "comment": " Get a vector orthogonal to the instance.\n   * \u003cp\u003eThere are an infinite number of normalized vectors orthogonal\n   * to the instance. This method picks up one of them almost\n   * arbitrarily. It is useful when one needs to compute a reference\n   * frame with one of the axes in a predefined direction. The\n   * following example shows how to build a frame having the k axis\n   * aligned with the known vector u :\n   * \u003cpre\u003e\u003ccode\u003e\n   *   Vector3D k \u003d u.normalize();\n   *   Vector3D i \u003d k.orthogonal();\n   *   Vector3D j \u003d Vector3D.crossProduct(k, i);\n   * \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n   * @return a new normalized vector orthogonal to the instance\n   * @exception ArithmeticException if the norm of the instance is null\n   ",
      "child_ranges": [
        "(line 308,col 5)-(line 308,col 39)",
        "(line 309,col 5)-(line 311,col 5)",
        "(line 313,col 5)-(line 319,col 5)",
        "(line 320,col 5)-(line 320,col 51)",
        "(line 321,col 5)-(line 321,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.angle(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 336,
      "end_line": 357,
      "comment": " Compute the angular separation between two vectors.\n   * \u003cp\u003eThis method computes the angular separation between two\n   * vectors using the dot product for well separated vectors and the\n   * cross product for almost aligned vectors. This allows to have a\n   * good accuracy in all cases, even for vectors very close to each\n   * other.\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return angular separation between v1 and v2\n   * @exception ArithmeticException if either vector has a null norm\n   ",
      "child_ranges": [
        "(line 338,col 5)-(line 338,col 53)",
        "(line 339,col 5)-(line 341,col 5)",
        "(line 343,col 5)-(line 343,col 36)",
        "(line 344,col 5)-(line 344,col 44)",
        "(line 345,col 5)-(line 352,col 5)",
        "(line 355,col 5)-(line 355,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.negate()",
      "begin_line": 362,
      "end_line": 364,
      "comment": " Get the opposite of the instance.\n   * @return a new vector which is opposite to the instance\n   ",
      "child_ranges": [
        "(line 363,col 5)-(line 363,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.scalarMultiply(double)",
      "begin_line": 370,
      "end_line": 372,
      "comment": " Multiply the instance by a scalar\n   * @param a scalar\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 371,col 5)-(line 371,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.isNaN()",
      "begin_line": 378,
      "end_line": 380,
      "comment": "\n   * Returns true if any coordinate of this vector is NaN; false otherwise\n   * @return  true if any coordinate of this vector is NaN; false otherwise\n   ",
      "child_ranges": [
        "(line 379,col 7)-(line 379,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.isInfinite()",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n   * Returns true if any coordinate of this vector is infinite and none are NaN;\n   * false otherwise\n   * @return  true if any coordinate of this vector is infinite and none are NaN;\n   * false otherwise\n   ",
      "child_ranges": [
        "(line 389,col 7)-(line 389,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.equals(java.lang.Object)",
      "begin_line": 411,
      "end_line": 427,
      "comment": "\n   * Test for the equality of two 3D vectors.\n   * \u003cp\u003e\n   * If all coordinates of two 3D vectors are exactly the same, and none are\n   * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two 3D vectors are considered to be equal.\n   * \u003c/p\u003e\n   * \u003cp\u003e\n   * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n   * and be equals to each other - i.e, if either (or all) coordinates of the\n   * 3D vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the 3D vector is equal to\n   * {@link #NaN}.\n   * \u003c/p\u003e\n   *\n   * @param other Object to test for equality to this\n   * @return true if two 3D vector objects are equal, false if\n   *         object is null, not an instance of Vector3D, or\n   *         not equal to this Vector3D instance\n   *\n   ",
      "child_ranges": [
        "(line 414,col 5)-(line 416,col 5)",
        "(line 418,col 5)-(line 425,col 5)",
        "(line 426,col 5)-(line 426,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.hashCode()",
      "begin_line": 436,
      "end_line": 442,
      "comment": "\n   * Get a hashCode for the 3D vector.\n   * \u003cp\u003e\n   * All NaN values have the same hash code.\u003c/p\u003e\n   *\n   * @return a hash code value for this object\n   ",
      "child_ranges": [
        "(line 438,col 7)-(line 440,col 7)",
        "(line 441,col 7)-(line 441,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.dotProduct(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 449,
      "end_line": 451,
      "comment": " Compute the dot-product of two vectors.\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the dot product v1.v2\n   ",
      "child_ranges": [
        "(line 450,col 5)-(line 450,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.crossProduct(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 458,
      "end_line": 462,
      "comment": " Compute the cross-product of two vectors.\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the cross product v1 ^ v2 as a new Vector\n   ",
      "child_ranges": [
        "(line 459,col 5)-(line 461,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.distance1(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 472,
      "end_line": 477,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e1\u003c/sub\u003e norm.\n   * \u003cp\u003eCalling this method is equivalent to calling:\n   * \u003ccode\u003ev1.subtract(v2).getNorm1()\u003c/code\u003e except that no intermediate\n   * vector is built\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the distance between v1 and v2 according to the L\u003csub\u003e1\u003c/sub\u003e norm\n   ",
      "child_ranges": [
        "(line 473,col 5)-(line 473,col 44)",
        "(line 474,col 5)-(line 474,col 44)",
        "(line 475,col 5)-(line 475,col 44)",
        "(line 476,col 5)-(line 476,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.distance(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 487,
      "end_line": 492,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n   * \u003cp\u003eCalling this method is equivalent to calling:\n   * \u003ccode\u003ev1.subtract(v2).getNorm()\u003c/code\u003e except that no intermediate\n   * vector is built\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the distance between v1 and v2 according to the L\u003csub\u003e2\u003c/sub\u003e norm\n   ",
      "child_ranges": [
        "(line 488,col 5)-(line 488,col 34)",
        "(line 489,col 5)-(line 489,col 34)",
        "(line 490,col 5)-(line 490,col 34)",
        "(line 491,col 5)-(line 491,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.distanceInf(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 502,
      "end_line": 507,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n   * \u003cp\u003eCalling this method is equivalent to calling:\n   * \u003ccode\u003ev1.subtract(v2).getNormInf()\u003c/code\u003e except that no intermediate\n   * vector is built\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the distance between v1 and v2 according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n   ",
      "child_ranges": [
        "(line 503,col 5)-(line 503,col 44)",
        "(line 504,col 5)-(line 504,col 44)",
        "(line 505,col 5)-(line 505,col 44)",
        "(line 506,col 5)-(line 506,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.distanceSq(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 517,
      "end_line": 522,
      "comment": " Compute the square of the distance between two vectors.\n   * \u003cp\u003eCalling this method is equivalent to calling:\n   * \u003ccode\u003ev1.subtract(v2).getNormSq()\u003c/code\u003e except that no intermediate\n   * vector is built\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the square of the distance between v1 and v2\n   ",
      "child_ranges": [
        "(line 518,col 5)-(line 518,col 34)",
        "(line 519,col 5)-(line 519,col 34)",
        "(line 520,col 5)-(line 520,col 34)",
        "(line 521,col 5)-(line 521,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.toString()",
      "begin_line": 527,
      "end_line": 530,
      "comment": " Get a string representation of this vector.\n   * @return a string representation of this vector\n   ",
      "child_ranges": [
        "(line 529,col 7)-(line 529,col 41)"
      ]
    }
  ]
}