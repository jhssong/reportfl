{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/FieldRotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldRotation",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 1184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "q0"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Scalar coordinate of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q1"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " First coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q2"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Second coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "field",
      "varNames": [
        "q3"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Third coordinate of the vectorial part of the quaternion. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.FieldRotation(T, T, T, T, boolean)",
      "begin_line": 76,
      "end_line": 93,
      "comment": " Build a rotation from the quaternion coordinates.\n     * \u003cp\u003eA rotation can be built from a \u003cem\u003enormalized\u003c/em\u003e quaternion,\n     * i.e. a quaternion for which q\u003csub\u003e0\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e +\n     * q\u003csub\u003e1\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e + q\u003csub\u003e2\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e +\n     * q\u003csub\u003e3\u003c/sub\u003e\u003csup\u003e2\u003c/sup\u003e \u003d 1. If the quaternion is not normalized,\n     * the constructor can normalize it in a preprocessing step.\u003c/p\u003e\n     * \u003cp\u003eNote that some conventions put the scalar part of the quaternion\n     * as the 4\u003csup\u003eth\u003c/sup\u003e component and the vector part as the first three\n     * components. This is \u003cem\u003enot\u003c/em\u003e our convention. We put the scalar part\n     * as the first component.\u003c/p\u003e\n     * @param q0 scalar part of the quaternion\n     * @param q1 first coordinate of the vectorial part of the quaternion\n     * @param q2 second coordinate of the vectorial part of the quaternion\n     * @param q3 third coordinate of the vectorial part of the quaternion\n     * @param needsNormalization if true, the coordinates are considered\n     * not to be normalized, a normalization preprocessing step is performed\n     * before using them\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.FieldRotation(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, T)",
      "begin_line": 116,
      "end_line": 132,
      "comment": " Build a rotation from an axis and an angle.\n     * \u003cp\u003eWe use the convention that angles are oriented according to\n     * the effect of the rotation on vectors around the axis. That means\n     * that if (i, j, k) is a direct frame and if we first provide +k as\n     * the axis and \u0026pi;/2 as the angle to this constructor, and then\n     * {@link #applyTo(FieldVector3D) apply} the instance to +i, we will get\n     * +j.\u003c/p\u003e\n     * \u003cp\u003eAnother way to represent our convention is to say that a rotation\n     * of angle \u0026theta; about the unit vector (x, y, z) is the same as the\n     * rotation build from quaternion components { cos(-\u0026theta;/2),\n     * x * sin(-\u0026theta;/2), y * sin(-\u0026theta;/2), z * sin(-\u0026theta;/2) }.\n     * Note the minus sign on the angle!\u003c/p\u003e\n     * \u003cp\u003eOn the one hand this convention is consistent with a vectorial\n     * perspective (moving vectors in fixed frames), on the other hand it\n     * is different from conventions with a frame perspective (fixed vectors\n     * viewed from different frames) like the ones used for example in spacecraft\n     * attitude community or in the graphics community.\u003c/p\u003e\n     * @param axis axis around which to rotate\n     * @param angle rotation angle.\n     * @exception MathIllegalArgumentException if the axis norm is zero\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 38)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 49)",
        "(line 125,col 9)-(line 125,col 53)",
        "(line 127,col 9)-(line 127,col 29)",
        "(line 128,col 9)-(line 128,col 41)",
        "(line 129,col 9)-(line 129,col 41)",
        "(line 130,col 9)-(line 130,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.FieldRotation(T[][], double)",
      "begin_line": 164,
      "end_line": 196,
      "comment": " Build a rotation from a 3X3 matrix.\n\n     * \u003cp\u003eRotation matrices are orthogonal matrices, i.e. unit matrices\n     * (which are matrices for which m.m\u003csup\u003eT\u003c/sup\u003e \u003d I) with real\n     * coefficients. The module of the determinant of unit matrices is\n     * 1, among the orthogonal 3X3 matrices, only the ones having a\n     * positive determinant (+1) are rotation matrices.\u003c/p\u003e\n\n     * \u003cp\u003eWhen a rotation is defined by a matrix with truncated values\n     * (typically when it is extracted from a technical sheet where only\n     * four to five significant digits are available), the matrix is not\n     * orthogonal anymore. This constructor handles this case\n     * transparently by using a copy of the given matrix and applying a\n     * correction to the copy in order to perfect its orthogonality. If\n     * the Frobenius norm of the correction needed is above the given\n     * threshold, then the matrix is considered to be too far from a\n     * true rotation matrix and an exception is thrown.\u003cp\u003e\n\n     * @param m rotation matrix\n     * @param threshold convergence threshold for the iterative\n     * orthogonality correction (convergence is reached when the\n     * difference between two steps of the Frobenius norm of the\n     * correction is below this threshold)\n\n     * @exception NotARotationMatrixException if the matrix is not a 3X3\n     * matrix, or if it cannot be transformed into an orthogonal matrix\n     * with the given threshold, or if the determinant of the resulting\n     * orthogonal matrix is negative\n\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 173,col 9)",
        "(line 176,col 9)-(line 176,col 60)",
        "(line 179,col 9)-(line 179,col 91)",
        "(line 180,col 9)-(line 180,col 91)",
        "(line 181,col 9)-(line 181,col 91)",
        "(line 182,col 9)-(line 183,col 100)",
        "(line 184,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 39)",
        "(line 191,col 9)-(line 191,col 21)",
        "(line 192,col 9)-(line 192,col 21)",
        "(line 193,col 9)-(line 193,col 21)",
        "(line 194,col 9)-(line 194,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.FieldRotation(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 217,
      "end_line": 250,
      "comment": " Build the rotation that transforms a pair of vector into another pair.\n\n     * \u003cp\u003eExcept for possible scale factors, if the instance were applied to\n     * the pair (u\u003csub\u003e1\u003c/sub\u003e, u\u003csub\u003e2\u003c/sub\u003e) it will produce the pair\n     * (v\u003csub\u003e1\u003c/sub\u003e, v\u003csub\u003e2\u003c/sub\u003e).\u003c/p\u003e\n\n     * \u003cp\u003eIf the angular separation between u\u003csub\u003e1\u003c/sub\u003e and u\u003csub\u003e2\u003c/sub\u003e is\n     * not the same as the angular separation between v\u003csub\u003e1\u003c/sub\u003e and\n     * v\u003csub\u003e2\u003c/sub\u003e, then a corrected v\u0027\u003csub\u003e2\u003c/sub\u003e will be used rather than\n     * v\u003csub\u003e2\u003c/sub\u003e, the corrected vector will be in the (v\u003csub\u003e1\u003c/sub\u003e,\n     * v\u003csub\u003e2\u003c/sub\u003e) plane.\u003c/p\u003e\n\n     * @param u1 first vector of the origin pair\n     * @param u2 second vector of the origin pair\n     * @param v1 desired image of u1 by the rotation\n     * @param v2 desired image of u2 by the rotation\n     * @exception MathArithmeticException if the norm of one of the vectors is zero,\n     * or if one of the pair is degenerated (i.e. the vectors of the pair are colinear)\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 83)",
        "(line 223,col 9)-(line 223,col 60)",
        "(line 224,col 9)-(line 224,col 28)",
        "(line 228,col 9)-(line 228,col 83)",
        "(line 229,col 9)-(line 229,col 60)",
        "(line 230,col 9)-(line 230,col 28)",
        "(line 233,col 9)-(line 233,col 78)",
        "(line 234,col 9)-(line 234,col 122)",
        "(line 235,col 9)-(line 235,col 122)",
        "(line 236,col 9)-(line 236,col 122)",
        "(line 237,col 9)-(line 237,col 122)",
        "(line 238,col 9)-(line 238,col 122)",
        "(line 239,col 9)-(line 239,col 122)",
        "(line 240,col 9)-(line 240,col 122)",
        "(line 241,col 9)-(line 241,col 122)",
        "(line 242,col 9)-(line 242,col 122)",
        "(line 244,col 9)-(line 244,col 35)",
        "(line 245,col 9)-(line 245,col 21)",
        "(line 246,col 9)-(line 246,col 21)",
        "(line 247,col 9)-(line 247,col 21)",
        "(line 248,col 9)-(line 248,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.FieldRotation(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 265,
      "end_line": 293,
      "comment": " Build one of the rotations that transform one vector into another one.\n\n     * \u003cp\u003eExcept for a possible scale factor, if the instance were\n     * applied to the vector u it will produce the vector v. There is an\n     * infinite number of such rotations, this constructor choose the\n     * one with the smallest associated angle (i.e. the one whose axis\n     * is orthogonal to the (u, v) plane). If u and v are colinear, an\n     * arbitrary rotation axis is chosen.\u003c/p\u003e\n\n     * @param u origin vector\n     * @param v desired image of u by the rotation\n     * @exception MathArithmeticException if the norm of one of the vectors is zero\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 64)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 272,col 53)",
        "(line 274,col 9)-(line 291,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.FieldRotation(org.apache.commons.math3.geometry.euclidean.threed.RotationOrder, T, T, T)",
      "begin_line": 314,
      "end_line": 324,
      "comment": " Build a rotation from three Cardan or Euler elementary rotations.\n\n     * \u003cp\u003eCardan rotations are three successive rotations around the\n     * canonical axes X, Y and Z, each axis being used once. There are\n     * 6 such sets of rotations (XYZ, XZY, YXZ, YZX, ZXY and ZYX). Euler\n     * rotations are three successive rotations around the canonical\n     * axes X, Y and Z, the first and last rotations being around the\n     * same axis. There are 6 such sets of rotations (XYX, XZX, YXY,\n     * YZY, ZXZ and ZYZ), the most popular one being ZXZ.\u003c/p\u003e\n     * \u003cp\u003eBeware that many people routinely use the term Euler angles even\n     * for what really are Cardan angles (this confusion is especially\n     * widespread in the aerospace business where Roll, Pitch and Yaw angles\n     * are often wrongly tagged as Euler angles).\u003c/p\u003e\n\n     * @param order order of rotations to use\n     * @param alpha1 angle of the first elementary rotation\n     * @param alpha2 angle of the second elementary rotation\n     * @param alpha3 angle of the third elementary rotation\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 49)",
        "(line 316,col 9)-(line 316,col 107)",
        "(line 317,col 9)-(line 317,col 107)",
        "(line 318,col 9)-(line 318,col 107)",
        "(line 319,col 9)-(line 319,col 69)",
        "(line 320,col 9)-(line 320,col 25)",
        "(line 321,col 9)-(line 321,col 25)",
        "(line 322,col 9)-(line 322,col 25)",
        "(line 323,col 9)-(line 323,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.mat2quat(T[][])",
      "begin_line": 330,
      "end_line": 385,
      "comment": " Convert an orthogonal rotation matrix to a quaternion.\n     * @param ort orthogonal rotation matrix\n     * @return quaternion corresponding to the matrix\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 72)",
        "(line 345,col 9)-(line 345,col 54)",
        "(line 346,col 9)-(line 381,col 9)",
        "(line 383,col 9)-(line 383,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.revert()",
      "begin_line": 394,
      "end_line": 396,
      "comment": " Revert a rotation.\n     * Build a rotation which reverse the effect of another\n     * rotation. This means that if r(u) \u003d v, then r.revert(v) \u003d u. The\n     * instance is not changed.\n     * @return a new rotation whose effect is the reverse of the effect\n     * of the instance\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.getQ0()",
      "begin_line": 401,
      "end_line": 403,
      "comment": " Get the scalar coordinate of the quaternion.\n     * @return scalar coordinate of the quaternion\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.getQ1()",
      "begin_line": 408,
      "end_line": 410,
      "comment": " Get the first coordinate of the vectorial part of the quaternion.\n     * @return first coordinate of the vectorial part of the quaternion\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.getQ2()",
      "begin_line": 415,
      "end_line": 417,
      "comment": " Get the second coordinate of the vectorial part of the quaternion.\n     * @return second coordinate of the vectorial part of the quaternion\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.getQ3()",
      "begin_line": 422,
      "end_line": 424,
      "comment": " Get the third coordinate of the vectorial part of the quaternion.\n     * @return third coordinate of the vectorial part of the quaternion\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.getAxis()",
      "begin_line": 430,
      "end_line": 441,
      "comment": " Get the normalized axis of the rotation.\n     * @return normalized axis of the rotation\n     * @see #FieldRotation(FieldVector3D, RealFieldElement)\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 88)",
        "(line 432,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 67)",
        "(line 440,col 9)-(line 440,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.getAngle()",
      "begin_line": 447,
      "end_line": 454,
      "comment": " Get the angle of the rotation.\n     * @return angle of the rotation (between 0 and \u0026pi;)\n     * @see #FieldRotation(FieldVector3D, RealFieldElement)\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.getAngles(org.apache.commons.math3.geometry.euclidean.threed.RotationOrder)",
      "begin_line": 491,
      "end_line": 688,
      "comment": " Get the Cardan or Euler angles corresponding to the instance.\n\n     * \u003cp\u003eThe equations show that each rotation can be defined by two\n     * different values of the Cardan or Euler angles set. For example\n     * if Cardan angles are used, the rotation defined by the angles\n     * a\u003csub\u003e1\u003c/sub\u003e, a\u003csub\u003e2\u003c/sub\u003e and a\u003csub\u003e3\u003c/sub\u003e is the same as\n     * the rotation defined by the angles \u0026pi; + a\u003csub\u003e1\u003c/sub\u003e, \u0026pi;\n     * - a\u003csub\u003e2\u003c/sub\u003e and \u0026pi; + a\u003csub\u003e3\u003c/sub\u003e. This method implements\n     * the following arbitrary choices:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003efor Cardan angles, the chosen set is the one for which the\n     *   second angle is between -\u0026pi;/2 and \u0026pi;/2 (i.e its cosine is\n     *   positive),\u003c/li\u003e\n     *   \u003cli\u003efor Euler angles, the chosen set is the one for which the\n     *   second angle is between 0 and \u0026pi; (i.e its sine is positive).\u003c/li\u003e\n     * \u003c/ul\u003e\n\n     * \u003cp\u003eCardan and Euler angle have a very disappointing drawback: all\n     * of them have singularities. This means that if the instance is\n     * too close to the singularities corresponding to the given\n     * rotation order, it will be impossible to retrieve the angles. For\n     * Cardan angles, this is often called gimbal lock. There is\n     * \u003cem\u003enothing\u003c/em\u003e to do to prevent this, it is an intrinsic problem\n     * with Cardan and Euler representation (but not a problem with the\n     * rotation itself, which is perfectly well defined). For Cardan\n     * angles, singularities occur when the second angle is close to\n     * -\u0026pi;/2 or +\u0026pi;/2, for Euler angle singularities occur when the\n     * second angle is close to 0 or \u0026pi;, this implies that the identity\n     * rotation is always singular for Euler angles!\u003c/p\u003e\n\n     * @param order rotation order to use\n     * @return an array of three angles, in the order specified by the set\n     * @exception CardanEulerSingularityException if the rotation is\n     * singular with respect to the angles set specified\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 686,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.buildArray(T, T, T)",
      "begin_line": 696,
      "end_line": 702,
      "comment": " Create a dimension 3 array.\n     * @param a0 first array element\n     * @param a1 second array element\n     * @param a2 third array element\n     * @return new array\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 66)",
        "(line 698,col 9)-(line 698,col 22)",
        "(line 699,col 9)-(line 699,col 22)",
        "(line 700,col 9)-(line 700,col 22)",
        "(line 701,col 9)-(line 701,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.vector(double, double, double)",
      "begin_line": 710,
      "end_line": 713,
      "comment": " Create a constant vector.\n     * @param x abscissa\n     * @param y ordinate\n     * @param z height\n     * @return a constant vector\n     ",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 47)",
        "(line 712,col 9)-(line 712,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.getMatrix()",
      "begin_line": 718,
      "end_line": 749,
      "comment": " Get the 3X3 matrix corresponding to the instance\n     * @return the matrix corresponding to the instance\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 40)",
        "(line 722,col 9)-(line 722,col 40)",
        "(line 723,col 9)-(line 723,col 40)",
        "(line 724,col 9)-(line 724,col 40)",
        "(line 725,col 9)-(line 725,col 40)",
        "(line 726,col 9)-(line 726,col 40)",
        "(line 727,col 9)-(line 727,col 40)",
        "(line 728,col 9)-(line 728,col 40)",
        "(line 729,col 9)-(line 729,col 40)",
        "(line 730,col 9)-(line 730,col 40)",
        "(line 733,col 9)-(line 733,col 67)",
        "(line 735,col 9)-(line 735,col 58)",
        "(line 736,col 9)-(line 736,col 51)",
        "(line 737,col 9)-(line 737,col 46)",
        "(line 739,col 9)-(line 739,col 46)",
        "(line 740,col 9)-(line 740,col 58)",
        "(line 741,col 9)-(line 741,col 51)",
        "(line 743,col 9)-(line 743,col 51)",
        "(line 744,col 9)-(line 744,col 46)",
        "(line 745,col 9)-(line 745,col 58)",
        "(line 747,col 9)-(line 747,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.toRotation()",
      "begin_line": 754,
      "end_line": 756,
      "comment": " Convert to a constant vector without derivatives.\n     * @return a constant vector\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyTo(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 762,
      "end_line": 774,
      "comment": " Apply the rotation to a vector.\n     * @param u vector to apply the rotation to\n     * @return a new vector which is the image of u by the rotation\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 29)",
        "(line 765,col 9)-(line 765,col 29)",
        "(line 766,col 9)-(line 766,col 29)",
        "(line 768,col 9)-(line 768,col 75)",
        "(line 770,col 9)-(line 772,col 159)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyTo(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 780,
      "end_line": 792,
      "comment": " Apply the rotation to a vector.\n     * @param u vector to apply the rotation to\n     * @return a new vector which is the image of u by the rotation\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 34)",
        "(line 783,col 9)-(line 783,col 34)",
        "(line 784,col 9)-(line 784,col 34)",
        "(line 786,col 9)-(line 786,col 75)",
        "(line 788,col 9)-(line 790,col 159)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyTo(T[], T[])",
      "begin_line": 799,
      "end_line": 811,
      "comment": " Apply the rotation to a vector stored in an array.\n     * @param in an array with three items which stores vector to rotate\n     * @param out an array with three items to put result to (it can be the same\n     * array as in)\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 26)",
        "(line 802,col 9)-(line 802,col 26)",
        "(line 803,col 9)-(line 803,col 26)",
        "(line 805,col 9)-(line 805,col 75)",
        "(line 807,col 9)-(line 807,col 139)",
        "(line 808,col 9)-(line 808,col 139)",
        "(line 809,col 9)-(line 809,col 139)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyTo(double[], T[])",
      "begin_line": 817,
      "end_line": 829,
      "comment": " Apply the rotation to a vector stored in an array.\n     * @param in an array with three items which stores vector to rotate\n     * @param out an array with three items to put result to\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 31)",
        "(line 820,col 9)-(line 820,col 31)",
        "(line 821,col 9)-(line 821,col 31)",
        "(line 823,col 9)-(line 823,col 75)",
        "(line 825,col 9)-(line 825,col 139)",
        "(line 826,col 9)-(line 826,col 139)",
        "(line 827,col 9)-(line 827,col 139)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 837,
      "end_line": 849,
      "comment": " Apply a rotation to a vector.\n     * @param r rotation to apply\n     * @param u vector to apply the rotation to\n     * @param \u003cT\u003e the type of the field elements\n     * @return a new vector which is the image of u by the rotation\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 29)",
        "(line 840,col 9)-(line 840,col 29)",
        "(line 841,col 9)-(line 841,col 29)",
        "(line 843,col 9)-(line 843,col 96)",
        "(line 845,col 9)-(line 847,col 194)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 855,
      "end_line": 868,
      "comment": " Apply the inverse of the rotation to a vector.\n     * @param u vector to apply the inverse of the rotation to\n     * @return a new vector which such that u is its image by the rotation\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 29)",
        "(line 858,col 9)-(line 858,col 29)",
        "(line 859,col 9)-(line 859,col 29)",
        "(line 861,col 9)-(line 861,col 76)",
        "(line 862,col 9)-(line 862,col 33)",
        "(line 864,col 9)-(line 866,col 159)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 874,
      "end_line": 887,
      "comment": " Apply the inverse of the rotation to a vector.\n     * @param u vector to apply the inverse of the rotation to\n     * @return a new vector which such that u is its image by the rotation\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 876,col 34)",
        "(line 877,col 9)-(line 877,col 34)",
        "(line 878,col 9)-(line 878,col 34)",
        "(line 880,col 9)-(line 880,col 76)",
        "(line 881,col 9)-(line 881,col 33)",
        "(line 883,col 9)-(line 885,col 159)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyInverseTo(T[], T[])",
      "begin_line": 894,
      "end_line": 907,
      "comment": " Apply the inverse of the rotation to a vector stored in an array.\n     * @param in an array with three items which stores vector to rotate\n     * @param out an array with three items to put result to (it can be the same\n     * array as in)\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 26)",
        "(line 897,col 9)-(line 897,col 26)",
        "(line 898,col 9)-(line 898,col 26)",
        "(line 900,col 9)-(line 900,col 75)",
        "(line 901,col 9)-(line 901,col 33)",
        "(line 903,col 9)-(line 903,col 139)",
        "(line 904,col 9)-(line 904,col 139)",
        "(line 905,col 9)-(line 905,col 139)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyInverseTo(double[], T[])",
      "begin_line": 913,
      "end_line": 926,
      "comment": " Apply the inverse of the rotation to a vector stored in an array.\n     * @param in an array with three items which stores vector to rotate\n     * @param out an array with three items to put result to\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 31)",
        "(line 916,col 9)-(line 916,col 31)",
        "(line 917,col 9)-(line 917,col 31)",
        "(line 919,col 9)-(line 919,col 75)",
        "(line 920,col 9)-(line 920,col 33)",
        "(line 922,col 9)-(line 922,col 139)",
        "(line 923,col 9)-(line 923,col 139)",
        "(line 924,col 9)-(line 924,col 139)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation, org.apache.commons.math3.geometry.euclidean.threed.FieldVector3D\u003cT\u003e)",
      "begin_line": 934,
      "end_line": 947,
      "comment": " Apply the inverse of a rotation to a vector.\n     * @param r rotation to apply\n     * @param u vector to apply the inverse of the rotation to\n     * @param \u003cT\u003e the type of the field elements\n     * @return a new vector which such that u is its image by the rotation\n     ",
      "child_ranges": [
        "(line 936,col 9)-(line 936,col 29)",
        "(line 937,col 9)-(line 937,col 29)",
        "(line 938,col 9)-(line 938,col 29)",
        "(line 940,col 9)-(line 940,col 97)",
        "(line 941,col 9)-(line 941,col 37)",
        "(line 943,col 9)-(line 945,col 180)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyTo(org.apache.commons.math3.geometry.euclidean.threed.FieldRotation\u003cT\u003e)",
      "begin_line": 958,
      "end_line": 964,
      "comment": " Apply the instance to another rotation.\n     * Applying the instance to a rotation is computing the composition\n     * in an order compliant with the following rule : let u be any\n     * vector and v its image by r (i.e. r.applyTo(u) \u003d v), let w be the image\n     * of v by the instance (i.e. applyTo(v) \u003d w), then w \u003d comp.applyTo(u),\n     * where comp \u003d applyTo(r).\n     * @param r rotation to apply the rotation to\n     * @return a new rotation which is the composition of r by the instance\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 963,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation)",
      "begin_line": 975,
      "end_line": 981,
      "comment": " Apply the instance to another rotation.\n     * Applying the instance to a rotation is computing the composition\n     * in an order compliant with the following rule : let u be any\n     * vector and v its image by r (i.e. r.applyTo(u) \u003d v), let w be the image\n     * of v by the instance (i.e. applyTo(v) \u003d w), then w \u003d comp.applyTo(u),\n     * where comp \u003d applyTo(r).\n     * @param r rotation to apply the rotation to\n     * @return a new rotation which is the composition of r by the instance\n     ",
      "child_ranges": [
        "(line 976,col 9)-(line 980,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation, org.apache.commons.math3.geometry.euclidean.threed.FieldRotation\u003cT\u003e)",
      "begin_line": 994,
      "end_line": 1000,
      "comment": " Apply a rotation to another rotation.\n     * Applying a rotation to another rotation is computing the composition\n     * in an order compliant with the following rule : let u be any\n     * vector and v its image by rInner (i.e. rInner.applyTo(u) \u003d v), let w be the image\n     * of v by rOuter (i.e. rOuter.applyTo(v) \u003d w), then w \u003d comp.applyTo(u),\n     * where comp \u003d applyTo(rOuter, rInner).\n     * @param r1 rotation to apply\n     * @param rInner rotation to apply the rotation to\n     * @param \u003cT\u003e the type of the field elements\n     * @return a new rotation which is the composition of r by the instance\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 999,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.FieldRotation\u003cT\u003e)",
      "begin_line": 1013,
      "end_line": 1019,
      "comment": " Apply the inverse of the instance to another rotation.\n     * Applying the inverse of the instance to a rotation is computing\n     * the composition in an order compliant with the following rule :\n     * let u be any vector and v its image by r (i.e. r.applyTo(u) \u003d v),\n     * let w be the inverse image of v by the instance\n     * (i.e. applyInverseTo(v) \u003d w), then w \u003d comp.applyTo(u), where\n     * comp \u003d applyInverseTo(r).\n     * @param r rotation to apply the rotation to\n     * @return a new rotation which is the composition of r by the inverse\n     * of the instance\n     ",
      "child_ranges": [
        "(line 1014,col 9)-(line 1018,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation)",
      "begin_line": 1032,
      "end_line": 1038,
      "comment": " Apply the inverse of the instance to another rotation.\n     * Applying the inverse of the instance to a rotation is computing\n     * the composition in an order compliant with the following rule :\n     * let u be any vector and v its image by r (i.e. r.applyTo(u) \u003d v),\n     * let w be the inverse image of v by the instance\n     * (i.e. applyInverseTo(v) \u003d w), then w \u003d comp.applyTo(u), where\n     * comp \u003d applyInverseTo(r).\n     * @param r rotation to apply the rotation to\n     * @return a new rotation which is the composition of r by the inverse\n     * of the instance\n     ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1037,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.applyInverseTo(org.apache.commons.math3.geometry.euclidean.threed.Rotation, org.apache.commons.math3.geometry.euclidean.threed.FieldRotation\u003cT\u003e)",
      "begin_line": 1053,
      "end_line": 1059,
      "comment": " Apply the inverse of a rotation to another rotation.\n     * Applying the inverse of a rotation to another rotation is computing\n     * the composition in an order compliant with the following rule :\n     * let u be any vector and v its image by rInner (i.e. rInner.applyTo(u) \u003d v),\n     * let w be the inverse image of v by rOuter\n     * (i.e. rOuter.applyInverseTo(v) \u003d w), then w \u003d comp.applyTo(u), where\n     * comp \u003d applyInverseTo(rOuter, rInner).\n     * @param rOuter rotation to apply the rotation to\n     * @param rInner rotation to apply the rotation to\n     * @param \u003cT\u003e the type of the field elements\n     * @return a new rotation which is the composition of r by the inverse\n     * of the instance\n     ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1058,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.orthogonalizeMatrix(T[][], double)",
      "begin_line": 1071,
      "end_line": 1153,
      "comment": " Perfect orthogonality on a 3X3 matrix.\n     * @param m initial matrix (not exactly orthogonal)\n     * @param threshold convergence threshold for the iterative\n     * orthogonality correction (convergence is reached when the\n     * difference between two steps of the Frobenius norm of the\n     * correction is below this threshold)\n     * @return an orthogonal matrix close to m\n     * @exception NotARotationMatrixException if the matrix cannot be\n     * orthogonalized with the given threshold after 10 iterations\n     ",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 24)",
        "(line 1075,col 9)-(line 1075,col 24)",
        "(line 1076,col 9)-(line 1076,col 24)",
        "(line 1077,col 9)-(line 1077,col 24)",
        "(line 1078,col 9)-(line 1078,col 24)",
        "(line 1079,col 9)-(line 1079,col 24)",
        "(line 1080,col 9)-(line 1080,col 24)",
        "(line 1081,col 9)-(line 1081,col 24)",
        "(line 1082,col 9)-(line 1082,col 24)",
        "(line 1083,col 9)-(line 1083,col 22)",
        "(line 1084,col 9)-(line 1084,col 19)",
        "(line 1086,col 9)-(line 1086,col 72)",
        "(line 1089,col 9)-(line 1089,col 18)",
        "(line 1090,col 9)-(line 1147,col 9)",
        "(line 1150,col 9)-(line 1151,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.FieldRotation.distance(org.apache.commons.math3.geometry.euclidean.threed.FieldRotation\u003cT\u003e, org.apache.commons.math3.geometry.euclidean.threed.FieldRotation\u003cT\u003e)",
      "begin_line": 1180,
      "end_line": 1182,
      "comment": " Compute the \u003ci\u003edistance\u003c/i\u003e between two rotations.\n     * \u003cp\u003eThe \u003ci\u003edistance\u003c/i\u003e is intended here as a way to check if two\n     * rotations are almost similar (i.e. they transform vectors the same way)\n     * or very different. It is mathematically defined as the angle of\n     * the rotation r that prepended to one of the rotations gives the other\n     * one:\u003c/p\u003e\n     * \u003cpre\u003e\n     *        r\u003csub\u003e1\u003c/sub\u003e(r) \u003d r\u003csub\u003e2\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * \u003cp\u003eThis distance is an angle between 0 and \u0026pi;. Its value is the smallest\n     * possible upper bound of the angle in radians between r\u003csub\u003e1\u003c/sub\u003e(v)\n     * and r\u003csub\u003e2\u003c/sub\u003e(v) for all possible vectors v. This upper bound is\n     * reached for some v. The distance is equal to 0 if and only if the two\n     * rotations are identical.\u003c/p\u003e\n     * \u003cp\u003eComparing two rotations should always be done using this value rather\n     * than for example comparing the components of the quaternions. It is much\n     * more stable, and has a geometric meaning. Also comparing quaternions\n     * components is error prone since for example quaternions (0.36, 0.48, -0.48, -0.64)\n     * and (-0.36, -0.48, 0.48, 0.64) represent exactly the same rotation despite\n     * their components are different (they are exact opposites).\u003c/p\u003e\n     * @param r1 first rotation\n     * @param r2 second rotation\n     * @param \u003cT\u003e the type of the field elements\n     * @return \u003ci\u003edistance\u003c/i\u003e between r1 and r2\n     ",
      "child_ranges": [
        "(line 1181,col 9)-(line 1181,col 48)"
      ]
    }
  ]
}