{
  "filepath": "/tmp/Math-3b/src/main/java/org/apache/commons/math3/geometry/partitioning/AbstractRegion.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRegion",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.Region\u003cS\u003e"
      ],
      "begin_line": 38,
      "end_line": 674,
      "comment": " Abstract class for all regions, independently of geometry type or dimension.\n\n * @param \u003cS\u003e Type of the space.\n * @param \u003cT\u003e Type of the sub-space.\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "tree"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Inside/Outside BSP tree. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Size of the instance. "
    },
    {
      "type": "field",
      "varNames": [
        "barycenter"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Barycenter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.AbstractRegion()",
      "begin_line": 51,
      "end_line": 53,
      "comment": " Build a region representing the whole space.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.AbstractRegion(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 67,
      "end_line": 69,
      "comment": " Build a region from an inside/outside BSP tree.\n     * \u003cp\u003eThe leaf nodes of the BSP tree \u003cem\u003emust\u003c/em\u003e have a\n     * {@code Boolean} attribute representing the inside status of\n     * the corresponding cell (true for inside cells, false for outside\n     * cells). In order to avoid building too many small objects, it is\n     * recommended to use the predefined constants\n     * {@code Boolean.TRUE} and {@code Boolean.FALSE}. The\n     * tree also \u003cem\u003emust\u003c/em\u003e have either null internal nodes or\n     * internal nodes representing the boundary as specified in the\n     * {@link #getTree getTree} method).\u003c/p\u003e\n     * @param tree inside/outside BSP tree representing the region\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.AbstractRegion(java.util.Collection\u003corg.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e\u003e)",
      "begin_line": 90,
      "end_line": 136,
      "comment": " Build a Region from a Boundary REPresentation (B-rep).\n     * \u003cp\u003eThe boundary is provided as a collection of {@link\n     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the\n     * interior part of the region on its minus side and the exterior on\n     * its plus side.\u003c/p\u003e\n     * \u003cp\u003eThe boundary elements can be in any order, and can form\n     * several non-connected sets (like for example polygons with holes\n     * or a set of disjoints polyhedrons considered as a whole). In\n     * fact, the elements do not even need to be connected together\n     * (their topological connections are not used here). However, if the\n     * boundary does not really separate an inside open from an outside\n     * open (open having here its topological meaning), then subsequent\n     * calls to the {@link #checkPoint(Vector) checkPoint} method will not be\n     * meaningful anymore.\u003c/p\u003e\n     * \u003cp\u003eIf the boundary is empty, the region will represent the whole\n     * space.\u003c/p\u003e\n     * @param boundary collection of boundary elements, as a\n     * collection of {@link SubHyperplane SubHyperplane} objects\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Anonymous-c38bc09d-5e3f-44a5-90c9-8feb8daa74b0.compare(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 103,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 104,col 21)-(line 104,col 54)",
        "(line 105,col 21)-(line 105,col 54)",
        "(line 106,col 21)-(line 106,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Anonymous-82818144-6b25-42c5-8afa-395745d88c6f.visitOrder(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 119,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 21)-(line 120,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Anonymous-2edba5cc-d21c-4c91-83be-e8372a53f34c.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 124,
      "end_line": 125,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Anonymous-d8472b49-17c5-4a1f-ba85-404335094a5f.visitLeafNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 128,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 21)-(line 130,col 106)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.AbstractRegion(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e[])",
      "begin_line": 142,
      "end_line": 164,
      "comment": " Build a convex region from an array of bounding hyperplanes.\n     * @param hyperplanes array of bounding hyperplanes (if null, an\n     * empty region will be built)\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.buildNew(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 167,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.insertCuts(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, java.util.Collection\u003corg.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e\u003e)",
      "begin_line": 175,
      "end_line": 218,
      "comment": " Recursively build a tree by inserting cut sub-hyperplanes.\n     * @param node current tree node (it is a leaf node at the beginning\n     * of the call)\n     * @param boundary collection of edges belonging to the cell defined\n     * by the node\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 72)",
        "(line 180,col 9)-(line 180,col 38)",
        "(line 181,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 193,col 9)-(line 193,col 88)",
        "(line 194,col 9)-(line 194,col 88)",
        "(line 195,col 9)-(line 212,col 9)",
        "(line 215,col 9)-(line 215,col 46)",
        "(line 216,col 9)-(line 216,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.copySelf()",
      "begin_line": 221,
      "end_line": 223,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.isEmpty()",
      "begin_line": 226,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.isEmpty(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 231,
      "end_line": 245,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 9)-(line 240,col 9)",
        "(line 243,col 9)-(line 243,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.contains(org.apache.commons.math3.geometry.partitioning.Region\u003cS\u003e)",
      "begin_line": 248,
      "end_line": 250,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.checkPoint(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 253,
      "end_line": 255,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.checkPoint(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 264,
      "end_line": 276,
      "comment": " Check a point with respect to the region starting at a given node.\n     * @param node root node of the region\n     * @param point point to check\n     * @return a code representing the point status: either {@link\n     * Region.Location#INSIDE INSIDE}, {@link Region.Location#OUTSIDE\n     * OUTSIDE} or {@link Region.Location#BOUNDARY BOUNDARY}\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 52)",
        "(line 266,col 9)-(line 269,col 9)",
        "(line 272,col 9)-(line 272,col 70)",
        "(line 273,col 9)-(line 273,col 70)",
        "(line 274,col 9)-(line 274,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.getTree(boolean)",
      "begin_line": 279,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 280,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoundaryBuilder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor\u003cS\u003e"
      ],
      "begin_line": 293,
      "end_line": 401,
      "comment": " Visitor building boundary shell tree.\n     * \u003cp\u003e\n     * The boundary shell is represented as {@link BoundaryAttribute boundary attributes}\n     * at each internal node.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.BoundaryBuilder.visitOrder(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 296,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 13)-(line 297,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.BoundaryBuilder.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 301,
      "end_line": 343,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 303,col 13)-(line 303,col 48)",
        "(line 304,col 13)-(line 304,col 48)",
        "(line 308,col 13)-(line 309,col 111)",
        "(line 310,col 13)-(line 310,col 77)",
        "(line 312,col 13)-(line 324,col 13)",
        "(line 326,col 13)-(line 338,col 13)",
        "(line 341,col 13)-(line 341,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.BoundaryBuilder.visitLeafNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 346,
      "end_line": 347,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.BoundaryBuilder.characterize(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e[])",
      "begin_line": 362,
      "end_line": 399,
      "comment": " Filter the parts of an hyperplane belonging to the boundary.\n         * \u003cp\u003eThe filtering consist in splitting the specified\n         * sub-hyperplane into several parts lying in inside and outside\n         * cells of the tree. The principle is to call this method twice for\n         * each cut sub-hyperplane in the tree, once one the plus node and\n         * once on the minus node. The parts that have the same flag\n         * (inside/inside or outside/outside) do not belong to the boundary\n         * while parts that have different flags (inside/outside or\n         * outside/inside) do belong to the boundary.\u003c/p\u003e\n         * @param node current BSP tree node\n         * @param sub sub-hyperplane to characterize\n         * @param characterization placeholder where to put the characterized parts\n         ",
      "child_ranges": [
        "(line 364,col 13)-(line 398,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.getBoundarySize()",
      "begin_line": 404,
      "end_line": 408,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 76)",
        "(line 406,col 9)-(line 406,col 37)",
        "(line 407,col 9)-(line 407,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.getSize()",
      "begin_line": 411,
      "end_line": 416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.setSize(double)",
      "begin_line": 421,
      "end_line": 423,
      "comment": " Set the size of the instance.\n     * @param size size of the instance\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.getBarycenter()",
      "begin_line": 426,
      "end_line": 431,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.setBarycenter(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 436,
      "end_line": 438,
      "comment": " Set the barycenter of the instance.\n     * @param barycenter barycenter of the instance\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.computeGeometricalProperties()",
      "begin_line": 443,
      "end_line": 443,
      "comment": " Compute some geometrical properties.\n     * \u003cp\u003eThe properties to compute are the barycenter and the size.\u003c/p\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.side(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e)",
      "begin_line": 446,
      "end_line": 452,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 40)",
        "(line 448,col 9)-(line 448,col 64)",
        "(line 449,col 9)-(line 451,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.recurseSides(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides)",
      "begin_line": 469,
      "end_line": 543,
      "comment": " Search recursively for inside leaf nodes on each side of the given hyperplane.\n\n     * \u003cp\u003eThe algorithm used here is directly derived from the one\n     * described in section III (\u003ci\u003eBinary Partitioning of a BSP\n     * Tree\u003c/i\u003e) of the Bruce Naylor, John Amanatides and William\n     * Thibault paper \u003ca\n     * href\u003d\"http://www.cs.yorku.ca/~amana/research/bsptSetOp.pdf\"\u003eMerging\n     * BSP Trees Yields Polyhedral Set Operations\u003c/a\u003e Proc. Siggraph\n     * \u002790, Computer Graphics 24(4), August 1990, pp 115-124, published\n     * by the Association for Computing Machinery (ACM)..\u003c/p\u003e\n\n     * @param node current BSP tree node\n     * @param sub sub-hyperplane\n     * @param sides object holding the sides found\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 478,col 9)",
        "(line 480,col 9)-(line 480,col 71)",
        "(line 481,col 9)-(line 541,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Sides",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 546,
      "end_line": 587,
      "comment": " Utility class holding the already found sides. "
    },
    {
      "type": "field",
      "varNames": [
        "plusFound"
      ],
      "begin_line": 549,
      "end_line": 549,
      "comment": " Indicator of inside leaf nodes found on the plus side. "
    },
    {
      "type": "field",
      "varNames": [
        "minusFound"
      ],
      "begin_line": 552,
      "end_line": 552,
      "comment": " Indicator of inside leaf nodes found on the plus side. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides.Sides()",
      "begin_line": 556,
      "end_line": 559,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 557,col 13)-(line 557,col 31)",
        "(line 558,col 13)-(line 558,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides.rememberPlusFound()",
      "begin_line": 563,
      "end_line": 565,
      "comment": " Remember the fact that inside leaf nodes have been found on the plus side.\n         ",
      "child_ranges": [
        "(line 564,col 13)-(line 564,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides.plusFound()",
      "begin_line": 570,
      "end_line": 572,
      "comment": " Check if inside leaf nodes have been found on the plus side.\n         * @return true if inside leaf nodes have been found on the plus side\n         ",
      "child_ranges": [
        "(line 571,col 13)-(line 571,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides.rememberMinusFound()",
      "begin_line": 576,
      "end_line": 578,
      "comment": " Remember the fact that inside leaf nodes have been found on the minus side.\n         ",
      "child_ranges": [
        "(line 577,col 13)-(line 577,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides.minusFound()",
      "begin_line": 583,
      "end_line": 585,
      "comment": " Check if inside leaf nodes have been found on the minus side.\n         * @return true if inside leaf nodes have been found on the minus side\n         ",
      "child_ranges": [
        "(line 584,col 13)-(line 584,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.intersection(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 590,
      "end_line": 592,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.recurseIntersection(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 600,
      "end_line": 628,
      "comment": " Recursively compute the parts of a sub-hyperplane that are\n     * contained in the region.\n     * @param node current BSP tree node\n     * @param sub sub-hyperplane traversing the region\n     * @return filtered sub-hyperplane\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 604,col 9)",
        "(line 606,col 9)-(line 606,col 71)",
        "(line 607,col 9)-(line 626,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.applyTransform(org.apache.commons.math3.geometry.partitioning.Transform\u003cS, T\u003e)",
      "begin_line": 640,
      "end_line": 642,
      "comment": " Transform a region.\n     * \u003cp\u003eApplying a transform to a region consist in applying the\n     * transform to all the hyperplanes of the underlying BSP tree and\n     * of the boundary (and also to the sub-hyperplanes embedded in\n     * these hyperplanes) and to the barycenter. The instance is not\n     * modified, a new instance is built.\u003c/p\u003e\n     * @param transform transform to apply\n     * @return a new region, resulting from the application of the\n     * transform to the instance\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.recurseTransform(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.Transform\u003cS, T\u003e)",
      "begin_line": 649,
      "end_line": 672,
      "comment": " Recursively transform an inside/outside BSP-tree.\n     * @param node current BSP tree node\n     * @param transform transform to apply\n     * @return a new tree\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 654,col 9)",
        "(line 656,col 9)-(line 656,col 52)",
        "(line 657,col 9)-(line 657,col 100)",
        "(line 658,col 9)-(line 658,col 84)",
        "(line 659,col 9)-(line 665,col 9)",
        "(line 667,col 9)-(line 670,col 47)"
      ]
    }
  ]
}