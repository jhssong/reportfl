{
  "filepath": "/tmp/Math-48b/src/main/java/org/apache/commons/math/geometry/euclidean/threed/Vector3D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector3D",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e"
      ],
      "begin_line": 36,
      "end_line": 558,
      "comment": "\n * This class implements vectors in a three-dimensional space.\n * \u003cp\u003eInstance of this class are guaranteed to be immutable.\u003c/p\u003e\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Null vector (coordinates: 0, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_I"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " First canonical vector (coordinates: 1, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_I"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Opposite of the first canonical vector (coordinates: -1, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_J"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Second canonical vector (coordinates: 0, 1, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_J"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Opposite of the second canonical vector (coordinates: 0, -1, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_K"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Third canonical vector (coordinates: 0, 0, 1). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_K"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Opposite of the third canonical vector (coordinates: 0, 0, -1).  "
    },
    {
      "type": "field",
      "varNames": [
        "NaN"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " A vector with all coordinates set to NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "POSITIVE_INFINITY"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": " A vector with all coordinates set to positive infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_INFINITY"
      ],
      "begin_line": 69,
      "end_line": 70,
      "comment": " A vector with all coordinates set to negative infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Abscissa. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Ordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Height. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.Vector3D(double, double, double)",
      "begin_line": 93,
      "end_line": 97,
      "comment": " Simple constructor.\n     * Build a vector from its coordinates\n     * @param x abscissa\n     * @param y ordinate\n     * @param z height\n     * @see #getX()\n     * @see #getY()\n     * @see #getZ()\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 19)",
        "(line 95,col 9)-(line 95,col 19)",
        "(line 96,col 9)-(line 96,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.Vector3D(double, double)",
      "begin_line": 107,
      "end_line": 112,
      "comment": " Simple constructor.\n     * Build a vector from its azimuthal coordinates\n     * @param alpha azimuth (\u0026alpha;) around Z\n     *              (0 is +X, \u0026pi;/2 is +Y, \u0026pi; is -X and 3\u0026pi;/2 is -Y)\n     * @param delta elevation (\u0026delta;) above (XY) plane, from -\u0026pi;/2 to +\u0026pi;/2\n     * @see #getAlpha()\n     * @see #getDelta()\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 46)",
        "(line 109,col 9)-(line 109,col 48)",
        "(line 110,col 9)-(line 110,col 48)",
        "(line 111,col 9)-(line 111,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.Vector3D(double, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 120,
      "end_line": 124,
      "comment": " Multiplicative constructor\n     * Build a vector from another one and a scale factor.\n     * The vector built will be a * u\n     * @param a scale factor\n     * @param u base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 25)",
        "(line 122,col 9)-(line 122,col 25)",
        "(line 123,col 9)-(line 123,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.Vector3D(double, org.apache.commons.math.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 134,
      "end_line": 138,
      "comment": " Linear constructor\n     * Build a vector from two other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 65)",
        "(line 136,col 9)-(line 136,col 65)",
        "(line 137,col 9)-(line 137,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.Vector3D(double, org.apache.commons.math.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 150,
      "end_line": 155,
      "comment": " Linear constructor\n     * Build a vector from three other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 75)",
        "(line 153,col 9)-(line 153,col 75)",
        "(line 154,col 9)-(line 154,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.Vector3D(double, org.apache.commons.math.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 169,
      "end_line": 174,
      "comment": " Linear constructor\n     * Build a vector from four other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3 + a4 * u4\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     * @param a4 fourth scale factor\n     * @param u4 fourth base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 85)",
        "(line 172,col 9)-(line 172,col 85)",
        "(line 173,col 9)-(line 173,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getX()",
      "begin_line": 180,
      "end_line": 182,
      "comment": " Get the abscissa of the vector.\n     * @return abscissa of the vector\n     * @see #Vector3D(double, double, double)\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getY()",
      "begin_line": 188,
      "end_line": 190,
      "comment": " Get the ordinate of the vector.\n     * @return ordinate of the vector\n     * @see #Vector3D(double, double, double)\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getZ()",
      "begin_line": 196,
      "end_line": 198,
      "comment": " Get the height of the vector.\n     * @return height of the vector\n     * @see #Vector3D(double, double, double)\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getSpace()",
      "begin_line": 201,
      "end_line": 203,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getZero()",
      "begin_line": 206,
      "end_line": 208,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getNorm1()",
      "begin_line": 211,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getNorm()",
      "begin_line": 216,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getNormSq()",
      "begin_line": 222,
      "end_line": 225,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getNormInf()",
      "begin_line": 228,
      "end_line": 230,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getAlpha()",
      "begin_line": 236,
      "end_line": 238,
      "comment": " Get the azimuth of the vector.\n     * @return azimuth (\u0026alpha;) of the vector, between -\u0026pi; and +\u0026pi;\n     * @see #Vector3D(double, double)\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.getDelta()",
      "begin_line": 244,
      "end_line": 246,
      "comment": " Get the elevation of the vector.\n     * @return elevation (\u0026delta;) of the vector, between -\u0026pi;/2 and +\u0026pi;/2\n     * @see #Vector3D(double, double)\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.add(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 249,
      "end_line": 252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 41)",
        "(line 251,col 9)-(line 251,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.add(double, org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 255,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.subtract(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 260,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 41)",
        "(line 262,col 9)-(line 262,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.subtract(double, org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 266,
      "end_line": 268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.normalize()",
      "begin_line": 271,
      "end_line": 277,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 29)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.orthogonal()",
      "begin_line": 294,
      "end_line": 311,
      "comment": " Get a vector orthogonal to the instance.\n     * \u003cp\u003eThere are an infinite number of normalized vectors orthogonal\n     * to the instance. This method picks up one of them almost\n     * arbitrarily. It is useful when one needs to compute a reference\n     * frame with one of the axes in a predefined direction. The\n     * following example shows how to build a frame having the k axis\n     * aligned with the known vector u :\n     * \u003cpre\u003e\u003ccode\u003e\n     *   Vector3D k \u003d u.normalize();\n     *   Vector3D i \u003d k.orthogonal();\n     *   Vector3D j \u003d Vector3D.crossProduct(k, i);\n     * \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * @return a new normalized vector orthogonal to the instance\n     * @exception MathArithmeticException if the norm of the instance is null\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 43)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 59)",
        "(line 309,col 9)-(line 309,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.angle(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 324,
      "end_line": 345,
      "comment": " Compute the angular separation between two vectors.\n     * \u003cp\u003eThis method computes the angular separation between two\n     * vectors using the dot product for well separated vectors and the\n     * cross product for almost aligned vectors. This allows to have a\n     * good accuracy in all cases, even for vectors very close to each\n     * other.\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return angular separation between v1 and v2\n     * @exception MathArithmeticException if either vector has a null norm\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 57)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 331,col 9)-(line 331,col 39)",
        "(line 332,col 9)-(line 332,col 48)",
        "(line 333,col 9)-(line 340,col 9)",
        "(line 343,col 9)-(line 343,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.negate()",
      "begin_line": 348,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.scalarMultiply(double)",
      "begin_line": 353,
      "end_line": 355,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.isNaN()",
      "begin_line": 358,
      "end_line": 360,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.isInfinite()",
      "begin_line": 363,
      "end_line": 365,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.equals(java.lang.Object)",
      "begin_line": 386,
      "end_line": 402,
      "comment": "\n     * Test for the equality of two 3D vectors.\n     * \u003cp\u003e\n     * If all coordinates of two 3D vectors are exactly the same, and none are\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two 3D vectors are considered to be equal.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * 3D vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the 3D vector is equal to\n     * {@link #NaN}.\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two 3D vector objects are equal, false if\n     *         object is null, not an instance of Vector3D, or\n     *         not equal to this Vector3D instance\n     *\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 391,col 9)",
        "(line 393,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.hashCode()",
      "begin_line": 411,
      "end_line": 417,
      "comment": "\n     * Get a hashCode for the 3D vector.\n     * \u003cp\u003e\n     * All NaN values have the same hash code.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 427,
      "end_line": 430,
      "comment": " {@inheritDoc}\n     * \u003cp\u003e\n     * The implementation uses specific multiplication and addition\n     * algorithms to preserve accuracy and reduce cancellation effects.\n     * It should be very accurate even for nearly orthogonal vectors.\n     * \u003c/p\u003e\n     * @see MathUtils#linearCombination(double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 41)",
        "(line 429,col 9)-(line 429,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.crossProduct(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 436,
      "end_line": 441,
      "comment": " Compute the cross-product of the instance with another vector.\n     * @param v other vector\n     * @return the cross product this ^ v as a new Vector3D\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 41)",
        "(line 438,col 9)-(line 440,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distance1(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 444,
      "end_line": 450,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 41)",
        "(line 446,col 9)-(line 446,col 49)",
        "(line 447,col 9)-(line 447,col 49)",
        "(line 448,col 9)-(line 448,col 49)",
        "(line 449,col 9)-(line 449,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distance(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 453,
      "end_line": 459,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 41)",
        "(line 455,col 9)-(line 455,col 35)",
        "(line 456,col 9)-(line 456,col 35)",
        "(line 457,col 9)-(line 457,col 35)",
        "(line 458,col 9)-(line 458,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distanceInf(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 462,
      "end_line": 468,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 41)",
        "(line 464,col 9)-(line 464,col 49)",
        "(line 465,col 9)-(line 465,col 49)",
        "(line 466,col 9)-(line 466,col 49)",
        "(line 467,col 9)-(line 467,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distanceSq(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 471,
      "end_line": 477,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 41)",
        "(line 473,col 9)-(line 473,col 35)",
        "(line 474,col 9)-(line 474,col 35)",
        "(line 475,col 9)-(line 475,col 35)",
        "(line 476,col 9)-(line 476,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.dotProduct(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 484,
      "end_line": 486,
      "comment": " Compute the dot-product of two vectors.\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the dot product v1.v2\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.crossProduct(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 493,
      "end_line": 495,
      "comment": " Compute the cross-product of two vectors.\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the cross product v1 ^ v2 as a new Vector\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distance1(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 505,
      "end_line": 507,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e1\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNorm1()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e1\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distance(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 517,
      "end_line": 519,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNorm()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e2\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distanceInf(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 529,
      "end_line": 531,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNormInf()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.distanceSq(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 541,
      "end_line": 543,
      "comment": " Compute the square of the distance between two vectors.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNormSq()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the square of the distance between v1 and v2\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.toString()",
      "begin_line": 548,
      "end_line": 551,
      "comment": " Get a string representation of this vector.\n     * @return a string representation of this vector\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.Vector3D.toString(java.text.NumberFormat)",
      "begin_line": 554,
      "end_line": 556,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 55)"
      ]
    }
  ]
}