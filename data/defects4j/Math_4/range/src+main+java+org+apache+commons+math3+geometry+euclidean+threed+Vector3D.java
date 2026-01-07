{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/Vector3D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector3D",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e"
      ],
      "begin_line": 38,
      "end_line": 583,
      "comment": "\n * This class implements vectors in a three-dimensional space.\n * \u003cp\u003eInstance of this class are guaranteed to be immutable.\u003c/p\u003e\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Null vector (coordinates: 0, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_I"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " First canonical vector (coordinates: 1, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_I"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Opposite of the first canonical vector (coordinates: -1, 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_J"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Second canonical vector (coordinates: 0, 1, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_J"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Opposite of the second canonical vector (coordinates: 0, -1, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "PLUS_K"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Third canonical vector (coordinates: 0, 0, 1). "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_K"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Opposite of the third canonical vector (coordinates: 0, 0, -1).  "
    },
    {
      "type": "field",
      "varNames": [
        "NaN"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " A vector with all coordinates set to NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "POSITIVE_INFINITY"
      ],
      "begin_line": 67,
      "end_line": 68,
      "comment": " A vector with all coordinates set to positive infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_INFINITY"
      ],
      "begin_line": 71,
      "end_line": 72,
      "comment": " A vector with all coordinates set to negative infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Abscissa. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Ordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Height. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.Vector3D(double, double, double)",
      "begin_line": 95,
      "end_line": 99,
      "comment": " Simple constructor.\n     * Build a vector from its coordinates\n     * @param x abscissa\n     * @param y ordinate\n     * @param z height\n     * @see #getX()\n     * @see #getY()\n     * @see #getZ()\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 19)",
        "(line 97,col 9)-(line 97,col 19)",
        "(line 98,col 9)-(line 98,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.Vector3D(double[])",
      "begin_line": 107,
      "end_line": 114,
      "comment": " Simple constructor.\n     * Build a vector from its coordinates\n     * @param v coordinates array\n     * @exception DimensionMismatchException if array does not have 3 elements\n     * @see #toArray()\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 22)",
        "(line 112,col 9)-(line 112,col 22)",
        "(line 113,col 9)-(line 113,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.Vector3D(double, double)",
      "begin_line": 124,
      "end_line": 129,
      "comment": " Simple constructor.\n     * Build a vector from its azimuthal coordinates\n     * @param alpha azimuth (\u0026alpha;) around Z\n     *              (0 is +X, \u0026pi;/2 is +Y, \u0026pi; is -X and 3\u0026pi;/2 is -Y)\n     * @param delta elevation (\u0026delta;) above (XY) plane, from -\u0026pi;/2 to +\u0026pi;/2\n     * @see #getAlpha()\n     * @see #getDelta()\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 46)",
        "(line 126,col 9)-(line 126,col 48)",
        "(line 127,col 9)-(line 127,col 48)",
        "(line 128,col 9)-(line 128,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.Vector3D(double, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 137,
      "end_line": 141,
      "comment": " Multiplicative constructor\n     * Build a vector from another one and a scale factor.\n     * The vector built will be a * u\n     * @param a scale factor\n     * @param u base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 25)",
        "(line 139,col 9)-(line 139,col 25)",
        "(line 140,col 9)-(line 140,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.Vector3D(double, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 151,
      "end_line": 155,
      "comment": " Linear constructor\n     * Build a vector from two other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 66)",
        "(line 153,col 9)-(line 153,col 66)",
        "(line 154,col 9)-(line 154,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.Vector3D(double, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 167,
      "end_line": 172,
      "comment": " Linear constructor\n     * Build a vector from three other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 76)",
        "(line 170,col 9)-(line 170,col 76)",
        "(line 171,col 9)-(line 171,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.Vector3D(double, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, double, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 186,
      "end_line": 191,
      "comment": " Linear constructor\n     * Build a vector from four other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3 + a4 * u4\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     * @param a4 fourth scale factor\n     * @param u4 fourth base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 86)",
        "(line 189,col 9)-(line 189,col 86)",
        "(line 190,col 9)-(line 190,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.getX()",
      "begin_line": 197,
      "end_line": 199,
      "comment": " Get the abscissa of the vector.\n     * @return abscissa of the vector\n     * @see #Vector3D(double, double, double)\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.getY()",
      "begin_line": 205,
      "end_line": 207,
      "comment": " Get the ordinate of the vector.\n     * @return ordinate of the vector\n     * @see #Vector3D(double, double, double)\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.getZ()",
      "begin_line": 213,
      "end_line": 215,
      "comment": " Get the height of the vector.\n     * @return height of the vector\n     * @see #Vector3D(double, double, double)\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.toArray()",
      "begin_line": 221,
      "end_line": 223,
      "comment": " Get the vector coordinates as a dimension 3 array.\n     * @return vector coordinates\n     * @see #Vector3D(double[])\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.getSpace()",
      "begin_line": 226,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.getZero()",
      "begin_line": 231,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.getNorm1()",
      "begin_line": 236,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.getNorm()",
      "begin_line": 241,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.getNormSq()",
      "begin_line": 247,
      "end_line": 250,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.getNormInf()",
      "begin_line": 253,
      "end_line": 255,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.getAlpha()",
      "begin_line": 261,
      "end_line": 263,
      "comment": " Get the azimuth of the vector.\n     * @return azimuth (\u0026alpha;) of the vector, between -\u0026pi; and +\u0026pi;\n     * @see #Vector3D(double, double)\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.getDelta()",
      "begin_line": 269,
      "end_line": 271,
      "comment": " Get the elevation of the vector.\n     * @return elevation (\u0026delta;) of the vector, between -\u0026pi;/2 and +\u0026pi;/2\n     * @see #Vector3D(double, double)\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.add(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 274,
      "end_line": 277,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 41)",
        "(line 276,col 9)-(line 276,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.add(double, org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 280,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.subtract(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 285,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 41)",
        "(line 287,col 9)-(line 287,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.subtract(double, org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 291,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.normalize()",
      "begin_line": 296,
      "end_line": 302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 29)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.orthogonal()",
      "begin_line": 319,
      "end_line": 336,
      "comment": " Get a vector orthogonal to the instance.\n     * \u003cp\u003eThere are an infinite number of normalized vectors orthogonal\n     * to the instance. This method picks up one of them almost\n     * arbitrarily. It is useful when one needs to compute a reference\n     * frame with one of the axes in a predefined direction. The\n     * following example shows how to build a frame having the k axis\n     * aligned with the known vector u :\n     * \u003cpre\u003e\u003ccode\u003e\n     *   Vector3D k \u003d u.normalize();\n     *   Vector3D i \u003d k.orthogonal();\n     *   Vector3D j \u003d Vector3D.crossProduct(k, i);\n     * \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * @return a new normalized vector orthogonal to the instance\n     * @exception MathArithmeticException if the norm of the instance is null\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 43)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 59)",
        "(line 334,col 9)-(line 334,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.angle(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 349,
      "end_line": 370,
      "comment": " Compute the angular separation between two vectors.\n     * \u003cp\u003eThis method computes the angular separation between two\n     * vectors using the dot product for well separated vectors and the\n     * cross product for almost aligned vectors. This allows to have a\n     * good accuracy in all cases, even for vectors very close to each\n     * other.\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return angular separation between v1 and v2\n     * @exception MathArithmeticException if either vector has a null norm\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 57)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 39)",
        "(line 357,col 9)-(line 357,col 48)",
        "(line 358,col 9)-(line 365,col 9)",
        "(line 368,col 9)-(line 368,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.negate()",
      "begin_line": 373,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.scalarMultiply(double)",
      "begin_line": 378,
      "end_line": 380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.isNaN()",
      "begin_line": 383,
      "end_line": 385,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.isInfinite()",
      "begin_line": 388,
      "end_line": 390,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.equals(java.lang.Object)",
      "begin_line": 411,
      "end_line": 427,
      "comment": "\n     * Test for the equality of two 3D vectors.\n     * \u003cp\u003e\n     * If all coordinates of two 3D vectors are exactly the same, and none are\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two 3D vectors are considered to be equal.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * 3D vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the 3D vector is equal to\n     * {@link #NaN}.\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two 3D vector objects are equal, false if\n     *         object is null, not an instance of Vector3D, or\n     *         not equal to this Vector3D instance\n     *\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.hashCode()",
      "begin_line": 436,
      "end_line": 442,
      "comment": "\n     * Get a hashCode for the 3D vector.\n     * \u003cp\u003e\n     * All NaN values have the same hash code.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.dotProduct(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 452,
      "end_line": 455,
      "comment": " {@inheritDoc}\n     * \u003cp\u003e\n     * The implementation uses specific multiplication and addition\n     * algorithms to preserve accuracy and reduce cancellation effects.\n     * It should be very accurate even for nearly orthogonal vectors.\n     * \u003c/p\u003e\n     * @see MathArrays#linearCombination(double, double, double, double, double, double)\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 41)",
        "(line 454,col 9)-(line 454,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.crossProduct(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 461,
      "end_line": 466,
      "comment": " Compute the cross-product of the instance with another vector.\n     * @param v other vector\n     * @return the cross product this ^ v as a new Vector3D\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 41)",
        "(line 463,col 9)-(line 465,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distance1(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 469,
      "end_line": 475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 41)",
        "(line 471,col 9)-(line 471,col 49)",
        "(line 472,col 9)-(line 472,col 49)",
        "(line 473,col 9)-(line 473,col 49)",
        "(line 474,col 9)-(line 474,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distance(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 478,
      "end_line": 484,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 41)",
        "(line 480,col 9)-(line 480,col 35)",
        "(line 481,col 9)-(line 481,col 35)",
        "(line 482,col 9)-(line 482,col 35)",
        "(line 483,col 9)-(line 483,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distanceInf(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 487,
      "end_line": 493,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 41)",
        "(line 489,col 9)-(line 489,col 49)",
        "(line 490,col 9)-(line 490,col 49)",
        "(line 491,col 9)-(line 491,col 49)",
        "(line 492,col 9)-(line 492,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distanceSq(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 496,
      "end_line": 502,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 41)",
        "(line 498,col 9)-(line 498,col 35)",
        "(line 499,col 9)-(line 499,col 35)",
        "(line 500,col 9)-(line 500,col 35)",
        "(line 501,col 9)-(line 501,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.dotProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 509,
      "end_line": 511,
      "comment": " Compute the dot-product of two vectors.\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the dot product v1.v2\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.crossProduct(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 518,
      "end_line": 520,
      "comment": " Compute the cross-product of two vectors.\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the cross product v1 ^ v2 as a new Vector\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distance1(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 530,
      "end_line": 532,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e1\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNorm1()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e1\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distance(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 542,
      "end_line": 544,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNorm()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e2\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distanceInf(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 554,
      "end_line": 556,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNormInf()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the distance between v1 and v2 according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.distanceSq(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 566,
      "end_line": 568,
      "comment": " Compute the square of the distance between two vectors.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ev1.subtract(v2).getNormSq()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param v1 first vector\n     * @param v2 second vector\n     * @return the square of the distance between v1 and v2\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.toString()",
      "begin_line": 573,
      "end_line": 576,
      "comment": " Get a string representation of this vector.\n     * @return a string representation of this vector\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Vector3D.toString(java.text.NumberFormat)",
      "begin_line": 579,
      "end_line": 581,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 55)"
      ]
    }
  ]
}