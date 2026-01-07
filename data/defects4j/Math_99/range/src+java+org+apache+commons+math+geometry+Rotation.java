{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/geometry/Rotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Rotation",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 91,
      "end_line": 1060,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IDENTITY"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Identity rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "q0"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Scalar coordinate of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q1"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " First coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q2"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Second coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q3"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Third coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(double, double, double, double, boolean)",
      "begin_line": 125,
      "end_line": 142,
      "comment": " Build a rotation from the quaternion coordinates.\n   * \u003cp\u003eA rotation can be built from a \u003cem\u003enormalized\u003c/em\u003e quaternion,\n   * i.e. a quaternion for which q\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e +\n   * q\u003csub\u003e1\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e + q\u003csub\u003e2\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e +\n   * q\u003csub\u003e3\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e \u003d 1. If the quaternion is not normalized,\n   * the constructor can normalize it in a preprocessing step.\u003c/p\u003e\n   * @param q0 scalar part of the quaternion\n   * @param q1 first coordinate of the vectorial part of the quaternion\n   * @param q2 second coordinate of the vectorial part of the quaternion\n   * @param q3 third coordinate of the vectorial part of the quaternion\n   * @param needsNormalization if true, the coordinates are considered\n   * not to be normalized, a normalization preprocessing step is performed\n   * before using them\n   ",
      "child_ranges": [
        "(line 128,col 5)-(line 135,col 5)",
        "(line 137,col 5)-(line 137,col 17)",
        "(line 138,col 5)-(line 138,col 17)",
        "(line 139,col 5)-(line 139,col 17)",
        "(line 140,col 5)-(line 140,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.Vector3D, double)",
      "begin_line": 155,
      "end_line": 171,
      "comment": " Build a rotation from an axis and an angle.\n   * \u003cp\u003eWe use the convention that angles are oriented according to\n   * the effect of the rotation on vectors around the axis. That means\n   * that if (i, j, k) is a direct frame and if we first provide +k as\n   * the axis and PI/2 as the angle to this constructor, and then\n   * {@link #applyTo(Vector3D) apply} the instance to +i, we will get\n   * +j.\u003c/p\u003e\n   * @param axis axis around which to rotate\n   * @param angle rotation angle.\n   * @exception ArithmeticException if the axis norm is zero\n   ",
      "child_ranges": [
        "(line 157,col 5)-(line 157,col 33)",
        "(line 158,col 5)-(line 161,col 5)",
        "(line 163,col 5)-(line 163,col 36)",
        "(line 164,col 5)-(line 164,col 46)",
        "(line 166,col 5)-(line 166,col 30)",
        "(line 167,col 5)-(line 167,col 29)",
        "(line 168,col 5)-(line 168,col 29)",
        "(line 169,col 5)-(line 169,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(double[][], double)",
      "begin_line": 203,
      "end_line": 281,
      "comment": " Build a rotation from a 3X3 matrix.\n\n   * \u003cp\u003eRotation matrices are orthogonal matrices, i.e. unit matrices\n   * (which are matrices for which m.m\u003csup\u003eT\u003c/sup\u003e \u003d I) with real\n   * coefficients. The module of the determinant of unit matrices is\n   * 1, among the orthogonal 3X3 matrices, only the ones having a\n   * positive determinant (+1) are rotation matrices.\u003c/p\u003e\n\n   * \u003cp\u003eWhen a rotation is defined by a matrix with truncated values\n   * (typically when it is extracted from a technical sheet where only\n   * four to five significant digits are available), the matrix is not\n   * orthogonal anymore. This constructor handles this case\n   * transparently by using a copy of the given matrix and applying a\n   * correction to the copy in order to perfect its orthogonality. If\n   * the Frobenius norm of the correction needed is above the given\n   * threshold, then the matrix is considered to be too far from a\n   * true rotation matrix and an exception is thrown.\u003cp\u003e\n\n   * @param m rotation matrix\n   * @param threshold convergence threshold for the iterative\n   * orthogonality correction (convergence is reached when the\n   * difference between two steps of the Frobenius norm of the\n   * correction is below this threshold)\n\n   * @exception NotARotationMatrixException if the matrix is not a 3X3\n   * matrix, or if it cannot be transformed into an orthogonal matrix\n   * with the given threshold, or if the determinant of the resulting\n   * orthogonal matrix is negative\n\n   ",
      "child_ranges": [
        "(line 207,col 5)-(line 215,col 5)",
        "(line 218,col 5)-(line 218,col 55)",
        "(line 221,col 5)-(line 223,col 77)",
        "(line 224,col 5)-(line 230,col 5)",
        "(line 243,col 5)-(line 243,col 49)",
        "(line 244,col 5)-(line 279,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 301,
      "end_line": 421,
      "comment": " Build the rotation that transforms a pair of vector into another pair.\n\n   * \u003cp\u003eExcept for possible scale factors, if the instance were applied to\n   * the pair (u\u003csub\u003e1\u003c/sub\u003e, u\u003csub\u003e2\u003c/sub\u003e) it will produce the pair\n   * (v\u003csub\u003e1\u003c/sub\u003e, v\u003csub\u003e2\u003c/sub\u003e).\u003c/p\u003e\n\n   * \u003cp\u003eIf the angular separation between u\u003csub\u003e1\u003c/sub\u003e and u\u003csub\u003e2\u003c/sub\u003e is\n   * not the same as the angular separation between v\u003csub\u003e1\u003c/sub\u003e and\n   * v\u003csub\u003e2\u003c/sub\u003e, then a corrected v\u0027\u003csub\u003e2\u003c/sub\u003e will be used rather than\n   * v\u003csub\u003e2\u003c/sub\u003e, the corrected vector will be in the (v\u003csub\u003e1\u003c/sub\u003e,\n   * v\u003csub\u003e2\u003c/sub\u003e) plane.\u003c/p\u003e\n\n   * @param u1 first vector of the origin pair\n   * @param u2 second vector of the origin pair\n   * @param v1 desired image of u1 by the rotation\n   * @param v2 desired image of u2 by the rotation\n   * @exception IllegalArgumentException if the norm of one of the vectors is zero\n   ",
      "child_ranges": [
        "(line 304,col 3)-(line 304,col 44)",
        "(line 305,col 3)-(line 305,col 44)",
        "(line 306,col 3)-(line 306,col 44)",
        "(line 307,col 3)-(line 307,col 44)",
        "(line 308,col 3)-(line 310,col 3)",
        "(line 312,col 3)-(line 312,col 25)",
        "(line 313,col 3)-(line 313,col 25)",
        "(line 314,col 3)-(line 314,col 25)",
        "(line 316,col 3)-(line 316,col 25)",
        "(line 317,col 3)-(line 317,col 25)",
        "(line 318,col 3)-(line 318,col 25)",
        "(line 321,col 3)-(line 321,col 41)",
        "(line 322,col 3)-(line 322,col 35)",
        "(line 323,col 3)-(line 323,col 35)",
        "(line 324,col 3)-(line 324,col 35)",
        "(line 325,col 3)-(line 325,col 35)",
        "(line 328,col 3)-(line 328,col 46)",
        "(line 329,col 3)-(line 329,col 46)",
        "(line 330,col 3)-(line 330,col 30)",
        "(line 331,col 3)-(line 331,col 30)",
        "(line 332,col 3)-(line 332,col 77)",
        "(line 333,col 3)-(line 333,col 41)",
        "(line 334,col 3)-(line 334,col 49)",
        "(line 335,col 3)-(line 335,col 49)",
        "(line 336,col 3)-(line 336,col 49)",
        "(line 337,col 3)-(line 337,col 35)",
        "(line 342,col 3)-(line 342,col 21)",
        "(line 343,col 3)-(line 343,col 21)",
        "(line 344,col 3)-(line 344,col 31)",
        "(line 345,col 3)-(line 345,col 31)",
        "(line 346,col 3)-(line 346,col 31)",
        "(line 347,col 3)-(line 347,col 31)",
        "(line 348,col 3)-(line 348,col 31)",
        "(line 349,col 3)-(line 349,col 31)",
        "(line 350,col 3)-(line 352,col 51)",
        "(line 353,col 3)-(line 355,col 48)",
        "(line 357,col 3)-(line 405,col 3)",
        "(line 408,col 3)-(line 408,col 19)",
        "(line 409,col 3)-(line 409,col 29)",
        "(line 410,col 3)-(line 410,col 22)",
        "(line 411,col 3)-(line 411,col 22)",
        "(line 412,col 3)-(line 412,col 22)",
        "(line 415,col 4)-(line 417,col 57)",
        "(line 418,col 4)-(line 418,col 33)",
        "(line 419,col 3)-(line 419,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 436,
      "end_line": 463,
      "comment": " Build one of the rotations that transform one vector into another one.\n\n   * \u003cp\u003eExcept for a possible scale factor, if the instance were\n   * applied to the vector u it will produce the vector v. There is an\n   * infinite number of such rotations, this constructor choose the\n   * one with the smallest associated angle (i.e. the one whose axis\n   * is orthogonal to the (u, v) plane). If u and v are colinear, an\n   * arbitrary rotation axis is chosen.\u003c/p\u003e\n\n   * @param u origin vector\n   * @param v desired image of u by the rotation\n   * @exception IllegalArgumentException if the norm of one of the vectors is zero\n   ",
      "child_ranges": [
        "(line 438,col 5)-(line 438,col 51)",
        "(line 439,col 5)-(line 441,col 5)",
        "(line 443,col 5)-(line 443,col 43)",
        "(line 445,col 5)-(line 461,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.RotationOrder, double, double, double)",
      "begin_line": 484,
      "end_line": 494,
      "comment": " Build a rotation from three Cardan or Euler elementary rotations.\n\n   * \u003cp\u003eCardan rotations are three successive rotations around the\n   * canonical axes X, Y and Z, each axis being used once. There are\n   * 6 such sets of rotations (XYZ, XZY, YXZ, YZX, ZXY and ZYX). Euler\n   * rotations are three successive rotations around the canonical\n   * axes X, Y and Z, the first and last rotations being around the\n   * same axis. There are 6 such sets of rotations (XYX, XZX, YXY,\n   * YZY, ZXZ and ZYZ), the most popular one being ZXZ.\u003c/p\u003e\n   * \u003cp\u003eBeware that many people routinely use the term Euler angles even\n   * for what really are Cardan angles (this confusion is especially\n   * widespread in the aerospace business where Roll, Pitch and Yaw angles\n   * are often wrongly tagged as Euler angles).\u003c/p\u003e\n\n   * @param order order of rotations to use\n   * @param alpha1 angle of the first elementary rotation\n   * @param alpha2 angle of the second elementary rotation\n   * @param alpha3 angle of the third elementary rotation\n   ",
      "child_ranges": [
        "(line 486,col 5)-(line 486,col 54)",
        "(line 487,col 5)-(line 487,col 54)",
        "(line 488,col 5)-(line 488,col 54)",
        "(line 489,col 5)-(line 489,col 51)",
        "(line 490,col 5)-(line 490,col 21)",
        "(line 491,col 5)-(line 491,col 21)",
        "(line 492,col 5)-(line 492,col 21)",
        "(line 493,col 5)-(line 493,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.revert()",
      "begin_line": 503,
      "end_line": 505,
      "comment": " Revert a rotation.\n   * Build a rotation which reverse the effect of another\n   * rotation. This means that if r(u) \u003d v, then r.revert(v) \u003d u. The\n   * instance is not changed.\n   * @return a new rotation whose effect is the reverse of the effect\n   * of the instance\n   ",
      "child_ranges": [
        "(line 504,col 5)-(line 504,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ0()",
      "begin_line": 510,
      "end_line": 512,
      "comment": " Get the scalar coordinate of the quaternion.\n   * @return scalar coordinate of the quaternion\n   ",
      "child_ranges": [
        "(line 511,col 5)-(line 511,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ1()",
      "begin_line": 517,
      "end_line": 519,
      "comment": " Get the first coordinate of the vectorial part of the quaternion.\n   * @return first coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 518,col 5)-(line 518,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ2()",
      "begin_line": 524,
      "end_line": 526,
      "comment": " Get the second coordinate of the vectorial part of the quaternion.\n   * @return second coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 525,col 5)-(line 525,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ3()",
      "begin_line": 531,
      "end_line": 533,
      "comment": " Get the third coordinate of the vectorial part of the quaternion.\n   * @return third coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 532,col 5)-(line 532,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getAxis()",
      "begin_line": 538,
      "end_line": 548,
      "comment": " Get the normalized axis of the rotation.\n   * @return normalized axis of the rotation\n   ",
      "child_ranges": [
        "(line 539,col 5)-(line 539,col 53)",
        "(line 540,col 5)-(line 545,col 5)",
        "(line 546,col 5)-(line 546,col 49)",
        "(line 547,col 5)-(line 547,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getAngle()",
      "begin_line": 553,
      "end_line": 560,
      "comment": " Get the angle of the rotation.\n   * @return angle of the rotation (between 0 and \u0026pi;)\n   ",
      "child_ranges": [
        "(line 554,col 5)-(line 558,col 5)",
        "(line 559,col 5)-(line 559,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getAngles(org.apache.commons.math.geometry.RotationOrder)",
      "begin_line": 597,
      "end_line": 818,
      "comment": " Get the Cardan or Euler angles corresponding to the instance.\n\n   * \u003cp\u003eThe equations show that each rotation can be defined by two\n   * different values of the Cardan or Euler angles set. For example\n   * if Cardan angles are used, the rotation defined by the angles\n   * a\u003csub\u003e1\u003c/sub\u003e, a\u003csub\u003e2\u003c/sub\u003e and a\u003csub\u003e3\u003c/sub\u003e is the same as\n   * the rotation defined by the angles \u0026pi; + a\u003csub\u003e1\u003c/sub\u003e, \u0026pi;\n   * - a\u003csub\u003e2\u003c/sub\u003e and \u0026pi; + a\u003csub\u003e3\u003c/sub\u003e. This method implements\n   * the following arbitrary choices:\u003c/p\u003e\n   * \u003cul\u003e\n   *   \u003cli\u003efor Cardan angles, the chosen set is the one for which the\n   *   second angle is between -\u0026pi;/2 and \u0026pi;/2 (i.e its cosine is\n   *   positive),\u003c/li\u003e\n   *   \u003cli\u003efor Euler angles, the chosen set is the one for which the\n   *   second angle is between 0 and \u0026pi; (i.e its sine is positive).\u003c/li\u003e\n   * \u003c/ul\u003e\n\n   * \u003cp\u003eCardan and Euler angle have a very disappointing drawback: all\n   * of them have singularities. This means that if the instance is\n   * too close to the singularities corresponding to the given\n   * rotation order, it will be impossible to retrieve the angles. For\n   * Cardan angles, this is often called gimbal lock. There is\n   * \u003cem\u003enothing\u003c/em\u003e to do to prevent this, it is an intrinsic problem\n   * with Cardan and Euler representation (but not a problem with the\n   * rotation itself, which is perfectly well defined). For Cardan\n   * angles, singularities occur when the second angle is close to\n   * -\u0026pi;/2 or +\u0026pi;/2, for Euler angle singularities occur when the\n   * second angle is close to 0 or \u0026pi;, this implies that the identity\n   * rotation is always singular for Euler angles!\u003c/p\u003e\n\n   * @param order rotation order to use\n   * @return an array of three angles, in the order specified by the set\n   * @exception CardanEulerSingularityException if the rotation is\n   * singular with respect to the angles set specified\n   ",
      "child_ranges": [
        "(line 600,col 5)-(line 816,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getMatrix()",
      "begin_line": 823,
      "end_line": 857,
      "comment": " Get the 3X3 matrix corresponding to the instance\n   * @return the matrix corresponding to the instance\n   ",
      "child_ranges": [
        "(line 826,col 5)-(line 826,col 27)",
        "(line 827,col 5)-(line 827,col 27)",
        "(line 828,col 5)-(line 828,col 27)",
        "(line 829,col 5)-(line 829,col 27)",
        "(line 830,col 5)-(line 830,col 27)",
        "(line 831,col 5)-(line 831,col 27)",
        "(line 832,col 5)-(line 832,col 27)",
        "(line 833,col 5)-(line 833,col 27)",
        "(line 834,col 5)-(line 834,col 27)",
        "(line 835,col 5)-(line 835,col 27)",
        "(line 838,col 5)-(line 838,col 35)",
        "(line 839,col 5)-(line 839,col 25)",
        "(line 840,col 5)-(line 840,col 25)",
        "(line 841,col 5)-(line 841,col 25)",
        "(line 843,col 5)-(line 843,col 41)",
        "(line 844,col 5)-(line 844,col 35)",
        "(line 845,col 5)-(line 845,col 35)",
        "(line 847,col 5)-(line 847,col 35)",
        "(line 848,col 5)-(line 848,col 41)",
        "(line 849,col 5)-(line 849,col 35)",
        "(line 851,col 5)-(line 851,col 35)",
        "(line 852,col 5)-(line 852,col 35)",
        "(line 853,col 5)-(line 853,col 41)",
        "(line 855,col 5)-(line 855,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyTo(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 863,
      "end_line": 875,
      "comment": " Apply the rotation to a vector.\n   * @param u vector to apply the rotation to\n   * @return a new vector which is the image of u by the rotation\n   ",
      "child_ranges": [
        "(line 865,col 5)-(line 865,col 24)",
        "(line 866,col 5)-(line 866,col 24)",
        "(line 867,col 5)-(line 867,col 24)",
        "(line 869,col 5)-(line 869,col 40)",
        "(line 871,col 5)-(line 873,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyInverseTo(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 881,
      "end_line": 894,
      "comment": " Apply the inverse of the rotation to a vector.\n   * @param u vector to apply the inverse of the rotation to\n   * @return a new vector which such that u is its image by the rotation\n   ",
      "child_ranges": [
        "(line 883,col 5)-(line 883,col 24)",
        "(line 884,col 5)-(line 884,col 24)",
        "(line 885,col 5)-(line 885,col 24)",
        "(line 887,col 5)-(line 887,col 40)",
        "(line 888,col 5)-(line 888,col 20)",
        "(line 890,col 5)-(line 892,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyTo(org.apache.commons.math.geometry.Rotation)",
      "begin_line": 905,
      "end_line": 911,
      "comment": " Apply the instance to another rotation.\n   * Applying the instance to a rotation is computing the composition\n   * in an order compliant with the following rule : let u be any\n   * vector and v its image by r (i.e. r.applyTo(u) \u003d v), let w be the image\n   * of v by the instance (i.e. applyTo(v) \u003d w), then w \u003d comp.applyTo(u),\n   * where comp \u003d applyTo(r).\n   * @param r rotation to apply the rotation to\n   * @return a new rotation which is the composition of r by the instance\n   ",
      "child_ranges": [
        "(line 906,col 5)-(line 910,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyInverseTo(org.apache.commons.math.geometry.Rotation)",
      "begin_line": 924,
      "end_line": 930,
      "comment": " Apply the inverse of the instance to another rotation.\n   * Applying the inverse of the instance to a rotation is computing\n   * the composition in an order compliant with the following rule :\n   * let u be any vector and v its image by r (i.e. r.applyTo(u) \u003d v),\n   * let w be the inverse image of v by the instance\n   * (i.e. applyInverseTo(v) \u003d w), then w \u003d comp.applyTo(u), where\n   * comp \u003d applyInverseTo(r).\n   * @param r rotation to apply the rotation to\n   * @return a new rotation which is the composition of r by the inverse\n   * of the instance\n   ",
      "child_ranges": [
        "(line 925,col 5)-(line 929,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.orthogonalizeMatrix(double[][], double)",
      "begin_line": 942,
      "end_line": 1030,
      "comment": " Perfect orthogonality on a 3X3 matrix.\n   * @param m initial matrix (not exactly orthogonal)\n   * @param threshold convergence threshold for the iterative\n   * orthogonality correction (convergence is reached when the\n   * difference between two steps of the Frobenius norm of the\n   * correction is below this threshold)\n   * @return an orthogonal matrix close to m\n   * @exception NotARotationMatrixException if the matrix cannot be\n   * orthogonalized with the given threshold after 10 iterations\n   ",
      "child_ranges": [
        "(line 944,col 5)-(line 944,col 23)",
        "(line 945,col 5)-(line 945,col 23)",
        "(line 946,col 5)-(line 946,col 23)",
        "(line 947,col 5)-(line 947,col 23)",
        "(line 948,col 5)-(line 948,col 23)",
        "(line 949,col 5)-(line 949,col 23)",
        "(line 950,col 5)-(line 950,col 23)",
        "(line 951,col 5)-(line 951,col 23)",
        "(line 952,col 5)-(line 952,col 23)",
        "(line 953,col 5)-(line 953,col 23)",
        "(line 954,col 5)-(line 954,col 23)",
        "(line 955,col 5)-(line 955,col 23)",
        "(line 956,col 5)-(line 956,col 18)",
        "(line 957,col 5)-(line 957,col 15)",
        "(line 959,col 5)-(line 959,col 36)",
        "(line 960,col 5)-(line 960,col 23)",
        "(line 961,col 5)-(line 961,col 23)",
        "(line 962,col 5)-(line 962,col 23)",
        "(line 965,col 5)-(line 965,col 14)",
        "(line 966,col 5)-(line 1022,col 5)",
        "(line 1025,col 5)-(line 1029,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.distance(org.apache.commons.math.geometry.Rotation, org.apache.commons.math.geometry.Rotation)",
      "begin_line": 1056,
      "end_line": 1058,
      "comment": " Compute the \u003ci\u003edistance\u003c/i\u003e between two rotations.\n   * \u003cp\u003eThe \u003ci\u003edistance\u003c/i\u003e is intended here as a way to check if two\n   * rotations are almost similar (i.e. they transform vectors the same way)\n   * or very different. It is mathematically defined as the angle of\n   * the rotation r that prepended to one of the rotations gives the other\n   * one:\u003c/p\u003e\n   * \u003cpre\u003e\n   *        r\u003csub\u003e1\u003c/sub\u003e(r) \u003d r\u003csub\u003e2\u003c/sub\u003e\n   * \u003c/pre\u003e\n   * \u003cp\u003eThis distance is an angle between 0 and \u0026pi;. Its value is the smallest\n   * possible upper bound of the angle in radians between r\u003csub\u003e1\u003c/sub\u003e(v)\n   * and r\u003csub\u003e2\u003c/sub\u003e(v) for all possible vectors v. This upper bound is\n   * reached for some v. The distance is equal to 0 if and only if the two\n   * rotations are identical.\u003c/p\u003e\n   * \u003cp\u003eComparing two rotations should always be done using this value rather\n   * than for example comparing the components of the quaternions. It is much\n   * more stable, and has a geometric meaning. Also comparing quaternions\n   * components is error prone since for example quaternions (0.36, 0.48, -0.48, -0.64)\n   * and (-0.36, -0.48, 0.48, 0.64) represent exactly the same rotation despite\n   * their components are different (they are exact opposites).\u003c/p\u003e\n   * @param r1 first rotation\n   * @param r2 second rotation\n   * @return \u003ci\u003edistance\u003c/i\u003e between r1 and r2\n   ",
      "child_ranges": [
        "(line 1057,col 7)-(line 1057,col 46)"
      ]
    }
  ]
}