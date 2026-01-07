{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/geometry/Vector3D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector3D",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 534,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Null vector (coordinates: 0, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_I"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " First canonical vector (coordinates: 1, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_I"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Opposite of the first canonical vector (coordinates: -1, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_J"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Second canonical vector (coordinates: 0, 1, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_J"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Opposite of the second canonical vector (coordinates: 0, -1, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_K"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Third canonical vector (coordinates: 0, 0, 1). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_K"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Opposite of the third canonical vector (coordinates: 0, 0, -1).  "
    },
    {
      "type": "field",
      "varNames": [
        "NaN"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " A vector with all coordinates set to NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "POSITIVE_INFINITY"
      ],
      "begin_line": 64,
      "end_line": 65,
      "comment": " A vector with all coordinates set to positive infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_INFINITY"
      ],
      "begin_line": 68,
      "end_line": 69,
      "comment": " A vector with all coordinates set to negative infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 72,
      "end_line": 73,
      "comment": " Default format. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Abscissa. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Ordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Height. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, double, double)",
      "begin_line": 96,
      "end_line": 100,
      "comment": " Simple constructor.\n   * Build a vector from its coordinates\n   * @param x abscissa\n   * @param y ordinate\n   * @param z height\n   * @see #getX()\n   * @see #getY()\n   * @see #getZ()\n   ",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 15)",
        "(line 98,col 5)-(line 98,col 15)",
        "(line 99,col 5)-(line 99,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, double)",
      "begin_line": 110,
      "end_line": 115,
      "comment": " Simple constructor.\n   * Build a vector from its azimuthal coordinates\n   * @param alpha azimuth (\u0026alpha;) around Z\n   *              (0 is +X, \u0026pi;/2 is +Y, \u0026pi; is -X and 3\u0026pi;/2 is -Y)\n   * @param delta elevation (\u0026delta;) above (XY) plane, from -\u0026pi;/2 to +\u0026pi;/2\n   * @see #getAlpha()\n   * @see #getDelta()\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 42)",
        "(line 112,col 5)-(line 112,col 44)",
        "(line 113,col 5)-(line 113,col 44)",
        "(line 114,col 5)-(line 114,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 123,
      "end_line": 127,
      "comment": " Multiplicative constructor\n   * Build a vector from another one and a scale factor.\n   * The vector built will be a * u\n   * @param a scale factor\n   * @param u base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 21)",
        "(line 125,col 5)-(line 125,col 21)",
        "(line 126,col 5)-(line 126,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 137,
      "end_line": 141,
      "comment": " Linear constructor\n   * Build a vector from two other ones and corresponding scale factors.\n   * The vector built will be a1 * u1 + a2 * u2\n   * @param a1 first scale factor\n   * @param u1 first base (unscaled) vector\n   * @param a2 second scale factor\n   * @param u2 second base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 35)",
        "(line 139,col 5)-(line 139,col 35)",
        "(line 140,col 5)-(line 140,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 153,
      "end_line": 158,
      "comment": " Linear constructor\n   * Build a vector from three other ones and corresponding scale factors.\n   * The vector built will be a1 * u1 + a2 * u2 + a3 * u3\n   * @param a1 first scale factor\n   * @param u1 first base (unscaled) vector\n   * @param a2 second scale factor\n   * @param u2 second base (unscaled) vector\n   * @param a3 third scale factor\n   * @param u3 third base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 47)",
        "(line 156,col 5)-(line 156,col 47)",
        "(line 157,col 5)-(line 157,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 172,
      "end_line": 177,
      "comment": " Linear constructor\n   * Build a vector from four other ones and corresponding scale factors.\n   * The vector built will be a1 * u1 + a2 * u2 + a3 * u3 + a4 * u4\n   * @param a1 first scale factor\n   * @param u1 first base (unscaled) vector\n   * @param a2 second scale factor\n   * @param u2 second base (unscaled) vector\n   * @param a3 third scale factor\n   * @param u3 third base (unscaled) vector\n   * @param a4 fourth scale factor\n   * @param u4 fourth base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 59)",
        "(line 175,col 5)-(line 175,col 59)",
        "(line 176,col 5)-(line 176,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getX()",
      "begin_line": 183,
      "end_line": 185,
      "comment": " Get the abscissa of the vector.\n   * @return abscissa of the vector\n   * @see #Vector3D(double, double, double)\n   ",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getY()",
      "begin_line": 191,
      "end_line": 193,
      "comment": " Get the ordinate of the vector.\n   * @return ordinate of the vector\n   * @see #Vector3D(double, double, double)\n   ",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getZ()",
      "begin_line": 199,
      "end_line": 201,
      "comment": " Get the height of the vector.\n   * @return height of the vector\n   * @see #Vector3D(double, double, double)\n   ",
      "child_ranges": [
        "(line 200,col 5)-(line 200,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getNorm1()",
      "begin_line": 206,
      "end_line": 208,
      "comment": " Get the L\u003csub\u003e1\u003c/sub\u003e norm for the vector.\n   * @return L\u003csub\u003e1\u003c/sub\u003e norm for the vector\n   ",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getNorm()",
      "begin_line": 213,
      "end_line": 215,
      "comment": " Get the L\u003csub\u003e2\u003c/sub\u003e norm for the vector.\n   * @return euclidian norm for the vector\n   ",
      "child_ranges": [
        "(line 214,col 5)-(line 214,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getNormSq()",
      "begin_line": 220,
      "end_line": 222,
      "comment": " Get the square of the norm for the vector.\n   * @return square of the euclidian norm for the vector\n   ",
      "child_ranges": [
        "(line 221,col 5)-(line 221,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getNormInf()",
      "begin_line": 227,
      "end_line": 229,
      "comment": " Get the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm for the vector.\n   * @return L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm for the vector\n   ",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getAlpha()",
      "begin_line": 235,
      "end_line": 237,
      "comment": " Get the azimuth of the vector.\n   * @return azimuth (\u0026alpha;) of the vector, between -\u0026pi; and +\u0026pi;\n   * @see #Vector3D(double, double)\n   ",
      "child_ranges": [
        "(line 236,col 5)-(line 236,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getDelta()",
      "begin_line": 243,
      "end_line": 245,
      "comment": " Get the elevation of the vector.\n   * @return elevation (\u0026delta;) of the vector, between -\u0026pi;/2 and +\u0026pi;/2\n   * @see #Vector3D(double, double)\n   ",
      "child_ranges": [
        "(line 244,col 5)-(line 244,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.add(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 251,
      "end_line": 253,
      "comment": " Add a vector to the instance.\n   * @param v vector to add\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 252,col 5)-(line 252,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.add(double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 260,
      "end_line": 262,
      "comment": " Add a scaled vector to the instance.\n   * @param factor scale factor to apply to v before adding it\n   * @param v vector to add\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 261,col 5)-(line 261,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.subtract(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 268,
      "end_line": 270,
      "comment": " Subtract a vector from the instance.\n   * @param v vector to subtract\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 269,col 5)-(line 269,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.subtract(double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 277,
      "end_line": 279,
      "comment": " Subtract a scaled vector from the instance.\n   * @param factor scale factor to apply to v before subtracting it\n   * @param v vector to subtract\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.normalize()",
      "begin_line": 285,
      "end_line": 291,
      "comment": " Get a normalized vector aligned with the instance.\n   * @return a new normalized vector\n   * @exception ArithmeticException if the norm is zero\n   ",
      "child_ranges": [
        "(line 286,col 5)-(line 286,col 25)",
        "(line 287,col 5)-(line 289,col 5)",
        "(line 290,col 5)-(line 290,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.orthogonal()",
      "begin_line": 308,
      "end_line": 325,
      "comment": " Get a vector orthogonal to the instance.\n   * \u003cp\u003eThere are an infinite number of normalized vectors orthogonal\n   * to the instance. This method picks up one of them almost\n   * arbitrarily. It is useful when one needs to compute a reference\n   * frame with one of the axes in a predefined direction. The\n   * following example shows how to build a frame having the k axis\n   * aligned with the known vector u :\n   * \u003cpre\u003e\u003ccode\u003e\n   *   Vector3D k \u003d u.normalize();\n   *   Vector3D i \u003d k.orthogonal();\n   *   Vector3D j \u003d Vector3D.crossProduct(k, i);\n   * \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n   * @return a new normalized vector orthogonal to the instance\n   * @exception ArithmeticException if the norm of the instance is null\n   ",
      "child_ranges": [
        "(line 310,col 5)-(line 310,col 39)",
        "(line 311,col 5)-(line 313,col 5)",
        "(line 315,col 5)-(line 321,col 5)",
        "(line 322,col 5)-(line 322,col 55)",
        "(line 323,col 5)-(line 323,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.angle(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 338,
      "end_line": 359,
      "comment": " Compute the angular separation between two vectors.\n   * \u003cp\u003eThis method computes the angular separation between two\n   * vectors using the dot product for well separated vectors and the\n   * cross product for almost aligned vectors. This allows to have a\n   * good accuracy in all cases, even for vectors very close to each\n   * other.\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return angular separation between v1 and v2\n   * @exception ArithmeticException if either vector has a null norm\n   ",
      "child_ranges": [
        "(line 340,col 5)-(line 340,col 53)",
        "(line 341,col 5)-(line 343,col 5)",
        "(line 345,col 5)-(line 345,col 36)",
        "(line 346,col 5)-(line 346,col 44)",
        "(line 347,col 5)-(line 354,col 5)",
        "(line 357,col 5)-(line 357,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.negate()",
      "begin_line": 364,
      "end_line": 366,
      "comment": " Get the opposite of the instance.\n   * @return a new vector which is opposite to the instance\n   ",
      "child_ranges": [
        "(line 365,col 5)-(line 365,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.scalarMultiply(double)",
      "begin_line": 372,
      "end_line": 374,
      "comment": " Multiply the instance by a scalar\n   * @param a scalar\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 373,col 5)-(line 373,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.isNaN()",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n   * Returns true if any coordinate of this vector is NaN; false otherwise\n   * @return  true if any coordinate of this vector is NaN; false otherwise\n   ",
      "child_ranges": [
        "(line 381,col 7)-(line 381,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.isInfinite()",
      "begin_line": 390,
      "end_line": 392,
      "comment": "\n   * Returns true if any coordinate of this vector is infinite and none are NaN;\n   * false otherwise\n   * @return  true if any coordinate of this vector is infinite and none are NaN;\n   * false otherwise\n   ",
      "child_ranges": [
        "(line 391,col 7)-(line 391,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.equals(java.lang.Object)",
      "begin_line": 413,
      "end_line": 429,
      "comment": "\n   * Test for the equality of two 3D vectors.\n   * \u003cp\u003e\n   * If all coordinates of two 3D vectors are exactly the same, and none are\n   * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two 3D vectors are considered to be equal.\n   * \u003c/p\u003e\n   * \u003cp\u003e\n   * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n   * and be equals to each other - i.e, if either (or all) coordinates of the\n   * 3D vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the 3D vector is equal to\n   * {@link #NaN}.\n   * \u003c/p\u003e\n   *\n   * @param other Object to test for equality to this\n   * @return true if two 3D vector objects are equal, false if\n   *         object is null, not an instance of Vector3D, or\n   *         not equal to this Vector3D instance\n   *\n   ",
      "child_ranges": [
        "(line 416,col 5)-(line 418,col 5)",
        "(line 420,col 5)-(line 427,col 5)",
        "(line 428,col 5)-(line 428,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.hashCode()",
      "begin_line": 438,
      "end_line": 444,
      "comment": "\n   * Get a hashCode for the 3D vector.\n   * \u003cp\u003e\n   * All NaN values have the same hash code.\u003c/p\u003e\n   *\n   * @return a hash code value for this object\n   ",
      "child_ranges": [
        "(line 440,col 7)-(line 442,col 7)",
        "(line 443,col 7)-(line 443,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.dotProduct(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 451,
      "end_line": 453,
      "comment": " Compute the dot-product of two vectors.\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the dot product v1.v2\n   ",
      "child_ranges": [
        "(line 452,col 5)-(line 452,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.crossProduct(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 460,
      "end_line": 464,
      "comment": " Compute the cross-product of two vectors.\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the cross product v1 ^ v2 as a new Vector\n   ",
      "child_ranges": [
        "(line 461,col 5)-(line 463,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.distance1(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 474,
      "end_line": 479,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e1\u003c/sub\u003e norm.\n   * \u003cp\u003eCalling this method is equivalent to calling:\n   * \u003ccode\u003ev1.subtract(v2).getNorm1()\u003c/code\u003e except that no intermediate\n   * vector is built\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the distance between v1 and v2 according to the L\u003csub\u003e1\u003c/sub\u003e norm\n   ",
      "child_ranges": [
        "(line 475,col 5)-(line 475,col 48)",
        "(line 476,col 5)-(line 476,col 48)",
        "(line 477,col 5)-(line 477,col 48)",
        "(line 478,col 5)-(line 478,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.distance(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 489,
      "end_line": 494,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n   * \u003cp\u003eCalling this method is equivalent to calling:\n   * \u003ccode\u003ev1.subtract(v2).getNorm()\u003c/code\u003e except that no intermediate\n   * vector is built\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the distance between v1 and v2 according to the L\u003csub\u003e2\u003c/sub\u003e norm\n   ",
      "child_ranges": [
        "(line 490,col 5)-(line 490,col 34)",
        "(line 491,col 5)-(line 491,col 34)",
        "(line 492,col 5)-(line 492,col 34)",
        "(line 493,col 5)-(line 493,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.distanceInf(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 504,
      "end_line": 509,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n   * \u003cp\u003eCalling this method is equivalent to calling:\n   * \u003ccode\u003ev1.subtract(v2).getNormInf()\u003c/code\u003e except that no intermediate\n   * vector is built\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the distance between v1 and v2 according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n   ",
      "child_ranges": [
        "(line 505,col 5)-(line 505,col 48)",
        "(line 506,col 5)-(line 506,col 48)",
        "(line 507,col 5)-(line 507,col 48)",
        "(line 508,col 5)-(line 508,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.distanceSq(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 519,
      "end_line": 524,
      "comment": " Compute the square of the distance between two vectors.\n   * \u003cp\u003eCalling this method is equivalent to calling:\n   * \u003ccode\u003ev1.subtract(v2).getNormSq()\u003c/code\u003e except that no intermediate\n   * vector is built\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the square of the distance between v1 and v2\n   ",
      "child_ranges": [
        "(line 520,col 5)-(line 520,col 34)",
        "(line 521,col 5)-(line 521,col 34)",
        "(line 522,col 5)-(line 522,col 34)",
        "(line 523,col 5)-(line 523,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.toString()",
      "begin_line": 529,
      "end_line": 532,
      "comment": " Get a string representation of this vector.\n   * @return a string representation of this vector\n   ",
      "child_ranges": [
        "(line 531,col 7)-(line 531,col 41)"
      ]
    }
  ]
}