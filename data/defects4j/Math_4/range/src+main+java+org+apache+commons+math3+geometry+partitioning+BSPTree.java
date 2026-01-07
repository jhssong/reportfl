{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/partitioning/BSPTree.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BSPTree",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 635,
      "comment": " This class represent a Binary Space Partition tree.\n\n * \u003cp\u003eBSP trees are an efficient way to represent space partitions and\n * to associate attributes with each cell. Each node in a BSP tree\n * represents a convex region which is partitioned in two convex\n * sub-regions at each side of a cut hyperplane. The root tree\n * contains the complete space.\u003c/p\u003e\n\n * \u003cp\u003eThe main use of such partitions is to use a boolean attribute to\n * define an inside/outside property, hence representing arbitrary\n * polytopes (line segments in 1D, polygons in 2D and polyhedrons in\n * 3D) and to operate on them.\u003c/p\u003e\n\n * \u003cp\u003eAnother example would be to represent Voronoi tesselations, the\n * attribute of each cell holding the defining point of the cell.\u003c/p\u003e\n\n * \u003cp\u003eThe application-defined attributes are shared among copied\n * instances and propagated to split parts. These attributes are not\n * used by the BSP-tree algorithms themselves, so the application can\n * use them for any purpose. Since the tree visiting method holds\n * internal and leaf nodes differently, it is possible to use\n * different classes for internal nodes attributes and leaf nodes\n * attributes. This should be used with care, though, because if the\n * tree is modified in any way after attributes have been set, some\n * internal nodes may become leaf nodes and some leaf nodes may become\n * internal nodes.\u003c/p\u003e\n\n * \u003cp\u003eOne of the main sources for the development of this package was\n * Bruce Naylor, John Amanatides and William Thibault paper \u003ca\n * href\u003d\"http://www.cs.yorku.ca/~amana/research/bsptSetOp.pdf\"\u003eMerging\n * BSP Trees Yields Polyhedral Set Operations\u003c/a\u003e Proc. Siggraph \u002790,\n * Computer Graphics 24(4), August 1990, pp 115-124, published by the\n * Association for Computing Machinery (ACM).\u003c/p\u003e\n\n * @param \u003cS\u003e Type of the space.\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "cut"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Cut sub-hyperplane. "
    },
    {
      "type": "field",
      "varNames": [
        "plus"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Tree at the plus side of the cut hyperplane. "
    },
    {
      "type": "field",
      "varNames": [
        "minus"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Tree at the minus side of the cut hyperplane. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Parent tree. "
    },
    {
      "type": "field",
      "varNames": [
        "attribute"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Application-defined attribute. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.BSPTree()",
      "begin_line": 82,
      "end_line": 88,
      "comment": " Build a tree having only one root cell representing the whole space.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 25)",
        "(line 84,col 9)-(line 84,col 25)",
        "(line 85,col 9)-(line 85,col 25)",
        "(line 86,col 9)-(line 86,col 25)",
        "(line 87,col 9)-(line 87,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.BSPTree(java.lang.Object)",
      "begin_line": 93,
      "end_line": 99,
      "comment": " Build a tree having only one root cell representing the whole space.\n     * @param attribute attribute of the tree (may be null)\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 22)",
        "(line 95,col 9)-(line 95,col 22)",
        "(line 96,col 9)-(line 96,col 22)",
        "(line 97,col 9)-(line 97,col 22)",
        "(line 98,col 9)-(line 98,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.BSPTree(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, java.lang.Object)",
      "begin_line": 114,
      "end_line": 123,
      "comment": " Build a BSPTree from its underlying elements.\n     * \u003cp\u003eThis method does \u003cem\u003enot\u003c/em\u003e perform any verification on\n     * consistency of its arguments, it should therefore be used only\n     * when then caller knows what it is doing.\u003c/p\u003e\n     * \u003cp\u003eThis method is mainly useful kto build trees\n     * bottom-up. Building trees top-down is realized with the help of\n     * method {@link #insertCut insertCut}.\u003c/p\u003e\n     * @param cut cut sub-hyperplane for the tree\n     * @param plus plus side sub-tree\n     * @param minus minus side sub-tree\n     * @param attribute attribute associated with the node (may be null)\n     * @see #insertCut\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 29)",
        "(line 117,col 9)-(line 117,col 30)",
        "(line 118,col 9)-(line 118,col 31)",
        "(line 119,col 9)-(line 119,col 30)",
        "(line 120,col 9)-(line 120,col 35)",
        "(line 121,col 9)-(line 121,col 30)",
        "(line 122,col 9)-(line 122,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.insertCut(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e)",
      "begin_line": 148,
      "end_line": 170,
      "comment": " Insert a cut sub-hyperplane in a node.\n     * \u003cp\u003eThe sub-tree starting at this node will be completely\n     * overwritten. The new cut sub-hyperplane will be built from the\n     * intersection of the provided hyperplane with the cell. If the\n     * hyperplane does intersect the cell, the cell will have two\n     * children cells with {@code null} attributes on each side of\n     * the inserted cut sub-hyperplane. If the hyperplane does not\n     * intersect the cell then \u003cem\u003eno\u003c/em\u003e cut hyperplane will be\n     * inserted and the cell will be changed to a leaf cell. The\n     * attribute of the node is never changed.\u003c/p\u003e\n     * \u003cp\u003eThis method is mainly useful when called on leaf nodes\n     * (i.e. nodes for which {@link #getCut getCut} returns\n     * {@code null}), in this case it provides a way to build a\n     * tree top-down (whereas the {@link #BSPTree(SubHyperplane,\n     * BSPTree, BSPTree, Object) 4 arguments constructor} is devoted to\n     * build trees bottom-up).\u003c/p\u003e\n     * @param hyperplane hyperplane to insert, it will be chopped in\n     * order to fit in the cell defined by the parent nodes of the\n     * instance\n     * @return true if a cut sub-hyperplane has been inserted (i.e. if\n     * the cell now has two leaf child nodes)\n     * @see #BSPTree(SubHyperplane, BSPTree, BSPTree, Object)\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 81)",
        "(line 156,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 31)",
        "(line 164,col 9)-(line 164,col 40)",
        "(line 165,col 9)-(line 165,col 28)",
        "(line 166,col 9)-(line 166,col 40)",
        "(line 167,col 9)-(line 167,col 28)",
        "(line 168,col 9)-(line 168,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.copySelf()",
      "begin_line": 179,
      "end_line": 188,
      "comment": " Copy the instance.\n     * \u003cp\u003eThe instance created is completely independant of the original\n     * one. A deep copy is used, none of the underlying objects are\n     * shared (except for the nodes attributes and immutable\n     * objects).\u003c/p\u003e\n     * @return a new tree, copy of the instance\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 186,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.getCut()",
      "begin_line": 193,
      "end_line": 195,
      "comment": " Get the cut sub-hyperplane.\n     * @return cut sub-hyperplane, null if this is a leaf tree\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.getPlus()",
      "begin_line": 201,
      "end_line": 203,
      "comment": " Get the tree on the plus side of the cut hyperplane.\n     * @return tree on the plus side of the cut hyperplane, null if this\n     * is a leaf tree\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.getMinus()",
      "begin_line": 209,
      "end_line": 211,
      "comment": " Get the tree on the minus side of the cut hyperplane.\n     * @return tree on the minus side of the cut hyperplane, null if this\n     * is a leaf tree\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.getParent()",
      "begin_line": 216,
      "end_line": 218,
      "comment": " Get the parent node.\n     * @return parent node, null if the node has no parents\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.setAttribute(java.lang.Object)",
      "begin_line": 224,
      "end_line": 226,
      "comment": " Associate an attribute with the instance.\n     * @param attribute attribute to associate with the node\n     * @see #getAttribute\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.getAttribute()",
      "begin_line": 234,
      "end_line": 236,
      "comment": " Get the attribute associated with the instance.\n     * @return attribute associated with the node or null if no\n     * attribute has been explicitly set using the {@link #setAttribute\n     * setAttribute} method\n     * @see #setAttribute\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.visit(org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor\u003cS\u003e)",
      "begin_line": 241,
      "end_line": 281,
      "comment": " Visit the BSP tree nodes.\n     * @param visitor object visiting the tree nodes\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.fitToCell(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 291,
      "end_line": 301,
      "comment": " Fit a sub-hyperplane inside the cell defined by the instance.\n     * \u003cp\u003eFitting is done by chopping off the parts of the\n     * sub-hyperplane that lie outside of the cell using the\n     * cut-hyperplanes of the parent nodes of the instance.\u003c/p\u003e\n     * @param sub sub-hyperplane to fit\n     * @return a new sub-hyperplane, guaranteed to have no part outside\n     * of the instance cell\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 33)",
        "(line 293,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.getCell(org.apache.commons.math3.geometry.Vector\u003cS\u003e)",
      "begin_line": 310,
      "end_line": 329,
      "comment": " Get the cell to which a point belongs.\n     * \u003cp\u003eIf the returned cell is a leaf node the points belongs to the\n     * interior of the node, if the cell is an internal node the points\n     * belongs to the node cut sub-hyperplane.\u003c/p\u003e\n     * @param point point to check\n     * @return the tree cell to which the point belongs (can be\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 314,col 9)",
        "(line 317,col 9)-(line 317,col 67)",
        "(line 319,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.condense()",
      "begin_line": 335,
      "end_line": 344,
      "comment": " Perform condensation on a tree.\n     * \u003cp\u003eThe condensation operation is not recursive, it must be called\n     * explicitely from leaves to root.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.merge(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree.LeafMerger\u003cS\u003e)",
      "begin_line": 364,
      "end_line": 366,
      "comment": " Merge a BSP tree with the instance.\n     * \u003cp\u003eAll trees are modified (parts of them are reused in the new\n     * tree), it is the responsibility of the caller to ensure a copy\n     * has been done before if any of the former tree should be\n     * preserved, \u003cem\u003eno\u003c/em\u003e such copy is done here!\u003c/p\u003e\n     * \u003cp\u003eThe algorithm used here is directly derived from the one\n     * described in the Naylor, Amanatides and Thibault paper (section\n     * III, Binary Partitioning of a BSP Tree).\u003c/p\u003e\n     * @param tree other tree to merge with the instance (will be\n     * \u003cem\u003eunusable\u003c/em\u003e after the operation, as well as the\n     * instance itself)\n     * @param leafMerger object implementing the final merging phase\n     * (this is where the semantic of the operation occurs, generally\n     * depending on the attribute of the leaf node)\n     * @return a new tree, result of \u003ccode\u003einstance \u0026lt;op\u0026gt;\n     * tree\u003c/code\u003e, this value can be ignored if parentTree is not null\n     * since all connections have already been established\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.merge(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree.LeafMerger\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, boolean)",
      "begin_line": 383,
      "end_line": 415,
      "comment": " Merge a BSP tree with the instance.\n     * @param tree other tree to merge with the instance (will be\n     * \u003cem\u003eunusable\u003c/em\u003e after the operation, as well as the\n     * instance itself)\n     * @param leafMerger object implementing the final merging phase\n     * (this is where the semantic of the operation occurs, generally\n     * depending on the attribute of the leaf node)\n     * @param parentTree parent tree to connect to (may be null)\n     * @param isPlusChild if true and if parentTree is not null, the\n     * resulting tree should be the plus child of its parent, ignored if\n     * parentTree is null\n     * @return a new tree, result of \u003ccode\u003einstance \u0026lt;op\u0026gt;\n     * tree\u003c/code\u003e, this value can be ignored if parentTree is not null\n     * since all connections have already been established\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 414,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LeafMerger",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 433,
      "end_line": 467,
      "comment": " This interface gather the merging operations between a BSP tree\n     * leaf and another BSP tree.\n     * \u003cp\u003eAs explained in Bruce Naylor, John Amanatides and William\n     * Thibault paper \u003ca\n     * href\u003d\"http://www.cs.yorku.ca/~amana/research/bsptSetOp.pdf\"\u003eMerging\n     * BSP Trees Yields Polyhedral Set Operations\u003c/a\u003e,\n     * the operations on {@link BSPTree BSP trees} can be expressed as a\n     * generic recursive merging operation where only the final part,\n     * when one of the operand is a leaf, is specific to the real\n     * operation semantics. For example, a tree representing a region\n     * using a boolean attribute to identify inside cells and outside\n     * cells would use four different objects to implement the final\n     * merging phase of the four set operations union, intersection,\n     * difference and symmetric difference (exclusive or).\u003c/p\u003e\n     * @param \u003cS\u003e Type of the space.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.LeafMerger.merge(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, boolean, boolean)",
      "begin_line": 464,
      "end_line": 465,
      "comment": " Merge a leaf node and a tree node.\n         * \u003cp\u003eThis method is called at the end of a recursive merging\n         * resulting from a {@code tree1.merge(tree2, leafMerger)}\n         * call, when one of the sub-trees involved is a leaf (i.e. when\n         * its cut-hyperplane is null). This is the only place where the\n         * precise semantics of the operation are required. For all upper\n         * level nodes in the tree, the merging operation is only a\n         * generic partitioning algorithm.\u003c/p\u003e\n         * \u003cp\u003eSince the final operation may be non-commutative, it is\n         * important to know if the leaf node comes from the instance tree\n         * ({@code tree1}) or the argument tree\n         * ({@code tree2}). The third argument of the method is\n         * devoted to this. It can be ignored for commutative\n         * operations.\u003c/p\u003e\n         * \u003cp\u003eThe {@link BSPTree#insertInTree BSPTree.insertInTree} method\n         * may be useful to implement this method.\u003c/p\u003e\n         * @param leaf leaf node (its cut hyperplane is guaranteed to be\n         * null)\n         * @param tree tree node (its cut hyperplane may be null or not)\n         * @param parentTree parent tree to connect to (may be null)\n         * @param isPlusChild if true and if parentTree is not null, the\n         * resulting tree should be the plus child of its parent, ignored if\n         * parentTree is null\n         * @param leafFromInstance if true, the leaf node comes from the\n         * instance tree ({@code tree1}) and the tree node comes from\n         * the argument tree ({@code tree2})\n         * @return the BSP tree resulting from the merging (may be one of\n         * the arguments)\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.split(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 487,
      "end_line": 553,
      "comment": " Split a BSP tree by an external sub-hyperplane.\n     * \u003cp\u003eSplit a tree in two halves, on each side of the\n     * sub-hyperplane. The instance is not modified.\u003c/p\u003e\n     * \u003cp\u003eThe tree returned is not upward-consistent: despite all of its\n     * sub-trees cut sub-hyperplanes (including its own cut\n     * sub-hyperplane) are bounded to the current cell, it is \u003cem\u003enot\u003c/em\u003e\n     * attached to any parent tree yet. This tree is intended to be\n     * later inserted into an higher level tree.\u003c/p\u003e\n     * \u003cp\u003eThe algorithm used here is the one given in Naylor, Amanatides\n     * and Thibault paper (section III, Binary Partitioning of a BSP\n     * Tree).\u003c/p\u003e\n     * @param sub partitioning sub-hyperplane, must be already clipped\n     * to the convex region represented by the instance, will be used as\n     * the cut sub-hyperplane of the returned tree\n     * @return a tree having the specified sub-hyperplane as its cut\n     * sub-hyperplane, the two parts of the split instance as its two\n     * sub-trees and a null parent\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 494,col 62)",
        "(line 495,col 9)-(line 495,col 62)",
        "(line 496,col 9)-(line 551,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.insertInTree(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, boolean)",
      "begin_line": 564,
      "end_line": 605,
      "comment": " Insert the instance into another tree.\n     * \u003cp\u003eThe instance itself is modified so its former parent should\n     * not be used anymore.\u003c/p\u003e\n     * @param parentTree parent tree to connect to (may be null)\n     * @param isPlusChild if true and if parentTree is not null, the\n     * resulting tree should be the plus child of its parent, ignored if\n     * parentTree is null\n     * @see LeafMerger\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 28)",
        "(line 568,col 9)-(line 574,col 9)",
        "(line 577,col 9)-(line 603,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.chopOffMinus(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e)",
      "begin_line": 613,
      "end_line": 619,
      "comment": " Chop off parts of the tree.\n     * \u003cp\u003eThe instance is modified in place, all the parts that are on\n     * the minus side of the chopping hyperplane are discarded, only the\n     * parts on the plus side remain.\u003c/p\u003e\n     * @param hyperplane chopping hyperplane\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 618,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.BSPTree.chopOffPlus(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e)",
      "begin_line": 627,
      "end_line": 633,
      "comment": " Chop off parts of the tree.\n     * \u003cp\u003eThe instance is modified in place, all the parts that are on\n     * the plus side of the chopping hyperplane are discarded, only the\n     * parts on the minus side remain.\u003c/p\u003e\n     * @param hyperplane chopping hyperplane\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 632,col 9)"
      ]
    }
  ]
}