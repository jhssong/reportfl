{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/geometry/euclidean/threed/PolyhedronsSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolyhedronsSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.AbstractRegion\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 42,
      "end_line": 426,
      "comment": " This class represents a 3D region: a set of polyhedrons.\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet()",
      "begin_line": 46,
      "end_line": 48,
      "comment": " Build a polyhedrons set representing the whole real line.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 59,
      "end_line": 61,
      "comment": " Build a polyhedrons set from a BSP tree.\n     * \u003cp\u003eThe leaf nodes of the BSP tree \u003cem\u003emust\u003c/em\u003e have a\n     * {@code Boolean} attribute representing the inside status of\n     * the corresponding cell (true for inside cells, false for outside\n     * cells). In order to avoid building too many small objects, it is\n     * recommended to use the predefined constants\n     * {@code Boolean.TRUE} and {@code Boolean.FALSE}\u003c/p\u003e\n     * @param tree inside/outside BSP tree representing the region\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet(java.util.Collection\u003corg.apache.commons.math.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e\u003e)",
      "begin_line": 82,
      "end_line": 84,
      "comment": " Build a polyhedrons set from a Boundary REPresentation (B-rep).\n     * \u003cp\u003eThe boundary is provided as a collection of {@link\n     * SubHyperplane sub-hyperplanes}. Each sub-hyperplane has the\n     * interior part of the region on its minus side and the exterior on\n     * its plus side.\u003c/p\u003e\n     * \u003cp\u003eThe boundary elements can be in any order, and can form\n     * several non-connected sets (like for example polyhedrons with holes\n     * or a set of disjoint polyhedrons considered as a whole). In\n     * fact, the elements do not even need to be connected together\n     * (their topological connections are not used here). However, if the\n     * boundary does not really separate an inside open from an outside\n     * open (open having here its topological meaning), then subsequent\n     * calls to the {@link Region#checkPoint(Vector) checkPoint} method will\n     * not be meaningful anymore.\u003c/p\u003e\n     * \u003cp\u003eIf the boundary is empty, the region will represent the whole\n     * space.\u003c/p\u003e\n     * @param boundary collection of boundary elements, as a\n     * collection of {@link SubHyperplane SubHyperplane} objects\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.PolyhedronsSet(double, double, double, double, double, double)",
      "begin_line": 94,
      "end_line": 105,
      "comment": " Build a parallellepipedic box.\n     * @param xMin low bound along the x direction\n     * @param xMax high bound along the x direction\n     * @param yMin low bound along the y direction\n     * @param yMax high bound along the y direction\n     * @param zMin low bound along the z direction\n     * @param zMax high bound along the z direction\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 104,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.buildNew(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 108,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.computeGeometricalProperties()",
      "begin_line": 113,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 61)",
        "(line 118,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FacetsContributionVisitor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.BSPTreeVisitor\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e"
      ],
      "begin_line": 132,
      "end_line": 190,
      "comment": " Visitor computing geometrical properties. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.FacetsContributionVisitor()",
      "begin_line": 135,
      "end_line": 138,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 136,col 13)-(line 136,col 23)",
        "(line 137,col 13)-(line 137,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.visitOrder(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 141,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 13)-(line 142,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.visitInternalNode(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 146,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 13)-(line 149,col 69)",
        "(line 150,col 13)-(line 152,col 13)",
        "(line 153,col 13)-(line 155,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.visitLeafNode(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 159,
      "end_line": 160,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.FacetsContributionVisitor.addContribution(org.apache.commons.math.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e, boolean)",
      "begin_line": 166,
      "end_line": 188,
      "comment": " Add he contribution of a boundary facet.\n         * @param facet boundary facet\n         * @param reversed if true, the facet has the inside on its plus side\n         ",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 88)",
        "(line 169,col 13)-(line 169,col 53)",
        "(line 171,col 13)-(line 186,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.firstIntersection(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Line)",
      "begin_line": 199,
      "end_line": 201,
      "comment": " Get the first sub-hyperplane crossed by a semi-infinite line.\n     * @param point start point of the part of the line considered\n     * @param line line to consider (contains point)\n     * @return the first sub-hyperplaned crossed by the line after the\n     * given point, or null if the line does not intersect any\n     * sub-hyperplaned\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.recurseFirstIntersection(org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Line)",
      "begin_line": 211,
      "end_line": 264,
      "comment": " Get the first sub-hyperplane crossed by a semi-infinite line.\n     * @param node current node\n     * @param point start point of the part of the line considered\n     * @param line line to consider (contains point)\n     * @return the first sub-hyperplaned crossed by the line after the\n     * given point, or null if the line does not intersect any\n     * sub-hyperplaned\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 61)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 59)",
        "(line 220,col 9)-(line 220,col 58)",
        "(line 221,col 9)-(line 221,col 70)",
        "(line 224,col 9)-(line 224,col 53)",
        "(line 225,col 9)-(line 225,col 61)",
        "(line 226,col 9)-(line 226,col 40)",
        "(line 227,col 9)-(line 227,col 39)",
        "(line 228,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 242,col 9)",
        "(line 245,col 9)-(line 245,col 95)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 259,col 9)",
        "(line 262,col 9)-(line 262,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.boundaryFacet(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.partitioning.BSPTree\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 272,
      "end_line": 287,
      "comment": " Check if a point belongs to the boundary part of a node.\n     * @param point point to check\n     * @param node node containing the boundary facet to check\n     * @return the boundary facet this points belongs to (or null if it\n     * does not belong to any boundary facet)\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 91)",
        "(line 275,col 9)-(line 277,col 65)",
        "(line 278,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.rotate(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Rotation)",
      "begin_line": 295,
      "end_line": 297,
      "comment": " Rotate the region around the specified point.\n     * \u003cp\u003eThe instance is not modified, a new instance is created.\u003c/p\u003e\n     * @param center rotation center\n     * @param rotation vectorial rotation operator\n     * @return a new instance representing the rotated region\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 88)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RotationTransform",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.Transform\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 300,
      "end_line": 361,
      "comment": " 3D rotation as a Transform. "
    },
    {
      "type": "field",
      "varNames": [
        "center"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": " Center point of the rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "rotation"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " Vectorial rotation. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedOriginal"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": " Cached original hyperplane. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedTransform"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " Cached 2D transform valid inside the cached original hyperplane. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.RotationTransform(org.apache.commons.math.geometry.euclidean.threed.Vector3D, org.apache.commons.math.geometry.euclidean.threed.Rotation)",
      "begin_line": 318,
      "end_line": 321,
      "comment": " Build a rotation transform.\n         * @param center center point of the rotation\n         * @param rotation vectorial rotation\n         ",
      "child_ranges": [
        "(line 319,col 13)-(line 319,col 35)",
        "(line 320,col 13)-(line 320,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.apply(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 324,
      "end_line": 327,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 325,col 13)-(line 325,col 71)",
        "(line 326,col 13)-(line 326,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.apply(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 330,
      "end_line": 332,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 331,col 13)-(line 331,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.RotationTransform.apply(org.apache.commons.math.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e, org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 335,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 338,col 13)-(line 357,col 13)",
        "(line 358,col 13)-(line 358,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.translate(org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 368,
      "end_line": 370,
      "comment": " Translate the region by the specified amount.\n     * \u003cp\u003eThe instance is not modified, a new instance is created.\u003c/p\u003e\n     * @param translation translation to apply\n     * @return a new instance representing the translated region\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 86)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TranslationTransform",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.geometry.partitioning.Transform\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D, org.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e"
      ],
      "begin_line": 373,
      "end_line": 424,
      "comment": " 3D translation as a transform. "
    },
    {
      "type": "field",
      "varNames": [
        "translation"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": " Translation vector. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedOriginal"
      ],
      "begin_line": 379,
      "end_line": 379,
      "comment": " Cached original hyperplane. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedTransform"
      ],
      "begin_line": 382,
      "end_line": 382,
      "comment": " Cached 2D transform valid inside the cached original hyperplane. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.TranslationTransform(org.apache.commons.math.geometry.euclidean.threed.Vector3D)",
      "begin_line": 387,
      "end_line": 389,
      "comment": " Build a translation transform.\n         * @param translation translation vector\n         ",
      "child_ranges": [
        "(line 388,col 13)-(line 388,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.apply(org.apache.commons.math.geometry.Vector\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 392,
      "end_line": 394,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 393,col 13)-(line 393,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.apply(org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 397,
      "end_line": 399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 398,col 13)-(line 398,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.geometry.euclidean.threed.PolyhedronsSet.TranslationTransform.apply(org.apache.commons.math.geometry.partitioning.SubHyperplane\u003corg.apache.commons.math.geometry.euclidean.twod.Euclidean2D\u003e, org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e, org.apache.commons.math.geometry.partitioning.Hyperplane\u003corg.apache.commons.math.geometry.euclidean.threed.Euclidean3D\u003e)",
      "begin_line": 402,
      "end_line": 422,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 405,col 13)-(line 418,col 13)",
        "(line 420,col 13)-(line 420,col 67)"
      ]
    }
  ]
}