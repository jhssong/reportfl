{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/geometry/Vector3D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector3D",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 491,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Null vector (coordinates: 0, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_I"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " First canonical vector (coordinates: 1, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_I"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Opposite of the first canonical vector (coordinates: -1, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_J"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Second canonical vector (coordinates: 0, 1, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_J"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Opposite of the second canonical vector (coordinates: 0, -1, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_K"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Third canonical vector (coordinates: 0, 0, 1). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_K"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Opposite of the third canonical vector (coordinates: 0, 0, -1).  "
    },
    {
      "type": "field",
      "varNames": [
        "NaN"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " A vector with all coordinates set to NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "POSITIVE_INFINITY"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": " A vector with all coordinates set to positive infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_INFINITY"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": " A vector with all coordinates set to negative infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 67,
      "end_line": 68,
      "comment": " Default format. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Abscissa. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Ordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Height. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, double, double)",
      "begin_line": 91,
      "end_line": 95,
      "comment": " Simple constructor.\n   * Build a vector from its coordinates\n   * @param x abscissa\n   * @param y ordinate\n   * @param z height\n   * @see #getX()\n   * @see #getY()\n   * @see #getZ()\n   ",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 15)",
        "(line 93,col 5)-(line 93,col 15)",
        "(line 94,col 5)-(line 94,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, double)",
      "begin_line": 105,
      "end_line": 110,
      "comment": " Simple constructor.\n   * Build a vector from its azimuthal coordinates\n   * @param alpha azimuth (\u0026alpha;) around Z\n   *              (0 is +X, \u0026pi;/2 is +Y, \u0026pi; is -X and 3\u0026pi;/2 is -Y)\n   * @param delta elevation (\u0026delta;) above (XY) plane, from -\u0026pi;/2 to +\u0026pi;/2\n   * @see #getAlpha()\n   * @see #getDelta()\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 38)",
        "(line 107,col 5)-(line 107,col 40)",
        "(line 108,col 5)-(line 108,col 40)",
        "(line 109,col 5)-(line 109,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 118,
      "end_line": 122,
      "comment": " Multiplicative constructor\n   * Build a vector from another one and a scale factor. \n   * The vector built will be a * u\n   * @param a scale factor\n   * @param u base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 21)",
        "(line 120,col 5)-(line 120,col 21)",
        "(line 121,col 5)-(line 121,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 132,
      "end_line": 136,
      "comment": " Linear constructor\n   * Build a vector from two other ones and corresponding scale factors.\n   * The vector built will be a1 * u1 + a2 * u2\n   * @param a1 first scale factor\n   * @param u1 first base (unscaled) vector\n   * @param a2 second scale factor\n   * @param u2 second base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 35)",
        "(line 134,col 5)-(line 134,col 35)",
        "(line 135,col 5)-(line 135,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 148,
      "end_line": 153,
      "comment": " Linear constructor\n   * Build a vector from three other ones and corresponding scale factors.\n   * The vector built will be a1 * u1 + a2 * u2 + a3 * u3\n   * @param a1 first scale factor\n   * @param u1 first base (unscaled) vector\n   * @param a2 second scale factor\n   * @param u2 second base (unscaled) vector\n   * @param a3 third scale factor\n   * @param u3 third base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 47)",
        "(line 151,col 5)-(line 151,col 47)",
        "(line 152,col 5)-(line 152,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Vector3D.Vector3D(double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D, double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 167,
      "end_line": 172,
      "comment": " Linear constructor\n   * Build a vector from four other ones and corresponding scale factors.\n   * The vector built will be a1 * u1 + a2 * u2 + a3 * u3 + a4 * u4\n   * @param a1 first scale factor\n   * @param u1 first base (unscaled) vector\n   * @param a2 second scale factor\n   * @param u2 second base (unscaled) vector\n   * @param a3 third scale factor\n   * @param u3 third base (unscaled) vector\n   * @param a4 fourth scale factor\n   * @param u4 fourth base (unscaled) vector\n   ",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 59)",
        "(line 170,col 5)-(line 170,col 59)",
        "(line 171,col 5)-(line 171,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getX()",
      "begin_line": 178,
      "end_line": 180,
      "comment": " Get the abscissa of the vector.\n   * @return abscissa of the vector\n   * @see #Vector3D(double, double, double)\n   ",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getY()",
      "begin_line": 186,
      "end_line": 188,
      "comment": " Get the ordinate of the vector.\n   * @return ordinate of the vector\n   * @see #Vector3D(double, double, double)\n   ",
      "child_ranges": [
        "(line 187,col 5)-(line 187,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getZ()",
      "begin_line": 194,
      "end_line": 196,
      "comment": " Get the height of the vector.\n   * @return height of the vector\n   * @see #Vector3D(double, double, double)\n   ",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getNorm()",
      "begin_line": 201,
      "end_line": 203,
      "comment": " Get the norm for the vector.\n   * @return euclidian norm for the vector\n   ",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getNormSq()",
      "begin_line": 208,
      "end_line": 210,
      "comment": " Get the square of the norm for the vector.\n   * @return square of the euclidian norm for the vector\n   ",
      "child_ranges": [
        "(line 209,col 5)-(line 209,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getAlpha()",
      "begin_line": 216,
      "end_line": 218,
      "comment": " Get the azimuth of the vector.\n   * @return azimuth (\u0026alpha;) of the vector, between -\u0026pi; and +\u0026pi;\n   * @see #Vector3D(double, double)\n   ",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.getDelta()",
      "begin_line": 224,
      "end_line": 226,
      "comment": " Get the elevation of the vector.\n   * @return elevation (\u0026delta;) of the vector, between -\u0026pi;/2 and +\u0026pi;/2\n   * @see #Vector3D(double, double)\n   ",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.add(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 232,
      "end_line": 234,
      "comment": " Add a vector to the instance.\n   * @param v vector to add\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 233,col 5)-(line 233,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.add(double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 241,
      "end_line": 243,
      "comment": " Add a scaled vector to the instance.\n   * @param factor scale factor to apply to v before adding it\n   * @param v vector to add\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.subtract(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 249,
      "end_line": 251,
      "comment": " Subtract a vector from the instance.\n   * @param v vector to subtract\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.subtract(double, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 258,
      "end_line": 260,
      "comment": " Subtract a scaled vector from the instance.\n   * @param factor scale factor to apply to v before subtracting it\n   * @param v vector to subtract\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 259,col 5)-(line 259,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.normalize()",
      "begin_line": 266,
      "end_line": 272,
      "comment": " Get a normalized vector aligned with the instance.\n   * @return a new normalized vector\n   * @exception ArithmeticException if the norm is zero\n   ",
      "child_ranges": [
        "(line 267,col 5)-(line 267,col 25)",
        "(line 268,col 5)-(line 270,col 5)",
        "(line 271,col 5)-(line 271,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.orthogonal()",
      "begin_line": 289,
      "end_line": 306,
      "comment": " Get a vector orthogonal to the instance.\n   * \u003cp\u003eThere are an infinite number of normalized vectors orthogonal\n   * to the instance. This method picks up one of them almost\n   * arbitrarily. It is useful when one needs to compute a reference\n   * frame with one of the axes in a predefined direction. The\n   * following example shows how to build a frame having the k axis\n   * aligned with the known vector u :\n   * \u003cpre\u003e\u003ccode\u003e\n   *   Vector3D k \u003d u.normalize();\n   *   Vector3D i \u003d k.orthogonal();\n   *   Vector3D j \u003d Vector3D.crossProduct(k, i);\n   * \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n   * @return a new normalized vector orthogonal to the instance\n   * @exception ArithmeticException if the norm of the instance is null\n   ",
      "child_ranges": [
        "(line 291,col 5)-(line 291,col 39)",
        "(line 292,col 5)-(line 294,col 5)",
        "(line 296,col 5)-(line 302,col 5)",
        "(line 303,col 5)-(line 303,col 51)",
        "(line 304,col 5)-(line 304,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.angle(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 319,
      "end_line": 340,
      "comment": " Compute the angular separation between two vectors.\n   * \u003cp\u003eThis method computes the angular separation between two\n   * vectors using the dot product for well separated vectors and the\n   * cross product for almost aligned vectors. This allow to have a\n   * good accuracy in all cases, even for vectors very close to each\n   * other.\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return angular separation between v1 and v2\n   * @exception ArithmeticException if either vector has a null norm\n   ",
      "child_ranges": [
        "(line 321,col 5)-(line 321,col 53)",
        "(line 322,col 5)-(line 324,col 5)",
        "(line 326,col 5)-(line 326,col 36)",
        "(line 327,col 5)-(line 327,col 44)",
        "(line 328,col 5)-(line 335,col 5)",
        "(line 338,col 5)-(line 338,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.negate()",
      "begin_line": 345,
      "end_line": 347,
      "comment": " Get the opposite of the instance.\n   * @return a new vector which is opposite to the instance\n   ",
      "child_ranges": [
        "(line 346,col 5)-(line 346,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.scalarMultiply(double)",
      "begin_line": 353,
      "end_line": 355,
      "comment": " Multiply the instance by a scalar\n   * @param a scalar\n   * @return a new vector\n   ",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.isNaN()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n   * Returns true if any coordinate of this vector is NaN; false otherwise\n   * @return  true if any coordinate of this vector is NaN; false otherwise\n   ",
      "child_ranges": [
        "(line 362,col 7)-(line 362,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.isInfinite()",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n   * Returns true if any coordinate of this vector is infinite and none are NaN;\n   * false otherwise\n   * @return  true if any coordinate of this vector is infinite and none are NaN;\n   * false otherwise\n   ",
      "child_ranges": [
        "(line 372,col 7)-(line 372,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.equals(java.lang.Object)",
      "begin_line": 394,
      "end_line": 418,
      "comment": "\n   * Test for the equality of two 3D vectors.\n   * \u003cp\u003e\n   * If all coordinates of two 3D vectors are exactly the same, and none are\n   * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two 3D vectors are considered to be equal.\n   * \u003c/p\u003e\n   * \u003cp\u003e\n   * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n   * and be equals to each other - i.e, if either (or all) coordinates of the\n   * 3D vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the 3D vector is equal to\n   * {@link #NaN}.\n   * \u003c/p\u003e\n   *\n   * @param other Object to test for equality to this\n   * @return true if two 3D vector objects are equal, false if\n   *         object is null, not an instance of Vector3D, or\n   *         not equal to this Vector3D instance\n   * \n   ",
      "child_ranges": [
        "(line 396,col 5)-(line 398,col 5)",
        "(line 400,col 5)-(line 402,col 5)",
        "(line 404,col 5)-(line 416,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.hashCode()",
      "begin_line": 427,
      "end_line": 432,
      "comment": "\n   * Get a hashCode for the 3D vector.\n   * \u003cp\u003e\n   * All NaN values have the same hash code.\u003c/p\u003e\n   * \n   * @return a hash code value for this object\n   ",
      "child_ranges": [
        "(line 428,col 7)-(line 430,col 7)",
        "(line 431,col 7)-(line 431,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.dotProduct(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 439,
      "end_line": 441,
      "comment": " Compute the dot-product of two vectors.\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the dot product v1.v2\n   ",
      "child_ranges": [
        "(line 440,col 5)-(line 440,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.crossProduct(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 448,
      "end_line": 452,
      "comment": " Compute the cross-product of two vectors.\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the cross product v1 ^ v2 as a new Vector\n   ",
      "child_ranges": [
        "(line 449,col 5)-(line 451,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.distance(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 462,
      "end_line": 467,
      "comment": " Compute the distance between two vectors.\n   * \u003cp\u003eCalling this method is equivalent to calling:\n   * \u003ccode\u003ev1.subtract(v2).getNorm()\u003c/code\u003e except that no intermediate\n   * vector is built\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the distance between v1 and v2\n   ",
      "child_ranges": [
        "(line 463,col 5)-(line 463,col 34)",
        "(line 464,col 5)-(line 464,col 34)",
        "(line 465,col 5)-(line 465,col 34)",
        "(line 466,col 5)-(line 466,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.distanceSq(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 477,
      "end_line": 482,
      "comment": " Compute the square of the distance between two vectors.\n   * \u003cp\u003eCalling this method is equivalent to calling:\n   * \u003ccode\u003ev1.subtract(v2).getNormSq()\u003c/code\u003e except that no intermediate\n   * vector is built\u003c/p\u003e\n   * @param v1 first vector\n   * @param v2 second vector\n   * @return the square of the distance between v1 and v2\n   ",
      "child_ranges": [
        "(line 478,col 5)-(line 478,col 34)",
        "(line 479,col 5)-(line 479,col 34)",
        "(line 480,col 5)-(line 480,col 34)",
        "(line 481,col 5)-(line 481,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Vector3D.toString()",
      "begin_line": 487,
      "end_line": 489,
      "comment": " Get a string representation of this vector.\n   * @return a string representation of this vector\n   ",
      "child_ranges": [
        "(line 488,col 7)-(line 488,col 41)"
      ]
    }
  ]
}