{
  "filepath": "/tmp/Math-18b/src/main/java/org/apache/commons/math3/geometry/euclidean/twod/PolygonsSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolygonsSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.AbstractRegion\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 42,
      "end_line": 474,
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
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.PolygonsSet()",
      "begin_line": 49,
      "end_line": 51,
      "comment": " Build a polygons set representing the whole real line.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.PolygonsSet(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 62,
      "end_line": 64,
      "comment": " Build a polygons set from a BSP tree.\n     * \u003cp\u003eThe leaf nodes of the BSP tree \u003cem\u003emust\u003c/em\u003e have a\n     * {@code Boolean} attribute representing the inside status of\n     * the corresponding cell (true for inside cells, false for outside\n     * cells). In order to avoid building too many small objects, it is\n     * recommended to use the predefined constants\n     * {@code Boolean.TRUE} and {@code Boolean.FALSE}\u003c/p\u003e\n     * @param tree inside/outside BSP tree representing the region\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.PolygonsSet(java.util.Collection\u003corg.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e\u003e)",
      "begin_line": 86,
      "end_line": 88,
      "comment": " Build a polygons set from a Boundary REPresentation (B-rep).\n     * \u003cp\u003eThe boundary is provided as a collection of {@link\n     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the\n     * interior part of the region on its minus side and the exterior on\n     * its plus side.\u003c/p\u003e\n     * \u003cp\u003eThe boundary elements can be in any order, and can form\n     * several non-connected sets (like for example polygons with holes\n     * or a set of disjoint polyhedrons considered as a whole). In\n     * fact, the elements do not even need to be connected together\n     * (their topological connections are not used here). However, if the\n     * boundary does not really separate an inside open from an outside\n     * open (open having here its topological meaning), then subsequent\n     * calls to the {@link\n     * org.apache.commons.math3.geometry.partitioning.Region#checkPoint(org.apache.commons.math3.geometry.Vector)\n     * checkPoint} method will not be meaningful anymore.\u003c/p\u003e\n     * \u003cp\u003eIf the boundary is empty, the region will represent the whole\n     * space.\u003c/p\u003e\n     * @param boundary collection of boundary elements, as a\n     * collection of {@link SubHyperplane SubHyperplane} objects\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.PolygonsSet(double, double, double, double)",
      "begin_line": 96,
      "end_line": 99,
      "comment": " Build a parallellepipedic box.\n     * @param xMin low bound along the x direction\n     * @param xMax high bound along the x direction\n     * @param yMin low bound along the y direction\n     * @param yMax high bound along the y direction\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.boxBoundary(double, double, double, double)",
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
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.buildNew(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 123,
      "end_line": 126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties()",
      "begin_line": 129,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 45)",
        "(line 134,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices()",
      "begin_line": 206,
      "end_line": 284,
      "comment": " Get the vertices of the polygon.\n     * \u003cp\u003eThe polygon boundary can be represented as an array of loops,\n     * each loop being itself an array of vertices.\u003c/p\u003e\n     * \u003cp\u003eIn order to identify open loops which start and end by\n     * infinite edges, the open loops arrays start with a null point. In\n     * this case, the first non null point and the last point of the\n     * array do not represent real vertices, they are dummy points\n     * intended only to get the direction of the first and last edge. An\n     * open loop consisting of a single infinite line will therefore be\n     * represented by a three elements array with one null point\n     * followed by two dummy points. The open loops are always the first\n     * ones in the loops array.\u003c/p\u003e\n     * \u003cp\u003eIf the polygon has no boundary at all, a zero length loop\n     * array will be returned.\u003c/p\u003e\n     * \u003cp\u003eAll line segments in the various loops have the inside of the\n     * region on their left side and the outside on their right side\n     * when moving in the underlying line direction. This means that\n     * closed loops surrounding finite areas obey the direct\n     * trigonometric orientation.\u003c/p\u003e\n     * @return vertices of the polygon, organized as oriented boundary\n     * loops with the open loops first (the returned value is guaranteed\n     * to be non-null)\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 282,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node, org.apache.commons.math3.geometry.partitioning.utilities.AVLTree\u003corg.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment\u003e)",
      "begin_line": 293,
      "end_line": 350,
      "comment": " Follow a boundary loop.\n     * @param node node containing the segment starting the loop\n     * @param sorted set of segments belonging to the boundary, sorted by\n     * start points (contains {@code node})\n     * @return a list of connected sub-hyperplanes starting at\n     * {@code node}\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 85)",
        "(line 297,col 9)-(line 297,col 54)",
        "(line 298,col 9)-(line 298,col 26)",
        "(line 299,col 9)-(line 299,col 56)",
        "(line 300,col 9)-(line 300,col 40)",
        "(line 301,col 9)-(line 301,col 22)",
        "(line 304,col 9)-(line 304,col 56)",
        "(line 306,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 342,col 9)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 348,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ComparableSegment",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.euclidean.twod.Segment",
        "java.lang.Comparable\u003corg.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment\u003e"
      ],
      "begin_line": 353,
      "end_line": 408,
      "comment": " Private extension of Segment allowing comparison. "
    },
    {
      "type": "field",
      "varNames": [
        "sortingKey"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": " Sorting key. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.ComparableSegment(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Line)",
      "begin_line": 363,
      "end_line": 368,
      "comment": " Build a segment.\n         * @param start start point of the segment\n         * @param end end point of the segment\n         * @param line line containing the segment\n         ",
      "child_ranges": [
        "(line 364,col 13)-(line 364,col 36)",
        "(line 365,col 13)-(line 367,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.ComparableSegment(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, double, double)",
      "begin_line": 379,
      "end_line": 382,
      "comment": " Build a dummy segment.\n         * \u003cp\u003e\n         * The object built is not a real segment, only the sorting key is used to\n         * allow searching in the neighborhood of a point. This is an horrible hack ...\n         * \u003c/p\u003e\n         * @param start start point of the segment\n         * @param dx abscissa offset from the start point\n         * @param dy ordinate offset from the start point\n         ",
      "child_ranges": [
        "(line 380,col 13)-(line 380,col 36)",
        "(line 381,col 13)-(line 381,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.compareTo(org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment)",
      "begin_line": 385,
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 386,col 13)-(line 386,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.equals(java.lang.Object)",
      "begin_line": 390,
      "end_line": 399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 13)-(line 398,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.hashCode()",
      "begin_line": 402,
      "end_line": 406,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 404,col 13)-(line 405,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SegmentsBuilder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 411,
      "end_line": 472,
      "comment": " Visitor building segments. "
    },
    {
      "type": "field",
      "varNames": [
        "sorted"
      ],
      "begin_line": 414,
      "end_line": 414,
      "comment": " Sorted segments. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.SegmentsBuilder()",
      "begin_line": 417,
      "end_line": 419,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 418,col 13)-(line 418,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.visitOrder(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 422,
      "end_line": 424,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 423,col 13)-(line 423,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 427,
      "end_line": 436,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 428,col 13)-(line 429,col 114)",
        "(line 430,col 13)-(line 432,col 13)",
        "(line 433,col 13)-(line 435,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.visitLeafNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 439,
      "end_line": 440,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.addContribution(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e, boolean)",
      "begin_line": 446,
      "end_line": 463,
      "comment": " Add he contribution of a boundary facet.\n         * @param sub boundary facet\n         * @param reversed if true, the facet has the inside on its plus side\n         ",
      "child_ranges": [
        "(line 447,col 13)-(line 449,col 70)",
        "(line 450,col 13)-(line 450,col 62)",
        "(line 451,col 13)-(line 451,col 99)",
        "(line 452,col 13)-(line 462,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.getSorted()",
      "begin_line": 468,
      "end_line": 470,
      "comment": " Get the sorted segments.\n         * @return sorted segments\n         ",
      "child_ranges": [
        "(line 469,col 13)-(line 469,col 26)"
      ]
    }
  ]
}