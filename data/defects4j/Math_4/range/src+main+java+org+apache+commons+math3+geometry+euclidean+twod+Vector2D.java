{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/twod/Vector2D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector2D",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 34,
      "end_line": 390,
      "comment": " This class represents a 2D vector.\n * \u003cp\u003eInstances of this class are guaranteed to be immutable.\u003c/p\u003e\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Origin (coordinates: 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "NaN"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " A vector with all coordinates set to NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "POSITIVE_INFINITY"
      ],
      "begin_line": 45,
      "end_line": 46,
      "comment": " A vector with all coordinates set to positive infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_INFINITY"
      ],
      "begin_line": 49,
      "end_line": 50,
      "comment": " A vector with all coordinates set to negative infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Abscissa. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Ordinate. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.Vector2D(double, double)",
      "begin_line": 68,
      "end_line": 71,
      "comment": " Simple constructor.\n     * Build a vector from its coordinates\n     * @param x abscissa\n     * @param y ordinate\n     * @see #getX()\n     * @see #getY()\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 19)",
        "(line 70,col 9)-(line 70,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.Vector2D(double[])",
      "begin_line": 79,
      "end_line": 85,
      "comment": " Simple constructor.\n     * Build a vector from its coordinates\n     * @param v coordinates array\n     * @exception DimensionMismatchException if array does not have 2 elements\n     * @see #toArray()\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 22)",
        "(line 84,col 9)-(line 84,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.Vector2D(double, org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 93,
      "end_line": 96,
      "comment": " Multiplicative constructor\n     * Build a vector from another one and a scale factor.\n     * The vector built will be a * u\n     * @param a scale factor\n     * @param u base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 25)",
        "(line 95,col 9)-(line 95,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.Vector2D(double, org.apache.commons.math3.geometry.euclidean.twod.Vector2D, double, org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 106,
      "end_line": 109,
      "comment": " Linear constructor\n     * Build a vector from two other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 39)",
        "(line 108,col 9)-(line 108,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.Vector2D(double, org.apache.commons.math3.geometry.euclidean.twod.Vector2D, double, org.apache.commons.math3.geometry.euclidean.twod.Vector2D, double, org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 121,
      "end_line": 125,
      "comment": " Linear constructor\n     * Build a vector from three other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 51)",
        "(line 124,col 9)-(line 124,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.Vector2D(double, org.apache.commons.math3.geometry.euclidean.twod.Vector2D, double, org.apache.commons.math3.geometry.euclidean.twod.Vector2D, double, org.apache.commons.math3.geometry.euclidean.twod.Vector2D, double, org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 139,
      "end_line": 143,
      "comment": " Linear constructor\n     * Build a vector from four other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3 + a4 * u4\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     * @param a4 fourth scale factor\n     * @param u4 fourth base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 63)",
        "(line 142,col 9)-(line 142,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.getX()",
      "begin_line": 149,
      "end_line": 151,
      "comment": " Get the abscissa of the vector.\n     * @return abscissa of the vector\n     * @see #Vector2D(double, double)\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.getY()",
      "begin_line": 157,
      "end_line": 159,
      "comment": " Get the ordinate of the vector.\n     * @return ordinate of the vector\n     * @see #Vector2D(double, double)\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.toArray()",
      "begin_line": 165,
      "end_line": 167,
      "comment": " Get the vector coordinates as a dimension 2 array.\n     * @return vector coordinates\n     * @see #Vector2D(double[])\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.getSpace()",
      "begin_line": 170,
      "end_line": 172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.getZero()",
      "begin_line": 175,
      "end_line": 177,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.getNorm1()",
      "begin_line": 180,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.getNorm()",
      "begin_line": 185,
      "end_line": 187,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.getNormSq()",
      "begin_line": 190,
      "end_line": 192,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.getNormInf()",
      "begin_line": 195,
      "end_line": 197,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.add(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 200,
      "end_line": 203,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 35)",
        "(line 202,col 9)-(line 202,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.add(double, org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 206,
      "end_line": 209,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 35)",
        "(line 208,col 9)-(line 208,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.subtract(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 212,
      "end_line": 215,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 35)",
        "(line 214,col 9)-(line 214,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.subtract(double, org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 218,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 35)",
        "(line 220,col 9)-(line 220,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.normalize()",
      "begin_line": 224,
      "end_line": 230,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 29)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.negate()",
      "begin_line": 232,
      "end_line": 234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.scalarMultiply(double)",
      "begin_line": 237,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.isNaN()",
      "begin_line": 242,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.isInfinite()",
      "begin_line": 247,
      "end_line": 249,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.distance1(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 252,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 35)",
        "(line 254,col 9)-(line 254,col 49)",
        "(line 255,col 9)-(line 255,col 49)",
        "(line 256,col 9)-(line 256,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.distance(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 260,
      "end_line": 265,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 35)",
        "(line 262,col 9)-(line 262,col 35)",
        "(line 263,col 9)-(line 263,col 35)",
        "(line 264,col 9)-(line 264,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.distanceInf(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 268,
      "end_line": 273,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 35)",
        "(line 270,col 9)-(line 270,col 49)",
        "(line 271,col 9)-(line 271,col 49)",
        "(line 272,col 9)-(line 272,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.distanceSq(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 276,
      "end_line": 281,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 35)",
        "(line 278,col 9)-(line 278,col 35)",
        "(line 279,col 9)-(line 279,col 35)",
        "(line 280,col 9)-(line 280,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.dotProduct(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 284,
      "end_line": 287,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 41)",
        "(line 286,col 9)-(line 286,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.distance(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 297,
      "end_line": 299,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ep1.subtract(p2).getNorm()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param p1 first vector\n     * @param p2 second vector\n     * @return the distance between p1 and p2 according to the L\u003csub\u003e2\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.distanceInf(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 309,
      "end_line": 311,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ep1.subtract(p2).getNormInf()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param p1 first vector\n     * @param p2 second vector\n     * @return the distance between p1 and p2 according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.distanceSq(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 321,
      "end_line": 323,
      "comment": " Compute the square of the distance between two vectors.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ep1.subtract(p2).getNormSq()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param p1 first vector\n     * @param p2 second vector\n     * @return the square of the distance between p1 and p2\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.equals(java.lang.Object)",
      "begin_line": 344,
      "end_line": 360,
      "comment": "\n     * Test for the equality of two 2D vectors.\n     * \u003cp\u003e\n     * If all coordinates of two 2D vectors are exactly the same, and none are\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two 2D vectors are considered to be equal.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * 2D vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the 2D vector is equal to\n     * {@link #NaN}.\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two 2D vector objects are equal, false if\n     *         object is null, not an instance of Vector2D, or\n     *         not equal to this Vector2D instance\n     *\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 349,col 9)",
        "(line 351,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.hashCode()",
      "begin_line": 369,
      "end_line": 375,
      "comment": "\n     * Get a hashCode for the 2D vector.\n     * \u003cp\u003e\n     * All NaN values have the same hash code.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.toString()",
      "begin_line": 380,
      "end_line": 383,
      "comment": " Get a string representation of this vector.\n     * @return a string representation of this vector\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Vector2D.toString(java.text.NumberFormat)",
      "begin_line": 386,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 55)"
      ]
    }
  ]
}