{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/geometry/Rotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Rotation",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 89,
      "end_line": 1035,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation()",
      "begin_line": 93,
      "end_line": 98,
      "comment": " Build the identity rotation.\n   ",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 11)",
        "(line 95,col 5)-(line 95,col 11)",
        "(line 96,col 5)-(line 96,col 11)",
        "(line 97,col 5)-(line 97,col 11)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(double, double, double, double, boolean)",
      "begin_line": 114,
      "end_line": 131,
      "comment": " Build a rotation from the quaternion coordinates.\n   * \u003cp\u003eA rotation can be built from a \u003cem\u003enormalized\u003c/em\u003e quaternion,\n   * i.e. a quaternion for which q\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e +\n   * q\u003csub\u003e1\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e + q\u003csub\u003e2\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e +\n   * q\u003csub\u003e3\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e \u003d 1. If the quaternion is not normalized,\n   * the constructor can normalize it in a preprocessing step.\u003c/p\u003e\n   * @param q0 scalar part of the quaternion\n   * @param q1 first coordinate of the vectorial part of the quaternion\n   * @param q2 second coordinate of the vectorial part of the quaternion\n   * @param q3 third coordinate of the vectorial part of the quaternion\n   * @param needsNormalization if true, the coordinates are considered\n   * not to be normalized, a normalization preprocessing step is performed\n   * before using them\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 124,col 5)",
        "(line 126,col 5)-(line 126,col 17)",
        "(line 127,col 5)-(line 127,col 17)",
        "(line 128,col 5)-(line 128,col 17)",
        "(line 129,col 5)-(line 129,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.Vector3D, double)",
      "begin_line": 144,
      "end_line": 159,
      "comment": " Build a rotation from an axis and an angle.\n   * \u003cp\u003eWe use the convention that angles are oriented according to\n   * the effect of the rotation on vectors around the axis. That means\n   * that if (i, j, k) is a direct frame and if we first provide +k as\n   * the axis and PI/2 as the angle to this constructor, and then\n   * {@link #applyTo(Vector3D) apply} the instance to +i, we will get\n   * +j.\u003c/p\u003e\n   * @param axis axis around which to rotate\n   * @param angle rotation angle.\n   * @exception ArithmeticException if the axis norm is zero\n   ",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 33)",
        "(line 147,col 5)-(line 149,col 5)",
        "(line 151,col 5)-(line 151,col 36)",
        "(line 152,col 5)-(line 152,col 46)",
        "(line 154,col 5)-(line 154,col 30)",
        "(line 155,col 5)-(line 155,col 29)",
        "(line 156,col 5)-(line 156,col 29)",
        "(line 157,col 5)-(line 157,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(double[][], double)",
      "begin_line": 191,
      "end_line": 269,
      "comment": " Build a rotation from a 3X3 matrix.\n\n   * \u003cp\u003eRotation matrices are orthogonal matrices, i.e. unit matrices\n   * (which are matrices for which m.m\u003csup\u003eT\u003c/sup\u003e \u003d I) with real\n   * coefficients. The module of the determinant of unit matrices is\n   * 1, among the orthogonal 3X3 matrices, only the ones having a\n   * positive determinant (+1) are rotation matrices.\u003c/p\u003e\n\n   * \u003cp\u003eWhen a rotation is defined by a matrix with truncated values\n   * (typically when it is extracted from a technical sheet where only\n   * four to five significant digits are available), the matrix is not\n   * orthogonal anymore. This constructor handles this case\n   * transparently by using a copy of the given matrix and applying a\n   * correction to the copy in order to perfect its orthogonality. If\n   * the Frobenius norm of the correction needed is above the given\n   * threshold, then the matrix is considered to be too far from a\n   * true rotation matrix and an exception is thrown.\u003cp\u003e\n\n   * @param m rotation matrix\n   * @param threshold convergence threshold for the iterative\n   * orthogonality correction (convergence is reached when the\n   * difference between two steps of the Frobenius norm of the\n   * correction is below this threshold)\n\n   * @exception NotARotationMatrixException if the matrix is not a 3X3\n   * matrix, or if it cannot be transformed into an orthogonal matrix\n   * with the given threshold, or if the determinant of the resulting\n   * orthogonal matrix is negative\n\n   ",
      "child_ranges": [
        "(line 195,col 5)-(line 203,col 5)",
        "(line 206,col 5)-(line 206,col 55)",
        "(line 209,col 5)-(line 211,col 77)",
        "(line 212,col 5)-(line 218,col 5)",
        "(line 231,col 5)-(line 231,col 49)",
        "(line 232,col 5)-(line 267,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 289,
      "end_line": 409,
      "comment": " Build the rotation that transforms a pair of vector into another pair.\n\n   * \u003cp\u003eExcept for possible scale factors, if the instance were applied to\n   * the pair (u\u003csub\u003e1\u003c/sub\u003e, u\u003csub\u003e2\u003c/sub\u003e) it will produce the pair\n   * (v\u003csub\u003e1\u003c/sub\u003e, v\u003csub\u003e2\u003c/sub\u003e).\u003c/p\u003e\n\n   * \u003cp\u003eIf the angular separation between u\u003csub\u003e1\u003c/sub\u003e and u\u003csub\u003e2\u003c/sub\u003e is\n   * not the same as the angular separation between v\u003csub\u003e1\u003c/sub\u003e and\n   * v\u003csub\u003e2\u003c/sub\u003e, then a corrected v\u0027\u003csub\u003e2\u003c/sub\u003e will be used rather than\n   * v\u003csub\u003e2\u003c/sub\u003e, the corrected vector will be in the (v\u003csub\u003e1\u003c/sub\u003e,\n   * v\u003csub\u003e2\u003c/sub\u003e) plane.\u003c/p\u003e\n\n   * @param u1 first vector of the origin pair\n   * @param u2 second vector of the origin pair\n   * @param v1 desired image of u1 by the rotation\n   * @param v2 desired image of u2 by the rotation\n   * @exception IllegalArgumentException if the norm of one of the vectors is zero\n   ",
      "child_ranges": [
        "(line 292,col 3)-(line 292,col 44)",
        "(line 293,col 3)-(line 293,col 44)",
        "(line 294,col 3)-(line 294,col 44)",
        "(line 295,col 3)-(line 295,col 44)",
        "(line 296,col 3)-(line 298,col 3)",
        "(line 300,col 3)-(line 300,col 25)",
        "(line 301,col 3)-(line 301,col 25)",
        "(line 302,col 3)-(line 302,col 25)",
        "(line 304,col 3)-(line 304,col 25)",
        "(line 305,col 3)-(line 305,col 25)",
        "(line 306,col 3)-(line 306,col 25)",
        "(line 309,col 3)-(line 309,col 41)",
        "(line 310,col 3)-(line 310,col 35)",
        "(line 311,col 3)-(line 311,col 35)",
        "(line 312,col 3)-(line 312,col 35)",
        "(line 313,col 3)-(line 313,col 35)",
        "(line 316,col 3)-(line 316,col 46)",
        "(line 317,col 3)-(line 317,col 46)",
        "(line 318,col 3)-(line 318,col 30)",
        "(line 319,col 3)-(line 319,col 30)",
        "(line 320,col 3)-(line 320,col 77)",
        "(line 321,col 3)-(line 321,col 41)",
        "(line 322,col 3)-(line 322,col 49)",
        "(line 323,col 3)-(line 323,col 49)",
        "(line 324,col 3)-(line 324,col 49)",
        "(line 325,col 3)-(line 325,col 35)",
        "(line 330,col 3)-(line 330,col 21)",
        "(line 331,col 3)-(line 331,col 21)",
        "(line 332,col 3)-(line 332,col 31)",
        "(line 333,col 3)-(line 333,col 31)",
        "(line 334,col 3)-(line 334,col 31)",
        "(line 335,col 3)-(line 335,col 31)",
        "(line 336,col 3)-(line 336,col 31)",
        "(line 337,col 3)-(line 337,col 31)",
        "(line 338,col 3)-(line 340,col 51)",
        "(line 341,col 3)-(line 343,col 48)",
        "(line 345,col 3)-(line 393,col 3)",
        "(line 396,col 3)-(line 396,col 19)",
        "(line 397,col 3)-(line 397,col 29)",
        "(line 398,col 3)-(line 398,col 22)",
        "(line 399,col 3)-(line 399,col 22)",
        "(line 400,col 3)-(line 400,col 22)",
        "(line 403,col 4)-(line 405,col 57)",
        "(line 406,col 4)-(line 406,col 33)",
        "(line 407,col 3)-(line 407,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 424,
      "end_line": 451,
      "comment": " Build one of the rotations that transform one vector into another one.\n\n   * \u003cp\u003eExcept for a possible scale factor, if the instance were\n   * applied to the vector u it will produce the vector v. There is an\n   * infinite number of such rotations, this constructor choose the\n   * one with the smallest associated angle (i.e. the one whose axis\n   * is orthogonal to the (u, v) plane). If u and v are colinear, an\n   * arbitrary rotation axis is chosen.\u003c/p\u003e\n\n   * @param u origin vector\n   * @param v desired image of u by the rotation\n   * @exception IllegalArgumentException if the norm of one of the vectors is zero\n   ",
      "child_ranges": [
        "(line 426,col 5)-(line 426,col 51)",
        "(line 427,col 5)-(line 429,col 5)",
        "(line 431,col 5)-(line 431,col 43)",
        "(line 433,col 5)-(line 449,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.RotationOrder, double, double, double)",
      "begin_line": 472,
      "end_line": 482,
      "comment": " Build a rotation from three Cardan or Euler elementary rotations.\n\n   * \u003cp\u003eCardan rotations are three successive rotations around the\n   * canonical axes X, Y and Z, each axis beeing used once. There are\n   * 6 such sets of rotations (XYZ, XZY, YXZ, YZX, ZXY and ZYX). Euler\n   * rotations are three successive rotations around the canonical\n   * axes X, Y and Z, the first and last rotations beeing around the\n   * same axis. There are 6 such sets of rotations (XYX, XZX, YXY,\n   * YZY, ZXZ and ZYZ), the most popular one being ZXZ.\u003c/p\u003e\n   * \u003cp\u003eBeware that many people routinely use the term Euler angles even\n   * for what really are Cardan angles (this confusion is especially\n   * widespread in the aerospace business where Roll, Pitch and Yaw angles\n   * are often wrongly tagged as Euler angles).\u003c/p\u003e\n\n   * @param order order of rotations to use\n   * @param alpha1 angle of the first elementary rotation\n   * @param alpha2 angle of the second elementary rotation\n   * @param alpha3 angle of the third elementary rotation\n   ",
      "child_ranges": [
        "(line 474,col 5)-(line 474,col 54)",
        "(line 475,col 5)-(line 475,col 54)",
        "(line 476,col 5)-(line 476,col 54)",
        "(line 477,col 5)-(line 477,col 51)",
        "(line 478,col 5)-(line 478,col 21)",
        "(line 479,col 5)-(line 479,col 21)",
        "(line 480,col 5)-(line 480,col 21)",
        "(line 481,col 5)-(line 481,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.revert()",
      "begin_line": 491,
      "end_line": 493,
      "comment": " Revert a rotation.\n   * Build a rotation which reverse the effect of another\n   * rotation. This means that if r(u) \u003d v, then r.revert(v) \u003d u. The\n   * instance is not changed.\n   * @return a new rotation whose effect is the reverse of the effect\n   * of the instance\n   ",
      "child_ranges": [
        "(line 492,col 5)-(line 492,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ0()",
      "begin_line": 498,
      "end_line": 500,
      "comment": " Get the scalar coordinate of the quaternion.\n   * @return scalar coordinate of the quaternion\n   ",
      "child_ranges": [
        "(line 499,col 5)-(line 499,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ1()",
      "begin_line": 505,
      "end_line": 507,
      "comment": " Get the first coordinate of the vectorial part of the quaternion.\n   * @return first coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 506,col 5)-(line 506,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ2()",
      "begin_line": 512,
      "end_line": 514,
      "comment": " Get the second coordinate of the vectorial part of the quaternion.\n   * @return second coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 513,col 5)-(line 513,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ3()",
      "begin_line": 519,
      "end_line": 521,
      "comment": " Get the third coordinate of the vectorial part of the quaternion.\n   * @return third coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 520,col 5)-(line 520,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getAxis()",
      "begin_line": 526,
      "end_line": 536,
      "comment": " Get the normalized axis of the rotation.\n   * @return normalized axis of the rotation\n   ",
      "child_ranges": [
        "(line 527,col 5)-(line 527,col 53)",
        "(line 528,col 5)-(line 533,col 5)",
        "(line 534,col 5)-(line 534,col 49)",
        "(line 535,col 5)-(line 535,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getAngle()",
      "begin_line": 541,
      "end_line": 548,
      "comment": " Get the angle of the rotation.\n   * @return angle of the rotation (between 0 and \u0026pi;)\n   ",
      "child_ranges": [
        "(line 542,col 5)-(line 546,col 5)",
        "(line 547,col 5)-(line 547,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getAngles(org.apache.commons.math.geometry.RotationOrder)",
      "begin_line": 585,
      "end_line": 806,
      "comment": " Get the Cardan or Euler angles corresponding to the instance.\n\n   * \u003cp\u003eThe equations show that each rotation can be defined by two\n   * different values of the Cardan or Euler angles set. For example\n   * if Cardan angles are used, the rotation defined by the angles\n   * a\u003csub\u003e1\u003c/sub\u003e, a\u003csub\u003e2\u003c/sub\u003e and a\u003csub\u003e3\u003c/sub\u003e is the same as\n   * the rotation defined by the angles \u0026pi; + a\u003csub\u003e1\u003c/sub\u003e, \u0026pi;\n   * - a\u003csub\u003e2\u003c/sub\u003e and \u0026pi; + a\u003csub\u003e3\u003c/sub\u003e. This method implements\n   * the following arbitrary choices:\u003c/p\u003e\n   * \u003cul\u003e\n   *   \u003cli\u003efor Cardan angles, the chosen set is the one for which the\n   *   second angle is between -\u0026pi;/2 and \u0026pi;/2 (i.e its cosine is\n   *   positive),\u003c/li\u003e\n   *   \u003cli\u003efor Euler angles, the chosen set is the one for which the\n   *   second angle is between 0 and \u0026pi; (i.e its sine is positive).\u003c/li\u003e\n   * \u003c/ul\u003e\n\n   * \u003cp\u003eCardan and Euler angle have a very disappointing drawback: all\n   * of them have singularities. This means that if the instance is\n   * too close to the singularities corresponding to the given\n   * rotation order, it will be impossible to retrieve the angles. For\n   * Cardan angles, this is often called gimbal lock. There is\n   * \u003cem\u003enothing\u003c/em\u003e to do to prevent this, it is an intrinsic problem\n   * with Cardan and Euler representation (but not a problem with the\n   * rotation itself, which is perfectly well defined). For Cardan\n   * angles, singularities occur when the second angle is close to\n   * -\u0026pi;/2 or +\u0026pi;/2, for Euler angle singularities occur when the\n   * second angle is close to 0 or \u0026pi;, this implies that the identity\n   * rotation is always singular for Euler angles!\u003c/p\u003e\n\n   * @param order rotation order to use\n   * @return an array of three angles, in the order specified by the set\n   * @exception CardanEulerSingularityException if the rotation is\n   * singular with respect to the angles set specified\n   ",
      "child_ranges": [
        "(line 588,col 5)-(line 804,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getMatrix()",
      "begin_line": 811,
      "end_line": 845,
      "comment": " Get the 3X3 matrix corresponding to the instance\n   * @return the matrix corresponding to the instance\n   ",
      "child_ranges": [
        "(line 814,col 5)-(line 814,col 27)",
        "(line 815,col 5)-(line 815,col 27)",
        "(line 816,col 5)-(line 816,col 27)",
        "(line 817,col 5)-(line 817,col 27)",
        "(line 818,col 5)-(line 818,col 27)",
        "(line 819,col 5)-(line 819,col 27)",
        "(line 820,col 5)-(line 820,col 27)",
        "(line 821,col 5)-(line 821,col 27)",
        "(line 822,col 5)-(line 822,col 27)",
        "(line 823,col 5)-(line 823,col 27)",
        "(line 826,col 5)-(line 826,col 35)",
        "(line 827,col 5)-(line 827,col 25)",
        "(line 828,col 5)-(line 828,col 25)",
        "(line 829,col 5)-(line 829,col 25)",
        "(line 831,col 5)-(line 831,col 41)",
        "(line 832,col 5)-(line 832,col 35)",
        "(line 833,col 5)-(line 833,col 35)",
        "(line 835,col 5)-(line 835,col 35)",
        "(line 836,col 5)-(line 836,col 41)",
        "(line 837,col 5)-(line 837,col 35)",
        "(line 839,col 5)-(line 839,col 35)",
        "(line 840,col 5)-(line 840,col 35)",
        "(line 841,col 5)-(line 841,col 41)",
        "(line 843,col 5)-(line 843,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyTo(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 851,
      "end_line": 863,
      "comment": " Apply the rotation to a vector.\n   * @param u vector to apply the rotation to\n   * @return a new vector which is the image of u by the rotation\n   ",
      "child_ranges": [
        "(line 853,col 5)-(line 853,col 24)",
        "(line 854,col 5)-(line 854,col 24)",
        "(line 855,col 5)-(line 855,col 24)",
        "(line 857,col 5)-(line 857,col 40)",
        "(line 859,col 5)-(line 861,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyInverseTo(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 869,
      "end_line": 882,
      "comment": " Apply the inverse of the rotation to a vector.\n   * @param u vector to apply the inverse of the rotation to\n   * @return a new vector which such that u is its image by the rotation\n   ",
      "child_ranges": [
        "(line 871,col 5)-(line 871,col 24)",
        "(line 872,col 5)-(line 872,col 24)",
        "(line 873,col 5)-(line 873,col 24)",
        "(line 875,col 5)-(line 875,col 40)",
        "(line 876,col 5)-(line 876,col 20)",
        "(line 878,col 5)-(line 880,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyTo(org.apache.commons.math.geometry.Rotation)",
      "begin_line": 893,
      "end_line": 899,
      "comment": " Apply the instance to another rotation.\n   * Applying the instance to a rotation is computing the composition\n   * in an order compliant with the following rule : let u be any\n   * vector and v its image by r (i.e. r.applyTo(u) \u003d v), let w be the image\n   * of v by the instance (i.e. applyTo(v) \u003d w), then w \u003d comp.applyTo(u),\n   * where comp \u003d applyTo(r).\n   * @param r rotation to apply the rotation to\n   * @return a new rotation which is the composition of r by the instance\n   ",
      "child_ranges": [
        "(line 894,col 5)-(line 898,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyInverseTo(org.apache.commons.math.geometry.Rotation)",
      "begin_line": 912,
      "end_line": 918,
      "comment": " Apply the inverse of the instance to another rotation.\n   * Applying the inverse of the instance to a rotation is computing\n   * the composition in an order compliant with the following rule :\n   * let u be any vector and v its image by r (i.e. r.applyTo(u) \u003d v),\n   * let w be the inverse image of v by the instance\n   * (i.e. applyInverseTo(v) \u003d w), then w \u003d comp.applyTo(u), where\n   * comp \u003d applyInverseTo(r).\n   * @param r rotation to apply the rotation to\n   * @return a new rotation which is the composition of r by the inverse\n   * of the instance\n   ",
      "child_ranges": [
        "(line 913,col 5)-(line 917,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.orthogonalizeMatrix(double[][], double)",
      "begin_line": 930,
      "end_line": 1018,
      "comment": " Perfect orthogonality on a 3X3 matrix.\n   * @param m initial matrix (not exactly orthogonal)\n   * @param threshold convergence threshold for the iterative\n   * orthogonality correction (convergence is reached when the\n   * difference between two steps of the Frobenius norm of the\n   * correction is below this threshold)\n   * @return an orthogonal matrix close to m\n   * @exception NotARotationMatrixException if the matrix cannot be\n   * orthogonalized with the given threshold after 10 iterations\n   ",
      "child_ranges": [
        "(line 932,col 5)-(line 932,col 23)",
        "(line 933,col 5)-(line 933,col 23)",
        "(line 934,col 5)-(line 934,col 23)",
        "(line 935,col 5)-(line 935,col 23)",
        "(line 936,col 5)-(line 936,col 23)",
        "(line 937,col 5)-(line 937,col 23)",
        "(line 938,col 5)-(line 938,col 23)",
        "(line 939,col 5)-(line 939,col 23)",
        "(line 940,col 5)-(line 940,col 23)",
        "(line 941,col 5)-(line 941,col 23)",
        "(line 942,col 5)-(line 942,col 23)",
        "(line 943,col 5)-(line 943,col 23)",
        "(line 944,col 5)-(line 944,col 18)",
        "(line 945,col 5)-(line 945,col 15)",
        "(line 947,col 5)-(line 947,col 36)",
        "(line 948,col 5)-(line 948,col 23)",
        "(line 949,col 5)-(line 949,col 23)",
        "(line 950,col 5)-(line 950,col 23)",
        "(line 953,col 5)-(line 953,col 14)",
        "(line 954,col 5)-(line 1010,col 5)",
        "(line 1013,col 5)-(line 1017,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "q0"
      ],
      "begin_line": 1021,
      "end_line": 1021,
      "comment": " Scalar coordinate of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q1"
      ],
      "begin_line": 1024,
      "end_line": 1024,
      "comment": " First coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q2"
      ],
      "begin_line": 1027,
      "end_line": 1027,
      "comment": " Second coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q3"
      ],
      "begin_line": 1030,
      "end_line": 1030,
      "comment": " Third coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1033,
      "end_line": 1033,
      "comment": " Serializable version identifier "
    }
  ]
}