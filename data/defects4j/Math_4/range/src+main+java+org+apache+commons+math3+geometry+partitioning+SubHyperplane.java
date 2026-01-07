{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/partitioning/SubHyperplane.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SubHyperplane",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 125,
      "comment": " This interface represents the remaining parts of an hyperplane after\n * other parts have been chopped off.\n\n * \u003cp\u003esub-hyperplanes are obtained when parts of an {@link\n * Hyperplane hyperplane} are chopped off by other hyperplanes that\n * intersect it. The remaining part is a convex region. Such objects\n * appear in {@link BSPTree BSP trees} as the intersection of a cut\n * hyperplane with the convex region which it splits, the chopping\n * hyperplanes are the cut hyperplanes closer to the tree root.\u003c/p\u003e\n\n * @param \u003cS\u003e Type of the embedding space.\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.SubHyperplane.copySelf()",
      "begin_line": 45,
      "end_line": 45,
      "comment": " Copy the instance.\n     * \u003cp\u003eThe instance created is completely independent of the original\n     * one. A deep copy is used, none of the underlying objects are\n     * shared (except for the nodes attributes and immutable\n     * objects).\u003c/p\u003e\n     * @return a new sub-hyperplane, copy of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.SubHyperplane.getHyperplane()",
      "begin_line": 50,
      "end_line": 50,
      "comment": " Get the underlying hyperplane.\n     * @return underlying hyperplane\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.SubHyperplane.isEmpty()",
      "begin_line": 55,
      "end_line": 55,
      "comment": " Check if the instance is empty.\n     * @return true if the instance is empty\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.SubHyperplane.getSize()",
      "begin_line": 61,
      "end_line": 61,
      "comment": " Get the size of the instance.\n     * @return the size of the instance (this is a length in 1D, an area\n     * in 2D, a volume in 3D ...)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.SubHyperplane.side(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e)",
      "begin_line": 69,
      "end_line": 69,
      "comment": " Compute the relative position of the instance with respect\n     * to an hyperplane.\n     * @param hyperplane hyperplane to check instance against\n     * @return one of {@link Side#PLUS}, {@link Side#MINUS}, {@link Side#BOTH},\n     * {@link Side#HYPER}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.SubHyperplane.split(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e)",
      "begin_line": 77,
      "end_line": 77,
      "comment": " Split the instance in two parts by an hyperplane.\n     * @param hyperplane splitting hyperplane\n     * @return an object containing both the part of the instance\n     * on the plus side of the instance and the part of the\n     * instance on the minus side of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.SubHyperplane.reunite(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 84,
      "end_line": 84,
      "comment": " Compute the union of the instance and another sub-hyperplane.\n     * @param other other sub-hyperplane to union (\u003cem\u003emust\u003c/em\u003e be in the\n     * same hyperplane as the instance)\n     * @return a new sub-hyperplane, union of the instance and other\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "SplitSubHyperplane",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 89,
      "end_line": 123,
      "comment": " Class holding the results of the {@link #split split} method.\n     * @param \u003cU\u003e Type of the embedding space.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "plus"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Part of the sub-hyperplane on the plus side of the splitting hyperplane. "
    },
    {
      "type": "field",
      "varNames": [
        "minus"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Part of the sub-hyperplane on the minus side of the splitting hyperplane. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane.SplitSubHyperplane(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cU\u003e, org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003cU\u003e)",
      "begin_line": 103,
      "end_line": 107,
      "comment": " Build a SplitSubHyperplane from its parts.\n         * @param plus part of the sub-hyperplane on the plus side of the\n         * splitting hyperplane\n         * @param minus part of the sub-hyperplane on the minus side of the\n         * splitting hyperplane\n         ",
      "child_ranges": [
        "(line 105,col 13)-(line 105,col 30)",
        "(line 106,col 13)-(line 106,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane.getPlus()",
      "begin_line": 112,
      "end_line": 114,
      "comment": " Get the part of the sub-hyperplane on the plus side of the splitting hyperplane.\n         * @return part of the sub-hyperplane on the plus side of the splitting hyperplane\n         ",
      "child_ranges": [
        "(line 113,col 13)-(line 113,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane.getMinus()",
      "begin_line": 119,
      "end_line": 121,
      "comment": " Get the part of the sub-hyperplane on the minus side of the splitting hyperplane.\n         * @return part of the sub-hyperplane on the minus side of the splitting hyperplane\n         ",
      "child_ranges": [
        "(line 120,col 13)-(line 120,col 25)"
      ]
    }
  ]
}