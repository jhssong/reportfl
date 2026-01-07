{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/geometry/euclidean/threed/Vector3D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector3D",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e"
      ],
      "begin_line": 37,
      "end_line": 559,
      "comment": "\n * This class implements vectors in a three-dimensional space.\n * \u003cp\u003eInstance of this class are guaranteed to be immutable.\u003c/p\u003e\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Null vector (coordinates: 0, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_I"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " First canonical vector (coordinates: 1, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_I"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Opposite of the first canonical vector (coordinates: -1, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_J"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Second canonical vector (coordinates: 0, 1, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_J"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Opposite of the second canonical vector (coordinates: 0, -1, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_K"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Third canonical vector (coordinates: 0, 0, 1). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_K"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Opposite of the third canonical vector (coordinates: 0, 0, -1).  "
    },
    {
      "type": "field",
      "varNames": [
        "NaN"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " A vector with all coordinates set to NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "POSITIVE_INFINITY"
      ],
      "begin_line": 66,
      "end_line": 67,
      "comment": " A vector with all coordinates set to positive infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_INFINITY"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": " A vector with all coordinates set to negative infinity. "
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
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.Vector3D(double, double, double)",
      "begin_line": 94,
      "end_line": 98,
      "comment": " Simple constructor.\n     * Build a vector from its coordinates\n     * @param x abscissa\n     * @param y ordinate\n     * @param z height\n     * @see #getX()\n     * @see #getY()\n     * @see #getZ()\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 19)",
        "(line 96,col 9)-(line 96,col 19)",
        "(line 97,col 9)-(line 97,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.Vector3D(double, double)",
      "begin_line": 108,
      "end_line": 113,
      "comment": " Simple constructor.\n     * Build a vector from its azimuthal coordinates\n     * @param alpha azimuth (\u0026alpha;) around Z\n     *              (0 is +X, \u0026pi;/2 is +Y, \u0026pi; is -X and 3\u0026pi;/2 is -Y)\n     * @param delta elevation (\u0026delta;) above (XY) plane, from -\u0026pi;/2 to +\u0026pi;/2\n     * @see #getAlpha()\n     * @see #getDelta()\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 46)",
        "(line 110,col 9)-(line 110,col 48)",
        "(line 111,col 9)-(line 111,col 48)",
        "(line 112,col 9)-(line 112,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.Vector3D(double, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 121,
      "end_line": 125,
      "comment": " Multiplicative constructor\n     * Build a vector from another one and a scale factor.\n     * The vector built will be a * u\n     * @param a scale factor\n     * @param u base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 25)",
        "(line 123,col 9)-(line 123,col 25)",
        "(line 124,col 9)-(line 124,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.Vector3D(double, org.apache.commons.math.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 135,
      "end_line": 139,
      "comment": " Linear constructor\n     * Build a vector from two other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 66)",
        "(line 137,col 9)-(line 137,col 66)",
        "(line 138,col 9)-(line 138,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.Vector3D(double, org.apache.commons.math.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 151,
      "end_line": 156,
      "comment": " Linear constructor\n     * Build a vector from three other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 76)",
        "(line 154,col 9)-(line 154,col 76)",
        "(line 155,col 9)-(line 155,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.Vector3D(double, org.apache.commons.math.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 170,
      "end_line": 175,
      "comment": " Linear constructor\n     * Build a vector from four other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3 + a4 * u4\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     * @param a4 fourth scale factor\n     * @param u4 fourth base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 86)",
        "(line 173,col 9)-(line 173,col 86)",
        "(line 174,col 9)-(line 174,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getX()",
      "begin_line": 181,
      "end_line": 183,
      "comment": " Get the abscissa of the vector.\n     * @return abscissa of the vector\n     * @see #Vector3D(double, double, double)\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getY()",
      "begin_line": 189,
      "end_line": 191,
      "comment": " Get the ordinate of the vector.\n     * @return ordinate of the vector\n     * @see #Vector3D(double, double, double)\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getZ()",
      "begin_line": 197,
      "end_line": 199,
      "comment": " Get the height of the vector.\n     * @return height of the vector\n     * @see #Vector3D(double, double, double)\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getSpace()",
      "begin_line": 202,
      "end_line": 204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getZero()",
      "begin_line": 207,
      "end_line": 209,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getNorm1()",
      "begin_line": 212,
      "end_line": 214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getNorm()",
      "begin_line": 217,
      "end_line": 220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getNormSq()",
      "begin_line": 223,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getNormInf()",
      "begin_line": 229,
      "end_line": 231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getAlpha()",
      "begin_line": 237,
      "end_line": 239,
      "comment": " Get the azimuth of the vector.\n     * @return azimuth (\u0026alpha;) of the vector, between -\u0026pi; and +\u0026pi;\n     * @see #Vector3D(double, double)\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getDelta()",
      "begin_line": 245,
      "end_line": 247,
      "comment": " Get the elevation of the vector.\n     * @return elevation (\u0026delta;) of the vector, between -\u0026pi;/2 and +\u0026pi;/2\n     * @see #Vector3D(double, double)\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.add(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 250,
      "end_line": 253,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 41)",
        "(line 252,col 9)-(line 252,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.add(double, org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 256,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.subtract(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 261,
      "end_line": 264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 41)",
        "(line 263,col 9)-(line 263,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.subtract(double, org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 267,
      "end_line": 269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.normalize()",
      "begin_line": 272,
      "end_line": 278,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 29)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.orthogonal()",
      "begin_line": 295,
      "end_line": 312,
      "comment": " Get a vector orthogonal to the instance.\n     * \u003cp\u003eThere are an infinite number of normalized vectors orthogonal\n     * to the instance. This method picks up one of them almost\n     * arbitrarily. It is useful when one needs to compute a reference\n     * frame with one of the axes in a predefined direction. The\n     * following example shows how to build a frame having the k axis\n     * aligned with the known vector u :\n     * \u003cpre\u003e\u003ccode\u003e\n     *   Vector3D k \u003d u.normalize();\n     *   Vector3D i \u003d k.orthogonal();\n     *   Vector3D j \u003d Vector3D.crossProduct(k, i);\n     * \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * @return a new normalized vector orthogonal to the instance\n     * @exception MathArithmeticException if the norm of the instance is null\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 43)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 59)",
        "(line 310,col 9)-(line 310,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.angle(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 325,
      "end_line": 346,
      "comment": " Compute the angular separation between two vectors.\n     * \u003cp\u003eThis method computes the angular separation between two\n     * vectors using the dot product for well separated vectors and the\n     * cross product for almost aligned vectors. This allows to have a\n     * good accuracy in all cases, even for vectors very close to each\n     * other.\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return angular separation between v1 and v2\n     * @exception MathArithmeticException if either vector has a null norm\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 57)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 332,col 9)-(line 332,col 39)",
        "(line 333,col 9)-(line 333,col 48)",
        "(line 334,col 9)-(line 341,col 9)",
        "(line 344,col 9)-(line 344,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.negate()",
      "begin_line": 349,
      "end_line": 351,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.scalarMultiply(double)",
      "begin_line": 354,
      "end_line": 356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.isNaN()",
      "begin_line": 359,
      "end_line": 361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.isInfinite()",
      "begin_line": 364,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.equals(java.lang.Object)",
      "begin_line": 387,
      "end_line": 403,
      "comment": "\n     * Test for the equality of two 3D vectors.\n     * \u003cp\u003e\n     * If all coordinates of two 3D vectors are exactly the same, and none are\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two 3D vectors are considered to be equal.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * 3D vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the 3D vector is equal to\n     * {@link #NaN}.\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two 3D vector objects are equal, false if\n     *         object is null, not an instance of Vector3D, or\n     *         not equal to this Vector3D instance\n     *\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.hashCode()",
      "begin_line": 412,
      "end_line": 418,
      "comment": "\n     * Get a hashCode for the 3D vector.\n     * \u003cp\u003e\n     * All NaN values have the same hash code.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 428,
      "end_line": 431,
      "comment": " {@inheritDoc}\n     * \u003cp\u003e\n     * The implementation uses specific multiplication and addition\n     * algorithms to preserve accuracy and reduce cancellation effects.\n     * It should be very accurate even for nearly orthogonal vectors.\n     * \u003c/p\u003e\n     * @see MathArrays#linearCombination(double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 41)",
        "(line 430,col 9)-(line 430,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.crossProduct(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 437,
      "end_line": 442,
      "comment": " Compute the cross-product of the instance with another vector.\n     * @param v other vector\n     * @return the cross product this ^ v as a new Vector3D\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 41)",
        "(line 439,col 9)-(line 441,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distance1(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 445,
      "end_line": 451,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 41)",
        "(line 447,col 9)-(line 447,col 49)",
        "(line 448,col 9)-(line 448,col 49)",
        "(line 449,col 9)-(line 449,col 49)",
        "(line 450,col 9)-(line 450,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distance(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 454,
      "end_line": 460,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 41)",
        "(line 456,col 9)-(line 456,col 35)",
        "(line 457,col 9)-(line 457,col 35)",
        "(line 458,col 9)-(line 458,col 35)",
        "(line 459,col 9)-(line 459,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distanceInf(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 463,
      "end_line": 469,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 41)",
        "(line 465,col 9)-(line 465,col 49)",
        "(line 466,col 9)-(line 466,col 49)",
        "(line 467,col 9)-(line 467,col 49)",
        "(line 468,col 9)-(line 468,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distanceSq(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 472,
      "end_line": 478,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 41)",
        "(line 474,col 9)-(line 474,col 35)",
        "(line 475,col 9)-(line 475,col 35)",
        "(line 476,col 9)-(line 476,col 35)",
        "(line 477,col 9)-(line 477,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 485,
      "end_line": 487,
      "comment": " Compute the dot-product of two vectors.\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the dot product v1.v2\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.crossProduct(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 494,
      "end_line": 496,
      "comment": " Compute the cross-product of two vectors.\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the cross product v1 ^ v2 as a new Vector\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distance1(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 506,
      "end_line": 508,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e1\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNorm1()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e1\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distance(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 518,
      "end_line": 520,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNorm()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e2\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distanceInf(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 530,
      "end_line": 532,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNormInf()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distanceSq(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 542,
      "end_line": 544,
      "comment": " Compute the square of the distance between two vectors.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNormSq()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the square of the distance between v1 and v2\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.toString()",
      "begin_line": 549,
      "end_line": 552,
      "comment": " Get a string representation of this vector.\n     * @return a string representation of this vector\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.toString(java.text.NumberFormat)",
      "begin_line": 555,
      "end_line": 557,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 55)"
      ]
    }
  ]
}