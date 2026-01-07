{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/geometry/partitioning/AbstractRegion.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRegion",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.Region\u003cS\u003e"
      ],
      "begin_line": 36,
      "end_line": 641,
      "comment": " Abstract class for all regions, independently of geometry type or dimension.\n\n * @param \u003cS\u003e Type of the space.\n * @param \u003cT\u003e Type of the sub-space.\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "tree"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Inside/Outside BSP tree. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Size of the instance. "
    },
    {
      "type": "field",
      "varNames": [
        "barycenter"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Barycenter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.AbstractRegion()",
      "begin_line": 49,
      "end_line": 51,
      "comment": " Build a region representing the whole space.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.AbstractRegion(org.apache.commons.math.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 65,
      "end_line": 67,
      "comment": " Build a region from an inside/outside BSP tree.\n     * \u003cp\u003eThe leaf nodes of the BSP tree \u003cem\u003emust\u003c/em\u003e have a\n     * {@code Boolean} attribute representing the inside status of\n     * the corresponding cell (true for inside cells, false for outside\n     * cells). In order to avoid building too many small objects, it is\n     * recommended to use the predefined constants\n     * {@code Boolean.TRUE} and {@code Boolean.FALSE}. The\n     * tree also \u003cem\u003emust\u003c/em\u003e have either null internal nodes or\n     * internal nodes representing the boundary as specified in the\n     * {@link #getTree getTree} method).\u003c/p\u003e\n     * @param tree inside/outside BSP tree representing the region\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.AbstractRegion(java.util.Collection\u003corg.apache.commons.math.geometry.partitioning.SubHyperplane\u003cS\u003e\u003e)",
      "begin_line": 88,
      "end_line": 134,
      "comment": " Build a Region from a Boundary REPresentation (B-rep).\n     * \u003cp\u003eThe boundary is provided as a collection of {@link\n     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the\n     * interior part of the region on its minus side and the exterior on\n     * its plus side.\u003c/p\u003e\n     * \u003cp\u003eThe boundary elements can be in any order, and can form\n     * several non-connected sets (like for example polygons with holes\n     * or a set of disjoints polyhedrons considered as a whole). In\n     * fact, the elements do not even need to be connected together\n     * (their topological connections are not used here). However, if the\n     * boundary does not really separate an inside open from an outside\n     * open (open having here its topological meaning), then subsequent\n     * calls to the {@link #checkPoint(Vector) checkPoint} method will not be\n     * meaningful anymore.\u003c/p\u003e\n     * \u003cp\u003eIf the boundary is empty, the region will represent the whole\n     * space.\u003c/p\u003e\n     * @param boundary collection of boundary elements, as a\n     * collection of {@link SubHyperplane SubHyperplane} objects\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.Anonymous-054b8f02-5d7f-4fb0-bd45-aba04e86fb04.compare(org.apache.commons.math.geometry.partitioning.SubHyperplane\u003cS\u003e, org.apache.commons.math.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 101,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 102,col 21)-(line 102,col 54)",
        "(line 103,col 21)-(line 103,col 54)",
        "(line 104,col 21)-(line 104,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.Anonymous-b8521dee-2451-4d96-bf24-6c12aa6fdc27.visitOrder(org.apache.commons.math.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 117,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 21)-(line 118,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.Anonymous-c4407747-6a4c-45fc-9a4e-4ab10a884eac.visitInternalNode(org.apache.commons.math.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 122,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.Anonymous-cba30cab-eee1-41d2-930b-6aed2d8802b7.visitLeafNode(org.apache.commons.math.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 126,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 21)-(line 128,col 106)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.AbstractRegion(org.apache.commons.math.geometry.partitioning.Hyperplane\u003cS\u003e[])",
      "begin_line": 140,
      "end_line": 162,
      "comment": " Build a convex region from an array of bounding hyperplanes.\n     * @param hyperplanes array of bounding hyperplanes (if null, an\n     * empty region will be built)\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.buildNew(org.apache.commons.math.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 165,
      "end_line": 165,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.insertCuts(org.apache.commons.math.geometry.partitioning.BSPTree\u003cS\u003e, java.util.Collection\u003corg.apache.commons.math.geometry.partitioning.SubHyperplane\u003cS\u003e\u003e)",
      "begin_line": 173,
      "end_line": 216,
      "comment": " Recursively build a tree by inserting cut sub-hyperplanes.\n     * @param node current tree node (it is a leaf node at the beginning\n     * of the call)\n     * @param boundary collection of edges belonging to the cell defined\n     * by the node\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 72)",
        "(line 178,col 9)-(line 178,col 38)",
        "(line 179,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 191,col 9)-(line 191,col 88)",
        "(line 192,col 9)-(line 192,col 88)",
        "(line 193,col 9)-(line 210,col 9)",
        "(line 213,col 9)-(line 213,col 46)",
        "(line 214,col 9)-(line 214,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.copySelf()",
      "begin_line": 219,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.isEmpty()",
      "begin_line": 224,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.isEmpty(org.apache.commons.math.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 229,
      "end_line": 243,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 235,col 9)-(line 238,col 9)",
        "(line 241,col 9)-(line 241,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.contains(org.apache.commons.math.geometry.partitioning.Region\u003cS\u003e)",
      "begin_line": 246,
      "end_line": 248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.checkPoint(org.apache.commons.math.geometry.Vector\u003cS\u003e)",
      "begin_line": 251,
      "end_line": 253,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.checkPoint(org.apache.commons.math.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math.geometry.Vector\u003cS\u003e)",
      "begin_line": 262,
      "end_line": 274,
      "comment": " Check a point with respect to the region starting at a given node.\n     * @param node root node of the region\n     * @param point point to check\n     * @return a code representing the point status: either {@link\n     * Region.Location#INSIDE INSIDE}, {@link Region.Location#OUTSIDE\n     * OUTSIDE} or {@link Region.Location#BOUNDARY BOUNDARY}\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 52)",
        "(line 264,col 9)-(line 267,col 9)",
        "(line 270,col 9)-(line 270,col 70)",
        "(line 271,col 9)-(line 271,col 70)",
        "(line 272,col 9)-(line 272,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.getTree(boolean)",
      "begin_line": 277,
      "end_line": 283,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 278,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.recurseBuildBoundary(org.apache.commons.math.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 288,
      "end_line": 328,
      "comment": " Recursively build the boundary shell tree.\n     * @param node current node in the inout tree\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.characterize(org.apache.commons.math.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math.geometry.partitioning.SubHyperplane\u003cS\u003e, org.apache.commons.math.geometry.partitioning.Characterization\u003cS\u003e)",
      "begin_line": 343,
      "end_line": 368,
      "comment": " Filter the parts of an hyperplane belonging to the boundary.\n     * \u003cp\u003eThe filtering consist in splitting the specified\n     * sub-hyperplane into several parts lying in inside and outside\n     * cells of the tree. The principle is to call this method twice for\n     * each cut sub-hyperplane in the tree, once one the plus node and\n     * once on the minus node. The parts that have the same flag\n     * (inside/inside or outside/outside) do not belong to the boundary\n     * while parts that have different flags (inside/outside or\n     * outside/inside) do belong to the boundary.\u003c/p\u003e\n     * @param node current BSP tree node\n     * @param sub sub-hyperplane to characterize\n     * @param characterization placeholder where to put the characterized parts\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.getBoundarySize()",
      "begin_line": 371,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 76)",
        "(line 373,col 9)-(line 373,col 37)",
        "(line 374,col 9)-(line 374,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.getSize()",
      "begin_line": 378,
      "end_line": 383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.setSize(double)",
      "begin_line": 388,
      "end_line": 390,
      "comment": " Set the size of the instance.\n     * @param size size of the instance\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.getBarycenter()",
      "begin_line": 393,
      "end_line": 398,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.setBarycenter(org.apache.commons.math.geometry.Vector\u003cS\u003e)",
      "begin_line": 403,
      "end_line": 405,
      "comment": " Set the barycenter of the instance.\n     * @param barycenter barycenter of the instance\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.computeGeometricalProperties()",
      "begin_line": 410,
      "end_line": 410,
      "comment": " Compute some geometrical properties.\n     * \u003cp\u003eThe properties to compute are the barycenter and the size.\u003c/p\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.side(org.apache.commons.math.geometry.partitioning.Hyperplane\u003cS\u003e)",
      "begin_line": 413,
      "end_line": 419,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 40)",
        "(line 415,col 9)-(line 415,col 64)",
        "(line 416,col 9)-(line 418,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.recurseSides(org.apache.commons.math.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math.geometry.partitioning.SubHyperplane\u003cS\u003e, org.apache.commons.math.geometry.partitioning.AbstractRegion.Sides)",
      "begin_line": 436,
      "end_line": 510,
      "comment": " Search recursively for inside leaf nodes on each side of the given hyperplane.\n\n     * \u003cp\u003eThe algorithm used here is directly derived from the one\n     * described in section III (\u003ci\u003eBinary Partitioning of a BSP\n     * Tree\u003c/i\u003e) of the Bruce Naylor, John Amanatides and William\n     * Thibault paper \u003ca\n     * href\u003d\"http://www.cs.yorku.ca/~amana/research/bsptSetOp.pdf\"\u003eMerging\n     * BSP Trees Yields Polyhedral Set Operations\u003c/a\u003e Proc. Siggraph\n     * \u002790, Computer Graphics 24(4), August 1990, pp 115-124, published\n     * by the Association for Computing Machinery (ACM)..\u003c/p\u003e\n\n     * @param node current BSP tree node\n     * @param sub sub-hyperplane\n     * @param sides object holding the sides found\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 445,col 9)",
        "(line 447,col 9)-(line 447,col 71)",
        "(line 448,col 9)-(line 508,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Sides",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 513,
      "end_line": 554,
      "comment": " Utility class holding the already found sides. "
    },
    {
      "type": "field",
      "varNames": [
        "plusFound"
      ],
      "begin_line": 516,
      "end_line": 516,
      "comment": " Indicator of inside leaf nodes found on the plus side. "
    },
    {
      "type": "field",
      "varNames": [
        "minusFound"
      ],
      "begin_line": 519,
      "end_line": 519,
      "comment": " Indicator of inside leaf nodes found on the plus side. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.Sides.Sides()",
      "begin_line": 523,
      "end_line": 526,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 524,col 13)-(line 524,col 31)",
        "(line 525,col 13)-(line 525,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.Sides.rememberPlusFound()",
      "begin_line": 530,
      "end_line": 532,
      "comment": " Remember the fact that inside leaf nodes have been found on the plus side.\n         ",
      "child_ranges": [
        "(line 531,col 13)-(line 531,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.Sides.plusFound()",
      "begin_line": 537,
      "end_line": 539,
      "comment": " Check if inside leaf nodes have been found on the plus side.\n         * @return true if inside leaf nodes have been found on the plus side\n         ",
      "child_ranges": [
        "(line 538,col 13)-(line 538,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.Sides.rememberMinusFound()",
      "begin_line": 543,
      "end_line": 545,
      "comment": " Remember the fact that inside leaf nodes have been found on the minus side.\n         ",
      "child_ranges": [
        "(line 544,col 13)-(line 544,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.Sides.minusFound()",
      "begin_line": 550,
      "end_line": 552,
      "comment": " Check if inside leaf nodes have been found on the minus side.\n         * @return true if inside leaf nodes have been found on the minus side\n         ",
      "child_ranges": [
        "(line 551,col 13)-(line 551,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.intersection(org.apache.commons.math.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 557,
      "end_line": 559,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.recurseIntersection(org.apache.commons.math.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 567,
      "end_line": 595,
      "comment": " Recursively compute the parts of a sub-hyperplane that are\n     * contained in the region.\n     * @param node current BSP tree node\n     * @param sub sub-hyperplane traversing the region\n     * @return filtered sub-hyperplane\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 571,col 9)",
        "(line 573,col 9)-(line 573,col 71)",
        "(line 574,col 9)-(line 593,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.applyTransform(org.apache.commons.math.geometry.partitioning.Transform\u003cS, T\u003e)",
      "begin_line": 607,
      "end_line": 609,
      "comment": " Transform a region.\n     * \u003cp\u003eApplying a transform to a region consist in applying the\n     * transform to all the hyperplanes of the underlying BSP tree and\n     * of the boundary (and also to the sub-hyperplanes embedded in\n     * these hyperplanes) and to the barycenter. The instance is not\n     * modified, a new instance is built.\u003c/p\u003e\n     * @param transform transform to apply\n     * @return a new region, resulting from the application of the\n     * transform to the instance\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractRegion.recurseTransform(org.apache.commons.math.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math.geometry.partitioning.Transform\u003cS, T\u003e)",
      "begin_line": 616,
      "end_line": 639,
      "comment": " Recursively transform an inside/outside BSP-tree.\n     * @param node current BSP tree node\n     * @param transform transform to apply\n     * @return a new tree\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 621,col 9)",
        "(line 623,col 9)-(line 623,col 52)",
        "(line 624,col 9)-(line 624,col 100)",
        "(line 625,col 9)-(line 625,col 84)",
        "(line 626,col 9)-(line 632,col 9)",
        "(line 634,col 9)-(line 637,col 47)"
      ]
    }
  ]
}