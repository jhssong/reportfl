{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/Rotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Rotation",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 97,
      "end_line": 1054,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IDENTITY"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Identity rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "q0"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Scalar coordinate of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q1"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " First coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q2"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Second coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q3"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Third coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.Rotation(double, double, double, double, boolean)",
      "begin_line": 135,
      "end_line": 152,
      "comment": " Build a rotation from the quaternion coordinates.\n   * \u003cp\u003eA rotation can be built from a \u003cem\u003enormalized\u003c/em\u003e quaternion,\n   * i.e. a quaternion for which q\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e +\n   * q\u003csub\u003e1\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e + q\u003csub\u003e2\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e +\n   * q\u003csub\u003e3\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e \u003d 1. If the quaternion is not normalized,\n   * the constructor can normalize it in a preprocessing step.\u003c/p\u003e\n   * \u003cp\u003eNote that some conventions put the scalar part of the quaternion\n   * as the 4\u003csup\u003eth\u003c/sup\u003e component and the vector part as the first three\n   * components. This is \u003cem\u003enot\u003c/em\u003e our convention. We put the scalar part\n   * as the first component.\u003c/p\u003e\n   * @param q0 scalar part of the quaternion\n   * @param q1 first coordinate of the vectorial part of the quaternion\n   * @param q2 second coordinate of the vectorial part of the quaternion\n   * @param q3 third coordinate of the vectorial part of the quaternion\n   * @param needsNormalization if true, the coordinates are considered\n   * not to be normalized, a normalization preprocessing step is performed\n   * before using them\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 145,col 5)",
        "(line 147,col 5)-(line 147,col 17)",
        "(line 148,col 5)-(line 148,col 17)",
        "(line 149,col 5)-(line 149,col 17)",
        "(line 150,col 5)-(line 150,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.Rotation(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, double)",
      "begin_line": 175,
      "end_line": 190,
      "comment": " Build a rotation from an axis and an angle.\n   * \u003cp\u003eWe use the convention that angles are oriented according to\n   * the effect of the rotation on vectors around the axis. That means\n   * that if (i, j, k) is a direct frame and if we first provide +k as\n   * the axis and \u0026pi;/2 as the angle to this constructor, and then\n   * {@link #applyTo(Vector3D) apply} the instance to +i, we will get\n   * +j.\u003c/p\u003e\n   * \u003cp\u003eAnother way to represent our convention is to say that a rotation\n   * of angle \u0026theta; about the unit vector (x, y, z) is the same as the\n   * rotation build from quaternion components { cos(-\u0026theta;/2),\n   * x * sin(-\u0026theta;/2), y * sin(-\u0026theta;/2), z * sin(-\u0026theta;/2) }.\n   * Note the minus sign on the angle!\u003c/p\u003e\n   * \u003cp\u003eOn the one hand this convention is consistent with a vectorial\n   * perspective (moving vectors in fixed frames), on the other hand it\n   * is different from conventions with a frame perspective (fixed vectors\n   * viewed from different frames) like the ones used for example in spacecraft\n   * attitude community or in the graphics community.\u003c/p\u003e\n   * @param axis axis around which to rotate\n   * @param angle rotation angle.\n   * @exception MathIllegalArgumentException if the axis norm is zero\n   ",
      "child_ranges": [
        "(line 177,col 5)-(line 177,col 33)",
        "(line 178,col 5)-(line 180,col 5)",
        "(line 182,col 5)-(line 182,col 36)",
        "(line 183,col 5)-(line 183,col 50)",
        "(line 185,col 5)-(line 185,col 34)",
        "(line 186,col 5)-(line 186,col 29)",
        "(line 187,col 5)-(line 187,col 29)",
        "(line 188,col 5)-(line 188,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.Rotation(double[][], double)",
      "begin_line": 222,
      "end_line": 252,
      "comment": " Build a rotation from a 3X3 matrix.\n\n   * \u003cp\u003eRotation matrices are orthogonal matrices, i.e. unit matrices\n   * (which are matrices for which m.m\u003csup\u003eT\u003c/sup\u003e \u003d I) with real\n   * coefficients. The module of the determinant of unit matrices is\n   * 1, among the orthogonal 3X3 matrices, only the ones having a\n   * positive determinant (+1) are rotation matrices.\u003c/p\u003e\n\n   * \u003cp\u003eWhen a rotation is defined by a matrix with truncated values\n   * (typically when it is extracted from a technical sheet where only\n   * four to five significant digits are available), the matrix is not\n   * orthogonal anymore. This constructor handles this case\n   * transparently by using a copy of the given matrix and applying a\n   * correction to the copy in order to perfect its orthogonality. If\n   * the Frobenius norm of the correction needed is above the given\n   * threshold, then the matrix is considered to be too far from a\n   * true rotation matrix and an exception is thrown.\u003cp\u003e\n\n   * @param m rotation matrix\n   * @param threshold convergence threshold for the iterative\n   * orthogonality correction (convergence is reached when the\n   * difference between two steps of the Frobenius norm of the\n   * correction is below this threshold)\n\n   * @exception NotARotationMatrixException if the matrix is not a 3X3\n   * matrix, or if it cannot be transformed into an orthogonal matrix\n   * with the given threshold, or if the determinant of the resulting\n   * orthogonal matrix is negative\n\n   ",
      "child_ranges": [
        "(line 226,col 5)-(line 231,col 5)",
        "(line 234,col 5)-(line 234,col 55)",
        "(line 237,col 5)-(line 239,col 77)",
        "(line 240,col 5)-(line 244,col 5)",
        "(line 246,col 5)-(line 246,col 34)",
        "(line 247,col 5)-(line 247,col 17)",
        "(line 248,col 5)-(line 248,col 17)",
        "(line 249,col 5)-(line 249,col 17)",
        "(line 250,col 5)-(line 250,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.Rotation(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 273,
      "end_line": 313,
      "comment": " Build the rotation that transforms a pair of vector into another pair.\n\n   * \u003cp\u003eExcept for possible scale factors, if the instance were applied to\n   * the pair (u\u003csub\u003e1\u003c/sub\u003e, u\u003csub\u003e2\u003c/sub\u003e) it will produce the pair\n   * (v\u003csub\u003e1\u003c/sub\u003e, v\u003csub\u003e2\u003c/sub\u003e).\u003c/p\u003e\n\n   * \u003cp\u003eIf the angular separation between u\u003csub\u003e1\u003c/sub\u003e and u\u003csub\u003e2\u003c/sub\u003e is\n   * not the same as the angular separation between v\u003csub\u003e1\u003c/sub\u003e and\n   * v\u003csub\u003e2\u003c/sub\u003e, then a corrected v\u0027\u003csub\u003e2\u003c/sub\u003e will be used rather than\n   * v\u003csub\u003e2\u003c/sub\u003e, the corrected vector will be in the (v\u003csub\u003e1\u003c/sub\u003e,\n   * v\u003csub\u003e2\u003c/sub\u003e) plane.\u003c/p\u003e\n\n   * @param u1 first vector of the origin pair\n   * @param u2 second vector of the origin pair\n   * @param v1 desired image of u1 by the rotation\n   * @param v2 desired image of u2 by the rotation\n   * @exception MathArithmeticException if the norm of one of the vectors is zero,\n   * or if one of the pair is degenerated (i.e. the vectors of the pair are colinear)\n   ",
      "child_ranges": [
        "(line 278,col 7)-(line 278,col 58)",
        "(line 279,col 7)-(line 279,col 43)",
        "(line 280,col 7)-(line 280,col 26)",
        "(line 284,col 7)-(line 284,col 58)",
        "(line 285,col 7)-(line 285,col 43)",
        "(line 286,col 7)-(line 286,col 26)",
        "(line 289,col 7)-(line 305,col 8)",
        "(line 307,col 7)-(line 307,col 34)",
        "(line 308,col 7)-(line 308,col 19)",
        "(line 309,col 7)-(line 309,col 19)",
        "(line 310,col 7)-(line 310,col 19)",
        "(line 311,col 7)-(line 311,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.Rotation(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 328,
      "end_line": 356,
      "comment": " Build one of the rotations that transform one vector into another one.\n\n   * \u003cp\u003eExcept for a possible scale factor, if the instance were\n   * applied to the vector u it will produce the vector v. There is an\n   * infinite number of such rotations, this constructor choose the\n   * one with the smallest associated angle (i.e. the one whose axis\n   * is orthogonal to the (u, v) plane). If u and v are colinear, an\n   * arbitrary rotation axis is chosen.\u003c/p\u003e\n\n   * @param u origin vector\n   * @param v desired image of u by the rotation\n   * @exception MathArithmeticException if the norm of one of the vectors is zero\n   ",
      "child_ranges": [
        "(line 330,col 5)-(line 330,col 51)",
        "(line 331,col 5)-(line 333,col 5)",
        "(line 335,col 5)-(line 335,col 33)",
        "(line 337,col 5)-(line 354,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.Rotation(org.apache.commons.math3.geometry.euclidean.threed.RotationOrder, double, double, double)",
      "begin_line": 377,
      "end_line": 387,
      "comment": " Build a rotation from three Cardan or Euler elementary rotations.\n\n   * \u003cp\u003eCardan rotations are three successive rotations around the\n   * canonical axes X, Y and Z, each axis being used once. There are\n   * 6 such sets of rotations (XYZ, XZY, YXZ, YZX, ZXY and ZYX). Euler\n   * rotations are three successive rotations around the canonical\n   * axes X, Y and Z, the first and last rotations being around the\n   * same axis. There are 6 such sets of rotations (XYX, XZX, YXY,\n   * YZY, ZXZ and ZYZ), the most popular one being ZXZ.\u003c/p\u003e\n   * \u003cp\u003eBeware that many people routinely use the term Euler angles even\n   * for what really are Cardan angles (this confusion is especially\n   * widespread in the aerospace business where Roll, Pitch and Yaw angles\n   * are often wrongly tagged as Euler angles).\u003c/p\u003e\n\n   * @param order order of rotations to use\n   * @param alpha1 angle of the first elementary rotation\n   * @param alpha2 angle of the second elementary rotation\n   * @param alpha3 angle of the third elementary rotation\n   ",
      "child_ranges": [
        "(line 379,col 7)-(line 379,col 56)",
        "(line 380,col 7)-(line 380,col 56)",
        "(line 381,col 7)-(line 381,col 56)",
        "(line 382,col 7)-(line 382,col 53)",
        "(line 383,col 7)-(line 383,col 23)",
        "(line 384,col 7)-(line 384,col 23)",
        "(line 385,col 7)-(line 385,col 23)",
        "(line 386,col 7)-(line 386,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.mat2quat(double[][])",
      "begin_line": 393,
      "end_line": 448,
      "comment": " Convert an orthogonal rotation matrix to a quaternion.\n   * @param ort orthogonal rotation matrix\n   * @return quaternion corresponding to the matrix\n   ",
      "child_ranges": [
        "(line 395,col 7)-(line 395,col 42)",
        "(line 408,col 7)-(line 408,col 51)",
        "(line 409,col 7)-(line 444,col 7)",
        "(line 446,col 7)-(line 446,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.revert()",
      "begin_line": 457,
      "end_line": 459,
      "comment": " Revert a rotation.\n   * Build a rotation which reverse the effect of another\n   * rotation. This means that if r(u) \u003d v, then r.revert(v) \u003d u. The\n   * instance is not changed.\n   * @return a new rotation whose effect is the reverse of the effect\n   * of the instance\n   ",
      "child_ranges": [
        "(line 458,col 5)-(line 458,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.getQ0()",
      "begin_line": 464,
      "end_line": 466,
      "comment": " Get the scalar coordinate of the quaternion.\n   * @return scalar coordinate of the quaternion\n   ",
      "child_ranges": [
        "(line 465,col 5)-(line 465,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.getQ1()",
      "begin_line": 471,
      "end_line": 473,
      "comment": " Get the first coordinate of the vectorial part of the quaternion.\n   * @return first coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 472,col 5)-(line 472,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.getQ2()",
      "begin_line": 478,
      "end_line": 480,
      "comment": " Get the second coordinate of the vectorial part of the quaternion.\n   * @return second coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 479,col 5)-(line 479,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.getQ3()",
      "begin_line": 485,
      "end_line": 487,
      "comment": " Get the third coordinate of the vectorial part of the quaternion.\n   * @return third coordinate of the vectorial part of the quaternion\n   ",
      "child_ranges": [
        "(line 486,col 5)-(line 486,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.getAxis()",
      "begin_line": 493,
      "end_line": 503,
      "comment": " Get the normalized axis of the rotation.\n   * @return normalized axis of the rotation\n   * @see #Rotation(Vector3D, double)\n   ",
      "child_ranges": [
        "(line 494,col 5)-(line 494,col 53)",
        "(line 495,col 5)-(line 500,col 5)",
        "(line 501,col 5)-(line 501,col 53)",
        "(line 502,col 5)-(line 502,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.getAngle()",
      "begin_line": 509,
      "end_line": 516,
      "comment": " Get the angle of the rotation.\n   * @return angle of the rotation (between 0 and \u0026pi;)\n   * @see #Rotation(Vector3D, double)\n   ",
      "child_ranges": [
        "(line 510,col 5)-(line 514,col 5)",
        "(line 515,col 5)-(line 515,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.getAngles(org.apache.commons.math3.geometry.euclidean.threed.RotationOrder)",
      "begin_line": 553,
      "end_line": 774,
      "comment": " Get the Cardan or Euler angles corresponding to the instance.\n\n   * \u003cp\u003eThe equations show that each rotation can be defined by two\n   * different values of the Cardan or Euler angles set. For example\n   * if Cardan angles are used, the rotation defined by the angles\n   * a\u003csub\u003e1\u003c/sub\u003e, a\u003csub\u003e2\u003c/sub\u003e and a\u003csub\u003e3\u003c/sub\u003e is the same as\n   * the rotation defined by the angles \u0026pi; + a\u003csub\u003e1\u003c/sub\u003e, \u0026pi;\n   * - a\u003csub\u003e2\u003c/sub\u003e and \u0026pi; + a\u003csub\u003e3\u003c/sub\u003e. This method implements\n   * the following arbitrary choices:\u003c/p\u003e\n   * \u003cul\u003e\n   *   \u003cli\u003efor Cardan angles, the chosen set is the one for which the\n   *   second angle is between -\u0026pi;/2 and \u0026pi;/2 (i.e its cosine is\n   *   positive),\u003c/li\u003e\n   *   \u003cli\u003efor Euler angles, the chosen set is the one for which the\n   *   second angle is between 0 and \u0026pi; (i.e its sine is positive).\u003c/li\u003e\n   * \u003c/ul\u003e\n\n   * \u003cp\u003eCardan and Euler angle have a very disappointing drawback: all\n   * of them have singularities. This means that if the instance is\n   * too close to the singularities corresponding to the given\n   * rotation order, it will be impossible to retrieve the angles. For\n   * Cardan angles, this is often called gimbal lock. There is\n   * \u003cem\u003enothing\u003c/em\u003e to do to prevent this, it is an intrinsic problem\n   * with Cardan and Euler representation (but not a problem with the\n   * rotation itself, which is perfectly well defined). For Cardan\n   * angles, singularities occur when the second angle is close to\n   * -\u0026pi;/2 or +\u0026pi;/2, for Euler angle singularities occur when the\n   * second angle is close to 0 or \u0026pi;, this implies that the identity\n   * rotation is always singular for Euler angles!\u003c/p\u003e\n\n   * @param order rotation order to use\n   * @return an array of three angles, in the order specified by the set\n   * @exception CardanEulerSingularityException if the rotation is\n   * singular with respect to the angles set specified\n   ",
      "child_ranges": [
        "(line 556,col 5)-(line 772,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.getMatrix()",
      "begin_line": 779,
      "end_line": 813,
      "comment": " Get the 3X3 matrix corresponding to the instance\n   * @return the matrix corresponding to the instance\n   ",
      "child_ranges": [
        "(line 782,col 5)-(line 782,col 27)",
        "(line 783,col 5)-(line 783,col 27)",
        "(line 784,col 5)-(line 784,col 27)",
        "(line 785,col 5)-(line 785,col 27)",
        "(line 786,col 5)-(line 786,col 27)",
        "(line 787,col 5)-(line 787,col 27)",
        "(line 788,col 5)-(line 788,col 27)",
        "(line 789,col 5)-(line 789,col 27)",
        "(line 790,col 5)-(line 790,col 27)",
        "(line 791,col 5)-(line 791,col 27)",
        "(line 794,col 5)-(line 794,col 35)",
        "(line 795,col 5)-(line 795,col 25)",
        "(line 796,col 5)-(line 796,col 25)",
        "(line 797,col 5)-(line 797,col 25)",
        "(line 799,col 5)-(line 799,col 41)",
        "(line 800,col 5)-(line 800,col 35)",
        "(line 801,col 5)-(line 801,col 35)",
        "(line 803,col 5)-(line 803,col 35)",
        "(line 804,col 5)-(line 804,col 41)",
        "(line 805,col 5)-(line 805,col 35)",
        "(line 807,col 5)-(line 807,col 35)",
        "(line 808,col 5)-(line 808,col 35)",
        "(line 809,col 5)-(line 809,col 41)",
        "(line 811,col 5)-(line 811,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.applyTo(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 819,
      "end_line": 831,
      "comment": " Apply the rotation to a vector.\n   * @param u vector to apply the rotation to\n   * @return a new vector which is the image of u by the rotation\n   ",
      "child_ranges": [
        "(line 821,col 5)-(line 821,col 24)",
        "(line 822,col 5)-(line 822,col 24)",
        "(line 823,col 5)-(line 823,col 24)",
        "(line 825,col 5)-(line 825,col 40)",
        "(line 827,col 5)-(line 829,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.applyTo(double[], double[])",
      "begin_line": 838,
      "end_line": 850,
      "comment": " Apply the rotation to a vector stored in an array.\n   * @param in an array with three items which stores vector to rotate\n   * @param out an array with three items to put result to (it can be the same\n   * array as in)\n   ",
      "child_ranges": [
        "(line 840,col 7)-(line 840,col 29)",
        "(line 841,col 7)-(line 841,col 29)",
        "(line 842,col 7)-(line 842,col 29)",
        "(line 844,col 7)-(line 844,col 48)",
        "(line 846,col 7)-(line 846,col 68)",
        "(line 847,col 7)-(line 847,col 68)",
        "(line 848,col 7)-(line 848,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 856,
      "end_line": 869,
      "comment": " Apply the inverse of the rotation to a vector.\n   * @param u vector to apply the inverse of the rotation to\n   * @return a new vector which such that u is its image by the rotation\n   ",
      "child_ranges": [
        "(line 858,col 5)-(line 858,col 24)",
        "(line 859,col 5)-(line 859,col 24)",
        "(line 860,col 5)-(line 860,col 24)",
        "(line 862,col 5)-(line 862,col 40)",
        "(line 863,col 5)-(line 863,col 20)",
        "(line 865,col 5)-(line 867,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.applyInverseTo(double[], double[])",
      "begin_line": 876,
      "end_line": 889,
      "comment": " Apply the inverse of the rotation to a vector stored in an array.\n   * @param in an array with three items which stores vector to rotate\n   * @param out an array with three items to put result to (it can be the same\n   * array as in)\n   ",
      "child_ranges": [
        "(line 878,col 7)-(line 878,col 29)",
        "(line 879,col 7)-(line 879,col 29)",
        "(line 880,col 7)-(line 880,col 29)",
        "(line 882,col 7)-(line 882,col 48)",
        "(line 883,col 7)-(line 883,col 28)",
        "(line 885,col 7)-(line 885,col 68)",
        "(line 886,col 7)-(line 886,col 68)",
        "(line 887,col 7)-(line 887,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.applyTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation)",
      "begin_line": 900,
      "end_line": 906,
      "comment": " Apply the instance to another rotation.\n   * Applying the instance to a rotation is computing the composition\n   * in an order compliant with the following rule : let u be any\n   * vector and v its image by r (i.e. r.applyTo(u) \u003d v), let w be the image\n   * of v by the instance (i.e. applyTo(v) \u003d w), then w \u003d comp.applyTo(u),\n   * where comp \u003d applyTo(r).\n   * @param r rotation to apply the rotation to\n   * @return a new rotation which is the composition of r by the instance\n   ",
      "child_ranges": [
        "(line 901,col 5)-(line 905,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation)",
      "begin_line": 919,
      "end_line": 925,
      "comment": " Apply the inverse of the instance to another rotation.\n   * Applying the inverse of the instance to a rotation is computing\n   * the composition in an order compliant with the following rule :\n   * let u be any vector and v its image by r (i.e. r.applyTo(u) \u003d v),\n   * let w be the inverse image of v by the instance\n   * (i.e. applyInverseTo(v) \u003d w), then w \u003d comp.applyTo(u), where\n   * comp \u003d applyInverseTo(r).\n   * @param r rotation to apply the rotation to\n   * @return a new rotation which is the composition of r by the inverse\n   * of the instance\n   ",
      "child_ranges": [
        "(line 920,col 5)-(line 924,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.orthogonalizeMatrix(double[][], double)",
      "begin_line": 937,
      "end_line": 1024,
      "comment": " Perfect orthogonality on a 3X3 matrix.\n   * @param m initial matrix (not exactly orthogonal)\n   * @param threshold convergence threshold for the iterative\n   * orthogonality correction (convergence is reached when the\n   * difference between two steps of the Frobenius norm of the\n   * correction is below this threshold)\n   * @return an orthogonal matrix close to m\n   * @exception NotARotationMatrixException if the matrix cannot be\n   * orthogonalized with the given threshold after 10 iterations\n   ",
      "child_ranges": [
        "(line 939,col 5)-(line 939,col 23)",
        "(line 940,col 5)-(line 940,col 23)",
        "(line 941,col 5)-(line 941,col 23)",
        "(line 942,col 5)-(line 942,col 23)",
        "(line 943,col 5)-(line 943,col 23)",
        "(line 944,col 5)-(line 944,col 23)",
        "(line 945,col 5)-(line 945,col 23)",
        "(line 946,col 5)-(line 946,col 23)",
        "(line 947,col 5)-(line 947,col 23)",
        "(line 948,col 5)-(line 948,col 23)",
        "(line 949,col 5)-(line 949,col 23)",
        "(line 950,col 5)-(line 950,col 23)",
        "(line 951,col 5)-(line 951,col 18)",
        "(line 952,col 5)-(line 952,col 15)",
        "(line 954,col 5)-(line 954,col 36)",
        "(line 955,col 5)-(line 955,col 23)",
        "(line 956,col 5)-(line 956,col 23)",
        "(line 957,col 5)-(line 957,col 23)",
        "(line 960,col 5)-(line 960,col 14)",
        "(line 961,col 5)-(line 1018,col 5)",
        "(line 1021,col 5)-(line 1023,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.Rotation.distance(org.apache.commons.math3.geometry.euclidean.threed.Rotation, org.apache.commons.math3.geometry.euclidean.threed.Rotation)",
      "begin_line": 1050,
      "end_line": 1052,
      "comment": " Compute the \u003ci\u003edistance\u003c/i\u003e between two rotations.\n   * \u003cp\u003eThe \u003ci\u003edistance\u003c/i\u003e is intended here as a way to check if two\n   * rotations are almost similar (i.e. they transform vectors the same way)\n   * or very different. It is mathematically defined as the angle of\n   * the rotation r that prepended to one of the rotations gives the other\n   * one:\u003c/p\u003e\n   * \u003cpre\u003e\n   *        r\u003csub\u003e1\u003c/sub\u003e(r) \u003d r\u003csub\u003e2\u003c/sub\u003e\n   * \u003c/pre\u003e\n   * \u003cp\u003eThis distance is an angle between 0 and \u0026pi;. Its value is the smallest\n   * possible upper bound of the angle in radians between r\u003csub\u003e1\u003c/sub\u003e(v)\n   * and r\u003csub\u003e2\u003c/sub\u003e(v) for all possible vectors v. This upper bound is\n   * reached for some v. The distance is equal to 0 if and only if the two\n   * rotations are identical.\u003c/p\u003e\n   * \u003cp\u003eComparing two rotations should always be done using this value rather\n   * than for example comparing the components of the quaternions. It is much\n   * more stable, and has a geometric meaning. Also comparing quaternions\n   * components is error prone since for example quaternions (0.36, 0.48, -0.48, -0.64)\n   * and (-0.36, -0.48, 0.48, 0.64) represent exactly the same rotation despite\n   * their components are different (they are exact opposites).\u003c/p\u003e\n   * @param r1 first rotation\n   * @param r2 second rotation\n   * @return \u003ci\u003edistance\u003c/i\u003e between r1 and r2\n   ",
      "child_ranges": [
        "(line 1051,col 7)-(line 1051,col 46)"
      ]
    }
  ]
}