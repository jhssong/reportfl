{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/geometry/euclidean/twod/Line.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Line",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e",
        "org.apache.commons.math.geometry.partitioning.Embedding\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 62,
      "end_line": 415,
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
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.Line(org.apache.commons.math.geometry.euclidean.twod.Vector2D, org.apache.commons.math.geometry.euclidean.twod.Vector2D)",
      "begin_line": 81,
      "end_line": 83,
      "comment": " Build a line from two points.\n     * \u003cp\u003eThe line is oriented from p1 to p2\u003c/p\u003e\n     * @param p1 first point\n     * @param p2 second point\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.Line(org.apache.commons.math.geometry.euclidean.twod.Vector2D, double)",
      "begin_line": 89,
      "end_line": 91,
      "comment": " Build a line from a point and an angle.\n     * @param p point belonging to the line\n     * @param angle angle of the line with respect to abscissa axis\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.Line(double, double, double, double)",
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
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.Line(org.apache.commons.math.geometry.euclidean.twod.Line)",
      "begin_line": 111,
      "end_line": 116,
      "comment": " Copy constructor.\n     * \u003cp\u003eThe created instance is completely independant from the\n     * original instance, it is a deep copy.\u003c/p\u003e\n     * @param line line to copy\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 73)",
        "(line 113,col 9)-(line 113,col 43)",
        "(line 114,col 9)-(line 114,col 43)",
        "(line 115,col 9)-(line 115,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.copySelf()",
      "begin_line": 119,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.reset(org.apache.commons.math.geometry.euclidean.twod.Vector2D, org.apache.commons.math.geometry.euclidean.twod.Vector2D)",
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
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.reset(org.apache.commons.math.geometry.euclidean.twod.Vector2D, double)",
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
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.revertSelf()",
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
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.getReverse()",
      "begin_line": 174,
      "end_line": 177,
      "comment": " Get the reverse of the instance.\n     * \u003cp\u003eGet a line with reversed orientation with respect to the\n     * instance. A new object is built, the instance is untouched.\u003c/p\u003e\n     * @return a new line, with orientation opposite to the instance orientation\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 176,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.toSubSpace(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
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
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.toSpace(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e)",
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
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.intersection(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 197,
      "end_line": 205,
      "comment": " Get the intersection point of the instance and another line.\n     * @param other other line\n     * @return intersection point of the instance and the other line\n     * (really a {@link Vector2D Vector2D} instance)\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 41)",
        "(line 199,col 9)-(line 199,col 61)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 204,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.wholeHyperplane()",
      "begin_line": 208,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.wholeSpace()",
      "begin_line": 216,
      "end_line": 218,
      "comment": " Build a region covering the whole space.\n     * @return a region containing the instance (really a {@link\n     * PolygonsSet PolygonsSet} instance)\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.getOffset(org.apache.commons.math.geometry.euclidean.twod.Line)",
      "begin_line": 230,
      "end_line": 233,
      "comment": " Get the offset (oriented distance) of a parallel line.\n     * \u003cp\u003eThis method should be called only for parallel lines otherwise\n     * the result is not meaningful.\u003c/p\u003e\n     * \u003cp\u003eThe offset is 0 if both lines are the same, it is\n     * positive if the line is on the right side of the instance and\n     * negative if it is on the left side, according to its natural\n     * orientation.\u003c/p\u003e\n     * @param line line to check\n     * @return offset of the line\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 232,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.getOffset(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 236,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 39)",
        "(line 238,col 9)-(line 238,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.sameOrientationAs(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 242,
      "end_line": 245,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 41)",
        "(line 244,col 9)-(line 244,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.getPointAt(org.apache.commons.math.geometry.euclidean.oned.Vector1D, double)",
      "begin_line": 253,
      "end_line": 257,
      "comment": " Get one point from the plane.\n     * @param abscissa desired abscissa for the point\n     * @param offset desired offset for the point\n     * @return one point in the plane, with given abscissa and offset\n     * relative to the line\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 47)",
        "(line 255,col 9)-(line 255,col 53)",
        "(line 256,col 9)-(line 256,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.contains(org.apache.commons.math.geometry.euclidean.twod.Vector2D)",
      "begin_line": 263,
      "end_line": 265,
      "comment": " Check if the line contains a point.\n     * @param p point to check\n     * @return true if p belongs to the line\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.isParallelTo(org.apache.commons.math.geometry.euclidean.twod.Line)",
      "begin_line": 272,
      "end_line": 274,
      "comment": " Check the instance is parallel to another line.\n     * @param line other line to check\n     * @return true if the instance is parallel to the other line\n     * (they can have either the same or opposite orientations)\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.translateToPoint(org.apache.commons.math.geometry.euclidean.twod.Vector2D)",
      "begin_line": 279,
      "end_line": 281,
      "comment": " Translate the line to force it passing by a point.\n     * @param p point by which the line should pass\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.getAngle()",
      "begin_line": 286,
      "end_line": 288,
      "comment": " Get the angle of the line.\n     * @return the angle of the line with respect to the abscissa axis\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.setAngle(double)",
      "begin_line": 293,
      "end_line": 297,
      "comment": " Set the angle of the line.\n     * @param angle new angle of the line with respect to the abscissa axis\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 66)",
        "(line 295,col 9)-(line 295,col 46)",
        "(line 296,col 9)-(line 296,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.getOriginOffset()",
      "begin_line": 302,
      "end_line": 304,
      "comment": " Get the offset of the origin.\n     * @return the offset of the origin\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.setOriginOffset(double)",
      "begin_line": 309,
      "end_line": 311,
      "comment": " Set the offset of the origin.\n     * @param offset offset of the origin\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.getTransform(java.awt.geom.AffineTransform)",
      "begin_line": 326,
      "end_line": 329,
      "comment": " Get a {@link org.apache.commons.math.geometry.partitioning.Transform\n     * Transform} embedding an affine transform.\n     * @param transform affine transform to embed (must be inversible\n     * otherwise the {@link\n     * org.apache.commons.math.geometry.partitioning.Transform#apply(Hyperplane)\n     * apply(Hyperplane)} method would work only for some lines, and\n     * fail for other ones)\n     * @return a new transform that can be applied to either {@link\n     * Vector2D Vector2D}, {@link Line Line} or {@link\n     * org.apache.commons.math.geometry.partitioning.SubHyperplane\n     * SubHyperplane} instances\n     * @exception MathIllegalArgumentException if the transform is non invertible\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineTransform",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.Transform\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 338,
      "end_line": 413,
      "comment": " Class embedding an affine transform.\n     * \u003cp\u003eThis class is used in order to apply an affine transform to a\n     * line. Using a specific object allow to perform some computations\n     * on the transform only once even if the same transform is to be\n     * applied to a large number of lines (for example to a large\n     * polygon)./\u003cp\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cXX"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": " CHECKSTYLE: stop JavadocVariable check"
    },
    {
      "type": "field",
      "varNames": [
        "cXY"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cX1"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cYX"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cYY"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cY1"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c1Y"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c1X"
      ],
      "begin_line": 349,
      "end_line": 349,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c11"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.LineTransform.LineTransform(java.awt.geom.AffineTransform)",
      "begin_line": 359,
      "end_line": 378,
      "comment": " Build an affine line transform from a n {@code AffineTransform}.\n         * @param transform transform to use (must be invertible otherwise\n         * the {@link LineTransform#apply(Hyperplane)} method would work\n         * only for some lines, and fail for other ones)\n         * @exception MathIllegalArgumentException if the transform is non invertible\n         ",
      "child_ranges": [
        "(line 361,col 13)-(line 361,col 45)",
        "(line 362,col 13)-(line 362,col 35)",
        "(line 363,col 13)-(line 363,col 23)",
        "(line 364,col 13)-(line 364,col 23)",
        "(line 365,col 13)-(line 365,col 23)",
        "(line 366,col 13)-(line 366,col 23)",
        "(line 367,col 13)-(line 367,col 23)",
        "(line 368,col 13)-(line 368,col 23)",
        "(line 370,col 13)-(line 370,col 40)",
        "(line 371,col 13)-(line 371,col 40)",
        "(line 372,col 13)-(line 372,col 40)",
        "(line 374,col 13)-(line 376,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.LineTransform.apply(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 381,
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 50)",
        "(line 383,col 13)-(line 383,col 43)",
        "(line 384,col 13)-(line 384,col 43)",
        "(line 385,col 13)-(line 386,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.LineTransform.apply(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 390,
      "end_line": 399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 391,col 13)-(line 391,col 53)",
        "(line 392,col 13)-(line 392,col 93)",
        "(line 393,col 13)-(line 393,col 67)",
        "(line 394,col 13)-(line 394,col 67)",
        "(line 395,col 13)-(line 395,col 82)",
        "(line 396,col 13)-(line 398,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.Line.LineTransform.apply(org.apache.commons.math.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e, org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e, org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 402,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 405,col 13)-(line 405,col 77)",
        "(line 406,col 13)-(line 406,col 57)",
        "(line 407,col 13)-(line 407,col 60)",
        "(line 408,col 13)-(line 409,col 90)",
        "(line 410,col 13)-(line 410,col 78)"
      ]
    }
  ]
}