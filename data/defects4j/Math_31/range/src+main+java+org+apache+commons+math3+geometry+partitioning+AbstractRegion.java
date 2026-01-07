{
  "filepath": "/tmp/Math-31b/src/main/java/org/apache/commons/math3/geometry/partitioning/AbstractRegion.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRegion",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.Region\u003cS\u003e"
      ],
      "begin_line": 37,
      "end_line": 642,
      "comment": " Abstract class for all regions, independently of geometry type or dimension.\n\n * @param \u003cS\u003e Type of the space.\n * @param \u003cT\u003e Type of the sub-space.\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "tree"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Inside/Outside BSP tree. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Size of the instance. "
    },
    {
      "type": "field",
      "varNames": [
        "barycenter"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Barycenter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.AbstractRegion()",
      "begin_line": 50,
      "end_line": 52,
      "comment": " Build a region representing the whole space.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.AbstractRegion(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 66,
      "end_line": 68,
      "comment": " Build a region from an inside/outside BSP tree.\n     * \u003cp\u003eThe leaf nodes of the BSP tree \u003cem\u003emust\u003c/em\u003e have a\n     * {@code Boolean} attribute representing the inside status of\n     * the corresponding cell (true for inside cells, false for outside\n     * cells). In order to avoid building too many small objects, it is\n     * recommended to use the predefined constants\n     * {@code Boolean.TRUE} and {@code Boolean.FALSE}. The\n     * tree also \u003cem\u003emust\u003c/em\u003e have either null internal nodes or\n     * internal nodes representing the boundary as specified in the\n     * {@link #getTree getTree} method).\u003c/p\u003e\n     * @param tree inside/outside BSP tree representing the region\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.AbstractRegion(java.util.Collection\u003corg.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e\u003e)",
      "begin_line": 89,
      "end_line": 135,
      "comment": " Build a Region from a Boundary REPresentation (B-rep).\n     * \u003cp\u003eThe boundary is provided as a collection of {@link\n     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the\n     * interior part of the region on its minus side and the exterior on\n     * its plus side.\u003c/p\u003e\n     * \u003cp\u003eThe boundary elements can be in any order, and can form\n     * several non-connected sets (like for example polygons with holes\n     * or a set of disjoints polyhedrons considered as a whole). In\n     * fact, the elements do not even need to be connected together\n     * (their topological connections are not used here). However, if the\n     * boundary does not really separate an inside open from an outside\n     * open (open having here its topological meaning), then subsequent\n     * calls to the {@link #checkPoint(Vector) checkPoint} method will not be\n     * meaningful anymore.\u003c/p\u003e\n     * \u003cp\u003eIf the boundary is empty, the region will represent the whole\n     * space.\u003c/p\u003e\n     * @param boundary collection of boundary elements, as a\n     * collection of {@link SubHyperplane SubHyperplane} objects\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Anonymous-a64951c9-47cf-49fe-87f0-f1b86007b679.compare(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 102,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 103,col 21)-(line 103,col 54)",
        "(line 104,col 21)-(line 104,col 54)",
        "(line 105,col 21)-(line 105,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Anonymous-84c0bd28-dbdc-49c8-895a-502d10be71a6.visitOrder(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 118,
      "end_line": 120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 119,col 21)-(line 119,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Anonymous-6d608d83-c1c6-447c-8efa-0da0613cdfe5.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 123,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Anonymous-df570733-8d5b-4e42-90bb-1bb8bc5e320b.visitLeafNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 127,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 21)-(line 129,col 106)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.AbstractRegion(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e[])",
      "begin_line": 141,
      "end_line": 163,
      "comment": " Build a convex region from an array of bounding hyperplanes.\n     * @param hyperplanes array of bounding hyperplanes (if null, an\n     * empty region will be built)\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.buildNew(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 166,
      "end_line": 166,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.insertCuts(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, java.util.Collection\u003corg.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e\u003e)",
      "begin_line": 174,
      "end_line": 217,
      "comment": " Recursively build a tree by inserting cut sub-hyperplanes.\n     * @param node current tree node (it is a leaf node at the beginning\n     * of the call)\n     * @param boundary collection of edges belonging to the cell defined\n     * by the node\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 72)",
        "(line 179,col 9)-(line 179,col 38)",
        "(line 180,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 192,col 9)-(line 192,col 88)",
        "(line 193,col 9)-(line 193,col 88)",
        "(line 194,col 9)-(line 211,col 9)",
        "(line 214,col 9)-(line 214,col 46)",
        "(line 215,col 9)-(line 215,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.copySelf()",
      "begin_line": 220,
      "end_line": 222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.isEmpty()",
      "begin_line": 225,
      "end_line": 227,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.isEmpty(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 230,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 236,col 9)-(line 239,col 9)",
        "(line 242,col 9)-(line 242,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.contains(org.apache.commons.math3.geometry.partitioning.Region\u003cS\u003e)",
      "begin_line": 247,
      "end_line": 249,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.checkPoint(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 252,
      "end_line": 254,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.checkPoint(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 263,
      "end_line": 275,
      "comment": " Check a point with respect to the region starting at a given node.\n     * @param node root node of the region\n     * @param point point to check\n     * @return a code representing the point status: either {@link\n     * Region.Location#INSIDE INSIDE}, {@link Region.Location#OUTSIDE\n     * OUTSIDE} or {@link Region.Location#BOUNDARY BOUNDARY}\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 52)",
        "(line 265,col 9)-(line 268,col 9)",
        "(line 271,col 9)-(line 271,col 70)",
        "(line 272,col 9)-(line 272,col 70)",
        "(line 273,col 9)-(line 273,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.getTree(boolean)",
      "begin_line": 278,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.recurseBuildBoundary(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 289,
      "end_line": 329,
      "comment": " Recursively build the boundary shell tree.\n     * @param node current node in the inout tree\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 328,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.characterize(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.Characterization\u003cS\u003e)",
      "begin_line": 344,
      "end_line": 369,
      "comment": " Filter the parts of an hyperplane belonging to the boundary.\n     * \u003cp\u003eThe filtering consist in splitting the specified\n     * sub-hyperplane into several parts lying in inside and outside\n     * cells of the tree. The principle is to call this method twice for\n     * each cut sub-hyperplane in the tree, once one the plus node and\n     * once on the minus node. The parts that have the same flag\n     * (inside/inside or outside/outside) do not belong to the boundary\n     * while parts that have different flags (inside/outside or\n     * outside/inside) do belong to the boundary.\u003c/p\u003e\n     * @param node current BSP tree node\n     * @param sub sub-hyperplane to characterize\n     * @param characterization placeholder where to put the characterized parts\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 368,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.getBoundarySize()",
      "begin_line": 372,
      "end_line": 376,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 76)",
        "(line 374,col 9)-(line 374,col 37)",
        "(line 375,col 9)-(line 375,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.getSize()",
      "begin_line": 379,
      "end_line": 384,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.setSize(double)",
      "begin_line": 389,
      "end_line": 391,
      "comment": " Set the size of the instance.\n     * @param size size of the instance\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.getBarycenter()",
      "begin_line": 394,
      "end_line": 399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.setBarycenter(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 404,
      "end_line": 406,
      "comment": " Set the barycenter of the instance.\n     * @param barycenter barycenter of the instance\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.computeGeometricalProperties()",
      "begin_line": 411,
      "end_line": 411,
      "comment": " Compute some geometrical properties.\n     * \u003cp\u003eThe properties to compute are the barycenter and the size.\u003c/p\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.side(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e)",
      "begin_line": 414,
      "end_line": 420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 40)",
        "(line 416,col 9)-(line 416,col 64)",
        "(line 417,col 9)-(line 419,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.recurseSides(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides)",
      "begin_line": 437,
      "end_line": 511,
      "comment": " Search recursively for inside leaf nodes on each side of the given hyperplane.\n\n     * \u003cp\u003eThe algorithm used here is directly derived from the one\n     * described in section III (\u003ci\u003eBinary Partitioning of a BSP\n     * Tree\u003c/i\u003e) of the Bruce Naylor, John Amanatides and William\n     * Thibault paper \u003ca\n     * href\u003d\"http://www.cs.yorku.ca/~amana/research/bsptSetOp.pdf\"\u003eMerging\n     * BSP Trees Yields Polyhedral Set Operations\u003c/a\u003e Proc. Siggraph\n     * \u002790, Computer Graphics 24(4), August 1990, pp 115-124, published\n     * by the Association for Computing Machinery (ACM)..\u003c/p\u003e\n\n     * @param node current BSP tree node\n     * @param sub sub-hyperplane\n     * @param sides object holding the sides found\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 446,col 9)",
        "(line 448,col 9)-(line 448,col 71)",
        "(line 449,col 9)-(line 509,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Sides",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 514,
      "end_line": 555,
      "comment": " Utility class holding the already found sides. "
    },
    {
      "type": "field",
      "varNames": [
        "plusFound"
      ],
      "begin_line": 517,
      "end_line": 517,
      "comment": " Indicator of inside leaf nodes found on the plus side. "
    },
    {
      "type": "field",
      "varNames": [
        "minusFound"
      ],
      "begin_line": 520,
      "end_line": 520,
      "comment": " Indicator of inside leaf nodes found on the plus side. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides.Sides()",
      "begin_line": 524,
      "end_line": 527,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 525,col 13)-(line 525,col 31)",
        "(line 526,col 13)-(line 526,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides.rememberPlusFound()",
      "begin_line": 531,
      "end_line": 533,
      "comment": " Remember the fact that inside leaf nodes have been found on the plus side.\n         ",
      "child_ranges": [
        "(line 532,col 13)-(line 532,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides.plusFound()",
      "begin_line": 538,
      "end_line": 540,
      "comment": " Check if inside leaf nodes have been found on the plus side.\n         * @return true if inside leaf nodes have been found on the plus side\n         ",
      "child_ranges": [
        "(line 539,col 13)-(line 539,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides.rememberMinusFound()",
      "begin_line": 544,
      "end_line": 546,
      "comment": " Remember the fact that inside leaf nodes have been found on the minus side.\n         ",
      "child_ranges": [
        "(line 545,col 13)-(line 545,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides.minusFound()",
      "begin_line": 551,
      "end_line": 553,
      "comment": " Check if inside leaf nodes have been found on the minus side.\n         * @return true if inside leaf nodes have been found on the minus side\n         ",
      "child_ranges": [
        "(line 552,col 13)-(line 552,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.intersection(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 558,
      "end_line": 560,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.recurseIntersection(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 568,
      "end_line": 596,
      "comment": " Recursively compute the parts of a sub-hyperplane that are\n     * contained in the region.\n     * @param node current BSP tree node\n     * @param sub sub-hyperplane traversing the region\n     * @return filtered sub-hyperplane\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 572,col 9)",
        "(line 574,col 9)-(line 574,col 71)",
        "(line 575,col 9)-(line 594,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.applyTransform(org.apache.commons.math3.geometry.partitioning.Transform\u003cS, T\u003e)",
      "begin_line": 608,
      "end_line": 610,
      "comment": " Transform a region.\n     * \u003cp\u003eApplying a transform to a region consist in applying the\n     * transform to all the hyperplanes of the underlying BSP tree and\n     * of the boundary (and also to the sub-hyperplanes embedded in\n     * these hyperplanes) and to the barycenter. The instance is not\n     * modified, a new instance is built.\u003c/p\u003e\n     * @param transform transform to apply\n     * @return a new region, resulting from the application of the\n     * transform to the instance\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.AbstractRegion.recurseTransform(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.Transform\u003cS, T\u003e)",
      "begin_line": 617,
      "end_line": 640,
      "comment": " Recursively transform an inside/outside BSP-tree.\n     * @param node current BSP tree node\n     * @param transform transform to apply\n     * @return a new tree\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 622,col 9)",
        "(line 624,col 9)-(line 624,col 52)",
        "(line 625,col 9)-(line 625,col 100)",
        "(line 626,col 9)-(line 626,col 84)",
        "(line 627,col 9)-(line 633,col 9)",
        "(line 635,col 9)-(line 638,col 47)"
      ]
    }
  ]
}