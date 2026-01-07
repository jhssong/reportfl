{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/geometry/partitioning/AbstractSubHyperplane.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSubHyperplane",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.SubHyperplane\u003cS\u003e"
      ],
      "begin_line": 37,
      "end_line": 159,
      "comment": " This class implements the dimension-independent parts of {@link SubHyperplane}.\n\n * \u003cp\u003esub-hyperplanes are obtained when parts of an {@link\n * Hyperplane hyperplane} are chopped off by other hyperplanes that\n * intersect it. The remaining part is a convex region. Such objects\n * appear in {@link BSPTree BSP trees} as the intersection of a cut\n * hyperplane with the convex region which it splits, the chopping\n * hyperplanes are the cut hyperplanes closer to the tree root.\u003c/p\u003e\n\n * @param \u003cS\u003e Type of the embedding space.\n * @param \u003cT\u003e Type of the embedded sub-space.\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "hyperplane"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Underlying hyperplane. "
    },
    {
      "type": "field",
      "varNames": [
        "remainingRegion"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Remaining region of the hyperplane. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane.AbstractSubHyperplane(org.apache.commons.math.geometry.partitioning.Hyperplane\u003cS\u003e, org.apache.commons.math.geometry.partitioning.Region\u003cT\u003e)",
      "begin_line": 50,
      "end_line": 54,
      "comment": " Build a sub-hyperplane from an hyperplane and a region.\n     * @param hyperplane underlying hyperplane\n     * @param remainingRegion remaining region of the hyperplane\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 42)",
        "(line 53,col 9)-(line 53,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane.buildNew(org.apache.commons.math.geometry.partitioning.Hyperplane\u003cS\u003e, org.apache.commons.math.geometry.partitioning.Region\u003cT\u003e)",
      "begin_line": 61,
      "end_line": 62,
      "comment": " Build a sub-hyperplane from an hyperplane and a region.\n     * @param hyper underlying hyperplane\n     * @param remaining remaining region of the hyperplane\n     * @return a new sub-hyperplane\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane.copySelf()",
      "begin_line": 65,
      "end_line": 67,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane.getHyperplane()",
      "begin_line": 72,
      "end_line": 74,
      "comment": " Get the underlying hyperplane.\n     * @return underlying hyperplane\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane.getRemainingRegion()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " Get the remaining region of the hyperplane.\n     * \u003cp\u003eThe returned region is expressed in the canonical hyperplane\n     * frame and has the hyperplane dimension. For example a chopped\n     * hyperplane in the 3D euclidean is a 2D plane and the\n     * corresponding region is a convex 2D polygon.\u003c/p\u003e\n     * @return remaining region of the hyperplane\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane.getSize()",
      "begin_line": 88,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane.reunite(org.apache.commons.math.geometry.partitioning.SubHyperplane\u003cS\u003e)",
      "begin_line": 93,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 9)-(line 95,col 76)",
        "(line 96,col 9)-(line 97,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane.applyTransform(org.apache.commons.math.geometry.partitioning.Transform\u003cS, T\u003e)",
      "begin_line": 110,
      "end_line": 115,
      "comment": " Apply a transform to the instance.\n     * \u003cp\u003eThe instance must be a (D-1)-dimension sub-hyperplane with\n     * respect to the transform \u003cem\u003enot\u003c/em\u003e a (D-2)-dimension\n     * sub-hyperplane the transform knows how to transform by\n     * itself. The transform will consist in transforming first the\n     * hyperplane and then the all region using the various methods\n     * provided by the transform.\u003c/p\u003e\n     * @param transform D-dimension transform to apply\n     * @return the transformed instance\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 70)",
        "(line 112,col 9)-(line 113,col 85)",
        "(line 114,col 9)-(line 114,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane.recurseTransform(org.apache.commons.math.geometry.partitioning.BSPTree\u003cT\u003e, org.apache.commons.math.geometry.partitioning.Hyperplane\u003cS\u003e, org.apache.commons.math.geometry.partitioning.Transform\u003cS, T\u003e)",
      "begin_line": 123,
      "end_line": 146,
      "comment": " Recursively transform a BSP-tree from a sub-hyperplane.\n     * @param node current BSP tree node\n     * @param transformed image of the instance hyperplane by the transform\n     * @param transform transform to apply\n     * @return a new tree\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 132,col 55)",
        "(line 133,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 144,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane.side(org.apache.commons.math.geometry.partitioning.Hyperplane\u003cS\u003e)",
      "begin_line": 149,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane.split(org.apache.commons.math.geometry.partitioning.Hyperplane\u003cS\u003e)",
      "begin_line": 152,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane.isEmpty()",
      "begin_line": 155,
      "end_line": 157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 41)"
      ]
    }
  ]
}