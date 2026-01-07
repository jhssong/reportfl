{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/geometry/Rotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Rotation",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 95,
      "end_line": 1072,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IDENTITY"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Identity rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "q0"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Scalar coordinate of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q1"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " First coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q2"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " Second coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q3"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Third coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(double, double, double, double, boolean)",
      "begin_line": 133,
      "end_line": 150,
      "comment": " Build a rotation from the quaternion coordinates.\n   * \u003cp\u003eA rotation can be built from a \u003cem\u003enormalized\u003c/em\u003e quaternion,\n   * i.e. a quaternion for which q\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e +\n   * q\u003csub\u003e1\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e + q\u003csub\u003e2\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e +\n   * q\u003csub\u003e3\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e \u003d 1. If the quaternion is not normalized,\n   * the constructor can normalize it in a preprocessing step.\u003c/p\u003e\n   * \u003cp\u003eNote that some conventions put the scalar part of the quaternion\n   * as the 4\u003csup\u003eth\u003c/sup\u003e component and the vector part as the first three\n   * components. This is \u003cem\u003enot\u003c/em\u003e our convention. We put the scalar part\n   * as the first component.\u003c/p\u003e\n   * @param q0 scalar part of the quaternion\n   * @param q1 first coordinate of the vectorial part of the quaternion\n   * @param q2 second coordinate of the vectorial part of the quaternion\n   * @param q3 third coordinate of the vectorial part of the quaternion\n   * @param needsNormalization if true, the coordinates are considered\n   * not to be normalized, a normalization preprocessing step is performed\n   * before using them\n   ",
      "child_ranges": [
        "(line 136,col 5)-(line 143,col 5)",
        "(line 145,col 5)-(line 145,col 17)",
        "(line 146,col 5)-(line 146,col 17)",
        "(line 147,col 5)-(line 147,col 17)",
        "(line 148,col 5)-(line 148,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.Vector3D, double)",
      "begin_line": 173,
      "end_line": 188,
      "comment": " Build a rotation from an axis and an angle.\n   * \u003cp\u003eWe use the convention that angles are oriented according to\n   * the effect of the rotation on vectors around the axis. That means\n   * that if (i, j, k) is a direct frame and if we first provide +k as\n   * the axis and \u0026pi;/2 as the angle to this constructor, and then\n   * {@link #applyTo(Vector3D) apply} the instance to +i, we will get\n   * +j.\u003c/p\u003e\n   * \u003cp\u003eAnother way to represent our convention is to say that a rotation\n   * of angle \u0026theta; about the unit vector (x, y, z) is the same as the\n   * rotation build from quaternion components { cos(-\u0026theta;/2),\n   * x * sin(-\u0026theta;/2), y * sin(-\u0026theta;/2), z * sin(-\u0026theta;/2) }.\n   * Note the minus sign on the angle!\u003c/p\u003e\n   * \u003cp\u003eOn the one hand this convention is consistent with a vectorial\n   * perspective (moving vectors in fixed frames), on the other hand it\n   * is different from conventions with a frame perspective (fixed vectors\n   * viewed from different frames) like the ones used for example in spacecraft\n   * attitude community or in the graphics community.\u003c/p\u003e\n   * @param axis axis around which to rotate\n   * @param angle rotation angle.\n   * @exception ArithmeticException if the axis norm is zero\n   ",
      "child_ranges": [
        "(line 175,col 5)-(line 175,col 33)",
        "(line 176,col 5)-(line 178,col 5)",
        "(line 180,col 5)-(line 180,col 36)",
        "(line 181,col 5)-(line 181,col 50)",
        "(line 183,col 5)-(line 183,col 34)",
        "(line 184,col 5)-(line 184,col 29)",
        "(line 185,col 5)-(line 185,col 29)",
        "(line 186,col 5)-(line 186,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(double[][], double)",
      "begin_line": 220,
      "end_line": 293,
      "comment": " Build a rotation from a 3X3 matrix.\n\n   * \u003cp\u003eRotation matrices are orthogonal matrices, i.e. unit matrices\n   * (which are matrices for which m.m\u003csup\u003eT\u003c/sup\u003e \u003d I) with real\n   * coefficients. The module of the determinant of unit matrices is\n   * 1, among the orthogonal 3X3 matrices, only the ones having a\n   * positive determinant (+1) are rotation matrices.\u003c/p\u003e\n\n   * \u003cp\u003eWhen a rotation is defined by a matrix with truncated values\n   * (typically when it is extracted from a technical sheet where only\n   * four to five significant digits are available), the matrix is not\n   * orthogonal anymore. This constructor handles this case\n   * transparently by using a copy of the given matrix and applying a\n   * correction to the copy in order to perfect its orthogonality. If\n   * the Frobenius norm of the correction needed is above the given\n   * threshold, then the matrix is considered to be too far from a\n   * true rotation matrix and an exception is thrown.\u003cp\u003e\n\n   * @param m rotation matrix\n   * @param threshold convergence threshold for the iterative\n   * orthogonality correction (convergence is reached when the\n   * difference between two steps of the Frobenius norm of the\n   * correction is below this threshold)\n\n   * @exception NotARotationMatrixException if the matrix is not a 3X3\n   * matrix, or if it cannot be transformed into an orthogonal matrix\n   * with the given threshold, or if the determinant of the resulting\n   * orthogonal matrix is negative\n\n   ",
      "child_ranges": [
        "(line 224,col 5)-(line 229,col 5)",
        "(line 232,col 5)-(line 232,col 55)",
        "(line 235,col 5)-(line 237,col 77)",
        "(line 238,col 5)-(line 242,col 5)",
        "(line 255,col 5)-(line 255,col 49)",
        "(line 256,col 5)-(line 291,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 313,
      "end_line": 433,
      "comment": " Build the rotation that transforms a pair of vector into another pair.\n\n   * \u003cp\u003eExcept for possible scale factors, if the instance were applied to\n   * the pair (u\u003csub\u003e1\u003c/sub\u003e, u\u003csub\u003e2\u003c/sub\u003e) it will produce the pair\n   * (v\u003csub\u003e1\u003c/sub\u003e, v\u003csub\u003e2\u003c/sub\u003e).\u003c/p\u003e\n\n   * \u003cp\u003eIf the angular separation between u\u003csub\u003e1\u003c/sub\u003e and u\u003csub\u003e2\u003c/sub\u003e is\n   * not the same as the angular separation between v\u003csub\u003e1\u003c/sub\u003e and\n   * v\u003csub\u003e2\u003c/sub\u003e, then a corrected v\u0027\u003csub\u003e2\u003c/sub\u003e will be used rather than\n   * v\u003csub\u003e2\u003c/sub\u003e, the corrected vector will be in the (v\u003csub\u003e1\u003c/sub\u003e,\n   * v\u003csub\u003e2\u003c/sub\u003e) plane.\u003c/p\u003e\n\n   * @param u1 first vector of the origin pair\n   * @param u2 second vector of the origin pair\n   * @param v1 desired image of u1 by the rotation\n   * @param v2 desired image of u2 by the rotation\n   * @exception IllegalArgumentException if the norm of one of the vectors is zero\n   ",
      "child_ranges": [
        "(line 316,col 3)-(line 316,col 44)",
        "(line 317,col 3)-(line 317,col 44)",
        "(line 318,col 3)-(line 318,col 44)",
        "(line 319,col 3)-(line 319,col 44)",
        "(line 320,col 3)-(line 322,col 3)",
        "(line 324,col 3)-(line 324,col 25)",
        "(line 325,col 3)-(line 325,col 25)",
        "(line 326,col 3)-(line 326,col 25)",
        "(line 328,col 3)-(line 328,col 25)",
        "(line 329,col 3)-(line 329,col 25)",
        "(line 330,col 3)-(line 330,col 25)",
        "(line 333,col 3)-(line 333,col 45)",
        "(line 334,col 3)-(line 334,col 35)",
        "(line 335,col 3)-(line 335,col 35)",
        "(line 336,col 3)-(line 336,col 35)",
        "(line 337,col 3)-(line 337,col 35)",
        "(line 340,col 3)-(line 340,col 46)",
        "(line 341,col 3)-(line 341,col 46)",
        "(line 342,col 3)-(line 342,col 30)",
        "(line 343,col 3)-(line 343,col 30)",
        "(line 344,col 3)-(line 344,col 81)",
        "(line 345,col 3)-(line 345,col 41)",
        "(line 346,col 3)-(line 346,col 49)",
        "(line 347,col 3)-(line 347,col 49)",
        "(line 348,col 3)-(line 348,col 49)",
        "(line 349,col 3)-(line 349,col 35)",
        "(line 354,col 3)-(line 354,col 21)",
        "(line 355,col 3)-(line 355,col 21)",
        "(line 356,col 3)-(line 356,col 31)",
        "(line 357,col 3)-(line 357,col 31)",
        "(line 358,col 3)-(line 358,col 31)",
        "(line 359,col 3)-(line 359,col 31)",
        "(line 360,col 3)-(line 360,col 31)",
        "(line 361,col 3)-(line 361,col 31)",
        "(line 362,col 3)-(line 364,col 51)",
        "(line 365,col 3)-(line 367,col 48)",
        "(line 369,col 3)-(line 417,col 3)",
        "(line 420,col 3)-(line 420,col 23)",
        "(line 421,col 3)-(line 421,col 29)",
        "(line 422,col 3)-(line 422,col 22)",
        "(line 423,col 3)-(line 423,col 22)",
        "(line 424,col 3)-(line 424,col 22)",
        "(line 427,col 4)-(line 429,col 57)",
        "(line 430,col 4)-(line 430,col 33)",
        "(line 431,col 3)-(line 431,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 448,
      "end_line": 475,
      "comment": " Build one of the rotations that transform one vector into another one.\n\n   * \u003cp\u003eExcept for a possible scale factor, if the instance were\n   * applied to the vector u it will produce the vector v. There is an\n   * infinite number of such rotations, this constructor choose the\n   * one with the smallest associated angle (i.e. the one whose axis\n   * is orthogonal to the (u, v) plane). If u and v are colinear, an\n   * arbitrary rotation axis is chosen.\u003c/p\u003e\n\n   * @param u origin vector\n   * @param v desired image of u by the rotation\n   * @exception IllegalArgumentException if the norm of one of the vectors is zero\n   ",
      "child_ranges": [
        "(line 450,col 5)-(line 450,col 51)",
        "(line 451,col 5)-(line 453,col 5)",
        "(line 455,col 5)-(line 455,col 43)",
        "(line 457,col 5)-(line 473,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.Rotation.Rotation(org.apache.commons.math.geometry.RotationOrder, double, double, double)",
      "begin_line": 496,
      "end_line": 506,
      "comment": " Build a rotation from three Cardan or Euler elementary rotations.\n\n   * \u003cp\u003eCardan rotations are three successive rotations around the\n   * canonical axes X, Y and Z, each axis being used once. There are\n   * 6 such sets of rotations (XYZ, XZY, YXZ, YZX, ZXY and ZYX). Euler\n   * rotations are three successive rotations around the canonical\n   * axes X, Y and Z, the first and last rotations being around the\n   * same axis. There are 6 such sets of rotations (XYX, XZX, YXY,\n   * YZY, ZXZ and ZYZ), the most popular one being ZXZ.\u003c/p\u003e\n   * \u003cp\u003eBeware that many people routinely use the term Euler angles even\n   * for what really are Cardan angles (this confusion is especially\n   * widespread in the aerospace business where Roll, Pitch and Yaw angles\n   * are often wrongly tagged as Euler angles).\u003c/p\u003e\n\n   * @param order order of rotations to use\n   * @param alpha1 angle of the first elementary rotation\n   * @param alpha2 angle of the second elementary rotation\n   * @param alpha3 angle of the third elementary rotation\n   ",
      "child_ranges": [
        "(line 498,col 5)-(line 498,col 54)",
        "(line 499,col 5)-(line 499,col 54)",
        "(line 500,col 5)-(line 500,col 54)",
        "(line 501,col 5)-(line 501,col 51)",
        "(line 502,col 5)-(line 502,col 21)",
        "(line 503,col 5)-(line 503,col 21)",
        "(line 504,col 5)-(line 504,col 21)",
        "(line 505,col 5)-(line 505,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.revert()",
      "begin_line": 515,
      "end_line": 517,
      "comment": " Revert a rotation.\n   * Build a rotation which reverse the effect of another\n   * rotation. This means that if r(u) \u003d v, then r.revert(v) \u003d u. The\n   * instance is not changed.\n   * @return a new rotation whose effect is the reverse of the effect\n   * of the instance\n   ",
      "child_ranges": [
        "(line 516,col 5)-(line 516,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ0()",
      "begin_line": 522,
      "end_line": 524,
      "comment": " Get the scalar coordinate of the quaternion.\n   * @return scalar coordinate of the quaternion\n   ",
      "child_ranges": [
        "(line 523,col 5)-(line 523,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ1()",
      "begin_line": 529,
      "end_line": 531,
      "comment": " Get the first coordinate of the vectorial part of the quaternion.\n   * @return first coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 530,col 5)-(line 530,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ2()",
      "begin_line": 536,
      "end_line": 538,
      "comment": " Get the second coordinate of the vectorial part of the quaternion.\n   * @return second coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 537,col 5)-(line 537,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getQ3()",
      "begin_line": 543,
      "end_line": 545,
      "comment": " Get the third coordinate of the vectorial part of the quaternion.\n   * @return third coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 544,col 5)-(line 544,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getAxis()",
      "begin_line": 551,
      "end_line": 561,
      "comment": " Get the normalized axis of the rotation.\n   * @return normalized axis of the rotation\n   * @see #Rotation(Vector3D, double)\n   ",
      "child_ranges": [
        "(line 552,col 5)-(line 552,col 53)",
        "(line 553,col 5)-(line 558,col 5)",
        "(line 559,col 5)-(line 559,col 53)",
        "(line 560,col 5)-(line 560,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getAngle()",
      "begin_line": 567,
      "end_line": 574,
      "comment": " Get the angle of the rotation.\n   * @return angle of the rotation (between 0 and \u0026pi;)\n   * @see #Rotation(Vector3D, double)\n   ",
      "child_ranges": [
        "(line 568,col 5)-(line 572,col 5)",
        "(line 573,col 5)-(line 573,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getAngles(org.apache.commons.math.geometry.RotationOrder)",
      "begin_line": 611,
      "end_line": 832,
      "comment": " Get the Cardan or Euler angles corresponding to the instance.\n\n   * \u003cp\u003eThe equations show that each rotation can be defined by two\n   * different values of the Cardan or Euler angles set. For example\n   * if Cardan angles are used, the rotation defined by the angles\n   * a\u003csub\u003e1\u003c/sub\u003e, a\u003csub\u003e2\u003c/sub\u003e and a\u003csub\u003e3\u003c/sub\u003e is the same as\n   * the rotation defined by the angles \u0026pi; + a\u003csub\u003e1\u003c/sub\u003e, \u0026pi;\n   * - a\u003csub\u003e2\u003c/sub\u003e and \u0026pi; + a\u003csub\u003e3\u003c/sub\u003e. This method implements\n   * the following arbitrary choices:\u003c/p\u003e\n   * \u003cul\u003e\n   *   \u003cli\u003efor Cardan angles, the chosen set is the one for which the\n   *   second angle is between -\u0026pi;/2 and \u0026pi;/2 (i.e its cosine is\n   *   positive),\u003c/li\u003e\n   *   \u003cli\u003efor Euler angles, the chosen set is the one for which the\n   *   second angle is between 0 and \u0026pi; (i.e its sine is positive).\u003c/li\u003e\n   * \u003c/ul\u003e\n\n   * \u003cp\u003eCardan and Euler angle have a very disappointing drawback: all\n   * of them have singularities. This means that if the instance is\n   * too close to the singularities corresponding to the given\n   * rotation order, it will be impossible to retrieve the angles. For\n   * Cardan angles, this is often called gimbal lock. There is\n   * \u003cem\u003enothing\u003c/em\u003e to do to prevent this, it is an intrinsic problem\n   * with Cardan and Euler representation (but not a problem with the\n   * rotation itself, which is perfectly well defined). For Cardan\n   * angles, singularities occur when the second angle is close to\n   * -\u0026pi;/2 or +\u0026pi;/2, for Euler angle singularities occur when the\n   * second angle is close to 0 or \u0026pi;, this implies that the identity\n   * rotation is always singular for Euler angles!\u003c/p\u003e\n\n   * @param order rotation order to use\n   * @return an array of three angles, in the order specified by the set\n   * @exception CardanEulerSingularityException if the rotation is\n   * singular with respect to the angles set specified\n   ",
      "child_ranges": [
        "(line 614,col 5)-(line 830,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.getMatrix()",
      "begin_line": 837,
      "end_line": 871,
      "comment": " Get the 3X3 matrix corresponding to the instance\n   * @return the matrix corresponding to the instance\n   ",
      "child_ranges": [
        "(line 840,col 5)-(line 840,col 27)",
        "(line 841,col 5)-(line 841,col 27)",
        "(line 842,col 5)-(line 842,col 27)",
        "(line 843,col 5)-(line 843,col 27)",
        "(line 844,col 5)-(line 844,col 27)",
        "(line 845,col 5)-(line 845,col 27)",
        "(line 846,col 5)-(line 846,col 27)",
        "(line 847,col 5)-(line 847,col 27)",
        "(line 848,col 5)-(line 848,col 27)",
        "(line 849,col 5)-(line 849,col 27)",
        "(line 852,col 5)-(line 852,col 35)",
        "(line 853,col 5)-(line 853,col 25)",
        "(line 854,col 5)-(line 854,col 25)",
        "(line 855,col 5)-(line 855,col 25)",
        "(line 857,col 5)-(line 857,col 41)",
        "(line 858,col 5)-(line 858,col 35)",
        "(line 859,col 5)-(line 859,col 35)",
        "(line 861,col 5)-(line 861,col 35)",
        "(line 862,col 5)-(line 862,col 41)",
        "(line 863,col 5)-(line 863,col 35)",
        "(line 865,col 5)-(line 865,col 35)",
        "(line 866,col 5)-(line 866,col 35)",
        "(line 867,col 5)-(line 867,col 41)",
        "(line 869,col 5)-(line 869,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyTo(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 877,
      "end_line": 889,
      "comment": " Apply the rotation to a vector.\n   * @param u vector to apply the rotation to\n   * @return a new vector which is the image of u by the rotation\n   ",
      "child_ranges": [
        "(line 879,col 5)-(line 879,col 24)",
        "(line 880,col 5)-(line 880,col 24)",
        "(line 881,col 5)-(line 881,col 24)",
        "(line 883,col 5)-(line 883,col 40)",
        "(line 885,col 5)-(line 887,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyInverseTo(org.apache.commons.math.geometry.Vector3D)",
      "begin_line": 895,
      "end_line": 908,
      "comment": " Apply the inverse of the rotation to a vector.\n   * @param u vector to apply the inverse of the rotation to\n   * @return a new vector which such that u is its image by the rotation\n   ",
      "child_ranges": [
        "(line 897,col 5)-(line 897,col 24)",
        "(line 898,col 5)-(line 898,col 24)",
        "(line 899,col 5)-(line 899,col 24)",
        "(line 901,col 5)-(line 901,col 40)",
        "(line 902,col 5)-(line 902,col 20)",
        "(line 904,col 5)-(line 906,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyTo(org.apache.commons.math.geometry.Rotation)",
      "begin_line": 919,
      "end_line": 925,
      "comment": " Apply the instance to another rotation.\n   * Applying the instance to a rotation is computing the composition\n   * in an order compliant with the following rule : let u be any\n   * vector and v its image by r (i.e. r.applyTo(u) \u003d v), let w be the image\n   * of v by the instance (i.e. applyTo(v) \u003d w), then w \u003d comp.applyTo(u),\n   * where comp \u003d applyTo(r).\n   * @param r rotation to apply the rotation to\n   * @return a new rotation which is the composition of r by the instance\n   ",
      "child_ranges": [
        "(line 920,col 5)-(line 924,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.applyInverseTo(org.apache.commons.math.geometry.Rotation)",
      "begin_line": 938,
      "end_line": 944,
      "comment": " Apply the inverse of the instance to another rotation.\n   * Applying the inverse of the instance to a rotation is computing\n   * the composition in an order compliant with the following rule :\n   * let u be any vector and v its image by r (i.e. r.applyTo(u) \u003d v),\n   * let w be the inverse image of v by the instance\n   * (i.e. applyInverseTo(v) \u003d w), then w \u003d comp.applyTo(u), where\n   * comp \u003d applyInverseTo(r).\n   * @param r rotation to apply the rotation to\n   * @return a new rotation which is the composition of r by the inverse\n   * of the instance\n   ",
      "child_ranges": [
        "(line 939,col 5)-(line 943,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.orthogonalizeMatrix(double[][], double)",
      "begin_line": 956,
      "end_line": 1042,
      "comment": " Perfect orthogonality on a 3X3 matrix.\n   * @param m initial matrix (not exactly orthogonal)\n   * @param threshold convergence threshold for the iterative\n   * orthogonality correction (convergence is reached when the\n   * difference between two steps of the Frobenius norm of the\n   * correction is below this threshold)\n   * @return an orthogonal matrix close to m\n   * @exception NotARotationMatrixException if the matrix cannot be\n   * orthogonalized with the given threshold after 10 iterations\n   ",
      "child_ranges": [
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
        "(line 969,col 5)-(line 969,col 23)",
        "(line 970,col 5)-(line 970,col 18)",
        "(line 971,col 5)-(line 971,col 15)",
        "(line 973,col 5)-(line 973,col 36)",
        "(line 974,col 5)-(line 974,col 23)",
        "(line 975,col 5)-(line 975,col 23)",
        "(line 976,col 5)-(line 976,col 23)",
        "(line 979,col 5)-(line 979,col 14)",
        "(line 980,col 5)-(line 1036,col 5)",
        "(line 1039,col 5)-(line 1041,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.Rotation.distance(org.apache.commons.math.geometry.Rotation, org.apache.commons.math.geometry.Rotation)",
      "begin_line": 1068,
      "end_line": 1070,
      "comment": " Compute the \u003ci\u003edistance\u003c/i\u003e between two rotations.\n   * \u003cp\u003eThe \u003ci\u003edistance\u003c/i\u003e is intended here as a way to check if two\n   * rotations are almost similar (i.e. they transform vectors the same way)\n   * or very different. It is mathematically defined as the angle of\n   * the rotation r that prepended to one of the rotations gives the other\n   * one:\u003c/p\u003e\n   * \u003cpre\u003e\n   *        r\u003csub\u003e1\u003c/sub\u003e(r) \u003d r\u003csub\u003e2\u003c/sub\u003e\n   * \u003c/pre\u003e\n   * \u003cp\u003eThis distance is an angle between 0 and \u0026pi;. Its value is the smallest\n   * possible upper bound of the angle in radians between r\u003csub\u003e1\u003c/sub\u003e(v)\n   * and r\u003csub\u003e2\u003c/sub\u003e(v) for all possible vectors v. This upper bound is\n   * reached for some v. The distance is equal to 0 if and only if the two\n   * rotations are identical.\u003c/p\u003e\n   * \u003cp\u003eComparing two rotations should always be done using this value rather\n   * than for example comparing the components of the quaternions. It is much\n   * more stable, and has a geometric meaning. Also comparing quaternions\n   * components is error prone since for example quaternions (0.36, 0.48, -0.48, -0.64)\n   * and (-0.36, -0.48, 0.48, 0.64) represent exactly the same rotation despite\n   * their components are different (they are exact opposites).\u003c/p\u003e\n   * @param r1 first rotation\n   * @param r2 second rotation\n   * @return \u003ci\u003edistance\u003c/i\u003e between r1 and r2\n   ",
      "child_ranges": [
        "(line 1069,col 7)-(line 1069,col 46)"
      ]
    }
  ]
}