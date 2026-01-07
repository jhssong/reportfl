{
  "filepath": "/tmp/Math-48b/src/main/java/org/apache/commons/math/geometry/euclidean/twod/PolygonsSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolygonsSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.AbstractRegion\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 42,
      "end_line": 470,
      "comment": " This class represents a 2D region: a set of polygons.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "vertices"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Vertices organized as boundary loops. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.PolygonsSet()",
      "begin_line": 49,
      "end_line": 51,
      "comment": " Build a polygons set representing the whole real line.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.PolygonsSet(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 62,
      "end_line": 64,
      "comment": " Build a polygons set from a BSP tree.\n     * \u003cp\u003eThe leaf nodes of the BSP tree \u003cem\u003emust\u003c/em\u003e have a\n     * {@code Boolean} attribute representing the inside status of\n     * the corresponding cell (true for inside cells, false for outside\n     * cells). In order to avoid building too many small objects, it is\n     * recommended to use the predefined constants\n     * {@code Boolean.TRUE} and {@code Boolean.FALSE}\u003c/p\u003e\n     * @param tree inside/outside BSP tree representing the region\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.PolygonsSet(java.util.Collection\u003corg.apache.commons.math.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e\u003e)",
      "begin_line": 86,
      "end_line": 88,
      "comment": " Build a polygons set from a Boundary REPresentation (B-rep).\n     * \u003cp\u003eThe boundary is provided as a collection of {@link\n     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the\n     * interior part of the region on its minus side and the exterior on\n     * its plus side.\u003c/p\u003e\n     * \u003cp\u003eThe boundary elements can be in any order, and can form\n     * several non-connected sets (like for example polygons with holes\n     * or a set of disjoint polyhedrons considered as a whole). In\n     * fact, the elements do not even need to be connected together\n     * (their topological connections are not used here). However, if the\n     * boundary does not really separate an inside open from an outside\n     * open (open having here its topological meaning), then subsequent\n     * calls to the {@link\n     * org.apache.commons.math.geometry.partitioning.Region#checkPoint(org.apache.commons.math.geometry.Vector)\n     * checkPoint} method will not be meaningful anymore.\u003c/p\u003e\n     * \u003cp\u003eIf the boundary is empty, the region will represent the whole\n     * space.\u003c/p\u003e\n     * @param boundary collection of boundary elements, as a\n     * collection of {@link SubHyperplane SubHyperplane} objects\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.PolygonsSet(double, double, double, double)",
      "begin_line": 96,
      "end_line": 99,
      "comment": " Build a parallellepipedic box.\n     * @param xMin low bound along the x direction\n     * @param xMax high bound along the x direction\n     * @param yMin low bound along the y direction\n     * @param yMax high bound along the y direction\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.boxBoundary(double, double, double, double)",
      "begin_line": 108,
      "end_line": 120,
      "comment": " Create a list of hyperplanes representing the boundary of a box.\n     * @param xMin low bound along the x direction\n     * @param xMax high bound along the x direction\n     * @param yMin low bound along the y direction\n     * @param yMax high bound along the y direction\n     * @return boundary of the box\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 57)",
        "(line 111,col 9)-(line 111,col 57)",
        "(line 112,col 9)-(line 112,col 57)",
        "(line 113,col 9)-(line 113,col 57)",
        "(line 114,col 9)-(line 119,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.buildNew(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 123,
      "end_line": 125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties()",
      "begin_line": 128,
      "end_line": 177,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 45)",
        "(line 132,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.getVertices()",
      "begin_line": 202,
      "end_line": 280,
      "comment": " Get the vertices of the polygon.\n     * \u003cp\u003eThe polygon boundary can be represented as an array of loops,\n     * each loop being itself an array of vertices.\u003c/p\u003e\n     * \u003cp\u003eIn order to identify open loops which start and end by\n     * infinite edges, the open loops arrays start with a null point. In\n     * this case, the first non null point and the last point of the\n     * array do not represent real vertices, they are dummy points\n     * intended only to get the direction of the first and last edge. An\n     * open loop consisting of a single infinite line will therefore be\n     * represented by a three elements array with one null point\n     * followed by two dummy points. The open loops are always the first\n     * ones in the loops array.\u003c/p\u003e\n     * \u003cp\u003eIf the polygon has no boundary at all, a zero length loop\n     * array will be returned.\u003c/p\u003e\n     * \u003cp\u003eAll line segments in the various loops have the inside of the\n     * region on their left side and the outside on their right side\n     * when moving in the underlying line direction. This means that\n     * closed loops surrounding finite areas obey the direct\n     * trigonometric orientation.\u003c/p\u003e\n     * @return vertices of the polygon, organized as oriented boundary\n     * loops with the open loops first (the returned value is guaranteed\n     * to be non-null)\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.followLoop(org.apache.commons.math.geometry.partitioning.utilities.AVLTree.Node, org.apache.commons.math.geometry.partitioning.utilities.AVLTree\u003corg.apache.commons.math.geometry.euclidean.twod.PolygonsSet.ComparableSegment\u003e)",
      "begin_line": 289,
      "end_line": 346,
      "comment": " Follow a boundary loop.\n     * @param node node containing the segment starting the loop\n     * @param sorted set of segments belonging to the boundary, sorted by\n     * start points (contains {@code node})\n     * @return a list of connected sub-hyperplanes starting at\n     * {@code node}\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 85)",
        "(line 293,col 9)-(line 293,col 54)",
        "(line 294,col 9)-(line 294,col 26)",
        "(line 295,col 9)-(line 295,col 56)",
        "(line 296,col 9)-(line 296,col 40)",
        "(line 297,col 9)-(line 297,col 22)",
        "(line 300,col 9)-(line 300,col 56)",
        "(line 302,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 344,col 9)-(line 344,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ComparableSegment",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.euclidean.twod.Segment",
        "java.lang.Comparable\u003corg.apache.commons.math.geometry.euclidean.twod.PolygonsSet.ComparableSegment\u003e"
      ],
      "begin_line": 349,
      "end_line": 404,
      "comment": " Private extension of Segment allowing comparison. "
    },
    {
      "type": "field",
      "varNames": [
        "sortingKey"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": " Sorting key. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.ComparableSegment.ComparableSegment(org.apache.commons.math.geometry.euclidean.twod.Vector2D, org.apache.commons.math.geometry.euclidean.twod.Vector2D, org.apache.commons.math.geometry.euclidean.twod.Line)",
      "begin_line": 359,
      "end_line": 364,
      "comment": " Build a segment.\n         * @param start start point of the segment\n         * @param end end point of the segment\n         * @param line line containing the segment\n         ",
      "child_ranges": [
        "(line 360,col 13)-(line 360,col 36)",
        "(line 361,col 13)-(line 363,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.ComparableSegment.ComparableSegment(org.apache.commons.math.geometry.euclidean.twod.Vector2D, double, double)",
      "begin_line": 375,
      "end_line": 378,
      "comment": " Build a dummy segment.\n         * \u003cp\u003e\n         * The object built is not a real segment, only the sorting key is used to\n         * allow searching in the neighborhood of a point. This is an horrible hack ...\n         * \u003c/p\u003e\n         * @param start start point of the segment\n         * @param dx abscissa offset from the start point\n         * @param dy ordinate offset from the start point\n         ",
      "child_ranges": [
        "(line 376,col 13)-(line 376,col 36)",
        "(line 377,col 13)-(line 377,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.ComparableSegment.compareTo(org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.ComparableSegment)",
      "begin_line": 381,
      "end_line": 383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.ComparableSegment.equals(java.lang.Object)",
      "begin_line": 386,
      "end_line": 395,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 388,col 13)-(line 394,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.ComparableSegment.hashCode()",
      "begin_line": 398,
      "end_line": 402,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 400,col 13)-(line 401,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SegmentsBuilder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.BSPTreeVisitor\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 407,
      "end_line": 468,
      "comment": " Visitor building segments. "
    },
    {
      "type": "field",
      "varNames": [
        "sorted"
      ],
      "begin_line": 410,
      "end_line": 410,
      "comment": " Sorted segments. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.SegmentsBuilder()",
      "begin_line": 413,
      "end_line": 415,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 414,col 13)-(line 414,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.visitOrder(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 418,
      "end_line": 420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 419,col 13)-(line 419,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.visitInternalNode(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 423,
      "end_line": 432,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 424,col 13)-(line 425,col 114)",
        "(line 426,col 13)-(line 428,col 13)",
        "(line 429,col 13)-(line 431,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.visitLeafNode(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 435,
      "end_line": 436,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.addContribution(org.apache.commons.math.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e, boolean)",
      "begin_line": 442,
      "end_line": 459,
      "comment": " Add he contribution of a boundary facet.\n         * @param sub boundary facet\n         * @param reversed if true, the facet has the inside on its plus side\n         ",
      "child_ranges": [
        "(line 443,col 13)-(line 445,col 70)",
        "(line 446,col 13)-(line 446,col 62)",
        "(line 447,col 13)-(line 447,col 99)",
        "(line 448,col 13)-(line 458,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.getSorted()",
      "begin_line": 464,
      "end_line": 466,
      "comment": " Get the sorted segments.\n         * @return sorted segments\n         ",
      "child_ranges": [
        "(line 465,col 13)-(line 465,col 26)"
      ]
    }
  ]
}