{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/complex/Quaternion.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Quaternion",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 465,
      "comment": "\n * This class implements \u003ca href\u003d\"http://mathworld.wolfram.com/Quaternion.html\"\u003e\n * quaternions\u003c/a\u003e (Hamilton\u0027s hypercomplex numbers).\n * \u003cbr/\u003e\n * Instance of this class are guaranteed to be immutable.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "IDENTITY"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Identity quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Zero quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "I"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " i "
    },
    {
      "type": "field",
      "varNames": [
        "J"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " j "
    },
    {
      "type": "field",
      "varNames": [
        "K"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " k "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "q0"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " First component (scalar part). "
    },
    {
      "type": "field",
      "varNames": [
        "q1"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Second component (first vector part). "
    },
    {
      "type": "field",
      "varNames": [
        "q2"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Third component (second vector part). "
    },
    {
      "type": "field",
      "varNames": [
        "q3"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Fourth component (third vector part). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.Quaternion.Quaternion(double, double, double, double)",
      "begin_line": 69,
      "end_line": 77,
      "comment": "\n     * Builds a quaternion from its components.\n     *\n     * @param a Scalar component.\n     * @param b First vector component.\n     * @param c Second vector component.\n     * @param d Third vector component.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 20)",
        "(line 74,col 9)-(line 74,col 20)",
        "(line 75,col 9)-(line 75,col 20)",
        "(line 76,col 9)-(line 76,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.Quaternion.Quaternion(double, double[])",
      "begin_line": 87,
      "end_line": 97,
      "comment": "\n     * Builds a quaternion from scalar and vector parts.\n     *\n     * @param scalar Scalar part of the quaternion.\n     * @param v Components of the vector part of the quaternion.\n     *\n     * @throws DimensionMismatchException if the array length is not 3.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 25)",
        "(line 94,col 9)-(line 94,col 23)",
        "(line 95,col 9)-(line 95,col 23)",
        "(line 96,col 9)-(line 96,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.Quaternion.Quaternion(double[])",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Builds a pure quaternion from a vector (assuming that the scalar\n     * part is zero).\n     *\n     * @param v Components of the vector part of the pure quaternion.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.getConjugate()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Returns the conjugate quaternion of the instance.\n     *\n     * @return the conjugate quaternion\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.multiply(org.apache.commons.math3.complex.Quaternion, org.apache.commons.math3.complex.Quaternion)",
      "begin_line": 125,
      "end_line": 145,
      "comment": "\n     * Returns the Hamilton product of two quaternions.\n     *\n     * @param q1 First quaternion.\n     * @param q2 Second quaternion.\n     * @return the product {@code q1} and {@code q2}, in that order.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 38)",
        "(line 128,col 9)-(line 128,col 38)",
        "(line 129,col 9)-(line 129,col 38)",
        "(line 130,col 9)-(line 130,col 38)",
        "(line 133,col 9)-(line 133,col 38)",
        "(line 134,col 9)-(line 134,col 38)",
        "(line 135,col 9)-(line 135,col 38)",
        "(line 136,col 9)-(line 136,col 38)",
        "(line 139,col 9)-(line 139,col 71)",
        "(line 140,col 9)-(line 140,col 71)",
        "(line 141,col 9)-(line 141,col 71)",
        "(line 142,col 9)-(line 142,col 71)",
        "(line 144,col 9)-(line 144,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.multiply(org.apache.commons.math3.complex.Quaternion)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Returns the Hamilton product of the instance by a quaternion.\n     *\n     * @param q Quaternion.\n     * @return the product of this instance with {@code q}, in that order.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.add(org.apache.commons.math3.complex.Quaternion, org.apache.commons.math3.complex.Quaternion)",
      "begin_line": 164,
      "end_line": 170,
      "comment": "\n     * Computes the sum of two quaternions.\n     *\n     * @param q1 Quaternion.\n     * @param q2 Quaternion.\n     * @return the sum of {@code q1} and {@code q2}.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 169,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.add(org.apache.commons.math3.complex.Quaternion)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Computes the sum of the instance and another quaternion.\n     *\n     * @param q Quaternion.\n     * @return the sum of this instance and {@code q}\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.subtract(org.apache.commons.math3.complex.Quaternion, org.apache.commons.math3.complex.Quaternion)",
      "begin_line": 189,
      "end_line": 195,
      "comment": "\n     * Subtracts two quaternions.\n     *\n     * @param q1 First Quaternion.\n     * @param q2 Second quaternion.\n     * @return the difference between {@code q1} and {@code q2}.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 194,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.subtract(org.apache.commons.math3.complex.Quaternion)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Subtracts a quaternion from the instance.\n     *\n     * @param q Quaternion.\n     * @return the difference between this instance and {@code q}.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.dotProduct(org.apache.commons.math3.complex.Quaternion, org.apache.commons.math3.complex.Quaternion)",
      "begin_line": 214,
      "end_line": 220,
      "comment": "\n     * Computes the dot-product of two quaternions.\n     *\n     * @param q1 Quaternion.\n     * @param q2 Quaternion.\n     * @return the dot product of {@code q1} and {@code q2}.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 219,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.dotProduct(org.apache.commons.math3.complex.Quaternion)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Computes the dot-product of the instance by a quaternion.\n     *\n     * @param q Quaternion.\n     * @return the dot product of this instance and {@code q}.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.getNorm()",
      "begin_line": 237,
      "end_line": 242,
      "comment": "\n     * Computes the norm of the quaternion.\n     *\n     * @return the norm.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 241,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.normalize()",
      "begin_line": 251,
      "end_line": 262,
      "comment": "\n     * Computes the normalized quaternion (the versor of the instance).\n     * The norm of the quaternion must not be zero.\n     *\n     * @return a normalized quaternion.\n     * @throws ZeroException if the norm of the quaternion is zero.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 38)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 261,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.equals(java.lang.Object)",
      "begin_line": 267,
      "end_line": 281,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 280,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.hashCode()",
      "begin_line": 286,
      "end_line": 295,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 24)",
        "(line 290,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.equals(org.apache.commons.math3.complex.Quaternion, double)",
      "begin_line": 306,
      "end_line": 312,
      "comment": "\n     * Checks whether this instance is equal to another quaternion\n     * within a given tolerance.\n     *\n     * @param q Quaternion with which to compare the current quaternion.\n     * @param eps Tolerance.\n     * @return {@code true} if the each of the components are equal\n     * within the allowed absolute error.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 311,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.isUnitQuaternion(double)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Checks whether the instance is a unit quaternion within a given\n     * tolerance.\n     *\n     * @param eps Tolerance (absolute error).\n     * @return {@code true} if the norm is 1 within the given tolerance,\n     * {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.isPureQuaternion(double)",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * Checks whether the instance is a pure quaternion within a given\n     * tolerance.\n     *\n     * @param eps Tolerance (absolute error).\n     * @return {@code true} if the scalar part of the quaternion is zero.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.getPositivePolarForm()",
      "begin_line": 342,
      "end_line": 354,
      "comment": "\n     * Returns the polar form of the quaternion.\n     *\n     * @return the unit quaternion with positive scalar part.\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.getInverse()",
      "begin_line": 363,
      "end_line": 373,
      "comment": "\n     * Returns the inverse of this instance.\n     * The norm of the quaternion must not be zero.\n     *\n     * @return the inverse.\n     * @throws ZeroException if the norm (squared) of the quaternion is zero.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 72)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 369,col 9)-(line 372,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.getQ0()",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n     * Gets the first component of the quaternion (scalar part).\n     *\n     * @return the scalar part.\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.getQ1()",
      "begin_line": 390,
      "end_line": 392,
      "comment": "\n     * Gets the second component of the quaternion (first component\n     * of the vector part).\n     *\n     * @return the first component of the vector part.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.getQ2()",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n     * Gets the third component of the quaternion (second component\n     * of the vector part).\n     *\n     * @return the second component of the vector part.\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.getQ3()",
      "begin_line": 410,
      "end_line": 412,
      "comment": "\n     * Gets the fourth component of the quaternion (third component\n     * of the vector part).\n     *\n     * @return the third component of the vector part.\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.getScalarPart()",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Gets the scalar part of the quaternion.\n     *\n     * @return the scalar part.\n     * @see #getQ0()\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.getVectorPart()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\n     * Gets the three components of the vector part of the quaternion.\n     *\n     * @return the vector part.\n     * @see #getQ1()\n     * @see #getQ2()\n     * @see #getQ3()\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.multiply(double)",
      "begin_line": 442,
      "end_line": 447,
      "comment": "\n     * Multiplies the instance by a scalar.\n     *\n     * @param alpha Scalar factor.\n     * @return a scaled quaternion.\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 446,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.Quaternion.toString()",
      "begin_line": 452,
      "end_line": 464,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 30)",
        "(line 455,col 9)-(line 455,col 52)",
        "(line 456,col 9)-(line 461,col 25)",
        "(line 463,col 9)-(line 463,col 28)"
      ]
    }
  ]
}