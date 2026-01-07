{
  "filepath": "/tmp/Math-16b/src/main/java/org/apache/commons/math3/geometry/euclidean/twod/PolygonsSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolygonsSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.AbstractRegion\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 43,
      "end_line": 864,
      "comment": " This class represents a 2D region: a set of polygons.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "vertices"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Vertices organized as boundary loops. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.PolygonsSet()",
      "begin_line": 50,
      "end_line": 52,
      "comment": " Build a polygons set representing the whole real line.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.PolygonsSet(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 63,
      "end_line": 65,
      "comment": " Build a polygons set from a BSP tree.\n     * \u003cp\u003eThe leaf nodes of the BSP tree \u003cem\u003emust\u003c/em\u003e have a\n     * {@code Boolean} attribute representing the inside status of\n     * the corresponding cell (true for inside cells, false for outside\n     * cells). In order to avoid building too many small objects, it is\n     * recommended to use the predefined constants\n     * {@code Boolean.TRUE} and {@code Boolean.FALSE}\u003c/p\u003e\n     * @param tree inside/outside BSP tree representing the region\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.PolygonsSet(java.util.Collection\u003corg.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e\u003e)",
      "begin_line": 87,
      "end_line": 89,
      "comment": " Build a polygons set from a Boundary REPresentation (B-rep).\n     * \u003cp\u003eThe boundary is provided as a collection of {@link\n     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the\n     * interior part of the region on its minus side and the exterior on\n     * its plus side.\u003c/p\u003e\n     * \u003cp\u003eThe boundary elements can be in any order, and can form\n     * several non-connected sets (like for example polygons with holes\n     * or a set of disjoint polyhedrons considered as a whole). In\n     * fact, the elements do not even need to be connected together\n     * (their topological connections are not used here). However, if the\n     * boundary does not really separate an inside open from an outside\n     * open (open having here its topological meaning), then subsequent\n     * calls to the {@link\n     * org.apache.commons.math3.geometry.partitioning.Region#checkPoint(org.apache.commons.math3.geometry.Vector)\n     * checkPoint} method will not be meaningful anymore.\u003c/p\u003e\n     * \u003cp\u003eIf the boundary is empty, the region will represent the whole\n     * space.\u003c/p\u003e\n     * @param boundary collection of boundary elements, as a\n     * collection of {@link SubHyperplane SubHyperplane} objects\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.PolygonsSet(double, double, double, double)",
      "begin_line": 97,
      "end_line": 100,
      "comment": " Build a parallellepipedic box.\n     * @param xMin low bound along the x direction\n     * @param xMax high bound along the x direction\n     * @param yMin low bound along the y direction\n     * @param yMax high bound along the y direction\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.PolygonsSet(double, org.apache.commons.math3.geometry.euclidean.twod.Vector2D...)",
      "begin_line": 132,
      "end_line": 134,
      "comment": " Build a polygon from a simple list of vertices.\n     * \u003cp\u003eThe boundary is provided as a list of points considering to\n     * represent the vertices of a simple loop. The interior part of the\n     * region is on the left side of this path and the exterior is on its\n     * right side.\u003c/p\u003e\n     * \u003cp\u003eThis constructor does not handle polygons with a boundary\n     * forming several disconnected paths (such as polygons with holes).\u003c/p\u003e\n     * \u003cp\u003eFor cases where this simple constructor applies, it is expected to\n     * be numerically more robust than the {@link #PolygonsSet(Collection) general\n     * constructor} using {@link SubHyperplane subhyperplanes}.\u003c/p\u003e\n     * \u003cp\u003eIf the list is empty, the region will represent the whole\n     * space.\u003c/p\u003e\n     * \u003cp\u003e\n     * Polygons with thin pikes or dents are inherently difficult to handle because\n     * they involve lines with almost opposite directions at some vertices. Polygons\n     * whose vertices come from some physical measurement with noise are also\n     * difficult because an edge that should be straight may be broken in lots of\n     * different pieces with almost equal directions. In both cases, computing the\n     * lines intersections is not numerically robust due to the almost 0 or almost\n     * \u0026pi; angle. Such cases need to carefully adjust the {@code hyperplaneThickness}\n     * parameter. A too small value would often lead to completely wrong polygons\n     * with large area wrongly identified as inside or outside. Large values are\n     * often much safer. As a rule of thumb, a value slightly below the size of the\n     * most accurate detail needed is a good value for the {@code hyperplaneThickness}\n     * parameter.\n     * \u003c/p\u003e\n     * @param hyperplaneThickness tolerance below which points are considered to\n     * belong to the hyperplane (which is therefore more a slab)\n     * @param vertices vertices of the simple loop boundary\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.boxBoundary(double, double, double, double)",
      "begin_line": 143,
      "end_line": 155,
      "comment": " Create a list of hyperplanes representing the boundary of a box.\n     * @param xMin low bound along the x direction\n     * @param xMax high bound along the x direction\n     * @param yMin low bound along the y direction\n     * @param yMax high bound along the y direction\n     * @return boundary of the box\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 57)",
        "(line 146,col 9)-(line 146,col 57)",
        "(line 147,col 9)-(line 147,col 57)",
        "(line 148,col 9)-(line 148,col 57)",
        "(line 149,col 9)-(line 154,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.verticesToTree(double, org.apache.commons.math3.geometry.euclidean.twod.Vector2D...)",
      "begin_line": 172,
      "end_line": 222,
      "comment": " Build the BSP tree of a polygons set from a simple list of vertices.\n     * \u003cp\u003eThe boundary is provided as a list of points considering to\n     * represent the vertices of a simple loop. The interior part of the\n     * region is on the left side of this path and the exterior is on its\n     * right side.\u003c/p\u003e\n     * \u003cp\u003eThis constructor does not handle polygons with a boundary\n     * forming several disconnected paths (such as polygons with holes).\u003c/p\u003e\n     * \u003cp\u003eFor cases where this simple constructor applies, it is expected to\n     * be numerically more robust than the {@link #PolygonsSet(Collection) general\n     * constructor} using {@link SubHyperplane subhyperplanes}.\u003c/p\u003e\n     * @param hyperplaneThickness tolerance below which points are consider to\n     * belong to the hyperplane (which is therefore more a slab)\n     * @param vertices vertices of the simple loop boundary\n     * @return the BSP tree of the input vertices\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 38)",
        "(line 176,col 9)-(line 179,col 9)",
        "(line 182,col 9)-(line 182,col 46)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 188,col 9)-(line 188,col 49)",
        "(line 189,col 9)-(line 214,col 9)",
        "(line 217,col 9)-(line 217,col 69)",
        "(line 218,col 9)-(line 218,col 54)",
        "(line 220,col 9)-(line 220,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.insertEdges(double, org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e, java.util.List\u003corg.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge\u003e)",
      "begin_line": 232,
      "end_line": 320,
      "comment": " Recursively build a tree by inserting cut sub-hyperplanes.\n     * @param hyperplaneThickness tolerance below which points are consider to\n     * belong to the hyperplane (which is therefore more a slab)\n     * @param node current tree node (it is a leaf node at the beginning\n     * of the call)\n     * @param edges list of edges to insert in the cell defined by this node\n     * (excluding edges not belonging to the cell defined by this node)\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 22)",
        "(line 238,col 9)-(line 238,col 28)",
        "(line 239,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 262,col 9)",
        "(line 266,col 9)-(line 266,col 59)",
        "(line 267,col 9)-(line 267,col 59)",
        "(line 268,col 9)-(line 306,col 9)",
        "(line 309,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Vertex",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 323,
      "end_line": 420,
      "comment": " Internal class for holding vertices while they are processed to build a BSP tree. "
    },
    {
      "type": "field",
      "varNames": [
        "location"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " Vertex location. "
    },
    {
      "type": "field",
      "varNames": [
        "incoming"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": " Incoming edge. "
    },
    {
      "type": "field",
      "varNames": [
        "outgoing"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": " Outgoing edge. "
    },
    {
      "type": "field",
      "varNames": [
        "lines"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": " Lines bound with this vertex. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.Vertex(org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 340,
      "end_line": 345,
      "comment": " Build a non-processed vertex not owned by any node yet.\n         * @param location vertex location\n         ",
      "child_ranges": [
        "(line 341,col 13)-(line 341,col 37)",
        "(line 342,col 13)-(line 342,col 33)",
        "(line 343,col 13)-(line 343,col 33)",
        "(line 344,col 13)-(line 344,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.getLocation()",
      "begin_line": 350,
      "end_line": 352,
      "comment": " Get Vertex location.\n         * @return vertex location\n         ",
      "child_ranges": [
        "(line 351,col 13)-(line 351,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.bindWith(org.apache.commons.math3.geometry.euclidean.twod.Line)",
      "begin_line": 357,
      "end_line": 359,
      "comment": " Bind a line considered to contain this vertex.\n         * @param line line to bind with this vertex\n         ",
      "child_ranges": [
        "(line 358,col 13)-(line 358,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.sharedLineWith(org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex)",
      "begin_line": 371,
      "end_line": 380,
      "comment": " Get the common line bound with both the instance and another vertex, if any.\n         * \u003cp\u003e\n         * When two vertices are both bound to the same line, this means they are\n         * already handled by node associated with this line, so there is no need\n         * to create a cut hyperplane for them.\n         * \u003c/p\u003e\n         * @param vertex other vertex to check instance against\n         * @return line bound with both the instance and another vertex, or null if the\n         * two vertices do not share a line yet\n         ",
      "child_ranges": [
        "(line 372,col 13)-(line 378,col 13)",
        "(line 379,col 13)-(line 379,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.setIncoming(org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge)",
      "begin_line": 389,
      "end_line": 392,
      "comment": " Set incoming edge.\n         * \u003cp\u003e\n         * The line supporting the incoming edge is automatically bound\n         * with the instance.\n         * \u003c/p\u003e\n         * @param incoming incoming edge\n         ",
      "child_ranges": [
        "(line 390,col 13)-(line 390,col 37)",
        "(line 391,col 13)-(line 391,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.getIncoming()",
      "begin_line": 397,
      "end_line": 399,
      "comment": " Get incoming edge.\n         * @return incoming edge\n         ",
      "child_ranges": [
        "(line 398,col 13)-(line 398,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.setOutgoing(org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge)",
      "begin_line": 408,
      "end_line": 411,
      "comment": " Set outgoing edge.\n         * \u003cp\u003e\n         * The line supporting the outgoing edge is automatically bound\n         * with the instance.\n         * \u003c/p\u003e\n         * @param outgoing outgoing edge\n         ",
      "child_ranges": [
        "(line 409,col 13)-(line 409,col 37)",
        "(line 410,col 13)-(line 410,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.getOutgoing()",
      "begin_line": 416,
      "end_line": 418,
      "comment": " Get outgoing edge.\n         * @return outgoing edge\n         ",
      "child_ranges": [
        "(line 417,col 13)-(line 417,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Edge",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 423,
      "end_line": 510,
      "comment": " Internal class for holding edges while they are processed to build a BSP tree. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": " Start vertex. "
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 429,
      "end_line": 429,
      "comment": " End vertex. "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 432,
      "end_line": 432,
      "comment": " Line supporting the edge. "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 435,
      "end_line": 435,
      "comment": " Node whose cut hyperplane contains this edge. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge.Edge(org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex, org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex, org.apache.commons.math3.geometry.euclidean.twod.Line)",
      "begin_line": 442,
      "end_line": 453,
      "comment": " Build an edge not contained in any node yet.\n         * @param start start vertex\n         * @param end end vertex\n         * @param line line supporting the edge\n         ",
      "child_ranges": [
        "(line 444,col 13)-(line 444,col 31)",
        "(line 445,col 13)-(line 445,col 29)",
        "(line 446,col 13)-(line 446,col 30)",
        "(line 447,col 13)-(line 447,col 30)",
        "(line 450,col 13)-(line 450,col 36)",
        "(line 451,col 13)-(line 451,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge.getStart()",
      "begin_line": 458,
      "end_line": 460,
      "comment": " Get start vertex.\n         * @return start vertex\n         ",
      "child_ranges": [
        "(line 459,col 13)-(line 459,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge.getEnd()",
      "begin_line": 465,
      "end_line": 467,
      "comment": " Get end vertex.\n         * @return end vertex\n         ",
      "child_ranges": [
        "(line 466,col 13)-(line 466,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge.getLine()",
      "begin_line": 472,
      "end_line": 474,
      "comment": " Get the line supporting this edge.\n         * @return line supporting this edge\n         ",
      "child_ranges": [
        "(line 473,col 13)-(line 473,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge.setNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 479,
      "end_line": 481,
      "comment": " Set the node whose cut hyperplane contains this edge.\n         * @param node node whose cut hyperplane contains this edge\n         ",
      "child_ranges": [
        "(line 480,col 13)-(line 480,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge.getNode()",
      "begin_line": 487,
      "end_line": 489,
      "comment": " Get the node whose cut hyperplane contains this edge.\n         * @return node whose cut hyperplane contains this edge\n         * (null if edge has not yet been inserted into the BSP tree)\n         ",
      "child_ranges": [
        "(line 488,col 13)-(line 488,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge.split(org.apache.commons.math3.geometry.euclidean.twod.Line)",
      "begin_line": 500,
      "end_line": 508,
      "comment": " Split the edge.\n         * \u003cp\u003e\n         * Once split, this edge is not referenced anymore by the vertices,\n         * it is replaced by the two half-edges and an intermediate splitting\n         * vertex is introduced to connect these two halves.\n         * \u003c/p\u003e\n         * @param splitLine line splitting the edge in two halves\n         * @return split vertex (its incoming and outgoing edges are the two halves)\n         ",
      "child_ranges": [
        "(line 501,col 13)-(line 501,col 80)",
        "(line 502,col 13)-(line 502,col 44)",
        "(line 503,col 13)-(line 503,col 70)",
        "(line 504,col 13)-(line 504,col 68)",
        "(line 505,col 13)-(line 505,col 34)",
        "(line 506,col 13)-(line 506,col 34)",
        "(line 507,col 13)-(line 507,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.buildNew(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 513,
      "end_line": 516,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties()",
      "begin_line": 519,
      "end_line": 571,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 45)",
        "(line 524,col 9)-(line 569,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices()",
      "begin_line": 596,
      "end_line": 674,
      "comment": " Get the vertices of the polygon.\n     * \u003cp\u003eThe polygon boundary can be represented as an array of loops,\n     * each loop being itself an array of vertices.\u003c/p\u003e\n     * \u003cp\u003eIn order to identify open loops which start and end by\n     * infinite edges, the open loops arrays start with a null point. In\n     * this case, the first non null point and the last point of the\n     * array do not represent real vertices, they are dummy points\n     * intended only to get the direction of the first and last edge. An\n     * open loop consisting of a single infinite line will therefore be\n     * represented by a three elements array with one null point\n     * followed by two dummy points. The open loops are always the first\n     * ones in the loops array.\u003c/p\u003e\n     * \u003cp\u003eIf the polygon has no boundary at all, a zero length loop\n     * array will be returned.\u003c/p\u003e\n     * \u003cp\u003eAll line segments in the various loops have the inside of the\n     * region on their left side and the outside on their right side\n     * when moving in the underlying line direction. This means that\n     * closed loops surrounding finite areas obey the direct\n     * trigonometric orientation.\u003c/p\u003e\n     * @return vertices of the polygon, organized as oriented boundary\n     * loops with the open loops first (the returned value is guaranteed\n     * to be non-null)\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 670,col 9)",
        "(line 672,col 9)-(line 672,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node, org.apache.commons.math3.geometry.partitioning.utilities.AVLTree\u003corg.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment\u003e)",
      "begin_line": 683,
      "end_line": 740,
      "comment": " Follow a boundary loop.\n     * @param node node containing the segment starting the loop\n     * @param sorted set of segments belonging to the boundary, sorted by\n     * start points (contains {@code node})\n     * @return a list of connected sub-hyperplanes starting at\n     * {@code node}\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 85)",
        "(line 687,col 9)-(line 687,col 54)",
        "(line 688,col 9)-(line 688,col 26)",
        "(line 689,col 9)-(line 689,col 56)",
        "(line 690,col 9)-(line 690,col 40)",
        "(line 691,col 9)-(line 691,col 22)",
        "(line 694,col 9)-(line 694,col 56)",
        "(line 696,col 9)-(line 727,col 9)",
        "(line 729,col 9)-(line 732,col 9)",
        "(line 734,col 9)-(line 736,col 9)",
        "(line 738,col 9)-(line 738,col 20)"
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
      "begin_line": 743,
      "end_line": 798,
      "comment": " Private extension of Segment allowing comparison. "
    },
    {
      "type": "field",
      "varNames": [
        "sortingKey"
      ],
      "begin_line": 746,
      "end_line": 746,
      "comment": " Sorting key. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.ComparableSegment(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Line)",
      "begin_line": 753,
      "end_line": 758,
      "comment": " Build a segment.\n         * @param start start point of the segment\n         * @param end end point of the segment\n         * @param line line containing the segment\n         ",
      "child_ranges": [
        "(line 754,col 13)-(line 754,col 36)",
        "(line 755,col 13)-(line 757,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.ComparableSegment(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, double, double)",
      "begin_line": 769,
      "end_line": 772,
      "comment": " Build a dummy segment.\n         * \u003cp\u003e\n         * The object built is not a real segment, only the sorting key is used to\n         * allow searching in the neighborhood of a point. This is an horrible hack ...\n         * \u003c/p\u003e\n         * @param start start point of the segment\n         * @param dx abscissa offset from the start point\n         * @param dy ordinate offset from the start point\n         ",
      "child_ranges": [
        "(line 770,col 13)-(line 770,col 36)",
        "(line 771,col 13)-(line 771,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.compareTo(org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment)",
      "begin_line": 775,
      "end_line": 777,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 776,col 13)-(line 776,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.equals(java.lang.Object)",
      "begin_line": 780,
      "end_line": 789,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 782,col 13)-(line 788,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.hashCode()",
      "begin_line": 792,
      "end_line": 796,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 794,col 13)-(line 795,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SegmentsBuilder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 801,
      "end_line": 862,
      "comment": " Visitor building segments. "
    },
    {
      "type": "field",
      "varNames": [
        "sorted"
      ],
      "begin_line": 804,
      "end_line": 804,
      "comment": " Sorted segments. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.SegmentsBuilder()",
      "begin_line": 807,
      "end_line": 809,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 808,col 13)-(line 808,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.visitOrder(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 812,
      "end_line": 814,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 813,col 13)-(line 813,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 817,
      "end_line": 826,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 818,col 13)-(line 819,col 114)",
        "(line 820,col 13)-(line 822,col 13)",
        "(line 823,col 13)-(line 825,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.visitLeafNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 829,
      "end_line": 830,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.addContribution(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e, boolean)",
      "begin_line": 836,
      "end_line": 853,
      "comment": " Add he contribution of a boundary facet.\n         * @param sub boundary facet\n         * @param reversed if true, the facet has the inside on its plus side\n         ",
      "child_ranges": [
        "(line 837,col 13)-(line 839,col 70)",
        "(line 840,col 13)-(line 840,col 62)",
        "(line 841,col 13)-(line 841,col 99)",
        "(line 842,col 13)-(line 852,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.getSorted()",
      "begin_line": 858,
      "end_line": 860,
      "comment": " Get the sorted segments.\n         * @return sorted segments\n         ",
      "child_ranges": [
        "(line 859,col 13)-(line 859,col 26)"
      ]
    }
  ]
}