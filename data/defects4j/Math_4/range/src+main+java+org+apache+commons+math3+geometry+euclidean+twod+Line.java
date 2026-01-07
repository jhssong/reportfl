{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/twod/Line.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Line",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e",
        "org.apache.commons.math3.geometry.partitioning.Embedding\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 62,
      "end_line": 427,
      "comment": " This class represents an oriented line in the 2D plane.\n\n * \u003cp\u003eAn oriented line can be defined either by prolongating a line\n * segment between two points past these points, or by one point and\n * an angular direction (in trigonometric orientation).\u003c/p\u003e\n\n * \u003cp\u003eSince it is oriented the two half planes at its two sides are\n * unambiguously identified as a left half plane and a right half\n * plane. This can be used to identify the interior and the exterior\n * in a simple way by local properties only when part of a line is\n * used to define part of a polygon boundary.\u003c/p\u003e\n\n * \u003cp\u003eA line can also be used to completely define a reference frame\n * in the plane. It is sufficient to select one specific point in the\n * line (the orthogonal projection of the original reference frame on\n * the line) and to use the unit vector in the line direction and the\n * orthogonal vector oriented from left half plane to right half\n * plane. We define two coordinates by the process, the\n * \u003cem\u003eabscissa\u003c/em\u003e along the line, and the \u003cem\u003eoffset\u003c/em\u003e across\n * the line. All points of the plane are uniquely identified by these\n * two coordinates. The line is the set of points at zero offset, the\n * left half plane is the set of points with negative offsets and the\n * right half plane is the set of points with positive offsets.\u003c/p\u003e\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "angle"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Angle with respect to the abscissa axis. "
    },
    {
      "type": "field",
      "varNames": [
        "cos"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Cosine of the line angle. "
    },
    {
      "type": "field",
      "varNames": [
        "sin"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Sine of the line angle. "
    },
    {
      "type": "field",
      "varNames": [
        "originOffset"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Offset of the frame origin. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.Line(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 81,
      "end_line": 83,
      "comment": " Build a line from two points.\n     * \u003cp\u003eThe line is oriented from p1 to p2\u003c/p\u003e\n     * @param p1 first point\n     * @param p2 second point\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.Line(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, double)",
      "begin_line": 89,
      "end_line": 91,
      "comment": " Build a line from a point and an angle.\n     * @param p point belonging to the line\n     * @param angle angle of the line with respect to abscissa axis\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.Line(double, double, double, double)",
      "begin_line": 99,
      "end_line": 104,
      "comment": " Build a line from its internal characteristics.\n     * @param angle angle of the line with respect to abscissa axis\n     * @param cos cosine of the angle\n     * @param sin sine of the angle\n     * @param originOffset offset of the origin\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 34)",
        "(line 101,col 9)-(line 101,col 32)",
        "(line 102,col 9)-(line 102,col 32)",
        "(line 103,col 9)-(line 103,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.Line(org.apache.commons.math3.geometry.euclidean.twod.Line)",
      "begin_line": 111,
      "end_line": 116,
      "comment": " Copy constructor.\n     * \u003cp\u003eThe created instance is completely independent from the\n     * original instance, it is a deep copy.\u003c/p\u003e\n     * @param line line to copy\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 73)",
        "(line 113,col 9)-(line 113,col 43)",
        "(line 114,col 9)-(line 114,col 43)",
        "(line 115,col 9)-(line 115,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.copySelf()",
      "begin_line": 119,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.reset(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 128,
      "end_line": 143,
      "comment": " Reset the instance as if built from two points.\n     * \u003cp\u003eThe line is oriented from p1 to p2\u003c/p\u003e\n     * @param p1 first point\n     * @param p2 second point\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 48)",
        "(line 130,col 9)-(line 130,col 48)",
        "(line 131,col 9)-(line 131,col 48)",
        "(line 132,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.reset(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, double)",
      "begin_line": 149,
      "end_line": 154,
      "comment": " Reset the instance as if built from a line and an angle.\n     * @param p point belonging to the line\n     * @param alpha angle of the line with respect to abscissa axis\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 68)",
        "(line 151,col 9)-(line 151,col 48)",
        "(line 152,col 9)-(line 152,col 48)",
        "(line 153,col 9)-(line 153,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.revertSelf()",
      "begin_line": 158,
      "end_line": 167,
      "comment": " Revert the instance.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 28)",
        "(line 165,col 9)-(line 165,col 28)",
        "(line 166,col 9)-(line 166,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.getReverse()",
      "begin_line": 174,
      "end_line": 177,
      "comment": " Get the reverse of the instance.\n     * \u003cp\u003eGet a line with reversed orientation with respect to the\n     * instance. A new object is built, the instance is untouched.\u003c/p\u003e\n     * @return a new line, with orientation opposite to the instance orientation\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 176,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.toSubSpace(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 180,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 39)",
        "(line 182,col 9)-(line 182,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.toSpace(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e)",
      "begin_line": 186,
      "end_line": 190,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 58)",
        "(line 188,col 9)-(line 189,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.intersection(org.apache.commons.math3.geometry.euclidean.twod.Line)",
      "begin_line": 197,
      "end_line": 204,
      "comment": " Get the intersection point of the instance and another line.\n     * @param other other line\n     * @return intersection point of the instance and the other line\n     * or null if there are no intersection points\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 59)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 203,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.wholeHyperplane()",
      "begin_line": 207,
      "end_line": 209,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.wholeSpace()",
      "begin_line": 215,
      "end_line": 217,
      "comment": " Build a region covering the whole space.\n     * @return a region containing the instance (really a {@link\n     * PolygonsSet PolygonsSet} instance)\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.getOffset(org.apache.commons.math3.geometry.euclidean.twod.Line)",
      "begin_line": 229,
      "end_line": 232,
      "comment": " Get the offset (oriented distance) of a parallel line.\n     * \u003cp\u003eThis method should be called only for parallel lines otherwise\n     * the result is not meaningful.\u003c/p\u003e\n     * \u003cp\u003eThe offset is 0 if both lines are the same, it is\n     * positive if the line is on the right side of the instance and\n     * negative if it is on the left side, according to its natural\n     * orientation.\u003c/p\u003e\n     * @param line line to check\n     * @return offset of the line\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 231,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.getOffset(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 235,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 39)",
        "(line 237,col 9)-(line 237,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.sameOrientationAs(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 241,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 41)",
        "(line 243,col 9)-(line 243,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.getPointAt(org.apache.commons.math3.geometry.euclidean.oned.Vector1D, double)",
      "begin_line": 252,
      "end_line": 256,
      "comment": " Get one point from the plane.\n     * @param abscissa desired abscissa for the point\n     * @param offset desired offset for the point\n     * @return one point in the plane, with given abscissa and offset\n     * relative to the line\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 47)",
        "(line 254,col 9)-(line 254,col 53)",
        "(line 255,col 9)-(line 255,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.contains(org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 262,
      "end_line": 264,
      "comment": " Check if the line contains a point.\n     * @param p point to check\n     * @return true if p belongs to the line\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.distance(org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 275,
      "end_line": 277,
      "comment": " Compute the distance between the instance and a point.\n     * \u003cp\u003eThis is a shortcut for invoking FastMath.abs(getOffset(p)),\n     * and provides consistency with what is in the\n     * org.apache.commons.math3.geometry.euclidean.threed.Line class.\u003c/p\u003e\n     *\n     * @param p to check\n     * @return distance between the instance and the point\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.isParallelTo(org.apache.commons.math3.geometry.euclidean.twod.Line)",
      "begin_line": 284,
      "end_line": 286,
      "comment": " Check the instance is parallel to another line.\n     * @param line other line to check\n     * @return true if the instance is parallel to the other line\n     * (they can have either the same or opposite orientations)\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.translateToPoint(org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 291,
      "end_line": 293,
      "comment": " Translate the line to force it passing by a point.\n     * @param p point by which the line should pass\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.getAngle()",
      "begin_line": 298,
      "end_line": 300,
      "comment": " Get the angle of the line.\n     * @return the angle of the line with respect to the abscissa axis\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.setAngle(double)",
      "begin_line": 305,
      "end_line": 309,
      "comment": " Set the angle of the line.\n     * @param angle new angle of the line with respect to the abscissa axis\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 66)",
        "(line 307,col 9)-(line 307,col 46)",
        "(line 308,col 9)-(line 308,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.getOriginOffset()",
      "begin_line": 314,
      "end_line": 316,
      "comment": " Get the offset of the origin.\n     * @return the offset of the origin\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.setOriginOffset(double)",
      "begin_line": 321,
      "end_line": 323,
      "comment": " Set the offset of the origin.\n     * @param offset offset of the origin\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(java.awt.geom.AffineTransform)",
      "begin_line": 338,
      "end_line": 341,
      "comment": " Get a {@link org.apache.commons.math3.geometry.partitioning.Transform\n     * Transform} embedding an affine transform.\n     * @param transform affine transform to embed (must be inversible\n     * otherwise the {@link\n     * org.apache.commons.math3.geometry.partitioning.Transform#apply(Hyperplane)\n     * apply(Hyperplane)} method would work only for some lines, and\n     * fail for other ones)\n     * @return a new transform that can be applied to either {@link\n     * Vector2D Vector2D}, {@link Line Line} or {@link\n     * org.apache.commons.math3.geometry.partitioning.SubHyperplane\n     * SubHyperplane} instances\n     * @exception MathIllegalArgumentException if the transform is non invertible\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineTransform",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.Transform\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 350,
      "end_line": 425,
      "comment": " Class embedding an affine transform.\n     * \u003cp\u003eThis class is used in order to apply an affine transform to a\n     * line. Using a specific object allow to perform some computations\n     * on the transform only once even if the same transform is to be\n     * applied to a large number of lines (for example to a large\n     * polygon)./\u003cp\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cXX"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": " CHECKSTYLE: stop JavadocVariable check"
    },
    {
      "type": "field",
      "varNames": [
        "cXY"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cX1"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cYX"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cYY"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cY1"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c1Y"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c1X"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c11"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.LineTransform.LineTransform(java.awt.geom.AffineTransform)",
      "begin_line": 371,
      "end_line": 390,
      "comment": " Build an affine line transform from a n {@code AffineTransform}.\n         * @param transform transform to use (must be invertible otherwise\n         * the {@link LineTransform#apply(Hyperplane)} method would work\n         * only for some lines, and fail for other ones)\n         * @exception MathIllegalArgumentException if the transform is non invertible\n         ",
      "child_ranges": [
        "(line 373,col 13)-(line 373,col 45)",
        "(line 374,col 13)-(line 374,col 35)",
        "(line 375,col 13)-(line 375,col 23)",
        "(line 376,col 13)-(line 376,col 23)",
        "(line 377,col 13)-(line 377,col 23)",
        "(line 378,col 13)-(line 378,col 23)",
        "(line 379,col 13)-(line 379,col 23)",
        "(line 380,col 13)-(line 380,col 23)",
        "(line 382,col 13)-(line 382,col 40)",
        "(line 383,col 13)-(line 383,col 40)",
        "(line 384,col 13)-(line 384,col 40)",
        "(line 386,col 13)-(line 388,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.LineTransform.apply(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 393,
      "end_line": 399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 394,col 13)-(line 394,col 50)",
        "(line 395,col 13)-(line 395,col 43)",
        "(line 396,col 13)-(line 396,col 43)",
        "(line 397,col 13)-(line 398,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.LineTransform.apply(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 402,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 403,col 13)-(line 403,col 53)",
        "(line 404,col 13)-(line 404,col 93)",
        "(line 405,col 13)-(line 405,col 67)",
        "(line 406,col 13)-(line 406,col 67)",
        "(line 407,col 13)-(line 407,col 82)",
        "(line 408,col 13)-(line 410,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.Line.LineTransform.apply(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e, org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e, org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 414,
      "end_line": 423,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 13)-(line 417,col 77)",
        "(line 418,col 13)-(line 418,col 57)",
        "(line 419,col 13)-(line 419,col 60)",
        "(line 420,col 13)-(line 421,col 90)",
        "(line 422,col 13)-(line 422,col 78)"
      ]
    }
  ]
}