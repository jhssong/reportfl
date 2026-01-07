{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/geometry/euclidean/threed/PolyhedronsSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolyhedronsSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.AbstractRegion\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 42,
      "end_line": 445,
      "comment": " This class represents a 3D region: a set of polyhedrons.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet()",
      "begin_line": 46,
      "end_line": 48,
      "comment": " Build a polyhedrons set representing the whole real line.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 59,
      "end_line": 61,
      "comment": " Build a polyhedrons set from a BSP tree.\n     * \u003cp\u003eThe leaf nodes of the BSP tree \u003cem\u003emust\u003c/em\u003e have a\n     * {@code Boolean} attribute representing the inside status of\n     * the corresponding cell (true for inside cells, false for outside\n     * cells). In order to avoid building too many small objects, it is\n     * recommended to use the predefined constants\n     * {@code Boolean.TRUE} and {@code Boolean.FALSE}\u003c/p\u003e\n     * @param tree inside/outside BSP tree representing the region\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet(java.util.Collection\u003corg.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e\u003e)",
      "begin_line": 82,
      "end_line": 84,
      "comment": " Build a polyhedrons set from a Boundary REPresentation (B-rep).\n     * \u003cp\u003eThe boundary is provided as a collection of {@link\n     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the\n     * interior part of the region on its minus side and the exterior on\n     * its plus side.\u003c/p\u003e\n     * \u003cp\u003eThe boundary elements can be in any order, and can form\n     * several non-connected sets (like for example polyhedrons with holes\n     * or a set of disjoint polyhedrons considered as a whole). In\n     * fact, the elements do not even need to be connected together\n     * (their topological connections are not used here). However, if the\n     * boundary does not really separate an inside open from an outside\n     * open (open having here its topological meaning), then subsequent\n     * calls to the {@link Region#checkPoint(Vector) checkPoint} method will\n     * not be meaningful anymore.\u003c/p\u003e\n     * \u003cp\u003eIf the boundary is empty, the region will represent the whole\n     * space.\u003c/p\u003e\n     * @param boundary collection of boundary elements, as a\n     * collection of {@link SubHyperplane SubHyperplane} objects\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet(double, double, double, double, double, double)",
      "begin_line": 94,
      "end_line": 98,
      "comment": " Build a parallellepipedic box.\n     * @param xMin low bound along the x direction\n     * @param xMax high bound along the x direction\n     * @param yMin low bound along the y direction\n     * @param yMax high bound along the y direction\n     * @param zMin low bound along the z direction\n     * @param zMax high bound along the z direction\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.buildBoundary(double, double, double, double, double, double)",
      "begin_line": 109,
      "end_line": 122,
      "comment": " Build a parallellepipedic box boundary.\n     * @param xMin low bound along the x direction\n     * @param xMax high bound along the x direction\n     * @param yMin low bound along the y direction\n     * @param yMax high bound along the y direction\n     * @param zMin low bound along the z direction\n     * @param zMax high bound along the z direction\n     * @return boundary tree\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 87)",
        "(line 113,col 9)-(line 113,col 86)",
        "(line 114,col 9)-(line 114,col 87)",
        "(line 115,col 9)-(line 115,col 86)",
        "(line 116,col 9)-(line 116,col 87)",
        "(line 117,col 9)-(line 117,col 86)",
        "(line 118,col 9)-(line 120,col 95)",
        "(line 121,col 9)-(line 121,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.buildNew(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 125,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.computeGeometricalProperties()",
      "begin_line": 131,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 61)",
        "(line 137,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FacetsContributionVisitor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e"
      ],
      "begin_line": 151,
      "end_line": 209,
      "comment": " Visitor computing geometrical properties. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.FacetsContributionVisitor()",
      "begin_line": 154,
      "end_line": 157,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 23)",
        "(line 156,col 13)-(line 156,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.visitOrder(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 160,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 165,
      "end_line": 175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 166,col 13)-(line 168,col 69)",
        "(line 169,col 13)-(line 171,col 13)",
        "(line 172,col 13)-(line 174,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.visitLeafNode(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 178,
      "end_line": 179,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.addContribution(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e, boolean)",
      "begin_line": 185,
      "end_line": 207,
      "comment": " Add he contribution of a boundary facet.\n         * @param facet boundary facet\n         * @param reversed if true, the facet has the inside on its plus side\n         ",
      "child_ranges": [
        "(line 187,col 13)-(line 187,col 88)",
        "(line 188,col 13)-(line 188,col 53)",
        "(line 190,col 13)-(line 205,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.firstIntersection(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Line)",
      "begin_line": 218,
      "end_line": 220,
      "comment": " Get the first sub-hyperplane crossed by a semi-infinite line.\n     * @param point start point of the part of the line considered\n     * @param line line to consider (contains point)\n     * @return the first sub-hyperplaned crossed by the line after the\n     * given point, or null if the line does not intersect any\n     * sub-hyperplaned\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.recurseFirstIntersection(org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Line)",
      "begin_line": 230,
      "end_line": 283,
      "comment": " Get the first sub-hyperplane crossed by a semi-infinite line.\n     * @param node current node\n     * @param point start point of the part of the line considered\n     * @param line line to consider (contains point)\n     * @return the first sub-hyperplaned crossed by the line after the\n     * given point, or null if the line does not intersect any\n     * sub-hyperplaned\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 61)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 59)",
        "(line 239,col 9)-(line 239,col 58)",
        "(line 240,col 9)-(line 240,col 70)",
        "(line 243,col 9)-(line 243,col 53)",
        "(line 244,col 9)-(line 244,col 61)",
        "(line 245,col 9)-(line 245,col 40)",
        "(line 246,col 9)-(line 246,col 39)",
        "(line 247,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 261,col 9)",
        "(line 264,col 9)-(line 264,col 95)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 278,col 9)",
        "(line 281,col 9)-(line 281,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.boundaryFacet(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.partitioning.BSPTree\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 291,
      "end_line": 306,
      "comment": " Check if a point belongs to the boundary part of a node.\n     * @param point point to check\n     * @param node node containing the boundary facet to check\n     * @return the boundary facet this points belongs to (or null if it\n     * does not belong to any boundary facet)\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 91)",
        "(line 294,col 9)-(line 296,col 65)",
        "(line 297,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.rotate(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Rotation)",
      "begin_line": 314,
      "end_line": 316,
      "comment": " Rotate the region around the specified point.\n     * \u003cp\u003eThe instance is not modified, a new instance is created.\u003c/p\u003e\n     * @param center rotation center\n     * @param rotation vectorial rotation operator\n     * @return a new instance representing the rotated region\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 88)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RotationTransform",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.Transform\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 319,
      "end_line": 380,
      "comment": " 3D rotation as a Transform. "
    },
    {
      "type": "field",
      "varNames": [
        "center"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " Center point of the rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "rotation"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " Vectorial rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedOriginal"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " Cached original hyperplane. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedTransform"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": " Cached 2D transform valid inside the cached original hyperplane. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.RotationTransform(org.apache.commons.math3.geometry.euclidean.threed.Vector3D, org.apache.commons.math3.geometry.euclidean.threed.Rotation)",
      "begin_line": 337,
      "end_line": 340,
      "comment": " Build a rotation transform.\n         * @param center center point of the rotation\n         * @param rotation vectorial rotation\n         ",
      "child_ranges": [
        "(line 338,col 13)-(line 338,col 35)",
        "(line 339,col 13)-(line 339,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.apply(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 343,
      "end_line": 346,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 344,col 13)-(line 344,col 71)",
        "(line 345,col 13)-(line 345,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.apply(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 349,
      "end_line": 351,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 350,col 13)-(line 350,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.apply(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e, org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 354,
      "end_line": 378,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 357,col 13)-(line 376,col 13)",
        "(line 377,col 13)-(line 377,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.translate(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 387,
      "end_line": 389,
      "comment": " Translate the region by the specified amount.\n     * \u003cp\u003eThe instance is not modified, a new instance is created.\u003c/p\u003e\n     * @param translation translation to apply\n     * @return a new instance representing the translated region\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 86)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TranslationTransform",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.geometry.partitioning.Transform\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 392,
      "end_line": 443,
      "comment": " 3D translation as a transform. "
    },
    {
      "type": "field",
      "varNames": [
        "translation"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": " Translation vector. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedOriginal"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": " Cached original hyperplane. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedTransform"
      ],
      "begin_line": 401,
      "end_line": 401,
      "comment": " Cached 2D transform valid inside the cached original hyperplane. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.TranslationTransform(org.apache.commons.math3.geometry.euclidean.threed.Vector3D)",
      "begin_line": 406,
      "end_line": 408,
      "comment": " Build a translation transform.\n         * @param translation translation vector\n         ",
      "child_ranges": [
        "(line 407,col 13)-(line 407,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.apply(org.apache.commons.math3.geometry.Vector\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 411,
      "end_line": 413,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 412,col 13)-(line 412,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.apply(org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 416,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 13)-(line 417,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.apply(org.apache.commons.math3.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math3.geometry.euclidean.twod.Euclidean2D\u003e, org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math3.geometry.partitioning.Hyperplane\u003corg.apache.commons.math3.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 421,
      "end_line": 441,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 424,col 13)-(line 437,col 13)",
        "(line 439,col 13)-(line 439,col 67)"
      ]
    }
  ]
}