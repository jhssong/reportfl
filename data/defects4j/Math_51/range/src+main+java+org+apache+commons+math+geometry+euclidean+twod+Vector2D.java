{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/geometry/euclidean/twod/Vector2D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Vector2D",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 33,
      "end_line": 367,
      "comment": " This class represents a 2D vector.\n * \u003cp\u003eInstances of this class are guaranteed to be immutable.\u003c/p\u003e\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Origin (coordinates: 0, 0). "
    },
    {
      "type": "field",
      "varNames": [
        "NaN"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " A vector with all coordinates set to NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "POSITIVE_INFINITY"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": " A vector with all coordinates set to positive infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_INFINITY"
      ],
      "begin_line": 48,
      "end_line": 49,
      "comment": " A vector with all coordinates set to negative infinity. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Abscissa. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Ordinate. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.Vector2D(double, double)",
      "begin_line": 67,
      "end_line": 70,
      "comment": " Simple constructor.\n     * Build a vector from its coordinates\n     * @param x abscissa\n     * @param y ordinate\n     * @see #getX()\n     * @see #getY()\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 19)",
        "(line 69,col 9)-(line 69,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.Vector2D(double, org.apache.commons.math.geometry.euclidean.twod.Vector2D)",
      "begin_line": 78,
      "end_line": 81,
      "comment": " Multiplicative constructor\n     * Build a vector from another one and a scale factor.\n     * The vector built will be a * u\n     * @param a scale factor\n     * @param u base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 25)",
        "(line 80,col 9)-(line 80,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.Vector2D(double, org.apache.commons.math.geometry.euclidean.twod.Vector2D, double, org.apache.commons.math.geometry.euclidean.twod.Vector2D)",
      "begin_line": 91,
      "end_line": 94,
      "comment": " Linear constructor\n     * Build a vector from two other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 39)",
        "(line 93,col 9)-(line 93,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.Vector2D(double, org.apache.commons.math.geometry.euclidean.twod.Vector2D, double, org.apache.commons.math.geometry.euclidean.twod.Vector2D, double, org.apache.commons.math.geometry.euclidean.twod.Vector2D)",
      "begin_line": 106,
      "end_line": 110,
      "comment": " Linear constructor\n     * Build a vector from three other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 51)",
        "(line 109,col 9)-(line 109,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.Vector2D(double, org.apache.commons.math.geometry.euclidean.twod.Vector2D, double, org.apache.commons.math.geometry.euclidean.twod.Vector2D, double, org.apache.commons.math.geometry.euclidean.twod.Vector2D, double, org.apache.commons.math.geometry.euclidean.twod.Vector2D)",
      "begin_line": 124,
      "end_line": 128,
      "comment": " Linear constructor\n     * Build a vector from four other ones and corresponding scale factors.\n     * The vector built will be a1 * u1 + a2 * u2 + a3 * u3 + a4 * u4\n     * @param a1 first scale factor\n     * @param u1 first base (unscaled) vector\n     * @param a2 second scale factor\n     * @param u2 second base (unscaled) vector\n     * @param a3 third scale factor\n     * @param u3 third base (unscaled) vector\n     * @param a4 fourth scale factor\n     * @param u4 fourth base (unscaled) vector\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 63)",
        "(line 127,col 9)-(line 127,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.getX()",
      "begin_line": 134,
      "end_line": 136,
      "comment": " Get the abscissa of the vector.\n     * @return abscissa of the vector\n     * @see #Vector2D(double, double)\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.getY()",
      "begin_line": 142,
      "end_line": 144,
      "comment": " Get the ordinate of the vector.\n     * @return ordinate of the vector\n     * @see #Vector2D(double, double)\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.getSpace()",
      "begin_line": 147,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.getZero()",
      "begin_line": 152,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.getNorm1()",
      "begin_line": 157,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.getNorm()",
      "begin_line": 162,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.getNormSq()",
      "begin_line": 167,
      "end_line": 169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.getNormInf()",
      "begin_line": 172,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.add(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 177,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 35)",
        "(line 179,col 9)-(line 179,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.add(double, org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 183,
      "end_line": 186,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 35)",
        "(line 185,col 9)-(line 185,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.subtract(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 189,
      "end_line": 192,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 35)",
        "(line 191,col 9)-(line 191,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.subtract(double, org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 195,
      "end_line": 198,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 35)",
        "(line 197,col 9)-(line 197,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.normalize()",
      "begin_line": 201,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 29)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.negate()",
      "begin_line": 209,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.scalarMultiply(double)",
      "begin_line": 214,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.isNaN()",
      "begin_line": 219,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.isInfinite()",
      "begin_line": 224,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.distance1(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 229,
      "end_line": 234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 35)",
        "(line 231,col 9)-(line 231,col 49)",
        "(line 232,col 9)-(line 232,col 49)",
        "(line 233,col 9)-(line 233,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.distance(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 237,
      "end_line": 242,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 35)",
        "(line 239,col 9)-(line 239,col 35)",
        "(line 240,col 9)-(line 240,col 35)",
        "(line 241,col 9)-(line 241,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.distanceInf(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 245,
      "end_line": 250,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 35)",
        "(line 247,col 9)-(line 247,col 49)",
        "(line 248,col 9)-(line 248,col 49)",
        "(line 249,col 9)-(line 249,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.distanceSq(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 253,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 35)",
        "(line 255,col 9)-(line 255,col 35)",
        "(line 256,col 9)-(line 256,col 35)",
        "(line 257,col 9)-(line 257,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.dotProduct(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 261,
      "end_line": 264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 41)",
        "(line 263,col 9)-(line 263,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.distance(org.apache.commons.math.geometry.euclidean.twod.Vector2D, org.apache.commons.math.geometry.euclidean.twod.Vector2D)",
      "begin_line": 274,
      "end_line": 276,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e2\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ep1.subtract(p2).getNorm()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param p1 first vector\n     * @param p2 second vector\n     * @return the distance between p1 and p2 according to the L\u003csub\u003e2\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.distanceInf(org.apache.commons.math.geometry.euclidean.twod.Vector2D, org.apache.commons.math.geometry.euclidean.twod.Vector2D)",
      "begin_line": 286,
      "end_line": 288,
      "comment": " Compute the distance between two vectors according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ep1.subtract(p2).getNormInf()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param p1 first vector\n     * @param p2 second vector\n     * @return the distance between p1 and p2 according to the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.distanceSq(org.apache.commons.math.geometry.euclidean.twod.Vector2D, org.apache.commons.math.geometry.euclidean.twod.Vector2D)",
      "begin_line": 298,
      "end_line": 300,
      "comment": " Compute the square of the distance between two vectors.\n     * \u003cp\u003eCalling this method is equivalent to calling:\n     * \u003ccode\u003ep1.subtract(p2).getNormSq()\u003c/code\u003e except that no intermediate\n     * vector is built\u003c/p\u003e\n     * @param p1 first vector\n     * @param p2 second vector\n     * @return the square of the distance between p1 and p2\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.equals(java.lang.Object)",
      "begin_line": 321,
      "end_line": 337,
      "comment": "\n     * Test for the equality of two 2D vectors.\n     * \u003cp\u003e\n     * If all coordinates of two 2D vectors are exactly the same, and none are\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two 2D vectors are considered to be equal.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eNaN\u003c/code\u003e coordinates are considered to affect globally the vector\n     * and be equals to each other - i.e, if either (or all) coordinates of the\n     * 2D vector are equal to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the 2D vector is equal to\n     * {@link #NaN}.\n     * \u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two 2D vector objects are equal, false if\n     *         object is null, not an instance of Vector2D, or\n     *         not equal to this Vector2D instance\n     *\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.hashCode()",
      "begin_line": 346,
      "end_line": 352,
      "comment": "\n     * Get a hashCode for the 2D vector.\n     * \u003cp\u003e\n     * All NaN values have the same hash code.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.toString()",
      "begin_line": 357,
      "end_line": 360,
      "comment": " Get a string representation of this vector.\n     * @return a string representation of this vector\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Vector2D.toString(java.text.NumberFormat)",
      "begin_line": 363,
      "end_line": 365,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 55)"
      ]
    }
  ]
}