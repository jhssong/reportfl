{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/geometry/Rotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Rotation",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 94,
      "end_line": 1071,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IDENTITY"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Identity rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "q0"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Scalar coordinate of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q1"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " First coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q2"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Second coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q3"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Third coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(double, double, double, double, boolean)",
      "begin_line": 132,
      "end_line": 149,
      "comment": " Build a rotation from the quaternion coordinates.\n   * \u003cp\u003eA rotation can be built from a \u003cem\u003enormalized\u003c/em\u003e quaternion,\n   * i.e. a quaternion for which q\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e +\n   * q\u003csub\u003e1\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e + q\u003csub\u003e2\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e +\n   * q\u003csub\u003e3\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e \u003d 1. If the quaternion is not normalized,\n   * the constructor can normalize it in a preprocessing step.\u003c/p\u003e\n   * \u003cp\u003eNote that some conventions put the scalar part of the quaternion\n   * as the 4\u003csup\u003eth\u003c/sup\u003e component and the vector part as the first three\n   * components. This is \u003cem\u003enot\u003c/em\u003e our convention. We put the scalar part\n   * as the first component.\u003c/p\u003e\n   * @param q0 scalar part of the quaternion\n   * @param q1 first coordinate of the vectorial part of the quaternion\n   * @param q2 second coordinate of the vectorial part of the quaternion\n   * @param q3 third coordinate of the vectorial part of the quaternion\n   * @param needsNormalization if true, the coordinates are considered\n   * not to be normalized, a normalization preprocessing step is performed\n   * before using them\n   ",
      "child_ranges": [
        "(line 135,col 5)-(line 142,col 5)",
        "(line 144,col 5)-(line 144,col 17)",
        "(line 145,col 5)-(line 145,col 17)",
        "(line 146,col 5)-(line 146,col 17)",
        "(line 147,col 5)-(line 147,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.Vector3D, double)",
      "begin_line": 172,
      "end_line": 187,
      "comment": " Build a rotation from an axis and an angle.\n   * \u003cp\u003eWe use the convention that angles are oriented according to\n   * the effect of the rotation on vectors around the axis. That means\n   * that if (i, j, k) is a direct frame and if we first provide +k as\n   * the axis and \u0026pi;/2 as the angle to this constructor, and then\n   * {@link #applyTo(Vector3D) apply} the instance to +i, we will get\n   * +j.\u003c/p\u003e\n   * \u003cp\u003eAnother way to represent our convention is to say that a rotation\n   * of angle \u0026theta; about the unit vector (x, y, z) is the same as the\n   * rotation build from quaternion components { cos(-\u0026theta;/2),\n   * x * sin(-\u0026theta;/2), y * sin(-\u0026theta;/2), z * sin(-\u0026theta;/2) }.\n   * Note the minus sign on the angle!\u003c/p\u003e\n   * \u003cp\u003eOn the one hand this convention is consistent with a vectorial\n   * perspective (moving vectors in fixed frames), on the other hand it\n   * is different from conventions with a frame perspective (fixed vectors\n   * viewed from different frames) like the ones used for example in spacecraft\n   * attitude community or in the graphics community.\u003c/p\u003e\n   * @param axis axis around which to rotate\n   * @param angle rotation angle.\n   * @exception ArithmeticException if the axis norm is zero\n   ",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 33)",
        "(line 175,col 5)-(line 177,col 5)",
        "(line 179,col 5)-(line 179,col 36)",
        "(line 180,col 5)-(line 180,col 46)",
        "(line 182,col 5)-(line 182,col 30)",
        "(line 183,col 5)-(line 183,col 29)",
        "(line 184,col 5)-(line 184,col 29)",
        "(line 185,col 5)-(line 185,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(double[][], double)",
      "begin_line": 219,
      "end_line": 292,
      "comment": " Build a rotation from a 3X3 matrix.\n\n   * \u003cp\u003eRotation matrices are orthogonal matrices, i.e. unit matrices\n   * (which are matrices for which m.m\u003csup\u003eT\u003c/sup\u003e \u003d I) with real\n   * coefficients. The module of the determinant of unit matrices is\n   * 1, among the orthogonal 3X3 matrices, only the ones having a\n   * positive determinant (+1) are rotation matrices.\u003c/p\u003e\n\n   * \u003cp\u003eWhen a rotation is defined by a matrix with truncated values\n   * (typically when it is extracted from a technical sheet where only\n   * four to five significant digits are available), the matrix is not\n   * orthogonal anymore. This constructor handles this case\n   * transparently by using a copy of the given matrix and applying a\n   * correction to the copy in order to perfect its orthogonality. If\n   * the Frobenius norm of the correction needed is above the given\n   * threshold, then the matrix is considered to be too far from a\n   * true rotation matrix and an exception is thrown.\u003cp\u003e\n\n   * @param m rotation matrix\n   * @param threshold convergence threshold for the iterative\n   * orthogonality correction (convergence is reached when the\n   * difference between two steps of the Frobenius norm of the\n   * correction is below this threshold)\n\n   * @exception NotARotationMatrixException if the matrix is not a 3X3\n   * matrix, or if it cannot be transformed into an orthogonal matrix\n   * with the given threshold, or if the determinant of the resulting\n   * orthogonal matrix is negative\n\n   ",
      "child_ranges": [
        "(line 223,col 5)-(line 228,col 5)",
        "(line 231,col 5)-(line 231,col 55)",
        "(line 234,col 5)-(line 236,col 77)",
        "(line 237,col 5)-(line 241,col 5)",
        "(line 254,col 5)-(line 254,col 49)",
        "(line 255,col 5)-(line 290,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 312,
      "end_line": 432,
      "comment": " Build the rotation that transforms a pair of vector into another pair.\n\n   * \u003cp\u003eExcept for possible scale factors, if the instance were applied to\n   * the pair (u\u003csub\u003e1\u003c/sub\u003e, u\u003csub\u003e2\u003c/sub\u003e) it will produce the pair\n   * (v\u003csub\u003e1\u003c/sub\u003e, v\u003csub\u003e2\u003c/sub\u003e).\u003c/p\u003e\n\n   * \u003cp\u003eIf the angular separation between u\u003csub\u003e1\u003c/sub\u003e and u\u003csub\u003e2\u003c/sub\u003e is\n   * not the same as the angular separation between v\u003csub\u003e1\u003c/sub\u003e and\n   * v\u003csub\u003e2\u003c/sub\u003e, then a corrected v\u0027\u003csub\u003e2\u003c/sub\u003e will be used rather than\n   * v\u003csub\u003e2\u003c/sub\u003e, the corrected vector will be in the (v\u003csub\u003e1\u003c/sub\u003e,\n   * v\u003csub\u003e2\u003c/sub\u003e) plane.\u003c/p\u003e\n\n   * @param u1 first vector of the origin pair\n   * @param u2 second vector of the origin pair\n   * @param v1 desired image of u1 by the rotation\n   * @param v2 desired image of u2 by the rotation\n   * @exception IllegalArgumentException if the norm of one of the vectors is zero\n   ",
      "child_ranges": [
        "(line 315,col 3)-(line 315,col 44)",
        "(line 316,col 3)-(line 316,col 44)",
        "(line 317,col 3)-(line 317,col 44)",
        "(line 318,col 3)-(line 318,col 44)",
        "(line 319,col 3)-(line 321,col 3)",
        "(line 323,col 3)-(line 323,col 25)",
        "(line 324,col 3)-(line 324,col 25)",
        "(line 325,col 3)-(line 325,col 25)",
        "(line 327,col 3)-(line 327,col 25)",
        "(line 328,col 3)-(line 328,col 25)",
        "(line 329,col 3)-(line 329,col 25)",
        "(line 332,col 3)-(line 332,col 41)",
        "(line 333,col 3)-(line 333,col 35)",
        "(line 334,col 3)-(line 334,col 35)",
        "(line 335,col 3)-(line 335,col 35)",
        "(line 336,col 3)-(line 336,col 35)",
        "(line 339,col 3)-(line 339,col 46)",
        "(line 340,col 3)-(line 340,col 46)",
        "(line 341,col 3)-(line 341,col 30)",
        "(line 342,col 3)-(line 342,col 30)",
        "(line 343,col 3)-(line 343,col 77)",
        "(line 344,col 3)-(line 344,col 41)",
        "(line 345,col 3)-(line 345,col 49)",
        "(line 346,col 3)-(line 346,col 49)",
        "(line 347,col 3)-(line 347,col 49)",
        "(line 348,col 3)-(line 348,col 35)",
        "(line 353,col 3)-(line 353,col 21)",
        "(line 354,col 3)-(line 354,col 21)",
        "(line 355,col 3)-(line 355,col 31)",
        "(line 356,col 3)-(line 356,col 31)",
        "(line 357,col 3)-(line 357,col 31)",
        "(line 358,col 3)-(line 358,col 31)",
        "(line 359,col 3)-(line 359,col 31)",
        "(line 360,col 3)-(line 360,col 31)",
        "(line 361,col 3)-(line 363,col 51)",
        "(line 364,col 3)-(line 366,col 48)",
        "(line 368,col 3)-(line 416,col 3)",
        "(line 419,col 3)-(line 419,col 19)",
        "(line 420,col 3)-(line 420,col 29)",
        "(line 421,col 3)-(line 421,col 22)",
        "(line 422,col 3)-(line 422,col 22)",
        "(line 423,col 3)-(line 423,col 22)",
        "(line 426,col 4)-(line 428,col 57)",
        "(line 429,col 4)-(line 429,col 33)",
        "(line 430,col 3)-(line 430,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 447,
      "end_line": 474,
      "comment": " Build one of the rotations that transform one vector into another one.\n\n   * \u003cp\u003eExcept for a possible scale factor, if the instance were\n   * applied to the vector u it will produce the vector v. There is an\n   * infinite number of such rotations, this constructor choose the\n   * one with the smallest associated angle (i.e. the one whose axis\n   * is orthogonal to the (u, v) plane). If u and v are colinear, an\n   * arbitrary rotation axis is chosen.\u003c/p\u003e\n\n   * @param u origin vector\n   * @param v desired image of u by the rotation\n   * @exception IllegalArgumentException if the norm of one of the vectors is zero\n   ",
      "child_ranges": [
        "(line 449,col 5)-(line 449,col 51)",
        "(line 450,col 5)-(line 452,col 5)",
        "(line 454,col 5)-(line 454,col 43)",
        "(line 456,col 5)-(line 472,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.RotationOrder, double, double, double)",
      "begin_line": 495,
      "end_line": 505,
      "comment": " Build a rotation from three Cardan or Euler elementary rotations.\n\n   * \u003cp\u003eCardan rotations are three successive rotations around the\n   * canonical axes X, Y and Z, each axis being used once. There are\n   * 6 such sets of rotations (XYZ, XZY, YXZ, YZX, ZXY and ZYX). Euler\n   * rotations are three successive rotations around the canonical\n   * axes X, Y and Z, the first and last rotations being around the\n   * same axis. There are 6 such sets of rotations (XYX, XZX, YXY,\n   * YZY, ZXZ and ZYZ), the most popular one being ZXZ.\u003c/p\u003e\n   * \u003cp\u003eBeware that many people routinely use the term Euler angles even\n   * for what really are Cardan angles (this confusion is especially\n   * widespread in the aerospace business where Roll, Pitch and Yaw angles\n   * are often wrongly tagged as Euler angles).\u003c/p\u003e\n\n   * @param order order of rotations to use\n   * @param alpha1 angle of the first elementary rotation\n   * @param alpha2 angle of the second elementary rotation\n   * @param alpha3 angle of the third elementary rotation\n   ",
      "child_ranges": [
        "(line 497,col 5)-(line 497,col 54)",
        "(line 498,col 5)-(line 498,col 54)",
        "(line 499,col 5)-(line 499,col 54)",
        "(line 500,col 5)-(line 500,col 51)",
        "(line 501,col 5)-(line 501,col 21)",
        "(line 502,col 5)-(line 502,col 21)",
        "(line 503,col 5)-(line 503,col 21)",
        "(line 504,col 5)-(line 504,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.revert()",
      "begin_line": 514,
      "end_line": 516,
      "comment": " Revert a rotation.\n   * Build a rotation which reverse the effect of another\n   * rotation. This means that if r(u) \u003d v, then r.revert(v) \u003d u. The\n   * instance is not changed.\n   * @return a new rotation whose effect is the reverse of the effect\n   * of the instance\n   ",
      "child_ranges": [
        "(line 515,col 5)-(line 515,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ0()",
      "begin_line": 521,
      "end_line": 523,
      "comment": " Get the scalar coordinate of the quaternion.\n   * @return scalar coordinate of the quaternion\n   ",
      "child_ranges": [
        "(line 522,col 5)-(line 522,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ1()",
      "begin_line": 528,
      "end_line": 530,
      "comment": " Get the first coordinate of the vectorial part of the quaternion.\n   * @return first coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 529,col 5)-(line 529,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ2()",
      "begin_line": 535,
      "end_line": 537,
      "comment": " Get the second coordinate of the vectorial part of the quaternion.\n   * @return second coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 536,col 5)-(line 536,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ3()",
      "begin_line": 542,
      "end_line": 544,
      "comment": " Get the third coordinate of the vectorial part of the quaternion.\n   * @return third coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 543,col 5)-(line 543,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getAxis()",
      "begin_line": 550,
      "end_line": 560,
      "comment": " Get the normalized axis of the rotation.\n   * @return normalized axis of the rotation\n   * @see #Rotation(Vector3D, double)\n   ",
      "child_ranges": [
        "(line 551,col 5)-(line 551,col 53)",
        "(line 552,col 5)-(line 557,col 5)",
        "(line 558,col 5)-(line 558,col 49)",
        "(line 559,col 5)-(line 559,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getAngle()",
      "begin_line": 566,
      "end_line": 573,
      "comment": " Get the angle of the rotation.\n   * @return angle of the rotation (between 0 and \u0026pi;)\n   * @see #Rotation(Vector3D, double)\n   ",
      "child_ranges": [
        "(line 567,col 5)-(line 571,col 5)",
        "(line 572,col 5)-(line 572,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getAngles(org.apache.commons.math.geometry.RotationOrder)",
      "begin_line": 610,
      "end_line": 831,
      "comment": " Get the Cardan or Euler angles corresponding to the instance.\n\n   * \u003cp\u003eThe equations show that each rotation can be defined by two\n   * different values of the Cardan or Euler angles set. For example\n   * if Cardan angles are used, the rotation defined by the angles\n   * a\u003csub\u003e1\u003c/sub\u003e, a\u003csub\u003e2\u003c/sub\u003e and a\u003csub\u003e3\u003c/sub\u003e is the same as\n   * the rotation defined by the angles \u0026pi; + a\u003csub\u003e1\u003c/sub\u003e, \u0026pi;\n   * - a\u003csub\u003e2\u003c/sub\u003e and \u0026pi; + a\u003csub\u003e3\u003c/sub\u003e. This method implements\n   * the following arbitrary choices:\u003c/p\u003e\n   * \u003cul\u003e\n   *   \u003cli\u003efor Cardan angles, the chosen set is the one for which the\n   *   second angle is between -\u0026pi;/2 and \u0026pi;/2 (i.e its cosine is\n   *   positive),\u003c/li\u003e\n   *   \u003cli\u003efor Euler angles, the chosen set is the one for which the\n   *   second angle is between 0 and \u0026pi; (i.e its sine is positive).\u003c/li\u003e\n   * \u003c/ul\u003e\n\n   * \u003cp\u003eCardan and Euler angle have a very disappointing drawback: all\n   * of them have singularities. This means that if the instance is\n   * too close to the singularities corresponding to the given\n   * rotation order, it will be impossible to retrieve the angles. For\n   * Cardan angles, this is often called gimbal lock. There is\n   * \u003cem\u003enothing\u003c/em\u003e to do to prevent this, it is an intrinsic problem\n   * with Cardan and Euler representation (but not a problem with the\n   * rotation itself, which is perfectly well defined). For Cardan\n   * angles, singularities occur when the second angle is close to\n   * -\u0026pi;/2 or +\u0026pi;/2, for Euler angle singularities occur when the\n   * second angle is close to 0 or \u0026pi;, this implies that the identity\n   * rotation is always singular for Euler angles!\u003c/p\u003e\n\n   * @param order rotation order to use\n   * @return an array of three angles, in the order specified by the set\n   * @exception CardanEulerSingularityException if the rotation is\n   * singular with respect to the angles set specified\n   ",
      "child_ranges": [
        "(line 613,col 5)-(line 829,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getMatrix()",
      "begin_line": 836,
      "end_line": 870,
      "comment": " Get the 3X3 matrix corresponding to the instance\n   * @return the matrix corresponding to the instance\n   ",
      "child_ranges": [
        "(line 839,col 5)-(line 839,col 27)",
        "(line 840,col 5)-(line 840,col 27)",
        "(line 841,col 5)-(line 841,col 27)",
        "(line 842,col 5)-(line 842,col 27)",
        "(line 843,col 5)-(line 843,col 27)",
        "(line 844,col 5)-(line 844,col 27)",
        "(line 845,col 5)-(line 845,col 27)",
        "(line 846,col 5)-(line 846,col 27)",
        "(line 847,col 5)-(line 847,col 27)",
        "(line 848,col 5)-(line 848,col 27)",
        "(line 851,col 5)-(line 851,col 35)",
        "(line 852,col 5)-(line 852,col 25)",
        "(line 853,col 5)-(line 853,col 25)",
        "(line 854,col 5)-(line 854,col 25)",
        "(line 856,col 5)-(line 856,col 41)",
        "(line 857,col 5)-(line 857,col 35)",
        "(line 858,col 5)-(line 858,col 35)",
        "(line 860,col 5)-(line 860,col 35)",
        "(line 861,col 5)-(line 861,col 41)",
        "(line 862,col 5)-(line 862,col 35)",
        "(line 864,col 5)-(line 864,col 35)",
        "(line 865,col 5)-(line 865,col 35)",
        "(line 866,col 5)-(line 866,col 41)",
        "(line 868,col 5)-(line 868,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyTo(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 876,
      "end_line": 888,
      "comment": " Apply the rotation to a vector.\n   * @param u vector to apply the rotation to\n   * @return a new vector which is the image of u by the rotation\n   ",
      "child_ranges": [
        "(line 878,col 5)-(line 878,col 24)",
        "(line 879,col 5)-(line 879,col 24)",
        "(line 880,col 5)-(line 880,col 24)",
        "(line 882,col 5)-(line 882,col 40)",
        "(line 884,col 5)-(line 886,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyInverseTo(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 894,
      "end_line": 907,
      "comment": " Apply the inverse of the rotation to a vector.\n   * @param u vector to apply the inverse of the rotation to\n   * @return a new vector which such that u is its image by the rotation\n   ",
      "child_ranges": [
        "(line 896,col 5)-(line 896,col 24)",
        "(line 897,col 5)-(line 897,col 24)",
        "(line 898,col 5)-(line 898,col 24)",
        "(line 900,col 5)-(line 900,col 40)",
        "(line 901,col 5)-(line 901,col 20)",
        "(line 903,col 5)-(line 905,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyTo(org.apache.commons.math.geometry.Rotation)",
      "begin_line": 918,
      "end_line": 924,
      "comment": " Apply the instance to another rotation.\n   * Applying the instance to a rotation is computing the composition\n   * in an order compliant with the following rule : let u be any\n   * vector and v its image by r (i.e. r.applyTo(u) \u003d v), let w be the image\n   * of v by the instance (i.e. applyTo(v) \u003d w), then w \u003d comp.applyTo(u),\n   * where comp \u003d applyTo(r).\n   * @param r rotation to apply the rotation to\n   * @return a new rotation which is the composition of r by the instance\n   ",
      "child_ranges": [
        "(line 919,col 5)-(line 923,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyInverseTo(org.apache.commons.math.geometry.Rotation)",
      "begin_line": 937,
      "end_line": 943,
      "comment": " Apply the inverse of the instance to another rotation.\n   * Applying the inverse of the instance to a rotation is computing\n   * the composition in an order compliant with the following rule :\n   * let u be any vector and v its image by r (i.e. r.applyTo(u) \u003d v),\n   * let w be the inverse image of v by the instance\n   * (i.e. applyInverseTo(v) \u003d w), then w \u003d comp.applyTo(u), where\n   * comp \u003d applyInverseTo(r).\n   * @param r rotation to apply the rotation to\n   * @return a new rotation which is the composition of r by the inverse\n   * of the instance\n   ",
      "child_ranges": [
        "(line 938,col 5)-(line 942,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.orthogonalizeMatrix(double[][], double)",
      "begin_line": 955,
      "end_line": 1041,
      "comment": " Perfect orthogonality on a 3X3 matrix.\n   * @param m initial matrix (not exactly orthogonal)\n   * @param threshold convergence threshold for the iterative\n   * orthogonality correction (convergence is reached when the\n   * difference between two steps of the Frobenius norm of the\n   * correction is below this threshold)\n   * @return an orthogonal matrix close to m\n   * @exception NotARotationMatrixException if the matrix cannot be\n   * orthogonalized with the given threshold after 10 iterations\n   ",
      "child_ranges": [
        "(line 957,col 5)-(line 957,col 23)",
        "(line 958,col 5)-(line 958,col 23)",
        "(line 959,col 5)-(line 959,col 23)",
        "(line 960,col 5)-(line 960,col 23)",
        "(line 961,col 5)-(line 961,col 23)",
        "(line 962,col 5)-(line 962,col 23)",
        "(line 963,col 5)-(line 963,col 23)",
        "(line 964,col 5)-(line 964,col 23)",
        "(line 965,col 5)-(line 965,col 23)",
        "(line 966,col 5)-(line 966,col 23)",
        "(line 967,col 5)-(line 967,col 23)",
        "(line 968,col 5)-(line 968,col 23)",
        "(line 969,col 5)-(line 969,col 18)",
        "(line 970,col 5)-(line 970,col 15)",
        "(line 972,col 5)-(line 972,col 36)",
        "(line 973,col 5)-(line 973,col 23)",
        "(line 974,col 5)-(line 974,col 23)",
        "(line 975,col 5)-(line 975,col 23)",
        "(line 978,col 5)-(line 978,col 14)",
        "(line 979,col 5)-(line 1035,col 5)",
        "(line 1038,col 5)-(line 1040,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.distance(org.apache.commons.math.geometry.Rotation, org.apache.commons.math.geometry.Rotation)",
      "begin_line": 1067,
      "end_line": 1069,
      "comment": " Compute the \u003ci\u003edistance\u003c/i\u003e between two rotations.\n   * \u003cp\u003eThe \u003ci\u003edistance\u003c/i\u003e is intended here as a way to check if two\n   * rotations are almost similar (i.e. they transform vectors the same way)\n   * or very different. It is mathematically defined as the angle of\n   * the rotation r that prepended to one of the rotations gives the other\n   * one:\u003c/p\u003e\n   * \u003cpre\u003e\n   *        r\u003csub\u003e1\u003c/sub\u003e(r) \u003d r\u003csub\u003e2\u003c/sub\u003e\n   * \u003c/pre\u003e\n   * \u003cp\u003eThis distance is an angle between 0 and \u0026pi;. Its value is the smallest\n   * possible upper bound of the angle in radians between r\u003csub\u003e1\u003c/sub\u003e(v)\n   * and r\u003csub\u003e2\u003c/sub\u003e(v) for all possible vectors v. This upper bound is\n   * reached for some v. The distance is equal to 0 if and only if the two\n   * rotations are identical.\u003c/p\u003e\n   * \u003cp\u003eComparing two rotations should always be done using this value rather\n   * than for example comparing the components of the quaternions. It is much\n   * more stable, and has a geometric meaning. Also comparing quaternions\n   * components is error prone since for example quaternions (0.36, 0.48, -0.48, -0.64)\n   * and (-0.36, -0.48, 0.48, 0.64) represent exactly the same rotation despite\n   * their components are different (they are exact opposites).\u003c/p\u003e\n   * @param r1 first rotation\n   * @param r2 second rotation\n   * @return \u003ci\u003edistance\u003c/i\u003e between r1 and r2\n   ",
      "child_ranges": [
        "(line 1068,col 7)-(line 1068,col 46)"
      ]
    }
  ]
}