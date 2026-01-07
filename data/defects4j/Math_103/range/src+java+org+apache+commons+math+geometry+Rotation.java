{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/geometry/Rotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Rotation",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 89,
      "end_line": 1016,
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
      "comment": " Build a rotation from an axis and an angle.\n   * \u003cp\u003eWe use the convention that angles are oriented according to\n   * the effect of the rotation on vectors around the axis. That means\n   * that if (i, j, k) is a direct frame and if we first provide +k as\n   * the axis and PI/2 as the angle to this constructor, and then\n   * {@link #applyTo(Vector3D) apply} the instance to +i, we will get\n   * +j.\u003c/p\u003e\n   * @param axis axis around which to rotate\n   * @param angle rotation angle.\n   * @exception ArithmeticException if the axis norm is null\n   ",
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
      "begin_line": 288,
      "end_line": 409,
      "comment": " Build the rotation that transforms a pair of vector into another pair.\n\n   * \u003cp\u003eExcept for possible scale factors, if the instance were applied to\n   * the pair (u\u003csub\u003e1\u003c/sub\u003e, u\u003csub\u003e2\u003c/sub\u003e) it will produce the pair\n   * (v\u003csub\u003e1\u003c/sub\u003e, v\u003csub\u003e2\u003c/sub\u003e).\u003c/p\u003e\n\n   * \u003cp\u003eIf the angular separation between u\u003csub\u003e1\u003c/sub\u003e and u\u003csub\u003e2\u003c/sub\u003e is\n   * not the same as the angular separation between v\u003csub\u003e1\u003c/sub\u003e and\n   * v\u003csub\u003e2\u003c/sub\u003e, then a corrected v\u0027\u003csub\u003e2\u003c/sub\u003e will be used rather than\n   * v\u003csub\u003e2\u003c/sub\u003e, the corrected vector will be in the (v\u003csub\u003e1\u003c/sub\u003e,\n   * v\u003csub\u003e2\u003c/sub\u003e) plane.\u003c/p\u003e\n\n   * @param u1 first vector of the origin pair\n   * @param u2 second vector of the origin pair\n   * @param v1 desired image of u1 by the rotation\n   * @param v2 desired image of u2 by the rotation\n   ",
      "child_ranges": [
        "(line 291,col 3)-(line 291,col 44)",
        "(line 292,col 3)-(line 292,col 44)",
        "(line 293,col 3)-(line 293,col 44)",
        "(line 294,col 3)-(line 294,col 44)",
        "(line 295,col 3)-(line 297,col 47)",
        "(line 299,col 3)-(line 299,col 25)",
        "(line 300,col 3)-(line 300,col 25)",
        "(line 301,col 3)-(line 301,col 25)",
        "(line 303,col 3)-(line 303,col 25)",
        "(line 304,col 3)-(line 304,col 25)",
        "(line 305,col 3)-(line 305,col 25)",
        "(line 308,col 3)-(line 308,col 41)",
        "(line 309,col 3)-(line 309,col 35)",
        "(line 310,col 3)-(line 310,col 35)",
        "(line 311,col 3)-(line 311,col 35)",
        "(line 312,col 3)-(line 312,col 35)",
        "(line 315,col 3)-(line 315,col 46)",
        "(line 316,col 3)-(line 316,col 46)",
        "(line 317,col 3)-(line 317,col 30)",
        "(line 318,col 3)-(line 318,col 30)",
        "(line 319,col 3)-(line 319,col 77)",
        "(line 320,col 3)-(line 320,col 41)",
        "(line 321,col 3)-(line 321,col 49)",
        "(line 322,col 3)-(line 322,col 49)",
        "(line 323,col 3)-(line 323,col 49)",
        "(line 324,col 3)-(line 324,col 35)",
        "(line 329,col 3)-(line 329,col 21)",
        "(line 330,col 3)-(line 330,col 21)",
        "(line 331,col 3)-(line 331,col 31)",
        "(line 332,col 3)-(line 332,col 31)",
        "(line 333,col 3)-(line 333,col 31)",
        "(line 334,col 3)-(line 334,col 31)",
        "(line 335,col 3)-(line 335,col 31)",
        "(line 336,col 3)-(line 336,col 31)",
        "(line 337,col 3)-(line 339,col 51)",
        "(line 340,col 3)-(line 342,col 48)",
        "(line 344,col 3)-(line 393,col 3)",
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
      "comment": " Build one of the rotations that transform one vector into another one.\n\n   * \u003cp\u003eExcept for a possible scale factor, if the instance were\n   * applied to the vector u it will produce the vector v. There is an\n   * infinite number of such rotations, this constructor choose the\n   * one with the smallest associated angle (i.e. the one whose axis\n   * is orthogonal to the (u, v) plane). If u and v are colinear, an\n   * arbitrary rotation axis is chosen.\u003c/p\u003e\n\n   * @param u origin vector\n   * @param v desired image of u by the rotation\n   * @exception ArithmeticException if the norm of one of the vectors is null\n   ",
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
      "end_line": 537,
      "comment": " Get the normalized axis of the rotation.\n   * @return normalized axis of the rotation\n   ",
      "child_ranges": [
        "(line 527,col 5)-(line 527,col 53)",
        "(line 528,col 5)-(line 536,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getAngle()",
      "begin_line": 542,
      "end_line": 550,
      "comment": " Get the angle of the rotation.\n   * @return angle of the rotation (between 0 and \u0026pi;)\n   ",
      "child_ranges": [
        "(line 543,col 5)-(line 549,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getAngles(org.apache.commons.math.geometry.RotationOrder)",
      "begin_line": 584,
      "end_line": 791,
      "comment": " Get the Cardan or Euler angles corresponding to the instance.\n\n   * \u003cp\u003eThe equations show that each rotation can be defined by two\n   * different values of the Cardan or Euler angles set. For example\n   * if Cardan angles are used, the rotation defined by the angles\n   * a\u003csub\u003e1\u003c/sub\u003e, a\u003csub\u003e2\u003c/sub\u003e and a\u003csub\u003e3\u003c/sub\u003e is the same as\n   * the rotation defined by the angles \u0026pi; + a\u003csub\u003e1\u003c/sub\u003e, \u0026pi;\n   * - a\u003csub\u003e2\u003c/sub\u003e and \u0026pi; + a\u003csub\u003e3\u003c/sub\u003e. This method implements\n   * the following arbitrary choices. For Cardan angles, the chosen\n   * set is the one for which the second angle is between -\u0026pi;/2 and\n   * \u0026pi;/2 (i.e its cosine is positive). For Euler angles, the chosen\n   * set is the one for which the second angle is between 0 and \u0026pi;\n   * (i.e its sine is positive).\u003c/p\u003e\n\n   * \u003cp\u003eCardan and Euler angle have a very disappointing drawback: all\n   * of them have singularities. This means that if the instance is\n   * too close to the singularities corresponding to the given\n   * rotation order, it will be impossible to retrieve the angles. For\n   * Cardan angles, this is often called gimbal lock. There is\n   * \u003cem\u003enothing\u003c/em\u003e to do to prevent this, it is an intrisic problem\n   * with Cardan and Euler representation (but not a problem with the\n   * rotation itself, which is perfectly well defined). For Cardan\n   * angles, singularities occur when the second angle is close to\n   * -\u0026pi;/2 or +\u0026pi;/2, for Euler angle singularities occur when the\n   * second angle is close to 0 or \u0026pi;, this implies that the identity\n   * rotation is always singular for Euler angles!\n\n   * @param order rotation order to use\n   * @return an array of three angles, in the order specified by the set\n   * @exception CardanEulerSingularityException if the rotation is\n   * singular with respect to the angles set specified\n   ",
      "child_ranges": [
        "(line 587,col 5)-(line 587,col 40)",
        "(line 588,col 5)-(line 588,col 44)",
        "(line 589,col 5)-(line 589,col 46)",
        "(line 591,col 5)-(line 591,col 36)",
        "(line 592,col 5)-(line 592,col 23)",
        "(line 593,col 5)-(line 593,col 23)",
        "(line 595,col 5)-(line 787,col 5)",
        "(line 789,col 5)-(line 789,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getMatrix()",
      "begin_line": 796,
      "end_line": 830,
      "comment": " Get the 3X3 matrix corresponding to the instance\n   * @return the matrix corresponding to the instance\n   ",
      "child_ranges": [
        "(line 799,col 5)-(line 799,col 27)",
        "(line 800,col 5)-(line 800,col 27)",
        "(line 801,col 5)-(line 801,col 27)",
        "(line 802,col 5)-(line 802,col 27)",
        "(line 803,col 5)-(line 803,col 27)",
        "(line 804,col 5)-(line 804,col 27)",
        "(line 805,col 5)-(line 805,col 27)",
        "(line 806,col 5)-(line 806,col 27)",
        "(line 807,col 5)-(line 807,col 27)",
        "(line 808,col 5)-(line 808,col 27)",
        "(line 811,col 5)-(line 811,col 35)",
        "(line 812,col 5)-(line 812,col 25)",
        "(line 813,col 5)-(line 813,col 25)",
        "(line 814,col 5)-(line 814,col 25)",
        "(line 816,col 5)-(line 816,col 41)",
        "(line 817,col 5)-(line 817,col 35)",
        "(line 818,col 5)-(line 818,col 35)",
        "(line 820,col 5)-(line 820,col 35)",
        "(line 821,col 5)-(line 821,col 41)",
        "(line 822,col 5)-(line 822,col 35)",
        "(line 824,col 5)-(line 824,col 35)",
        "(line 825,col 5)-(line 825,col 35)",
        "(line 826,col 5)-(line 826,col 41)",
        "(line 828,col 5)-(line 828,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyTo(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 836,
      "end_line": 848,
      "comment": " Apply the rotation to a vector.\n   * @param u vector to apply the rotation to\n   * @return a new vector which is the image of u by the rotation\n   ",
      "child_ranges": [
        "(line 838,col 5)-(line 838,col 24)",
        "(line 839,col 5)-(line 839,col 24)",
        "(line 840,col 5)-(line 840,col 24)",
        "(line 842,col 5)-(line 842,col 40)",
        "(line 844,col 5)-(line 846,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyInverseTo(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 854,
      "end_line": 867,
      "comment": " Apply the inverse of the rotation to a vector.\n   * @param u vector to apply the inverse of the rotation to\n   * @return a new vector which such that u is its image by the rotation\n   ",
      "child_ranges": [
        "(line 856,col 5)-(line 856,col 24)",
        "(line 857,col 5)-(line 857,col 24)",
        "(line 858,col 5)-(line 858,col 24)",
        "(line 860,col 5)-(line 860,col 40)",
        "(line 861,col 5)-(line 861,col 20)",
        "(line 863,col 5)-(line 865,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyTo(org.apache.commons.math.geometry.Rotation)",
      "begin_line": 878,
      "end_line": 884,
      "comment": " Apply the instance to another rotation.\n   * Applying the instance to a rotation is computing the composition\n   * in an order compliant with the following rule : let u be any\n   * vector and v its image by r (i.e. r.applyTo(u) \u003d v), let w be the image\n   * of v by the instance (i.e. applyTo(v) \u003d w), then w \u003d comp.applyTo(u),\n   * where comp \u003d applyTo(r).\n   * @param r rotation to apply the rotation to\n   * @return a new rotation which is the composition of r by the instance\n   ",
      "child_ranges": [
        "(line 879,col 5)-(line 883,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyInverseTo(org.apache.commons.math.geometry.Rotation)",
      "begin_line": 897,
      "end_line": 903,
      "comment": " Apply the inverse of the instance to another rotation.\n   * Applying the inverse of the instance to a rotation is computing\n   * the composition in an order compliant with the following rule :\n   * let u be any vector and v its image by r (i.e. r.applyTo(u) \u003d v),\n   * let w be the inverse image of v by the instance\n   * (i.e. applyInverseTo(v) \u003d w), then w \u003d comp.applyTo(u), where\n   * comp \u003d applyInverseTo(r).\n   * @param r rotation to apply the rotation to\n   * @return a new rotation which is the composition of r by the inverse\n   * of the instance\n   ",
      "child_ranges": [
        "(line 898,col 5)-(line 902,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.orthogonalizeMatrix(double[][], double)",
      "begin_line": 915,
      "end_line": 1000,
      "comment": " Perfect orthogonality on a 3X3 matrix.\n   * @param m initial matrix (not exactly orthogonal)\n   * @param threshold convergence threshold for the iterative\n   * orthogonality correction (convergence is reached when the\n   * difference between two steps of the Frobenius norm of the\n   * correction is below this threshold)\n   * @return an orthogonal matrix close to m\n   * @exception NotARotationMatrixException if the matrix cannot be\n   * orthogonalized with the given threshold after 10 iterations\n   ",
      "child_ranges": [
        "(line 917,col 5)-(line 917,col 25)",
        "(line 918,col 5)-(line 918,col 25)",
        "(line 919,col 5)-(line 919,col 25)",
        "(line 920,col 5)-(line 920,col 25)",
        "(line 921,col 5)-(line 921,col 25)",
        "(line 922,col 5)-(line 922,col 25)",
        "(line 923,col 5)-(line 923,col 25)",
        "(line 924,col 5)-(line 924,col 25)",
        "(line 925,col 5)-(line 925,col 25)",
        "(line 926,col 5)-(line 926,col 18)",
        "(line 927,col 5)-(line 927,col 15)",
        "(line 929,col 5)-(line 929,col 35)",
        "(line 930,col 5)-(line 930,col 25)",
        "(line 931,col 5)-(line 931,col 25)",
        "(line 932,col 5)-(line 932,col 25)",
        "(line 935,col 5)-(line 935,col 14)",
        "(line 936,col 5)-(line 992,col 5)",
        "(line 995,col 5)-(line 999,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "q0"
      ],
      "begin_line": 1003,
      "end_line": 1003,
      "comment": " Scalar coordinate of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q1"
      ],
      "begin_line": 1006,
      "end_line": 1006,
      "comment": " First coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q2"
      ],
      "begin_line": 1009,
      "end_line": 1009,
      "comment": " Second coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q3"
      ],
      "begin_line": 1012,
      "end_line": 1012,
      "comment": " Third coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1014,
      "end_line": 1014,
      "comment": ""
    }
  ]
}