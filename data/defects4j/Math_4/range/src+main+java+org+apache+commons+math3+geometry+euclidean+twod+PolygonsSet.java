{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/twod/PolygonsSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolygonsSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.AbstractRegion\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D, org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D\u003e"
      ],
      "begin_line": 43,
      "end_line": 865,
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
      "begin_line": 133,
      "end_line": 135,
      "comment": " Build a polygon from a simple list of vertices.\n     * \u003cp\u003eThe boundary is provided as a list of points considering to\n     * represent the vertices of a simple loop. The interior part of the\n     * region is on the left side of this path and the exterior is on its\n     * right side.\u003c/p\u003e\n     * \u003cp\u003eThis constructor does not handle polygons with a boundary\n     * forming several disconnected paths (such as polygons with holes).\u003c/p\u003e\n     * \u003cp\u003eFor cases where this simple constructor applies, it is expected to\n     * be numerically more robust than the {@link #PolygonsSet(Collection) general\n     * constructor} using {@link SubHyperplane subhyperplanes}.\u003c/p\u003e\n     * \u003cp\u003eIf the list is empty, the region will represent the whole\n     * space.\u003c/p\u003e\n     * \u003cp\u003e\n     * Polygons with thin pikes or dents are inherently difficult to handle because\n     * they involve lines with almost opposite directions at some vertices. Polygons\n     * whose vertices come from some physical measurement with noise are also\n     * difficult because an edge that should be straight may be broken in lots of\n     * different pieces with almost equal directions. In both cases, computing the\n     * lines intersections is not numerically robust due to the almost 0 or almost\n     * \u0026pi; angle. Such cases need to carefully adjust the {@code hyperplaneThickness}\n     * parameter. A too small value would often lead to completely wrong polygons\n     * with large area wrongly identified as inside or outside. Large values are\n     * often much safer. As a rule of thumb, a value slightly below the size of the\n     * most accurate detail needed is a good value for the {@code hyperplaneThickness}\n     * parameter.\n     * \u003c/p\u003e\n     * @param hyperplaneThickness tolerance below which points are considered to\n     * belong to the hyperplane (which is therefore more a slab)\n     * @param vertices vertices of the simple loop boundary\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.boxBoundary(double, double, double, double)",
      "begin_line": 144,
      "end_line": 156,
      "comment": " Create a list of hyperplanes representing the boundary of a box.\n     * @param xMin low bound along the x direction\n     * @param xMax high bound along the x direction\n     * @param yMin low bound along the y direction\n     * @param yMax high bound along the y direction\n     * @return boundary of the box\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 57)",
        "(line 147,col 9)-(line 147,col 57)",
        "(line 148,col 9)-(line 148,col 57)",
        "(line 149,col 9)-(line 149,col 57)",
        "(line 150,col 9)-(line 155,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.verticesToTree(double, org.apache.commons.math3.geometry.euclidean.twod.Vector2D...)",
      "begin_line": 173,
      "end_line": 223,
      "comment": " Build the BSP tree of a polygons set from a simple list of vertices.\n     * \u003cp\u003eThe boundary is provided as a list of points considering to\n     * represent the vertices of a simple loop. The interior part of the\n     * region is on the left side of this path and the exterior is on its\n     * right side.\u003c/p\u003e\n     * \u003cp\u003eThis constructor does not handle polygons with a boundary\n     * forming several disconnected paths (such as polygons with holes).\u003c/p\u003e\n     * \u003cp\u003eFor cases where this simple constructor applies, it is expected to\n     * be numerically more robust than the {@link #PolygonsSet(Collection) general\n     * constructor} using {@link SubHyperplane subhyperplanes}.\u003c/p\u003e\n     * @param hyperplaneThickness tolerance below which points are consider to\n     * belong to the hyperplane (which is therefore more a slab)\n     * @param vertices vertices of the simple loop boundary\n     * @return the BSP tree of the input vertices\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 38)",
        "(line 177,col 9)-(line 180,col 9)",
        "(line 183,col 9)-(line 183,col 46)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 189,col 9)-(line 189,col 49)",
        "(line 190,col 9)-(line 215,col 9)",
        "(line 218,col 9)-(line 218,col 69)",
        "(line 219,col 9)-(line 219,col 54)",
        "(line 221,col 9)-(line 221,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.insertEdges(double, org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e, java.util.List\u003corg.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge\u003e)",
      "begin_line": 233,
      "end_line": 321,
      "comment": " Recursively build a tree by inserting cut sub-hyperplanes.\n     * @param hyperplaneThickness tolerance below which points are consider to\n     * belong to the hyperplane (which is therefore more a slab)\n     * @param node current tree node (it is a leaf node at the beginning\n     * of the call)\n     * @param edges list of edges to insert in the cell defined by this node\n     * (excluding edges not belonging to the cell defined by this node)\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 22)",
        "(line 239,col 9)-(line 239,col 28)",
        "(line 240,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 263,col 9)",
        "(line 267,col 9)-(line 267,col 59)",
        "(line 268,col 9)-(line 268,col 59)",
        "(line 269,col 9)-(line 307,col 9)",
        "(line 310,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 319,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Vertex",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 324,
      "end_line": 421,
      "comment": " Internal class for holding vertices while they are processed to build a BSP tree. "
    },
    {
      "type": "field",
      "varNames": [
        "location"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": " Vertex location. "
    },
    {
      "type": "field",
      "varNames": [
        "incoming"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " Incoming edge. "
    },
    {
      "type": "field",
      "varNames": [
        "outgoing"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " Outgoing edge. "
    },
    {
      "type": "field",
      "varNames": [
        "lines"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " Lines bound with this vertex. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.Vertex(org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 341,
      "end_line": 346,
      "comment": " Build a non-processed vertex not owned by any node yet.\n         * @param location vertex location\n         ",
      "child_ranges": [
        "(line 342,col 13)-(line 342,col 37)",
        "(line 343,col 13)-(line 343,col 33)",
        "(line 344,col 13)-(line 344,col 33)",
        "(line 345,col 13)-(line 345,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.getLocation()",
      "begin_line": 351,
      "end_line": 353,
      "comment": " Get Vertex location.\n         * @return vertex location\n         ",
      "child_ranges": [
        "(line 352,col 13)-(line 352,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.bindWith(org.apache.commons.math3.geometry.euclidean.twod.Line)",
      "begin_line": 358,
      "end_line": 360,
      "comment": " Bind a line considered to contain this vertex.\n         * @param line line to bind with this vertex\n         ",
      "child_ranges": [
        "(line 359,col 13)-(line 359,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.sharedLineWith(org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex)",
      "begin_line": 372,
      "end_line": 381,
      "comment": " Get the common line bound with both the instance and another vertex, if any.\n         * \u003cp\u003e\n         * When two vertices are both bound to the same line, this means they are\n         * already handled by node associated with this line, so there is no need\n         * to create a cut hyperplane for them.\n         * \u003c/p\u003e\n         * @param vertex other vertex to check instance against\n         * @return line bound with both the instance and another vertex, or null if the\n         * two vertices do not share a line yet\n         ",
      "child_ranges": [
        "(line 373,col 13)-(line 379,col 13)",
        "(line 380,col 13)-(line 380,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.setIncoming(org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge)",
      "begin_line": 390,
      "end_line": 393,
      "comment": " Set incoming edge.\n         * \u003cp\u003e\n         * The line supporting the incoming edge is automatically bound\n         * with the instance.\n         * \u003c/p\u003e\n         * @param incoming incoming edge\n         ",
      "child_ranges": [
        "(line 391,col 13)-(line 391,col 37)",
        "(line 392,col 13)-(line 392,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.getIncoming()",
      "begin_line": 398,
      "end_line": 400,
      "comment": " Get incoming edge.\n         * @return incoming edge\n         ",
      "child_ranges": [
        "(line 399,col 13)-(line 399,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.setOutgoing(org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge)",
      "begin_line": 409,
      "end_line": 412,
      "comment": " Set outgoing edge.\n         * \u003cp\u003e\n         * The line supporting the outgoing edge is automatically bound\n         * with the instance.\n         * \u003c/p\u003e\n         * @param outgoing outgoing edge\n         ",
      "child_ranges": [
        "(line 410,col 13)-(line 410,col 37)",
        "(line 411,col 13)-(line 411,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex.getOutgoing()",
      "begin_line": 417,
      "end_line": 419,
      "comment": " Get outgoing edge.\n         * @return outgoing edge\n         ",
      "child_ranges": [
        "(line 418,col 13)-(line 418,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Edge",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 424,
      "end_line": 511,
      "comment": " Internal class for holding edges while they are processed to build a BSP tree. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 427,
      "end_line": 427,
      "comment": " Start vertex. "
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 430,
      "end_line": 430,
      "comment": " End vertex. "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 433,
      "end_line": 433,
      "comment": " Line supporting the edge. "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 436,
      "end_line": 436,
      "comment": " Node whose cut hyperplane contains this edge. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge.Edge(org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex, org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Vertex, org.apache.commons.math3.geometry.euclidean.twod.Line)",
      "begin_line": 443,
      "end_line": 454,
      "comment": " Build an edge not contained in any node yet.\n         * @param start start vertex\n         * @param end end vertex\n         * @param line line supporting the edge\n         ",
      "child_ranges": [
        "(line 445,col 13)-(line 445,col 31)",
        "(line 446,col 13)-(line 446,col 29)",
        "(line 447,col 13)-(line 447,col 30)",
        "(line 448,col 13)-(line 448,col 30)",
        "(line 451,col 13)-(line 451,col 36)",
        "(line 452,col 13)-(line 452,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge.getStart()",
      "begin_line": 459,
      "end_line": 461,
      "comment": " Get start vertex.\n         * @return start vertex\n         ",
      "child_ranges": [
        "(line 460,col 13)-(line 460,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge.getEnd()",
      "begin_line": 466,
      "end_line": 468,
      "comment": " Get end vertex.\n         * @return end vertex\n         ",
      "child_ranges": [
        "(line 467,col 13)-(line 467,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge.getLine()",
      "begin_line": 473,
      "end_line": 475,
      "comment": " Get the line supporting this edge.\n         * @return line supporting this edge\n         ",
      "child_ranges": [
        "(line 474,col 13)-(line 474,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge.setNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 480,
      "end_line": 482,
      "comment": " Set the node whose cut hyperplane contains this edge.\n         * @param node node whose cut hyperplane contains this edge\n         ",
      "child_ranges": [
        "(line 481,col 13)-(line 481,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge.getNode()",
      "begin_line": 488,
      "end_line": 490,
      "comment": " Get the node whose cut hyperplane contains this edge.\n         * @return node whose cut hyperplane contains this edge\n         * (null if edge has not yet been inserted into the BSP tree)\n         ",
      "child_ranges": [
        "(line 489,col 13)-(line 489,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.Edge.split(org.apache.commons.math3.geometry.euclidean.twod.Line)",
      "begin_line": 501,
      "end_line": 509,
      "comment": " Split the edge.\n         * \u003cp\u003e\n         * Once split, this edge is not referenced anymore by the vertices,\n         * it is replaced by the two half-edges and an intermediate splitting\n         * vertex is introduced to connect these two halves.\n         * \u003c/p\u003e\n         * @param splitLine line splitting the edge in two halves\n         * @return split vertex (its incoming and outgoing edges are the two halves)\n         ",
      "child_ranges": [
        "(line 502,col 13)-(line 502,col 80)",
        "(line 503,col 13)-(line 503,col 44)",
        "(line 504,col 13)-(line 504,col 70)",
        "(line 505,col 13)-(line 505,col 68)",
        "(line 506,col 13)-(line 506,col 34)",
        "(line 507,col 13)-(line 507,col 34)",
        "(line 508,col 13)-(line 508,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.buildNew(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 514,
      "end_line": 517,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.computeGeometricalProperties()",
      "begin_line": 520,
      "end_line": 572,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 45)",
        "(line 525,col 9)-(line 570,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.getVertices()",
      "begin_line": 597,
      "end_line": 675,
      "comment": " Get the vertices of the polygon.\n     * \u003cp\u003eThe polygon boundary can be represented as an array of loops,\n     * each loop being itself an array of vertices.\u003c/p\u003e\n     * \u003cp\u003eIn order to identify open loops which start and end by\n     * infinite edges, the open loops arrays start with a null point. In\n     * this case, the first non null point and the last point of the\n     * array do not represent real vertices, they are dummy points\n     * intended only to get the direction of the first and last edge. An\n     * open loop consisting of a single infinite line will therefore be\n     * represented by a three elements array with one null point\n     * followed by two dummy points. The open loops are always the first\n     * ones in the loops array.\u003c/p\u003e\n     * \u003cp\u003eIf the polygon has no boundary at all, a zero length loop\n     * array will be returned.\u003c/p\u003e\n     * \u003cp\u003eAll line segments in the various loops have the inside of the\n     * region on their left side and the outside on their right side\n     * when moving in the underlying line direction. This means that\n     * closed loops surrounding finite areas obey the direct\n     * trigonometric orientation.\u003c/p\u003e\n     * @return vertices of the polygon, organized as oriented boundary\n     * loops with the open loops first (the returned value is guaranteed\n     * to be non-null)\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 671,col 9)",
        "(line 673,col 9)-(line 673,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.followLoop(org.apache.commons.math3.geometry.partitioning.utilities.AVLTree.Node, org.apache.commons.math3.geometry.partitioning.utilities.AVLTree\u003corg.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment\u003e)",
      "begin_line": 684,
      "end_line": 741,
      "comment": " Follow a boundary loop.\n     * @param node node containing the segment starting the loop\n     * @param sorted set of segments belonging to the boundary, sorted by\n     * start points (contains {@code node})\n     * @return a list of connected sub-hyperplanes starting at\n     * {@code node}\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 85)",
        "(line 688,col 9)-(line 688,col 54)",
        "(line 689,col 9)-(line 689,col 26)",
        "(line 690,col 9)-(line 690,col 56)",
        "(line 691,col 9)-(line 691,col 40)",
        "(line 692,col 9)-(line 692,col 22)",
        "(line 695,col 9)-(line 695,col 56)",
        "(line 697,col 9)-(line 728,col 9)",
        "(line 730,col 9)-(line 733,col 9)",
        "(line 735,col 9)-(line 737,col 9)",
        "(line 739,col 9)-(line 739,col 20)"
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
      "begin_line": 744,
      "end_line": 799,
      "comment": " Private extension of Segment allowing comparison. "
    },
    {
      "type": "field",
      "varNames": [
        "sortingKey"
      ],
      "begin_line": 747,
      "end_line": 747,
      "comment": " Sorting key. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.ComparableSegment(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Vector2D, org.apache.commons.math3.geometry.euclidean.twod.Line)",
      "begin_line": 754,
      "end_line": 759,
      "comment": " Build a segment.\n         * @param start start point of the segment\n         * @param end end point of the segment\n         * @param line line containing the segment\n         ",
      "child_ranges": [
        "(line 755,col 13)-(line 755,col 36)",
        "(line 756,col 13)-(line 758,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.ComparableSegment(org.apache.commons.math3.geometry.euclidean.twod.Vector2D, double, double)",
      "begin_line": 770,
      "end_line": 773,
      "comment": " Build a dummy segment.\n         * \u003cp\u003e\n         * The object built is not a real segment, only the sorting key is used to\n         * allow searching in the neighborhood of a point. This is an horrible hack ...\n         * \u003c/p\u003e\n         * @param start start point of the segment\n         * @param dx abscissa offset from the start point\n         * @param dy ordinate offset from the start point\n         ",
      "child_ranges": [
        "(line 771,col 13)-(line 771,col 36)",
        "(line 772,col 13)-(line 772,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.compareTo(org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment)",
      "begin_line": 776,
      "end_line": 778,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 777,col 13)-(line 777,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.equals(java.lang.Object)",
      "begin_line": 781,
      "end_line": 790,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 783,col 13)-(line 789,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.ComparableSegment.hashCode()",
      "begin_line": 793,
      "end_line": 797,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 795,col 13)-(line 796,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SegmentsBuilder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 802,
      "end_line": 863,
      "comment": " Visitor building segments. "
    },
    {
      "type": "field",
      "varNames": [
        "sorted"
      ],
      "begin_line": 805,
      "end_line": 805,
      "comment": " Sorted segments. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.SegmentsBuilder()",
      "begin_line": 808,
      "end_line": 810,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 809,col 13)-(line 809,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.visitOrder(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 813,
      "end_line": 815,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 814,col 13)-(line 814,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 818,
      "end_line": 827,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 819,col 13)-(line 820,col 114)",
        "(line 821,col 13)-(line 823,col 13)",
        "(line 824,col 13)-(line 826,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.visitLeafNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e)",
      "begin_line": 830,
      "end_line": 831,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.addContribution(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e, boolean)",
      "begin_line": 837,
      "end_line": 854,
      "comment": " Add he contribution of a boundary facet.\n         * @param sub boundary facet\n         * @param reversed if true, the facet has the inside on its plus side\n         ",
      "child_ranges": [
        "(line 838,col 13)-(line 840,col 70)",
        "(line 841,col 13)-(line 841,col 62)",
        "(line 842,col 13)-(line 842,col 99)",
        "(line 843,col 13)-(line 853,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet.SegmentsBuilder.getSorted()",
      "begin_line": 859,
      "end_line": 861,
      "comment": " Get the sorted segments.\n         * @return sorted segments\n         ",
      "child_ranges": [
        "(line 860,col 13)-(line 860,col 26)"
      ]
    }
  ]
}