{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/partitioning/RegionFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RegionFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 248,
      "comment": " This class is a factory for {@link Region}.\n\n * @param \u003cS\u003e Type of the space.\n\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "nodeCleaner"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Visitor removing internal nodes attributes. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.RegionFactory()",
      "begin_line": 35,
      "end_line": 37,
      "comment": " Simple constructor.\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.buildConvex(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003cS\u003e...)",
      "begin_line": 43,
      "end_line": 65,
      "comment": " Build a convex region from a collection of bounding hyperplanes.\n     * @param hyperplanes collection of bounding hyperplanes\n     * @return a new convex region, or null if the collection is empty\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 46,col 9)",
        "(line 49,col 9)-(line 49,col 61)",
        "(line 52,col 9)-(line 52,col 48)",
        "(line 53,col 9)-(line 53,col 40)",
        "(line 54,col 9)-(line 61,col 9)",
        "(line 63,col 9)-(line 63,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.union(org.apache.commons.math3.geometry.partitioning.Region\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.Region\u003cS\u003e)",
      "begin_line": 74,
      "end_line": 79,
      "comment": " Compute the union of two regions.\n     * @param region1 first region (will be unusable after the operation as\n     * parts of it will be reused in the new region)\n     * @param region2 second region (will be unusable after the operation as\n     * parts of it will be reused in the new region)\n     * @return a new region, result of {@code region1 union region2}\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 76,col 84)",
        "(line 77,col 9)-(line 77,col 32)",
        "(line 78,col 9)-(line 78,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.intersection(org.apache.commons.math3.geometry.partitioning.Region\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.Region\u003cS\u003e)",
      "begin_line": 88,
      "end_line": 93,
      "comment": " Compute the intersection of two regions.\n     * @param region1 first region (will be unusable after the operation as\n     * parts of it will be reused in the new region)\n     * @param region2 second region (will be unusable after the operation as\n     * parts of it will be reused in the new region)\n     * @return a new region, result of {@code region1 intersection region2}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 90,col 91)",
        "(line 91,col 9)-(line 91,col 32)",
        "(line 92,col 9)-(line 92,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.xor(org.apache.commons.math3.geometry.partitioning.Region\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.Region\u003cS\u003e)",
      "begin_line": 102,
      "end_line": 107,
      "comment": " Compute the symmetric difference (exclusive or) of two regions.\n     * @param region1 first region (will be unusable after the operation as\n     * parts of it will be reused in the new region)\n     * @param region2 second region (will be unusable after the operation as\n     * parts of it will be reused in the new region)\n     * @return a new region, result of {@code region1 xor region2}\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 104,col 82)",
        "(line 105,col 9)-(line 105,col 32)",
        "(line 106,col 9)-(line 106,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.difference(org.apache.commons.math3.geometry.partitioning.Region\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.Region\u003cS\u003e)",
      "begin_line": 116,
      "end_line": 121,
      "comment": " Compute the difference of two regions.\n     * @param region1 first region (will be unusable after the operation as\n     * parts of it will be reused in the new region)\n     * @param region2 second region (will be unusable after the operation as\n     * parts of it will be reused in the new region)\n     * @return a new region, result of {@code region1 minus region2}\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 118,col 89)",
        "(line 119,col 9)-(line 119,col 32)",
        "(line 120,col 9)-(line 120,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.getComplement(org.apache.commons.math3.geometry.partitioning.Region\u003cS\u003e)",
      "begin_line": 128,
      "end_line": 130,
      "comment": " Get the complement of the region (exchanged interior/exterior).\n     * @param region region to complement, it will not modified, a new\n     * region independent region will be built\n     * @return a new region, complement of the specified one\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.recurseComplement(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 136,
      "end_line": 156,
      "comment": " Recursively build the complement of a BSP tree.\n     * @param node current node of the original tree\n     * @return new tree, complement of the node\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 142,col 84)",
        "(line 143,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 154,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnionMerger",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.BSPTree.LeafMerger\u003cS\u003e"
      ],
      "begin_line": 159,
      "end_line": 173,
      "comment": " BSP tree leaf merger computing union of two regions. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.UnionMerger.merge(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, boolean, boolean)",
      "begin_line": 161,
      "end_line": 172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 164,col 13)-(line 168,col 13)",
        "(line 170,col 13)-(line 170,col 55)",
        "(line 171,col 13)-(line 171,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IntersectionMerger",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.BSPTree.LeafMerger\u003cS\u003e"
      ],
      "begin_line": 176,
      "end_line": 190,
      "comment": " BSP tree leaf merger computing union of two regions. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.IntersectionMerger.merge(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, boolean, boolean)",
      "begin_line": 178,
      "end_line": 189,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 181,col 13)-(line 185,col 13)",
        "(line 187,col 13)-(line 187,col 55)",
        "(line 188,col 13)-(line 188,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "XorMerger",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.BSPTree.LeafMerger\u003cS\u003e"
      ],
      "begin_line": 193,
      "end_line": 206,
      "comment": " BSP tree leaf merger computing union of two regions. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.XorMerger.merge(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, boolean, boolean)",
      "begin_line": 195,
      "end_line": 205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 32)",
        "(line 199,col 13)-(line 202,col 13)",
        "(line 203,col 13)-(line 203,col 52)",
        "(line 204,col 13)-(line 204,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DifferenceMerger",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.BSPTree.LeafMerger\u003cS\u003e"
      ],
      "begin_line": 209,
      "end_line": 227,
      "comment": " BSP tree leaf merger computing union of two regions. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.DifferenceMerger.merge(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e, boolean, boolean)",
      "begin_line": 211,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 13)-(line 220,col 13)",
        "(line 222,col 13)-(line 223,col 47)",
        "(line 224,col 13)-(line 224,col 63)",
        "(line 225,col 13)-(line 225,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NodesCleaner",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor\u003cS\u003e"
      ],
      "begin_line": 230,
      "end_line": 246,
      "comment": " Visitor removing internal nodes attributes. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.NodesCleaner.visitOrder(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 233,
      "end_line": 235,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.NodesCleaner.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 238,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.partitioning.RegionFactory.NodesCleaner.visitLeafNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003cS\u003e)",
      "begin_line": 243,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}